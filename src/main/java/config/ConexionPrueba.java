/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;
import java.sql.*;

/**
 *
 * @author is-da
 */
public class ConexionPrueba {
    String BD = "jdbc:postgresql://localhost:5432/prueba";
    String usuario = "postgres";
    String clave = "admin";
    
  public void Conection(){
      try{
          Connection conectar = DriverManager.getConnection(BD, usuario, clave);
          System.out.println("Base de datos conectado con EXITO");
      }catch(Exception e){
          System.out.println("NO se CONECTO a la Base de DATOS: "+e);
      }
  }
}
