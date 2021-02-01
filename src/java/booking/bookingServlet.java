/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booking;

import bean.booking;
import bean.Flight1;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
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
 * @author SwarnnaNagesvaran
 */
@WebServlet(name = "bookingServlet", urlPatterns = {"/bookingServlet"})
public class bookingServlet extends HttpServlet {
    
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
                
                
                if (action.equals("VIEW"))                    
                {
                     String query = "SELECT * FROM Flight";
                     Connection con = DriverManager.getConnection(url, userName,passWord);
                     Statement st = con.createStatement();
                     ResultSet resultSet = st.executeQuery(query);
                     
                     while(resultSet.next()) {
                         
                         Flight1 Flight = new Flight1();
                         Flight.setId(resultSet.getInt(1));
                         Flight.setFlightNo(resultSet.getString(2));
                         Flight.setDeparture(resultSet.getString(3));
                         Flight.setDestination(resultSet.getString(4));
                         Flight.setDepatureTime(resultSet.getTime(5));
                         Flight.setArrivalTime(resultSet.getTime(6));
                         Flight.setDuration(resultSet.getTimestamp(7));
                         Flight.setEconomicPrice(resultSet.getDouble(8));
                         Flight.setBusinnessPrice(resultSet.getDouble(9));
                         Flight.setFirstclassPrice(resultSet.getDouble(10));
                         list.add(Flight);                                            
    
                     }
                     
                         st.close();
                         con.close();
                         
                         request.setAttribute("list", list);
                         sendPage (request, response, "/viewFlight.jsp");                       
                
                                                    
                               
                } else if (action.equals("VIEWBOOKING")) {
                    
                    String query = "SELECT * FROM booking";
                    Connection con = DriverManager.getConnection(url, userName, passWord);
                    Statement st = con.createStatement();
                    ResultSet resultSet = st.executeQuery(query);
                    
                    while(resultSet.next()) {
                        
                        booking booking = new booking ();
                        booking.setId(resultSet.getInt(1));
                        booking.setNameofPas(resultSet.getString(2));
                        booking.setDeparture(resultSet.getString(3));
                        booking.setDestination(resultSet.getString(4));
                        booking.setDepartureDate(resultSet.getDate(5));
                        booking.setDepartureTime(resultSet.getTime(6));
                        booking.setArrivalTime(resultSet.getTime(7));
                        
                        list.add(booking);                   
                    }
                    
                    st.close();
                    con.close();
                    
                    request.setAttribute("list", list);
                    sendPage(request, response, "/bookingHistory.jsp");
                    
                } else if (action.equals("CHECKOUT")){
                
                        String query = "INSERT INTO booking(nameofPas, numofPas, baggage, nameofPay, cardNum, expiry, cvv) VALUES(?,?,?,?, ?, ?,?)";
                        Connection con = DriverManager.getConnection(url, userName, passWord);
                        PreparedStatement st= con.prepareStatement(query);
                        
                        String nameofPas = request.getParameter("nameofPas");
                        int numofPas = Integer.parseInt(request.getParameter("numofPas"));
                        int baggage = Integer.parseInt(request.getParameter("baggage"));
                        String nameofPay = request.getParameter("nameofPay");
                        String cardNum = request.getParameter("cardNum");
                        String expiry = request.getParameter("expiry");
                        String cvv = request.getParameter("cvv");
        
                        st.setString(1,nameofPas);
                        st.setDouble(2,numofPas);
                        st.setInt(3,baggage);
                        st.setString(4,nameofPay);
                        st.setString(5,cardNum);
                        st.setString(6,expiry);
                        st.setString(7, cvv);
                        
                         
                        st.executeUpdate();
        
                                
                        st.close(); 
                        con.close();
                        
                         
                         RequestDispatcher rd = request.getRequestDispatcher("bookingHistory.jsp");
                         rd.forward(request,response);
                         
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
        doGet(request, response);
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
