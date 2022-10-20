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

    private Connection conectar;
    private String BD;
    private String usuario;
    private String contra;

    public Conexion(Connection conectar, String BD, String usuario, String contra) {
        this.conectar = conectar;
        this.BD = BD;
        this.usuario = usuario;
        this.contra = contra;
    }

    public Conexion() {
        this.conectar = null;
        this.BD = "\\\"jdbc:postgresql://ec2-54-211-77-\n"
                + "238.compute-1.amazonaws.com:5432/(d463ke2mhm8np0)?sslmode=require\\";
        this.usuario = "kmexxmxwgkmyii";
        this.contra = "4432729b89254410e668fae7e926738dbddd3db0b590e86d05bfdbf34b89dffe";
    }

    public void conectar() {
        try {
            Class.forName("org.postgresql.Driver");
            this.BD = "";
            this.usuario = "";
            this.contra = "";
            this.conectar = (Connection) DriverManager.getConnection(BD, usuario, contra);
        } catch (ClassNotFoundException | HeadlessException | SQLException e) {
            System.out.println("Error a conectar: " + e);
        }
    }

    public Connection getConexion() {
        return conectar;
    }
}
