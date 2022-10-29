/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author is-da
 */
public class ConexionR {

    private Connection conectar;
    private String BD;
    private String usuario;
    private String contra;
    private static ConexionR con;

    public ConexionR() {
        this.conectar = null;
        this.BD = "bd_bonill";
        this.usuario = "postgres";
        this.contra = "123456";
    }

    public Connection conectar() {
        try {
            Class.forName("org.postgresql.Driver");
            this.BD = "jdbc:postgresql://localhost:5432/prueba";
            this.usuario = "postgres";
            this.contra = "admin";
            this.conectar = (Connection) DriverManager.getConnection(BD, usuario, contra);
            System.out.println("SE CONECTO");
        } catch (ClassNotFoundException | HeadlessException | SQLException e) {

            System.out.println("Error al conectar: " + e);
        }
        return conectar;
    }

    public Connection getConexion() {
        return conectar;
    }

    public static ConexionR getIntance() {
        if (con == null) {
            con = new ConexionR();
        }
        return con;
    }
}
