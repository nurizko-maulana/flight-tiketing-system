/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plane;

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
 * @author duncanleo
 */
@WebServlet(name = "PlaneServlet", urlPatterns = {"/plane"})
public class PlaneServlet extends HttpServlet {

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
                    plane.setYear(resultSet.getInt("year"));
                    System.out.println(plane.getId());
                    System.out.println(plane.getCapacity());
                    System.out.println(plane.getModel());
                    System.out.println(plane.getYear());
                    System.out.println(plane.getFeature_id());
                    list.add(plane);
                }

                st.close();
                con.close();
                request.setAttribute("list", list);
                sendPage(request, response, "/adminPlaneList.jsp");
            }
            
            
            
            else if (action.equals("ADD")) {

                String query = "INSERT INTO planes( model, year, capacity, feature_id ) VALUES(?, ?, ?, ?)";
                Connection con = DriverManager.getConnection(url, userName, passWord);
                PreparedStatement st = con.prepareStatement(query);

                String model = request.getParameter("model");
                int year = Integer.parseInt(request.getParameter("year"));
                int capacity = Integer.parseInt(request.getParameter("capacity"));
                int feature_id = Integer.parseInt(request.getParameter("feature_id"));
                

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
            } 
            
            
            
            
            else if (action.equals("EDIT")) {

                int id = Integer.parseInt(request.getParameter("id"));
                String query = "SELECT * FROM features WHERE id=" + id;
                Connection con = DriverManager.getConnection(url, userName, passWord);
                PreparedStatement st = con.prepareStatement(query);
                ResultSet resultSet = st.executeQuery(query);
                Plane plane = new Plane();

                while (resultSet.next()) {
                    plane.setId(resultSet.getInt("id"));
                    plane.setCapacity(resultSet.getInt("capacity"));
                    plane.setFeature_id(resultSet.getInt("feature_id"));
                    plane.setModel(resultSet.getString("model"));
                    plane.setYear(resultSet.getInt("year"));
                }

                st.close();
                con.close();

                request.setAttribute("plane", plane);
                RequestDispatcher rd = request.getRequestDispatcher("editFeatures-form.jsp");
                rd.forward(request, response);

            } 
            
            
            
            
            else if (action.equals("UPDATE")) {

                int id = Integer.parseInt(request.getParameter("id"));
                String seatCat = request.getParameter("seatCat");
                double seatWidth = Double.parseDouble(request.getParameter("seatWidth"));
                String seatType = request.getParameter("seatType");
                String videoType = request.getParameter("videoType");
                String powerType = request.getParameter("powerType");
                String wifi = request.getParameter("wifi");

                String query = "UPDATE features SET seatCat= ?, seatWidth =?, seatType=?, videoType=?, powerType=?, wifi=? WHERE id=" + id;
                Connection con = DriverManager.getConnection(url, userName, passWord);
                PreparedStatement st = con.prepareStatement(query);

                st.setString(1, seatCat);
                st.setDouble(2, seatWidth);
                st.setString(3, seatType);
                st.setString(4, videoType);
                st.setString(5, powerType);
                st.setString(6, wifi);

                int insertStatus = 0;
                st.executeUpdate();

                System.out.println(insertStatus + "row affected");

                st.close();
                con.close();

                RequestDispatcher rd = request.getRequestDispatcher("featuresServlet?action=VIEW");
                rd.forward(request, response);

            }
            
            
            else if (action.equals("DELETE")) {

                int id = Integer.parseInt(request.getParameter("id"));

                String query = "DELETE FROM features WHERE id=" + id;
                Connection con = DriverManager.getConnection(url, userName, passWord);
                PreparedStatement st = con.prepareStatement(query);

                st.executeUpdate();

                st.close();
                con.close();

                RequestDispatcher rd = request.getRequestDispatcher("featuresServlet?action=VIEW");
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
