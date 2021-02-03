/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profile;

import bean.Plane;
import bean.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author Asus
 */
@WebServlet(name = "profileServlet", urlPatterns = {"/profileServlet"})
public class profileServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException  {
        processRequest(request, response);
        
        String driver = "com.mysql.jdbc.Driver";
        String dbName = "fts";
        String url = "jdbc:mysql://localhost/" + dbName + "?";
        String userName = "root";
        String passWord = "";
        String action = request.getParameter("action");
        
        User user= (User)request.getAttribute("user");
        
        
        
            if (action.equals("VIEW")) {
            try {
                String query = "SELECT * FROM users WHERE id=?";
                Connection con = DriverManager.getConnection(url, userName, passWord);
                PreparedStatement st = con.prepareStatement(query);
                int id = (int) user.getId();
                st.setInt(1, id);
                ResultSet resultSet = st.executeQuery();

                while (resultSet.next()) {
                    
                    
                    user.setId(resultSet.getInt("id"));
                    user.setEmail(resultSet.getString("email"));
                    user.setName(resultSet.getString("username"));
                }

                st.close();
                con.close();
                request.setAttribute("user", user);
                RequestDispatcher rd = request.getRequestDispatcher("profile.jsp");
                rd.forward(request, response);
            } catch (SQLException ex) {
                Logger.getLogger(profileServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            else if (action.equals("EDIT")) {
            try {
                String query = "SELECT * FROM users WHERE id=?";
                Connection con = DriverManager.getConnection(url, userName, passWord);
                PreparedStatement st = con.prepareStatement(query);
                int id = (int) user.getId();
                st.setInt(1, id);
                ResultSet resultSet = st.executeQuery();

                while (resultSet.next()) {
                    
                    
                    user.setId(resultSet.getInt("id"));
                    user.setEmail(resultSet.getString("email"));
                    user.setName(resultSet.getString("username"));
                }

                st.close();
                con.close();
                request.setAttribute("user", user);
                RequestDispatcher rd = request.getRequestDispatcher("editProfile.jsp");
                rd.forward(request, response);
            } catch (SQLException ex) {
                Logger.getLogger(profileServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            else if (action.equals("UPDATE")) {
            try {
                String query = "UPDATE users SET username=?, email=? WHERE id=?";
                Connection con = DriverManager.getConnection(url, userName, passWord);
                PreparedStatement st = con.prepareStatement(query);
                int id = (int) user.getId();
                st.setString(1, user.getName());
                st.setString(2, user.getEmail());
                st.setInt(3, id);
                st.executeUpdate();
                
                

                st.close();
                con.close();
                request.setAttribute("user", user);
                RequestDispatcher rd = request.getRequestDispatcher("/profileServlet>action=VIEW");
                rd.forward(request, response);
            } catch (SQLException ex) {
                Logger.getLogger(profileServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
    }
    

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void sendPage(HttpServletRequest request, HttpServletResponse response, String profilejsp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
