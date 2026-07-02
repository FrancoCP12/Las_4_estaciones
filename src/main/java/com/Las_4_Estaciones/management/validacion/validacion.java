package com.Las_4_Estaciones.management.validacion;

import com.Las_4_Estaciones.management.persistencia.Conexion.ConectarBD;
import com.Las_4_Estaciones.management.persistencia.Datos.Reserva;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class validacion {
    public static boolean letrasYNumeros(String palabra){
        String patron = "[a-zA-Z0-9\\s]+";
        return palabra.matches(patron);
    }
    public static boolean email(String palabra){
        String patron = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        return palabra.matches(patron);
    }
    public static boolean hora(String palabra){
        String patron = "^(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$";
        return palabra.matches(patron);
    }
    public static boolean letras(String palabra){
        String patron = "[a-zA-Z\\s]+";
        return palabra.matches(patron);
    }
    public static boolean numeros(String palabra){
        String patron = "\\d+(\\s*\\d+)*";
        return palabra.matches(patron);
    }
    public static boolean validacionReserva(Reserva reservaVieja, Reserva reservaNueva) throws SQLException{
        Connection con = ConectarBD.getConexion();
        String sql = """
                     SELECT * FROM reserva
                     INNER JOIN cliente ON reserva.id_cliente = cliente.id_cliente
                     WHERE (? BETWEEN check_in AND check_out) AND departamento = ? ; 
                     """;
        PreparedStatement query = con.prepareStatement(sql);
        query.setDate(1, new java.sql.Date(reservaNueva.getCheckIn().getTime()));
        query.setString(2, String.valueOf(reservaNueva.getDepartamento()));
        
        ResultSet resultado = query.executeQuery();
        boolean res = resultado.next();
        if (res){
            if(resultado.getString("dni_pasaporte").equals(reservaNueva.getCliente().getDniPasaporte())){
                return true;
            } 
        }
        return !res;
    }
    public static boolean validacionDni(String dniPasaporte) throws SQLException{
        Connection con = ConectarBD.getConexion();
        String sql = """
                     SELECT * FROM cliente
                     WHERE  dni_pasaporte = ?
                     """;
        PreparedStatement query = con.prepareStatement(sql);
        query.setString(1, dniPasaporte);
        
        ResultSet resultado = query.executeQuery();
        return resultado.next();
    }
    public static boolean validacionCheckIn(Date checkIn, String depto) throws SQLException{
        Connection con = ConectarBD.getConexion();
        java.sql.Date sqlDate = new java.sql.Date(checkIn.getTime());
        String sql = """
                     SELECT check_in, check_out, departamento FROM reserva
                     WHERE check_in = ? AND departamento = ?
                     """;
        PreparedStatement query = con.prepareStatement(sql);
        query.setDate(1, sqlDate);
        query.setString(2, depto);
        ResultSet resultado = query.executeQuery();
        return !resultado.next();
    }
    public static boolean validacionReserva(Reserva reservaNueva) throws SQLException{
        Connection con = ConectarBD.getConexion();
        String sql = """
                     SELECT check_in, check_out, departamento FROM reserva
                     WHERE (? BETWEEN check_in AND check_out) AND departamento = ?
                     """;
        PreparedStatement query = con.prepareStatement(sql);
        query.setDate(1, new java.sql.Date(reservaNueva.getCheckIn().getTime()));
        query.setString(2, String.valueOf(reservaNueva.getDepartamento()));
        ResultSet resultado = query.executeQuery();
        return !resultado.next();
    }
  
    public static int validacionCliente(Reserva reservaNueva) throws SQLException{
        Connection con = ConectarBD.getConexion();
        String sql = """
                     SELECT id_cliente, nombre, apellido FROM cliente
                     WHERE dni_pasaporte = ?
                     """;
        PreparedStatement query = con.prepareStatement(sql);
        query.setString(1, reservaNueva.getCliente().getDniPasaporte());
        ResultSet resultado = query.executeQuery();
        if (resultado.next()){
            String nombre = resultado.getString("nombre");
            String apellido = resultado.getString("apellido");
            if(reservaNueva.getCliente().getNombre().equals(nombre) && reservaNueva.getCliente().getApellido().equals(apellido)){
                return resultado.getInt("id_cliente");
            }else{
                return -2;
            }
        }
        return -1;  
    }
    public static boolean isEmpty(JTextField text){
        return text.getText().equals("");
    }
    public static boolean isEmpty(JComboBox select){
        return select.getSelectedItem().equals("Seleccionar");
    }
    public static boolean isEmpty(ButtonGroup buttonGroup) {
        Enumeration<AbstractButton> buttons = buttonGroup.getElements();
        while (buttons.hasMoreElements()) {
            JRadioButton button = (JRadioButton) buttons.nextElement();
            if (button.isSelected()) {
                return false;
            }
        }
        return true;
    }

}
