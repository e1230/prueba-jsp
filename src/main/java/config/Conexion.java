/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

/**
 *
 * @author administradorPC
 */

/*
Group ID: org.postgresql
Artifact ID: postgresql
Versión: 9.4.1208

 */
public class Conexion {

    private Conexion() {

    }
    //Crear connection para conexion a la base de datos//
    private static Connection conexion = null;
    //Singleton//
    private static Conexion instancia;

    private String BD = "d463ke2mhm8np0";
    private String usuario = "kmexxmxwgkmyii";
    private String contra = "4432729b89254410e668fae7e926738dbddd3db0b590e86d05bfdbf34b89dffe";
    private String host = "ec2-54-82-205-3.compute-1.amazonaws.com";

    public Connection conectar() {
        try {
            Class.forName("org.postgresql.Driver");
            conexion = (Connection) DriverManager.getConnection(BD, usuario, contra);
            System.out.println("Conexion exitosa");
        } catch (ClassNotFoundException | HeadlessException | SQLException e) {
            System.out.println("Error a conectar a la BD: " + e);
        }
        return conexion;
    }
    //Metodo para cerrar la conexión//

    public void cerrarConexion() throws SQLException {
        try {
            conexion.close();
            System.out.println("Se desconecto de la BD");
        } catch (Exception e) {
            System.out.println("Error a cerra conexion: " + e);
            conexion.close();
        } finally {
            conexion.close();
        }
    }

    //Patron Singleton//
    public static Conexion getInstance() {
        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;
    }
}
