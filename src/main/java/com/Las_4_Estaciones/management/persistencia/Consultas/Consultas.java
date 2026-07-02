package com.Las_4_Estaciones.management.persistencia.Consultas;
import com.Las_4_Estaciones.management.persistencia.Datos.Reserva;
import com.Las_4_Estaciones.management.persistencia.Datos.VehiculoPropio;
import com.Las_4_Estaciones.management.persistencia.Datos.VehiculoContratado;
import com.Las_4_Estaciones.management.persistencia.Conexion.ConectarBD;
import com.Las_4_Estaciones.management.persistencia.Datos.Cliente;
import com.Las_4_Estaciones.management.persistencia.Datos.Departamento;
import com.Las_4_Estaciones.management.persistencia.Datos.MetodoPago;
import com.Las_4_Estaciones.management.persistencia.Datos.TipoVehiculo;
import static com.Las_4_Estaciones.management.persistencia.Datos.TipoVehiculo.AVION;
import static com.Las_4_Estaciones.management.persistencia.Datos.TipoVehiculo.COLECTIVO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class Consultas {
        public static void deleteCliente(String dniPasaporte) throws SQLException{
            Connection con = ConectarBD.getConexion();
            String sql = """
                         DELETE FROM cliente
                         WHERE dni_pasaporte = ?;
                         """;
            PreparedStatement query = con.prepareStatement(sql);
            query.setString(1, dniPasaporte);
            query.executeUpdate();
        }
        public static void deleteReserva(Date checkIn, String dpto) throws SQLException{
            Connection con = ConectarBD.getConexion();
            String sqlIdVehiculo = """
                                   SELECT id_vehiculo FROM reserva
                                   WHERE check_in = ? AND departamento = ?;
                                   """;
            PreparedStatement queryId = con.prepareStatement(sqlIdVehiculo);
            queryId.setDate(1, new java.sql.Date(checkIn.getTime()));
            queryId.setString(2, dpto);
            ResultSet resultado = queryId.executeQuery();
            int idVehiculo = 0;
            if(resultado.next()){
                idVehiculo = resultado.getInt("id_vehiculo");
            }
            String sqlReserva = """
                         DELETE FROM reserva
                         WHERE check_in = ? AND departamento = ?;
                         """;
            PreparedStatement queryReserva = con.prepareStatement(sqlReserva);
            queryReserva.setDate(1, new java.sql.Date(checkIn.getTime()));
            queryReserva.setString(2, dpto);
            queryReserva.executeUpdate();

            String sqlVehiculo = """
                         DELETE FROM vehiculo
                         WHERE id_vehiculo = ?;
                         """;
            PreparedStatement queryVehiculo = con.prepareStatement(sqlVehiculo);
            queryVehiculo.setInt(1, idVehiculo);
            queryVehiculo.executeUpdate();
        }

        public static void updateReserva(Reserva reserva, Reserva viejaReserva) throws SQLException{
        Cliente cliente = reserva.getCliente();
        int idReserva = 0;
        int idCliente = 0;
        int idVehiculo = 0;
        Connection con = ConectarBD.getConexion();
        PreparedStatement queryOldReserva = con.prepareStatement("SELECT id_reserva, id_cliente, id_vehiculo FROM reserva WHERE check_in = ? AND departamento = ?");
        queryOldReserva.setDate(1, new java.sql.Date(viejaReserva.getCheckIn().getTime()));
        queryOldReserva.setString(2, viejaReserva.getDepartamento().toString());
        ResultSet resultado  = queryOldReserva.executeQuery();
        if(resultado.next()){
            idReserva = resultado.getInt("id_reserva");
            idCliente = resultado.getInt("id_cliente");
            idVehiculo = resultado.getInt("id_vehiculo");
        }
        String sqlClinte ="""
                          UPDATE cliente
                          SET  direccion = ?, email = ?, telefono = ?
                          WHERE id_cliente = ?;                          
                    """;
        PreparedStatement queryCliente = con.prepareStatement(sqlClinte);

        queryCliente.setString(1, cliente.getDireccion());
        queryCliente.setString(2, cliente.getEmail());
        queryCliente.setLong(3, cliente.getTelefono());
        queryCliente.setInt(4, idCliente);
        queryCliente.executeUpdate();
        if(reserva.getVehiculo().getTipoVehiculo().equals(COLECTIVO) || reserva.getVehiculo().getTipoVehiculo().equals(AVION)){
            VehiculoContratado vehiculo = (VehiculoContratado) reserva.getVehiculo();
            String sqlVehiculo ="""
                          UPDATE vehiculo SET hora_partida = ?, hora_llegada = ?, origen = ?, patente = ?, marca_modelo = ?, empresa = ?, tipo_vehiculo = ?
                          WHERE id_vehiculo = ?;        
                    """;
            PreparedStatement queryVehiculo = con.prepareStatement(sqlVehiculo);
            queryVehiculo.setString(1,vehiculo.getHoraPartida());
            queryVehiculo.setString(2,vehiculo.getHoraLlegada());
            queryVehiculo.setString(3, vehiculo.getOrigen());
            queryVehiculo.setString(4, "NULL");
            queryVehiculo.setString(5, "NULL");
            queryVehiculo.setString(6, vehiculo.getEmpresa());
            queryVehiculo.setString(7,String.valueOf(vehiculo.getTipoVehiculo()));
            queryVehiculo.setInt(8, idVehiculo);
            queryVehiculo.executeUpdate();        
        }else{
            VehiculoPropio vehiculo = (VehiculoPropio) reserva.getVehiculo();
            String sqlVehiculo ="""
                          UPDATE vehiculo SET hora_partida = ?, hora_llegada = ?, origen = ?, patente = ?, modelo_marca = ?, empresa = ?, tipo_vehiculo = ?
                          WHERE id_vehiculo = ?;
                          """;
            PreparedStatement queryVehiculo = con.prepareStatement(sqlVehiculo);
            queryVehiculo.setString(1,vehiculo.getHoraPartida());
            queryVehiculo.setString(2,vehiculo.getHoraLlegada());
            queryVehiculo.setString(3, vehiculo.getOrigen());
            queryVehiculo.setString(4, vehiculo.getPatente());
            queryVehiculo.setString(5, vehiculo.getMarcaModelo());
            queryVehiculo.setString(6, "NULL");
            queryVehiculo.setString(7,String.valueOf(vehiculo.getTipoVehiculo()));
            queryVehiculo.setInt(8, idVehiculo);
            queryVehiculo.executeUpdate();
        }

            String sqlReserva ="""
                          UPDATE reserva SET id_cliente = ?, check_in = ?, check_out = ?, departamento = ?, id_vehiculo = ?, ctd_adultos = ?, ctd_menores = ?, metodo_pago = ?
                          WHERE id_reserva = ?;
                               """;
            PreparedStatement queryReserva = con.prepareStatement(sqlReserva);
            queryReserva.setInt(1, idCliente);
            queryReserva.setDate(2,new java.sql.Date(reserva.getCheckIn().getTime()));
            queryReserva.setDate(3,new java.sql.Date(reserva.getCheckOut().getTime()));
            queryReserva.setString(4, reserva.getDepartamento().toString());        
            queryReserva.setInt(5, idVehiculo);
            queryReserva.setInt(6, reserva.getCtdAdultos());
            queryReserva.setInt(7, reserva.getCtdMenores());
            queryReserva.setString(8, reserva.getMetodoPago().toString());
            queryReserva.setInt(9, idReserva);
            queryReserva.executeUpdate();

    }
    public static void setReserva(Reserva reserva, int idCliente) throws SQLException{
        Connection con = ConectarBD.getConexion();
        int idVehiculo = 0;
        
        if(reserva.getVehiculo().getTipoVehiculo().equals(COLECTIVO) || reserva.getVehiculo().getTipoVehiculo().equals(AVION)){
            VehiculoContratado vehiculo = (VehiculoContratado) reserva.getVehiculo();
            String sqlVehiculo ="""
                          INSERT INTO vehiculo (hora_partida, hora_llegada, origen, empresa, tipo_vehiculo) VALUES (?, ?, ?, ?, ?);
                          
                    """;
            PreparedStatement queryVehiculo = con.prepareStatement(sqlVehiculo, Statement.RETURN_GENERATED_KEYS);
            queryVehiculo.setString(1,vehiculo.getHoraPartida());
            queryVehiculo.setString(2,vehiculo.getHoraLlegada());
            queryVehiculo.setString(3, vehiculo.getOrigen());
            queryVehiculo.setString(4, vehiculo.getEmpresa());
            queryVehiculo.setString(5,String.valueOf(vehiculo.getTipoVehiculo()));
            queryVehiculo.executeUpdate();
            ResultSet resultadoVehiculo = queryVehiculo.getGeneratedKeys();
            if(resultadoVehiculo.next()){
                idVehiculo = resultadoVehiculo.getInt(1);
            }
            
        
        }else{
            VehiculoPropio vehiculo = (VehiculoPropio) reserva.getVehiculo();
            String sqlVehiculo ="""
                          INSERT INTO vehiculo (hora_partida, hora_llegada, origen, patente, modelo_marca, tipo_vehiculo) VALUES (?, ?, ?, ?, ?, ?);
                    """;
            PreparedStatement queryVehiculo = con.prepareStatement(sqlVehiculo,Statement.RETURN_GENERATED_KEYS);
            queryVehiculo.setString(1,vehiculo.getHoraPartida());
            queryVehiculo.setString(2,vehiculo.getHoraLlegada());
            queryVehiculo.setString(3, vehiculo.getOrigen());
            queryVehiculo.setString(4, vehiculo.getPatente());
            queryVehiculo.setString(5, vehiculo.getMarcaModelo());
            queryVehiculo.setString(6,String.valueOf(vehiculo.getTipoVehiculo()));
            queryVehiculo.executeUpdate();
            ResultSet resultadoVehiculo = queryVehiculo.getGeneratedKeys();
            if(resultadoVehiculo.next()){
                idVehiculo = resultadoVehiculo.getInt(1);
            }
 
        }
        
            String sqlReserva ="""
                          INSERT INTO reserva (id_cliente, check_in, check_out, departamento, id_vehiculo, ctd_adultos, ctd_menores, metodo_pago) VALUES (?, ?, ?, ?, ?, ?, ?, ?);
                          
                               """;
            PreparedStatement queryReserva = con.prepareStatement(sqlReserva);
            queryReserva.setInt(1, idCliente);
            queryReserva.setDate(2,new java.sql.Date(reserva.getCheckIn().getTime()));
            queryReserva.setDate(3,new java.sql.Date(reserva.getCheckOut().getTime()));
            queryReserva.setString(4, reserva.getDepartamento().toString());        
            queryReserva.setInt(5, idVehiculo);
            queryReserva.setInt(6, reserva.getCtdAdultos());
            queryReserva.setInt(7, reserva.getCtdMenores());
            queryReserva.setString(8, reserva.getMetodoPago().toString());
            queryReserva.executeUpdate();

        
    
    }

    public static void setReserva(Reserva reserva) throws SQLException{
        Cliente cliente = reserva.getCliente();
        Connection con = ConectarBD.getConexion();
        int idCliente = 0;
        int idVehiculo = 0;
        String sqlClinte ="""
                          INSERT INTO cliente (nombre, apellido, direccion, email, dni_pasaporte, telefono) VALUES (?, ?, ?, ?, ?, ?);
                          
                    """;
        PreparedStatement queryCliente = con.prepareStatement(sqlClinte, Statement.RETURN_GENERATED_KEYS);
        queryCliente.setString(1, cliente.getNombre());
        queryCliente.setString(2, cliente.getApellido());
        queryCliente.setString(3, cliente.getDireccion());
        queryCliente.setString(4, cliente.getEmail());
        queryCliente.setString(5, cliente.getDniPasaporte());
        queryCliente.setLong(6, cliente.getTelefono());
        queryCliente.executeUpdate();
        ResultSet resultadoCliente = queryCliente.getGeneratedKeys();;
        if(resultadoCliente.next()){
            idCliente = resultadoCliente.getInt(1);
            }
        if(reserva.getVehiculo().getTipoVehiculo().equals(COLECTIVO) || reserva.getVehiculo().getTipoVehiculo().equals(AVION)){
            VehiculoContratado vehiculo = (VehiculoContratado) reserva.getVehiculo();
            String sqlVehiculo ="""
                          INSERT INTO vehiculo (hora_partida, hora_llegada, origen, empresa, tipo_vehiculo) VALUES (?, ?, ?, ?, ?);
                          
                    """;
            PreparedStatement queryVehiculo = con.prepareStatement(sqlVehiculo, Statement.RETURN_GENERATED_KEYS);
            queryVehiculo.setString(1,vehiculo.getHoraPartida());
            queryVehiculo.setString(2,vehiculo.getHoraLlegada());
            queryVehiculo.setString(3, vehiculo.getOrigen());
            queryVehiculo.setString(4, vehiculo.getEmpresa());
            queryVehiculo.setString(5,String.valueOf(vehiculo.getTipoVehiculo()));
            queryVehiculo.executeUpdate();
            ResultSet resultadoVehiculo = queryVehiculo.getGeneratedKeys();
            if(resultadoVehiculo.next()){
                idVehiculo = resultadoVehiculo.getInt(1);
            }
            
        
        }else{
            VehiculoPropio vehiculo = (VehiculoPropio) reserva.getVehiculo();
            String sqlVehiculo ="""
                          INSERT INTO vehiculo (hora_partida, hora_llegada, origen, patente, modelo_marca, tipo_vehiculo) VALUES (?, ?, ?, ?, ?, ?);
                    """;
            PreparedStatement queryVehiculo = con.prepareStatement(sqlVehiculo,Statement.RETURN_GENERATED_KEYS);
            queryVehiculo.setString(1,vehiculo.getHoraPartida());
            queryVehiculo.setString(2,vehiculo.getHoraLlegada());
            queryVehiculo.setString(3, vehiculo.getOrigen());
            queryVehiculo.setString(4, vehiculo.getPatente());
            queryVehiculo.setString(5, vehiculo.getMarcaModelo());
            queryVehiculo.setString(6,String.valueOf(vehiculo.getTipoVehiculo()));
            queryVehiculo.executeUpdate();
            ResultSet resultadoVehiculo = queryVehiculo.getGeneratedKeys();
            if(resultadoVehiculo.next()){
                idVehiculo = resultadoVehiculo.getInt(1);
            }
 
        }
        
            String sqlReserva ="""
                          INSERT INTO reserva (id_cliente, check_in, check_out, departamento, id_vehiculo, ctd_adultos, ctd_menores, metodo_pago) VALUES (?, ?, ?, ?, ?, ?, ?, ?);
                          
                               """;
            PreparedStatement queryReserva = con.prepareStatement(sqlReserva);
            queryReserva.setInt(1, idCliente);
            queryReserva.setDate(2,new java.sql.Date(reserva.getCheckIn().getTime()));
            queryReserva.setDate(3,new java.sql.Date(reserva.getCheckOut().getTime()));
            queryReserva.setString(4, reserva.getDepartamento().toString());        
            queryReserva.setInt(5, idVehiculo);
            queryReserva.setInt(6, reserva.getCtdAdultos());
            queryReserva.setInt(7, reserva.getCtdMenores());
            queryReserva.setString(8, reserva.getMetodoPago().toString());
            queryReserva.executeUpdate();

        
    
    }
    public static Reserva getReserva(String porDniPasaporte, String depto) throws SQLException {
        
        Connection con = ConectarBD.getConexion();
        String sql = """
                     SELECT * FROM reserva  
                     INNER JOIN cliente ON reserva.id_cliente = cliente.id_cliente
                     INNER JOIN vehiculo ON reserva.id_vehiculo = vehiculo.id_vehiculo
                     WHERE dni_pasaporte = ? AND departamento = ?;""";
        
        PreparedStatement query = con.prepareStatement(sql);
        query.setString(1, porDniPasaporte);
        query.setString(2, depto);
        ResultSet resultado = query.executeQuery();
        if (resultado.next()) {
                Date checkIn = resultado.getDate("check_in");
                Date checkOut = resultado.getDate("check_out");
                int ctdAdultos =  resultado.getInt("ctd_adultos");
                int ctdMenores =  resultado.getInt("ctd_menores");
                String nombre = resultado.getString("nombre");
                String apellido = resultado.getString("apellido");
                String direccion = resultado.getString("direccion");
                String email = resultado.getString("email");
                String dniPasaporte = resultado.getString("dni_pasaporte");
                long telefono =  resultado.getLong("telefono");
                Departamento departamento = Departamento.valueOf(resultado.getString("departamento"));
                String horaPartida = resultado.getString("hora_partida");
                String horaLlegada = resultado.getString("hora_llegada");
                String origen = resultado.getString("origen");
                String tipoVehiculo = resultado.getString("tipo_vehiculo");
                MetodoPago metodoPago = MetodoPago.valueOf(resultado.getString("metodo_pago"));
                if("COLECTIVO".equals(tipoVehiculo) || tipoVehiculo.equals("AVION")){
                    String empresa = resultado.getString("empresa");
                    resultado.close();
                    Cliente cliente = new Cliente(nombre, apellido, dniPasaporte, telefono, direccion, email);
                    VehiculoContratado vehiculo = new VehiculoContratado(horaPartida, horaLlegada, origen, empresa, TipoVehiculo.valueOf(tipoVehiculo));
                    return new Reserva(cliente, checkIn, checkOut, departamento, vehiculo, metodoPago, ctdAdultos, ctdMenores);
                             

                }else{
                    String modeloMarca = resultado.getString("modelo_marca");
                    String patente = resultado.getString("patente");
                    
                    Cliente cliente = new Cliente(nombre, apellido, dniPasaporte, telefono, direccion, email);
                    VehiculoPropio vehiculo = new VehiculoPropio(horaPartida, horaLlegada, origen, patente, modeloMarca, TipoVehiculo.valueOf(tipoVehiculo));
                    return new Reserva(cliente, checkIn, checkOut, departamento, vehiculo, metodoPago, ctdAdultos, ctdMenores);

                }
             
                
        } else {
                
                System.out.println("No se encontró ningún cliente con el código " );
                return null;
            }

      
        
        
    }
    public static Reserva getReserva(java.sql.Date porFecha, String depto) throws SQLException {
        System.out.print(porFecha);
        Connection con = ConectarBD.getConexion();
        String sql = """
                     SELECT * FROM reserva  
                     INNER JOIN cliente ON reserva.id_cliente = cliente.id_cliente
                     INNER JOIN vehiculo ON reserva.id_vehiculo = vehiculo.id_vehiculo
                     WHERE check_in = ? AND departamento = ?;""";
        
        PreparedStatement query = con.prepareStatement(sql);
        query.setDate(1, porFecha);
        query.setString(2, depto);
        ResultSet resultado = query.executeQuery();
        if (resultado.next()) {
                Date checkIn = resultado.getDate("check_in");
                Date checkOut = resultado.getDate("check_out");
                int ctdAdultos =  resultado.getInt("ctd_adultos");
                int ctdMenores =  resultado.getInt("ctd_menores");
                String nombre = resultado.getString("nombre");
                String apellido = resultado.getString("apellido");
                String direccion = resultado.getString("direccion");
                String email = resultado.getString("email");
                String dniPasaporte = resultado.getString("dni_pasaporte");
                long telefono =  resultado.getLong("telefono");
                Departamento departamento = Departamento.valueOf(resultado.getString("departamento"));
                String horaPartida = resultado.getString("hora_partida");
                String horaLlegada = resultado.getString("hora_llegada");
                String origen = resultado.getString("origen");
                String tipoVehiculo = resultado.getString("tipo_vehiculo");
                MetodoPago metodoPago = MetodoPago.valueOf(resultado.getString("metodo_pago"));
                if("COLECTIVO".equals(tipoVehiculo) || tipoVehiculo.equals("AVION")){
                    String empresa = resultado.getString("empresa");
                    resultado.close();
                    Cliente cliente = new Cliente(nombre, apellido, dniPasaporte, telefono, direccion, email);
                    VehiculoContratado vehiculo = new VehiculoContratado(horaPartida, horaLlegada, origen, empresa, TipoVehiculo.valueOf(tipoVehiculo));
                    return new Reserva(cliente, checkIn, checkOut, departamento, vehiculo, metodoPago, ctdAdultos, ctdMenores);
                             

                }else{
                    String modeloMarca = resultado.getString("modelo_marca");
                    String patente = resultado.getString("patente");
                    
                    Cliente cliente = new Cliente(nombre, apellido, dniPasaporte, telefono, direccion, email);
                    VehiculoPropio vehiculo = new VehiculoPropio(horaPartida, horaLlegada, origen, patente, modeloMarca, TipoVehiculo.valueOf(tipoVehiculo));
                    return new Reserva(cliente, checkIn, checkOut, departamento, vehiculo, metodoPago, ctdAdultos, ctdMenores);

                }
             
                
        } else {
                
                
                System.out.println("No se encontró ningún cliente con el código " );
                return null;
            }

      
        
        
    }
    

public static Reserva getReservaPorFechaOProxima(java.sql.Date fechaBuscada, Departamento depto) throws SQLException {
    Connection con = ConectarBD.getConexion();
    

    String sqlExacta = """
        SELECT * FROM reserva
        INNER JOIN cliente ON reserva.id_cliente = cliente.id_cliente
        INNER JOIN vehiculo ON reserva.id_vehiculo = vehiculo.id_vehiculo
        WHERE ? BETWEEN DATE(check_in) AND DATE(check_out) AND departamento = ?
        LIMIT 1;
    """;

    PreparedStatement query = con.prepareStatement(sqlExacta);
    query.setDate(1, fechaBuscada);
    

    query.setString(2, String.valueOf(depto));
    ResultSet resultado = query.executeQuery();
    boolean encontrado = resultado.next(); 

    if (!encontrado) {
        resultado.close();
        query.close();
        

        String sqlProxima = """
            SELECT * FROM reserva
            INNER JOIN cliente ON reserva.id_cliente = cliente.id_cliente
            INNER JOIN vehiculo ON reserva.id_vehiculo = vehiculo.id_vehiculo
            WHERE check_in > ? AND departamento = ?
            ORDER BY check_in ASC
            LIMIT 1;
        """;
        
        query = con.prepareStatement(sqlProxima);
        query.setDate(1, fechaBuscada);
        query.setString(2, String.valueOf(depto));
        resultado = query.executeQuery();
        encontrado = resultado.next();
    }


    if (encontrado) {
        
        Date checkIn = resultado.getDate("check_in");
        Date checkOut = resultado.getDate("check_out");
        int ctdAdultos = resultado.getInt("ctd_adultos");
        int ctdMenores = resultado.getInt("ctd_menores");
        String nombre = resultado.getString("nombre");
        String apellido = resultado.getString("apellido");
        String direccion = resultado.getString("direccion");
        String email = resultado.getString("email");
        String dniPasaporte = resultado.getString("dni_pasaporte");
        long telefono = resultado.getLong("telefono");
        Departamento departamento = Departamento.valueOf(resultado.getString("departamento"));
        String horaPartida = resultado.getString("hora_partida");
        String horaLlegada = resultado.getString("hora_llegada");
        String origen = resultado.getString("origen");
        String tipoVehiculo = resultado.getString("tipo_vehiculo");
        MetodoPago metodoPago = MetodoPago.valueOf(resultado.getString("metodo_pago"));
        System.out.println("HORASQL:" + checkIn);
        if ("COLECTIVO".equals(tipoVehiculo) || "AVION".equals(tipoVehiculo)) {
            String empresa = resultado.getString("empresa");
            resultado.close();
            Cliente cliente = new Cliente(nombre, apellido, dniPasaporte, telefono, direccion, email);
            VehiculoContratado vehiculo = new VehiculoContratado(horaPartida, horaLlegada, origen, empresa, TipoVehiculo.valueOf(tipoVehiculo));
            return new Reserva(cliente, checkIn, checkOut, departamento, vehiculo, metodoPago, ctdAdultos, ctdMenores);
        } else {
            String modeloMarca = resultado.getString("modelo_marca");
            String patente = resultado.getString("patente");
            resultado.close();
            Cliente cliente = new Cliente(nombre, apellido, dniPasaporte, telefono, direccion, email);
            VehiculoPropio vehiculo = new VehiculoPropio(horaPartida, horaLlegada, origen, patente, modeloMarca, TipoVehiculo.valueOf(tipoVehiculo));
            return new Reserva(cliente, checkIn, checkOut, departamento, vehiculo, metodoPago, ctdAdultos, ctdMenores);
        }
    }


    return null;
}

    

    
}


