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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet PlaneServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet PlaneServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

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

                    list.add(plane);
                }

                st.close();
                con.close();

            request.setAttribute("list", list);
            sendPage(request, response, "adminPlaneList.jsp");
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

}
