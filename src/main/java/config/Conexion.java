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
    private String contrasenia;


    public Conexion(Connection conectar, String BD, String usuario, String contrasenia) {
        this.conectar = conectar;
        this.BD = BD;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }

     public Conexion() {
        this.conectar = null;
        this.BD = "";
        this.usuario = "";
        this.contrasenia = "";
    }
    
    public void conectar(){
        try{
            Class.forName("org.postgresql.Driver");
            this.BD = "";
            this.usuario = "";
            this.contrasenia = "";
            this.conectar = (Connection) DriverManager.getConnection(BD, usuario, contrasenia);
        }catch(ClassNotFoundException | HeadlessException | SQLException e){
            System.out.println("Error a conectar: "+e);
        }
    }
    
    public Connection getConexion(){
        return conectar;
    }
}