/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transaction;

import bean.Features;
import bean.Schedule;
import booking.Booking;
import booking.bookingServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
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
@WebServlet(name = "transactionServlet", urlPatterns = {"/transaction"})
public class transactionServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    void sendPage(HttpServletRequest req, HttpServletResponse res, String fileName) throws ServletException, IOException
    
    {
        RequestDispatcher dispatcher = getServletContext () .getRequestDispatcher (fileName);
        
        if (dispatcher == null)
        {
            System.out.println ("No dispatcher found");
            //html file not found.
            res.sendError(HttpServletResponse.SC_NO_CONTENT);
                    
        }
         
        else
            dispatcher.forward(req, res);
        
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
            throws ServletException, IOException {
        String driver = "com.mysql.jdbc.Driver";
            String dbName = "fts";
            String url = "jdbc:mysql://localhost/" + dbName + "?";
            String userName = "root";
            String passWord = "";
            
            
            
            ArrayList list = new ArrayList ();
            String action = request.getParameter("action");
            
            try {
                Class.forName(driver);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(bookingServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                
                
                if (action.equals("VIEW")) {
                    
                    String query = "SELECT * FROM booking";                              
                    Connection con = DriverManager.getConnection(url, userName, passWord);
                    Statement st = con.createStatement();
                    ResultSet resultSet = st.executeQuery(query);
                    
                                      
                    while(resultSet.next()) {
                        
                          
                                          
                        Booking booking = new Booking();
                        booking.setId(resultSet.getInt("id"));
                        booking.setNumofpas(resultSet.getInt("numofpas"));
                        booking.setSeatCat(resultSet.getString("seatCat"));
                        booking.setBaggage(resultSet.getInt("baggage"));
                        booking.setBooking(resultSet.getDate("booking"));
                                                                 
                        list.add(booking);     
                        
                    }                  
                    
                    
                    st.close();
                    con.close();
                    
                    request.setAttribute("list", list);
                    sendPage(request, response, "/adminUserTransaction.jsp");
                    
                }  
            } catch (SQLException e) {
                e.printStackTrace();
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

}
