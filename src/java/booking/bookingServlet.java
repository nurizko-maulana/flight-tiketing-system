/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booking;


import booking.Booking;
import bean.Schedule;
import bean.Features;
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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import user.Validate;

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
                     String query = "SELECT * FROM `schedule` WHERE departureDate BETWEEN CURDATE() and '2021-12-12' AND approve=1";
                     Connection con = DriverManager.getConnection(url, userName,passWord);
                     Statement st = con.createStatement();
                     ResultSet resultSet = st.executeQuery(query);
                     
                     while(resultSet.next()) {
                         
                         Schedule schedule = new Schedule();   
                         schedule.setId(resultSet.getInt("id"));
                         schedule.setPlane_id(resultSet.getInt("plane_id"));
                         schedule.setDestination_arrival(resultSet.getString("destination_arrival"));
                         schedule.setDepartureDate(resultSet.getDate("departureDate"));
                         schedule.setDepartureTime(resultSet.getTime("departureTime"));
                         schedule.setArrivalTime(resultSet.getTime("arrivalTime"));  
                         schedule.setPrice(resultSet.getDouble("price"));
                         list.add(schedule);                                            
    
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
                    sendPage(request, response, "/bookingHistory.jsp");
                    
                }  else if (action.equals("VIEWSEATCAT")){
                            
                     String query = "SELECT * from features";                              
                    Connection con = DriverManager.getConnection(url, userName, passWord);
                    Statement st = con.createStatement();
                    ResultSet resultSet = st.executeQuery(query);
                    
                                      
                    while(resultSet.next()) {
                        
                        Features features = new Features();   
                        features.setSeatCat(resultSet.getString("seatCat"));
                        features.setSeatWidth(resultSet.getDouble("seatWidth"));
                        features.setSeatType(resultSet.getString("seatType"));                        
                        features.setVideoType(resultSet.getString("videoType"));
                        features.setPowerType(resultSet.getString("powerType"));
                        features.setWifi(resultSet.getString("wifi"));                           
                        
                    }                  
                    
                    
                    st.close();
                    con.close();
                    
                    request.setAttribute("list", list);
                    sendPage(request, response, "/viewSeat.jsp");
                            
                 } else if (action.equals("VIEWDETAIL")) {
                    
                    String query = "SELECT * FROM schedule WHERE departureDate BETWEEN CURDATE() and '2021-12-12' AND approve=1";                              
                    Connection con = DriverManager.getConnection(url, userName, passWord);
                    Statement st = con.createStatement();
                    ResultSet resultSet = st.executeQuery(query);
                    
                                      
                    while(resultSet.next()) {
                        
                          
                                          
                         Schedule schedule = new Schedule();   
                         schedule.setId(resultSet.getInt("id"));
                         schedule.setPlane_id(resultSet.getInt("plane_id"));
                         schedule.setDestination_arrival(resultSet.getString("destination_arrival"));
                         schedule.setDepartureDate(resultSet.getDate("departureDate"));
                         schedule.setDepartureTime(resultSet.getTime("departureTime"));
                         schedule.setArrivalTime(resultSet.getTime("arrivalTime"));  
                         schedule.setPrice(resultSet.getDouble("price"));
                         list.add(schedule);                                                                                     
                            
                        
                    }                  
                    
                    
                    st.close();
                    con.close();
                    
                    request.setAttribute("list", list);
                    sendPage(request, response, "/viewDetail.jsp");   
                
                 } else if (action.equals("BOOK")){
                
                        String query = "INSERT INTO booking(numofpas, baggage, seatCat) VALUES(?,?, ?)";
                        Connection con = DriverManager.getConnection(url, userName, passWord);
                        PreparedStatement st= con.prepareStatement(query);
                        
                        int numofpas = Integer.parseInt(request.getParameter("numofpas"));
                        int baggage= Integer.parseInt(request.getParameter("baggage"));
                        String seatCat = request.getParameter("seatCat");
                        
        
                        st.setInt(1,numofpas);
                        st.setInt(2,baggage);
                        st.setString(3,seatCat);
                        
                        
                        int insertStatus=0; 
                        st.executeUpdate();
        
                        System.out.println(insertStatus + "row affected");
        
                        st.close(); 
                        con.close();
                        
                         RequestDispatcher rd = request.getRequestDispatcher("bookingServlet?action=VIEWBOOKING");
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
        
    }
}