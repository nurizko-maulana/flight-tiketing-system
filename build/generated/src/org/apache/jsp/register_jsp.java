package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("    <style>\r\n");
      out.write("      #leftContent{\r\n");
      out.write("        background-color: #F5F5F5;\r\n");
      out.write("       \r\n");
      out.write("        background-repeat: no-repeat;\r\n");
      out.write("        width: 50%;\r\n");
      out.write("        position: absolute;\r\n");
      out.write("        left: 0px;\r\n");
      out.write("        height: 100%;\r\n");
      out.write("      }\r\n");
      out.write("      #rightHalf {\r\n");
      out.write("\r\n");
      out.write("        width: 50%;\r\n");
      out.write("        position: absolute;\r\n");
      out.write("        right: 0px;\r\n");
      out.write("        height: 100%;\r\n");
      out.write("        float:right;\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("       #rightHalf2 {\r\n");
      out.write("\r\n");
      out.write("        width: 50%;\r\n");
      out.write("        position: absolute;\r\n");
      out.write("        right: 0px;\r\n");
      out.write("        align-content: center;\r\n");
      out.write("        height: 100%;\r\n");
      out.write("        float:right;\r\n");
      out.write("        padding-top: 100px;\r\n");
      out.write("        padding-left: 70px;\r\n");
      out.write("      }\r\n");
      out.write("    </style>\r\n");
      out.write("        <title>Registration</title>\r\n");
      out.write(" \r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("       <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("          <div id=\"leftContent\" class=\"col\" >\r\n");
      out.write("            <img class=\"w-100\" src=\"img/TagLine.png\" alt=\"plane\">\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"col p-5 \">\r\n");
      out.write("            <div class=\"text-center\" id=\"rightHalf\">\r\n");
      out.write("              <img class=\"w-50 \" src=\"img/logo.png\" alt=\"logo\">\r\n");
      out.write("            </div>\r\n");
      out.write("              <div class=\"col p-5 \" >\r\n");
      out.write("              <form action=\"regServlet\" method=\"post\" id=\"rightHalf2\">\r\n");
      out.write("              <div class=\"form-group\">\r\n");
      out.write("                <label class=\"text-left\">Username</label>\r\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"username\" name=\"username\" placeholder=\"Enter Username\" required>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"form-group\">\r\n");
      out.write("                <label class=\"text-left\">Email address</label>\r\n");
      out.write("                <input type=\"email\" class=\"form-control\" id=\"email\" name=\"email\" placeholder=\"Enter email\" required>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"form-group\">\r\n");
      out.write("                <label class=\"text-left\">Password</label>\r\n");
      out.write("                <input type=\"password\" class=\"form-control\" id=\"password\" name=\"password\" placeholder=\"Password\" required>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"form-group\">\r\n");
      out.write("                     <label class=\"text-left\">User Role</label><br>\r\n");
      out.write("                <select class=\"form-control\" name=\"userType\">\r\n");
      out.write("                    <option selected value=\"1\">Customer</option>\r\n");
      out.write("                    <option value=\"2\">Admin</option>\r\n");
      out.write("                    <option value=\"3\">Manager</option>\r\n");
      out.write("                </select>\r\n");
      out.write("              </div>\r\n");
      out.write("              <button type=\"submit\" class=\"btn btn-primary btn-block\">Submit</button>\r\n");
      out.write("            </form>\r\n");
      out.write("          </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- Optional JavaScript -->\r\n");
      out.write("    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\r\n");
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
