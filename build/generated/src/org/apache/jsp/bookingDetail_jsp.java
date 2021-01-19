package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bookingDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link href=\"simple-sidebar.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("        <title>Flight Schedule</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <body>\r\n");
      out.write("       <div class=\"d-flex\" id=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Sidebar -->\r\n");
      out.write("        <div class=\"bg-light border-right\" id=\"sidebar-wrapper\">\r\n");
      out.write("\r\n");
      out.write("          <div class=\"sidebar-heading\"><img src=\"img/logo.png\" width=\"200\" height=\"100\" alt=\"\"></div>\r\n");
      out.write("          <div class=\"list-group list-group-flush\">\r\n");
      out.write("\r\n");
      out.write("            <a href=\"profile.jsp\" class=\"list-group-item list-group-item-action bg-light\">Profile</a>\r\n");
      out.write("            <a href=\"flightSchedule.jsp\" class=\"list-group-item list-group-item-action bg-light\">Flight</a>\r\n");
      out.write("            <a href=\"bookingDetail.jsp\" class=\"list-group-item list-group-item-action bg-primary active\">Booking</a>\r\n");
      out.write("\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /#sidebar-wrapper -->\r\n");
      out.write("    \r\n");
      out.write("     <!-- Page Content -->\r\n");
      out.write("    <div id=\"page-content-wrapper\">\r\n");
      out.write("      <div class=\"container-fluid\">\r\n");
      out.write("          \r\n");
      out.write("          <div class=\"dropdown float-right my-5 mr-5  \">\r\n");
      out.write("  <button class=\"btn btn-primary dropdown-toggle\" type=\"button\" id=\"dropdownMenuButton\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("    USER\r\n");
      out.write("  </button>\r\n");
      out.write("  <div class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuButton\">\r\n");
      out.write("      <a class=\"dropdown-item\" href=\"#\">Logout</a>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!--Table-->\r\n");
      out.write("<table id=\"tablePreview\" class=\"table\">\r\n");
      out.write("<!--Table head-->\r\n");
      out.write("  <thead>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <th>#</th>\r\n");
      out.write("      <th>Flight No</th>\r\n");
      out.write("      <th>Destination - Arrival</th>\r\n");
      out.write("      <th>Departure Time</th>\r\n");
      out.write("      <th>Arrival Time</th>\r\n");
      out.write("      <th>Price</th>\r\n");
      out.write("      \r\n");
      out.write("    </tr>\r\n");
      out.write("  </thead>\r\n");
      out.write("  <!--Table head-->\r\n");
      out.write("  <!--Table body-->\r\n");
      out.write("  <tbody>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <th scope=\"row\">1</th>\r\n");
      out.write("      <td>MQ2213</td>\r\n");
      out.write("      <td>Dhaka - Kuala Lumpur</td>\r\n");
      out.write("      <td>22.50</td>\r\n");
      out.write("      <td>0535</td>\r\n");
      out.write("      <td>RM 1500</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <th scope=\"row\">2</th>\r\n");
      out.write("      <td>MQ2221</td>\r\n");
      out.write("      <td>Langkawi - Johor</td>\r\n");
      out.write("      <td>18.20</td>\r\n");
      out.write("      <td>2235</td>\r\n");
      out.write("      <td>RM 125</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <th scope=\"row\">3</th>\r\n");
      out.write("      <td>MQ2258</td>\r\n");
      out.write("      <td>Penang - Johor</td>\r\n");
      out.write("      <td>03.25</td>\r\n");
      out.write("      <td>03.25</td>\r\n");
      out.write("      <td>RM 175</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </tbody>\r\n");
      out.write("  <!--Table body-->\r\n");
      out.write("</table>\r\n");
      out.write("<!--Table-->\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- /#page-content-wrapper -->\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("</html>\r\n");
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
