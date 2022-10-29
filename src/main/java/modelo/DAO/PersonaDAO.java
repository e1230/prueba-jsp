/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.DAO;

import config.Conexion;
import config.ConexionR;
import config.ConexionRHeroku;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.DTO.PersonaDTO;
import java.sql.*;

/**
 *
 * @author is-da
 */
public class PersonaDAO {

    //Conexion a la base de datos con Singleton//
   // Conexion con = Conexion.getInstance();
   //ConexionR conR = ConexionR.getIntance();
    ConexionRHeroku conrHeroku = new ConexionRHeroku();
    Connection conexion = null;

    //Sentencias SQL//
    private PreparedStatement ps;
    private ResultSet rs;
    private int r;
    private String sql;

    public PersonaDAO(){
       
    }

    public PersonaDTO validar(String correo, String clave) throws SQLException {
        PersonaDTO objpersona = new PersonaDTO();
        sql = "SELECT * FROM persona WHERE correo=? AND clave=?";
        try {
           // conexion = con.conectar();
          //  conexion = conR.conectar();
          conexion = conrHeroku.conectar();
            ps = conexion.prepareStatement(sql);
            ps.setString(1, correo);
            ps.setString(2, clave);
            rs = ps.executeQuery();
            while (rs.next()) {
                objpersona.setId(rs.getInt("id"));
                objpersona.setNombre(rs.getString("nombre"));
                objpersona.setCorreo(rs.getString("correo"));
                objpersona.setTelefono(rs.getString("telefono"));
                objpersona.setClave(rs.getString("clave"));
               
            }

        } catch (Exception e) {
            System.out.println("Error a validar usuario: " + e);

        }

        return objpersona;

    }
//    public List<PersonaDTO> readAll(){
//        List<PersonaDTO> lista = null;
//        PreparedStatement ps;
//       
//        try{
//        
//            
//        }catch(Exception e){
//            
//        }
//        
//       return lista;
//        
//    }
}
