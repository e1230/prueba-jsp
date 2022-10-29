/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebas;

import config.Conexion;
import config.ConexionPrueba;
import config.ConexionR;
import config.ConexionRHeroku;
import java.sql.*;
import modelo.DTO.PersonaDTO;

/**
 *
 * @author is-da
 */
public class main {

    public static void main(String[] args) throws SQLException {
//        Conexion con = Conexion.getInstance();
//        Connection conexion = con.conectar();
//        PersonaDTO objpersona = new PersonaDTO();
//        PreparedStatement ps;
//        ResultSet rs;
//
//        ps = conexion.prepareStatement("SELECT * FROM persona");
//        rs = ps.executeQuery();
//        while (rs.next()) {
//            System.out.println("id: "+rs.getInt("id"));
//            System.out.println("nombre: "+rs.getString("nombre"));
////            objpersona.setId(rs.getInt("id"));
////            objpersona.setNombre(rs.getString("nombre"));
////            objpersona.setCorreo(rs.getString("correo"));
////            objpersona.setTelefono(rs.getString("telefono"));
////            objpersona.setClave(rs.getString("clave"));
////            objpersona.toString();
//        }
//        System.out.println("Hola probando");
//
////          ConexionPrueba pos = new ConexionPrueba();
////          pos.Conection();
//

        ConexionRHeroku pruebaR = new ConexionRHeroku();
        pruebaR.conectar();
        Connection conexion = pruebaR.getConexion();
        PersonaDTO objpersona = new PersonaDTO();
        PreparedStatement ps;
        ResultSet rs;

        ps = conexion.prepareStatement("SELECT * FROM persona");
        rs = ps.executeQuery();
        while (rs.next()) {
            System.out.println("id: " + rs.getInt("id"));
            System.out.println("nombre: " + rs.getString("nombre"));
            System.out.println("Correo: "+rs.getString("correo"));
            System.out.println("Clave: "+rs.getString("clave"));
//            objpersona.setId(rs.getInt("id"));
//            objpersona.setNombre(rs.getString("nombre"));
//            objpersona.setCorreo(rs.getString("correo"));
//            objpersona.setTelefono(rs.getString("telefono"));
//            objpersona.setClave(rs.getString("clave"));
//            objpersona.toString();
        }
        System.out.println("Hola probando");

    }
}
