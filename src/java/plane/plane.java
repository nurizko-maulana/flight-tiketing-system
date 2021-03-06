package plane;

import bean.Features;
import bean.Plane;
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
@WebServlet(name = "plane", urlPatterns = {"/planes"})
public class plane extends HttpServlet {

    void sendPage(HttpServletRequest req, HttpServletResponse res, String fileName) throws ServletException, IOException {
        // Get the dispatcher; it gets the main page to the user
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(fileName);

        if (dispatcher == null) {
            System.out.println("There was no dispatcher");
            // No dispatcher means the html file could not be found.
            res.sendError(res.SC_NO_CONTENT);
        } else {
            dispatcher.forward(req, res);
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
            Logger.getLogger(plane.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {

            if (action.equals("VIEW")) {
                String query = "SELECT * FROM planes";
                Connection con = DriverManager.getConnection(url, userName, passWord);
                Statement st = con.createStatement();
                ResultSet resultSet = st.executeQuery(query);

                while (resultSet.next()) {

                    Plane plane = new Plane();
                    plane.setId(resultSet.getInt("id"));
                    plane.setCapacity(resultSet.getInt("capacity"));
                    plane.setFeature_id(resultSet.getInt("feature_id"));
                    plane.setModel(resultSet.getString("model"));
                    plane.setStatus(resultSet.getString("status"));
                    plane.setYear(resultSet.getInt("year"));

                    list.add(plane);

                }

                st.close();
                con.close();

                request.setAttribute("list", list);
                sendPage(request, response, "/adminPlaneList.jsp");

            } 
            
            else if (action.equals("EDIT")) {
                int id = Integer.parseInt(request.getParameter("id"));
                String query = "SELECT * FROM planes WHERE id=" + id;
                Connection con = DriverManager.getConnection(url, userName, passWord);
                Statement st = con.createStatement();
                ResultSet resultSet = st.executeQuery(query);
                Plane plane = new Plane();

                while (resultSet.next()) {
                    plane.setId(resultSet.getInt("id"));
                    plane.setCapacity(resultSet.getInt("capacity"));
                    plane.setFeature_id(resultSet.getInt("feature_id"));
                    plane.setModel(resultSet.getString("model"));
                    plane.setStatus(resultSet.getString("status"));
                    plane.setYear(resultSet.getInt("year"));
                }
                
                String query2 = "SELECT * FROM features";
                ResultSet resultSetFeature = st.executeQuery(query2);
                
                while (resultSetFeature.next()) {

                    Features features = new Features();
                    features.setId(resultSetFeature.getInt(1));
                    features.setSeatCat(resultSetFeature.getString(2));
                    features.setSeatWidth(resultSetFeature.getDouble(3));
                    features.setSeatType(resultSetFeature.getString(4));
                    features.setVideoType(resultSetFeature.getString(5));
                    features.setPowerType(resultSetFeature.getString(6));
                    features.setWifi(resultSetFeature.getString(7));
                    list.add(features);

                }
                
                st.close();
                con.close();
                
                request.setAttribute("plane", plane);
                request.setAttribute("list", list);
                sendPage(request, response, "/adminPlaneEdit.jsp");

            }
            else if (action.equals("CREATE")) {

                String query = "SELECT * FROM features";
                Connection con = DriverManager.getConnection(url, userName, passWord);
                Statement st = con.createStatement();
                ResultSet resultSet = st.executeQuery(query);

                while (resultSet.next()) {

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
                RequestDispatcher rd = request.getRequestDispatcher("adminPlaneAdd.jsp");
                rd.forward(request, response);
                
            } 
            
            
            
            else if (action.equals("ADD")) {

                String query = "INSERT INTO planes( model, year, capacity, feature_id ) VALUES(?, ?, ?, ?)";
                Connection con = DriverManager.getConnection(url, userName, passWord);
                PreparedStatement st = con.prepareStatement(query);

//                try {
                String model = request.getParameter("model");
                int year = Integer.parseInt(request.getParameter("year"));
                int capacity = Integer.parseInt(request.getParameter("capacity"));
                int feature_id = Integer.parseInt(request.getParameter("feature_id"));
//                } catch (NumberFormatException e) {
//                    System.out.println("We can catch the NumberFormatException");
//                }

                st.setString(1, model);
                st.setInt(2, year);
                st.setInt(3, capacity);
                st.setInt(4, feature_id);

                int insertStatus = 0;
                st.executeUpdate();

                System.out.println(insertStatus + "row affected");

                st.close();
                con.close();

                RequestDispatcher rd = request.getRequestDispatcher("planes?action=VIEW");
                rd.forward(request, response);
            } else if (action.equals("ACTIVATE")) {

                int id = Integer.parseInt(request.getParameter("id"));
                String status = request.getParameter("status");
                String query = "UPDATE planes SET status=? WHERE id=" + id;
                Connection con = DriverManager.getConnection(url, userName, passWord);
                PreparedStatement st = con.prepareStatement(query);
                Plane plane = new Plane();
                System.out.println("STATUS TYPE " + status);

                if (status.equals("ACTIVE")) {
                    st.setString(1, "MAINTENANCE");
                    st.executeUpdate();

                } else if (status.equals("MAINTENANCE")) {
                    st.setString(1, "ACTIVE");
                    st.executeUpdate();
                }

                st.close();
                con.close();

                RequestDispatcher rd = request.getRequestDispatcher("planes?action=VIEW");
                rd.include(request, response);
                
            } else if (action.equals("UPDATE")) {

                int id = Integer.parseInt(request.getParameter("id"));
                String model = request.getParameter("model");
                int year = Integer.parseInt(request.getParameter("year"));
                int capacity = Integer.parseInt(request.getParameter("capacity"));
                int feature_id = Integer.parseInt(request.getParameter("feature_id"));
                

                String query = "UPDATE plane SET model= ?, year =?, capacity=?, feature_id=? WHERE id=" + id;
                Connection con = DriverManager.getConnection(url, userName, passWord);
                PreparedStatement st = con.prepareStatement(query);

                st.setString(1, model);
                st.setInt(2, year);
                st.setInt(3, capacity);
                st.setInt(4, feature_id);
                

                int insertStatus = 0;
                st.executeUpdate();

                System.out.println(insertStatus + "row affected");

                st.close();
                con.close();

                RequestDispatcher rd = request.getRequestDispatcher("featuresServlet?action=VIEW");
                rd.forward(request, response);

            } else if (action.equals("DELETE")) {

                int id = Integer.parseInt(request.getParameter("id"));

                String query = "DELETE FROM planes WHERE id=" + id;
                Connection con = DriverManager.getConnection(url, userName, passWord);
                PreparedStatement st = con.prepareStatement(query);

                st.executeUpdate();

                st.close();
                con.close();

                RequestDispatcher rd = request.getRequestDispatcher("planes?action=VIEW");
                rd.forward(request, response);
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
