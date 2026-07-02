package com.Las_4_Estaciones.management.main;

import com.Las_4_Estaciones.management.GUI.Inicio;
import com.Las_4_Estaciones.management.persistencia.Conexion.ConectarBD;
import io.github.cdimascio.dotenv.Dotenv;
import java.sql.SQLException;


public class Las_4_estaciones {

    public static void main(String[] args) {
        Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();
        String url = dotenv.get("DB_URL", "jdbc:mysql://localhost:3306/bd_las4estaciones");
        String usuario = dotenv.get("DB_USUARIO", "root");
        String contraseña = dotenv.get("DB_CONTRASEÑA", ""); 
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
