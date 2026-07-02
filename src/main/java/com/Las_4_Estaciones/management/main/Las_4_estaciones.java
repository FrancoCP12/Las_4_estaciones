package com.Las_4_Estaciones.management.main;

import com.Las_4_Estaciones.management.GUI.Inicio;
import com.Las_4_Estaciones.management.persistencia.Conexion.ConectarBD;
import java.sql.SQLException;


public class Las_4_estaciones {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/bd_las4estaciones"; 
        String usuario = "root";     
        String contraseña = ""; 
        try {
            ConectarBD.conectar(url, usuario, contraseña);
            System.out.println("Conexión exitosa a la base de datos.");

            Inicio pantalla = new Inicio();
            pantalla.setVisible(true);
            pantalla.setLocationRelativeTo(null);
            

        
            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                ConectarBD.cerrarConexion();
            }));

        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }
}
