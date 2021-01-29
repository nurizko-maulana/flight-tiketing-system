/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schedule;

import bean.Schedule;
import features.featuresServlet;
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
 * @author thattshini
 */
@WebServlet(name = "scheduleServlet", urlPatterns = {"/scheduleServlet"})
public class scheduleServlet extends HttpServlet {

     void sendPage(HttpServletRequest req, HttpServletResponse res, String fileName) throws ServletException, IOException
    {
        // Get the dispatcher; it gets the main page to the user
	RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(fileName);

	if (dispatcher == null)
	{
            System.out.println("There was no dispatcher");
	    // No dispatcher means the html file could not be found.
	    res.sendError(res.SC_NO_CONTENT);
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
              
                
                ArrayList list = new ArrayList();
                String action = request.getParameter("action");
                
                
        try { 
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(featuresServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
        
             if (action.equals("VIEW"))
            {
                        String query = "SELECT * FROM schedule WHERE approve=0";	
                        Connection con = DriverManager.getConnection(url, userName, passWord);
			Statement st = con.createStatement(); 
			ResultSet resultSet = st.executeQuery(query); 
                        
			while(resultSet.next()) {
				
                                Schedule schedule = new Schedule();
                                schedule.setId(resultSet.getInt(1));
				schedule.setDestination_arrival(resultSet.getString(2));
				schedule.setDepartureTime(resultSet.getTime(3));
				schedule.setArrivalTime(resultSet.getTime(4));
                                schedule.setDepartureDate(resultSet.getDate(5));
				schedule.setArrivalDate(resultSet.getDate(6));
                                schedule.setSeatCat(resultSet.getString(7));
                                schedule.setPrice(resultSet.getDouble(8));
                                schedule.setApprove(resultSet.getInt(9));
                                schedule.setTotalBook(resultSet.getInt(10));
                                schedule.setPlane_id(resultSet.getInt(11));
				list.add(schedule);     
                            
			}
                            
                                st.close();
                                con.close();
                                
                                request.setAttribute("list", list);
                                sendPage(request, response, "/seatUpdate_admin.jsp");
        } else if(action.equals("APPROVE")){
            int id = Integer.parseInt(request.getParameter("id"));
            int approve=1;
            
                String query = "UPDATE schedule SET approve=? WHERE id="+id;
                Connection con = DriverManager.getConnection(url, userName, passWord);
                PreparedStatement st= con.prepareStatement(query);
                
                st.setInt(1, approve);
           
                int insertStatus=0; 
                st.executeUpdate();
        
                System.out.println(insertStatus + "row affected");
        
                st.close(); 
                con.close();
                        
                RequestDispatcher rd = request.getRequestDispatcher("scheduleServlet?action=VIEW");
                rd.forward(request,response);

        } else if(action.equals("REJECT")){
            int id = Integer.parseInt(request.getParameter("id"));
            int approve=2;
            
                String query = "UPDATE schedule SET approve=? WHERE id="+id;
                Connection con = DriverManager.getConnection(url, userName, passWord);
                PreparedStatement st= con.prepareStatement(query);
                
                st.setInt(1, approve);
           
                int insertStatus=0; 
                st.executeUpdate();
        
                System.out.println(insertStatus + "row affected");
        
                st.close(); 
                con.close();
                        
                RequestDispatcher rd = request.getRequestDispatcher("scheduleServlet?action=VIEW");
                rd.forward(request,response);

        }  else if(action.equals("UNDO")){
            int id = Integer.parseInt(request.getParameter("id"));
            int approve=0;
            
                String query = "UPDATE schedule SET approve=? WHERE id="+id;
                Connection con = DriverManager.getConnection(url, userName, passWord);
                PreparedStatement st= con.prepareStatement(query);
                
                st.setInt(1, approve);
           
                int insertStatus=0; 
                st.executeUpdate();
        
                System.out.println(insertStatus + "row affected");
        
                st.close(); 
                con.close();
                        
                RequestDispatcher rd = request.getRequestDispatcher("scheduleServlet?action=VIEW");
                rd.forward(request,response);

        }else if (action.equals("VIEWapprove"))
            {
                        String query = "SELECT * FROM schedule WHERE approve=1";	
                        Connection con = DriverManager.getConnection(url, userName, passWord);
			Statement st = con.createStatement(); 
			ResultSet resultSet = st.executeQuery(query); 
                        
			while(resultSet.next()) {
				
                                Schedule schedule = new Schedule();
                                schedule.setId(resultSet.getInt(1));
				schedule.setDestination_arrival(resultSet.getString(2));
				schedule.setDepartureTime(resultSet.getTime(3));
				schedule.setArrivalTime(resultSet.getTime(4));
                                schedule.setDepartureDate(resultSet.getDate(5));
				schedule.setArrivalDate(resultSet.getDate(6));
                                schedule.setSeatCat(resultSet.getString(7));
                                schedule.setPrice(resultSet.getDouble(8));
                                schedule.setApprove(resultSet.getInt(9));
                                schedule.setTotalBook(resultSet.getInt(10));
                                schedule.setPlane_id(resultSet.getInt(11));
				list.add(schedule);     
                            
			}
                            
                                st.close();
                                con.close();
                                
                                request.setAttribute("list", list);
                                sendPage(request, response, "/scheduleList_admin.jsp");
        }else if (action.equals("VIEWrejected"))
            {
                        String query = "SELECT * FROM schedule WHERE approve=2";	
                        Connection con = DriverManager.getConnection(url, userName, passWord);
			Statement st = con.createStatement(); 
			ResultSet resultSet = st.executeQuery(query); 
                        
			while(resultSet.next()) {
				
                                Schedule schedule = new Schedule();
                                schedule.setId(resultSet.getInt(1));
				schedule.setDestination_arrival(resultSet.getString(2));
				schedule.setDepartureTime(resultSet.getTime(3));
				schedule.setArrivalTime(resultSet.getTime(4));
                                schedule.setDepartureDate(resultSet.getDate(5));
				schedule.setArrivalDate(resultSet.getDate(6));
                                schedule.setSeatCat(resultSet.getString(7));
                                schedule.setPrice(resultSet.getDouble(8));
                                schedule.setApprove(resultSet.getInt(9));
                                schedule.setTotalBook(resultSet.getInt(10));
                                schedule.setPlane_id(resultSet.getInt(11));
				list.add(schedule);     
                            
			}
                            
                                st.close();
                                con.close();
                                
                                request.setAttribute("list", list);
                                sendPage(request, response, "/scheduleList_admin.jsp");
        }
       
       
    }
         catch(SQLException e) {
			e.printStackTrace();
		}

    }
    
      @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      doGet(request,response);
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>



}
