package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ManageUser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <!-- Required meta tags -->\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\" integrity=\"sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2\" crossorigin=\"anonymous\">\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link href=\"simple-sidebar.css\" rel=\"stylesheet\">\r\n");
      out.write("        <title>Manage Schedule</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"d-flex\" id=\"wrapper\">\r\n");
      out.write("            <!-- Sidebar -->\r\n");
      out.write("            <div class=\"bg-light border-right\" id=\"sidebar-wrapper\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"sidebar-heading\"><img src=\"img/logo.png\" width=\"200\" height=\"100\" alt=\"\"></div>\r\n");
      out.write("                <div class=\"list-group list-group-flush\">\r\n");
      out.write("\r\n");
      out.write("                   <a href=\"#\" class=\"list-group-item list-group-item-action bg-light\">Profile</a>\r\n");
      out.write("                   <a href=\"featuresServlet?action=VIEW\" class=\"list-group-item list-group-item-action bg-primary active\">Plane</a>\r\n");
      out.write("                   <a href=\"#\" class=\"list-group-item list-group-item-action bg-light\">Statistic</a>\r\n");
      out.write("                    <a href=\"#\" class=\"list-group-item list-group-item-action bg-primary active\">Users</a>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /#sidebar-wrapper -->\r\n");
      out.write("            <div class=\"bg-secondary\" id=\"page-content-wrapper\">\r\n");
      out.write("                <div class=\"container-fluid\">\r\n");
      out.write("                    <br><br><br>\r\n");
      out.write("                    <form action=\"updateuser.jsp\" method=\"post\">\r\n");
      out.write("                        \r\n");
      out.write("                    <button style=\"width: 160px;\" type=\"submit\" align=\"center\" margin-left=\"auto\" margin-right=\"auto\">CREATE USER</button>\r\n");
      out.write("                    <br><br>\r\n");
      out.write("                    <table class=\" bg-light table table-bordered\">\r\n");
      out.write("                        <thead>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <th scope=\"col\">No.</th>\r\n");
      out.write("                                <th scope=\"col\">Username</th>\r\n");
      out.write("                                <th scope=\"col\">Email</th>\r\n");
      out.write("                                <th scope=\"col\">User Type</th>\r\n");
      out.write("                                <th scope=\"col\">Name</th>\r\n");
      out.write("                                <th scope=\"col\">ID</th>\r\n");
      out.write("                                <th scope=\"col\">Actions</th>\r\n");
      out.write("\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </thead>\r\n");
      out.write("                        <tbody>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <th scope=\"row\">1</th>\r\n");
      out.write("                                <td>Tom</td>\r\n");
      out.write("                                <td>tomriddle@example.com</td>\r\n");
      out.write("                                <td>STAFF</td>\r\n");
      out.write("                                <td>TOM RIDDLE</td>\r\n");
      out.write("                                <td>012</td>                               \r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-success\">Update</button>\r\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-danger\">Delete</button>\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                              <tr>\r\n");
      out.write("                                  <th scope=\"row\">2</th>\r\n");
      out.write("                                <td>Bond</td>\r\n");
      out.write("                                <td>jamesb@example.com</td>\r\n");
      out.write("                                <td>CUSTOMER </td>\r\n");
      out.write("                                <td>JAMES BOND</td>\r\n");
      out.write("                                <td>007</td>                               \r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-success\">Update</button>\r\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-danger\">Delete</button>\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                           <tr>\r\n");
      out.write("                                <th scope=\"row\">3</th>\r\n");
      out.write("                                <td>Johnson</td>\r\n");
      out.write("                                <td>johnsonlim@example.com</td>\r\n");
      out.write("                                <td>STAFF</td>\r\n");
      out.write("                                <td>JOHNSON LIM</td>\r\n");
      out.write("                                <td>011</td>                               \r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-success\">Update</button>\r\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-danger\">Delete</button>\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </tbody>\r\n");
      out.write("                    </table>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /#page-content-wrapper -->\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Option 2: jQuery, Popper.js, and Bootstrap JS\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\" integrity=\"sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js\" integrity=\"sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        -->\r\n");
      out.write("</form>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
