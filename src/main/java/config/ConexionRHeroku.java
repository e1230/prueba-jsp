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
public class ConexionRHeroku {
      private Connection conectar;
    private String BD;
    private String usuario;
    private String contra;
    private static ConexionRHeroku con;

    public Connection conectar() {
        try {
            Class.forName("org.postgresql.Driver");
            this.BD = "jdbc:postgresql://ec2-44-209-57-4.compute-1.amazonaws.com:5432/d9b8sg4m79k2mk";
            this.usuario = "nqkzpvjjarudjz";
            this.contra = "4ad23efa96673c24005d5e5ecf254c0309310927a1b9e1bd12ef2eeeb2127734";
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

    public static ConexionRHeroku getIntance() {
        if (con == null) {
            con = new ConexionRHeroku();
        }
        return con;
    }
}
