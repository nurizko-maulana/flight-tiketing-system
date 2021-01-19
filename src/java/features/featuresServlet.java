package features;

import bean.Features;
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
 * @author thattshini
 */
@WebServlet(name = "featuresServlet", urlPatterns = {"/featuresServlet"})
public class featuresServlet extends HttpServlet {

  
    
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
     * Handles the HTTP
     * <code>GET</code> method.
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
                        String query = "SELECT * FROM features";	
                        Connection con = DriverManager.getConnection(url, userName, passWord);
			Statement st = con.createStatement(); 
			ResultSet resultSet = st.executeQuery(query); 
                        
			while(resultSet.next()) {
				
                                Features features = new Features();
                                features.setId(resultSet.getInt(1));
				features.setSeatCat(resultSet.getString(2));
				features.setSeatWidth(resultSet.getDouble(3));
				features.setSeatType(resultSet.getString(4));
				features.setVideoType(resultSet.getString(5));
                                features.setPowerType(resultSet.getString(6));
                                features.setWifi(resultSet.getString(7));
				list.add(features);
                            
			}
                            
                                st.close();
                                con.close();
                                
                                request.setAttribute("list", list);
                                sendPage(request, response, "/seatList_admin.jsp");
                        
            }else if (action.equals("ADD")){
                
                        String query = "INSERT INTO features(seatCat, seatWidth, seatType, videoType, powerType, wifi) VALUES(?,?, ?, ?,?,?)";
                        Connection con = DriverManager.getConnection(url, userName, passWord);
                        PreparedStatement st= con.prepareStatement(query);
                        
                        String seatCat = request.getParameter("seatCat");
                        double seatWidth = Double.parseDouble(request.getParameter("seatWidth"));
                        String seatType = request.getParameter("seatType");
                        String videoType = request.getParameter("videoType");
                        String powerType = request.getParameter("powerType");
                        String wifi = request.getParameter("wifi");
        
                        st.setString(1,seatCat);
                        st.setDouble(2,seatWidth);
                        st.setString(3,seatType);
                        st.setString(4,videoType);
                        st.setString(5,powerType);
                        st.setString(6,wifi);
                        
                        int insertStatus=0; 
                        st.executeUpdate();
        
                        System.out.println(insertStatus + "row affected");
        
                        st.close(); 
                        con.close();
                        
                         RequestDispatcher rd = request.getRequestDispatcher("featuresServlet?action=VIEW");
                         rd.forward(request,response);
            }else if (action.equals("EDIT")){
                
                int id = Integer.parseInt(request.getParameter("id"));
                String query = "SELECT * FROM features WHERE id="+id;
                Connection con = DriverManager.getConnection(url, userName, passWord);
                PreparedStatement st= con.prepareStatement(query);
                ResultSet resultSet = st.executeQuery(query); 
                Features features = new Features();
                                
                        
			while(resultSet.next()) {
                                features.setId(resultSet.getInt(1));
				features.setSeatCat(resultSet.getString(2));
				features.setSeatWidth(resultSet.getDouble(3));
				features.setSeatType(resultSet.getString(4));
				features.setVideoType(resultSet.getString(5));
                                features.setPowerType(resultSet.getString(6));
                                features.setWifi(resultSet.getString(7));
			}
                            
                                st.close();
                                con.close();
                                
                         request.setAttribute("features",features);       
                         RequestDispatcher rd = request.getRequestDispatcher("editFeatures-form.jsp");
                         rd.forward(request,response);
            
            }
            
            else if (action.equals("UPDATE")){
                
           int id = Integer.parseInt(request.getParameter("id"));
           String seatCat = request.getParameter("seatCat");
           double seatWidth = Double.parseDouble(request.getParameter("seatWidth"));
           String seatType = request.getParameter("seatType");
           String videoType = request.getParameter("videoType");
           String powerType = request.getParameter("powerType");
           String wifi = request.getParameter("wifi");
           
                String query = "UPDATE features SET seatCat= ?, seatWidth =?, seatType=?, videoType=?, powerType=?, wifi=? WHERE id="+id;
                Connection con = DriverManager.getConnection(url, userName, passWord);
                PreparedStatement st= con.prepareStatement(query);
           
                st.setString(1, seatCat);
                st.setDouble(2, seatWidth);
                st.setString(3, seatType);
                st.setString(4, videoType);
                st.setString(5, powerType);
                st.setString(6, wifi);
           
                int insertStatus=0; 
                st.executeUpdate();
        
                System.out.println(insertStatus + "row affected");
        
                st.close(); 
                con.close();
                        
                RequestDispatcher rd = request.getRequestDispatcher("featuresServlet?action=VIEW");
                rd.forward(request,response);
           
            } else if(action.equals("DELETE")){
            
                int id = Integer.parseInt(request.getParameter("id"));
                
                String query = "DELETE FROM features WHERE id="+id;
                Connection con = DriverManager.getConnection(url, userName, passWord);
                PreparedStatement st= con.prepareStatement(query);
                
                st.executeUpdate();
                
                st.close(); 
                con.close();
                
                RequestDispatcher rd = request.getRequestDispatcher("featuresServlet?action=VIEW");
                rd.forward(request,response);
            }
            
        
                        
		}catch(SQLException e) {
			e.printStackTrace();
		}
              
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      doGet(request,response);
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