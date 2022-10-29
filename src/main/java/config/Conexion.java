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
https://www.geeksforgeeks.org/jdbc-using-model-object-and-singleton-class/
 */
public class Conexion {

    private Conexion() {

    }
    //Crear connection para conexion a la base de datos//
    private static Connection conexion = null;
    //Singleton//
    private static Conexion instancia;
    private String BD = "jdbc:postgresql://localhost:5432/prueba";
    private String usuario = "postgres";
    private String contra = "admin";
    private String host = "ec2-54-82-205-3.compute-1.amazonaws.com"; //Heroku

    public Connection conectar() throws SQLException {
        try {
            conexion = (Connection) DriverManager.getConnection(BD, usuario, contra);
            System.out.println("Conexion exitosa Empezamos con la base de datos");
        } catch (Exception e) {
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
