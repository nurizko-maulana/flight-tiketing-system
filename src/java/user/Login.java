
package user;

import bean.User;
import java.io.*;
import java.sql.SQLException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
 
@WebServlet("/login")
public class Login extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
    public Login() {
        super();
    }
 
    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("email");
        String password = request.getParameter("password");
         
        Validate userDao = new Validate();
         
        try {
            User user = userDao.checkLogin(username, password);
            String destPage = "index.html";
             
            if (user != null) {
                HttpSession session = request.getSession();
                session.setAttribute("user", user);
                System.out.println(user.getUsername());
                System.out.println(user.getUserType());
                System.out.println(user.getEmail());
                int type = 1;
                switch (type) {
                    case 1:
                        destPage = "flightSchedule.jsp";
                        break;
                    case 2:
                        destPage = "Manage Schedule.jsp";
                        break;
                    case 3:
                        destPage = "seatList_admin.jsp";
                        break;
                    default:
                        break;
                }
            } else {
                String message = "Invalid email/password";
                request.setAttribute("message", message);
            }
             
            RequestDispatcher dispatcher = request.getRequestDispatcher(destPage);
            dispatcher.forward(request, response);
             
        } catch (SQLException | ClassNotFoundException ex) {
            throw new ServletException(ex);
        }
    }
}