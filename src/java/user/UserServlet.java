/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

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

/**
 *
 * @author SwarnnaNagesvaran
 */
@WebServlet(name = "UserServlet", urlPatterns = {"/UserServlet"})
public class UserServlet extends HttpServlet {

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
                    
                      if (action.equals("VIEW"))
            {
                        String query = "SELECT * FROM User";	
                        Connection con = DriverManager.getConnection(url, userName, passWord);
			Statement st = con.createStatement(); 
			ResultSet resultSet = st.executeQuery(query); 
                        
			while(resultSet.next()) {
				
                                User user = new User();
                                user.setId(resultSet.getInt(1));
				user.setName(resultSet.getString(2));
				user.setUsername(resultSet.getString(3));
				user.setEmail(resultSet.getString(4));
				user.setPassword(resultSet.getString(5));
                                user.setUserType(resultSet.getInt(6));
                                list.add(user);
                            
			}
                            
                                st.close();
                                con.close();
                                
                                request.setAttribute("list", list);
                                sendPage(request, response, "/ManageUser.jsp");
                                            
                    }else if(action.equals ("DELETE")){
                        int id = Integer.parseInt(request.getParameter("id"));
                        int user=2;
                        
                        String query = "DELETE FROM User WHERE id=" +id;
                        Connection con = DriverManager.getConnection(url, userName,passWord);
                        PreparedStatement st = con.prepareStatement(query);
                       
                                            
                        st.executeUpdate();
                        
                        st.close();
                        con.close();
                        
                        RequestDispatcher rd = request.getRequestDispatcher("UserServlet?action=VIEW");
                        rd.forward(request, response);
                        
                    }else if (action.equals("ADD")){
                
                        String query = "INSERT INTO User(name, usernam, email, password, userType) VALUES(?, ?, ?,?,?)";
                        Connection con = DriverManager.getConnection(url, userName, passWord);
                        PreparedStatement st= con.prepareStatement(query);
                        
                        String name = request.getParameter("name");                        
                        String username = request.getParameter("username");
                        String email= request.getParameter("email");
                        String password = request.getParameter("password");
                        String userType = request.getParameter("userType");
        
                        st.setString(1,name);
                        st.setString(2,username);
                        st.setString(3,email);
                        st.setString(4,password);
                        st.setString(5,userType);
                        
                        int insertStatus=0; 
                        st.executeUpdate();
        
                        System.out.println(insertStatus + "row affected");
        
                        st.close(); 
                        con.close();
                        
                         RequestDispatcher rd = request.getRequestDispatcher("UserServlet?action=VIEW");
                         rd.forward(request,response);
            }else if (action.equals("EDIT")){
                
                int id = Integer.parseInt(request.getParameter("id"));
                String query = "SELECT * FROM User WHERE id="+id;
                Connection con = DriverManager.getConnection(url, userName, passWord);
                PreparedStatement st= con.prepareStatement(query);
                ResultSet resultSet = st.executeQuery(query); 
                User user = new User();
                                
                        
			while(resultSet.next()) {
                                user.setId(resultSet.getInt(1));
				user.setName(resultSet.getString(2));
				user.setUsername(resultSet.getString(3));
				user.setEmail(resultSet.getString(4));
				user.setPassword(resultSet.getString(5));
                                user.setUserType(resultSet.getInt(6));
                                
			}
                            
                                st.close();
                                con.close();
                                
                         request.setAttribute("User", user);       
                         RequestDispatcher rd = request.getRequestDispatcher("editUser.jsp");
                         rd.forward(request,response);
                        
                    }
                }  catch (SQLException e) {
                    e.printStackTrace();
                }
                //<editor-fold defaultstate="collapsed" desc="comment">
                /*}*/
//</editor-fold>
    }

   
}