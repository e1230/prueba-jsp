/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controlador;

import com.sun.java.swing.plaf.windows.resources.windows;
import static java.awt.SystemColor.window;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.DAO.PersonaDAO;
import modelo.DTO.PersonaDTO;

/**
 *
 * @author is-da
 */
public class Controlador extends HttpServlet {

    PersonaDTO objpersoDTO = new PersonaDTO();
    PersonaDAO objpersoDAO = new PersonaDAO();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {

        String accion = request.getParameter("accion");

        if (accion.equals("ingresarLogin")) {

            String username = request.getParameter("txt_username");
            String password = request.getParameter("txt_password");
            //Metodo para validar usuario//
            objpersoDTO = objpersoDAO.validar(username, password);           
                if (objpersoDTO.getCorreo() != null) {
                    request.getRequestDispatcher("principal.jsp").forward(request, response);
                    System.out.println("Deberia Funcionar DB");
                }
                else{
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                    System.out.println("información no esta en BD");
                }
        }
        else{
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
