package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class booking_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link href=\"simple-sidebar.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("        <title>Book A Ticket</title>\r\n");
      out.write(" \r\n");
      out.write("    </head>\r\n");
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
      out.write("            <a href=\"flightSchedule.jsp\" class=\"list-group-item list-group-item-action bg-light\">Flight Schedule</a>\r\n");
      out.write("            <a href=\"bookingDetail.jsp\" class=\"list-group-item list-group-item-action bg-light\">Booking Details</a>\r\n");
      out.write("           \r\n");
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
      out.write("</div>\r\n");
      out.write("      \r\n");
      out.write("          <form action=\"bookingServlet1\" method=\"post\">   \r\n");
      out.write("              <table    \r\n");
      out.write("                  <br><br><tr><td align=\"left\"><h6 style=\"font-size: bold\">Number of Passengers: </h6></td>\r\n");
      out.write("                      <td> <select name=\"numofpas\">\r\n");
      out.write("                              <option value=\"1\">1</option>\r\n");
      out.write("                              <option value=\"2\">2</option>\r\n");
      out.write("                              <option value=\"3\">3</option>\r\n");
      out.write("                              <option value=\"4\">4</option>\r\n");
      out.write("                              <option value=\"5\">5</option>\r\n");
      out.write("                            </select></td></tr>\r\n");
      out.write("                  \r\n");
      out.write("                  <br><tr><td align=\"left\"><h6 style=\"font-size: bold\">Departure Date : </h6></td><td><input type=\"date\" name=\"date\"/></td>\r\n");
      out.write("                 <td><td><td align=\"left\"><h6 style=\"font-size: bold\">Return Date: </h6></td><td><input type=\"date\" name=\"date\"/></td></td></td>\r\n");
      out.write("                 </tr> \r\n");
      out.write("                 <tr><td align=\"left\"><h6 style=\"font-size: bold\">Seat Type: </h6></td>\r\n");
      out.write("                     <td> <select name=\"seattype\">\r\n");
      out.write("                              <option value=\"First Class\">First Class</option>\r\n");
      out.write("                              <option value=\"Business Class\">Business Class</option>\r\n");
      out.write("                              <option value=\"Economy\">Economy</option>                            \r\n");
      out.write("                            </select></td></tr>\r\n");
      out.write("                 <tr>                     \r\n");
      out.write("                <td align=\"left\"<h6 style=\"font-size: bold\">Passenger Name: </h6></td><td><input type=\"text\" name=\"nameofPas\"/></td>\r\n");
      out.write("                 <td><td><td align=\"right\"<h6 style=\"font-size: normal\">Passenger ID: </h6></td><td><input type=\"text\" name=\"idofPas\"/></td></td></td></tr>                \r\n");
      out.write("                 </tr>                   \r\n");
      out.write("                \r\n");
      out.write("                 <tr><td align=\"left\"<h6 style=\"font-size: bold\">Contact Details</h6></td></tr>\r\n");
      out.write("                 <tr><td align=\"left\"<h6 style=\"font-size: bold\">Mobile Number: </h6></td><td><input type=\"text\" name=\"contNum\"/></td></tr>\r\n");
      out.write("                 <tr><td align=\"left\"<h6 style=\"font-size: bold\">Email: </h6></td><td><input type=\"text\" name=\"email\"/></td></tr>\r\n");
      out.write("                 <tr><td align=\"left\"><h6 style=\"font-size: bold\">Extra Baggage: </h6></td>\r\n");
      out.write("                      <td> <select name=\"baggage\">\r\n");
      out.write("                              <option value=\"7\">7 kg</option>\r\n");
      out.write("                              <option value=\"10\">10 kg</option>\r\n");
      out.write("                              <option value=\"15\">15 kg</option>\r\n");
      out.write("                              <option value=\"20\">20 kg</option>\r\n");
      out.write("                              <option value=\"25\">25 kg</option>\r\n");
      out.write("                            </select></td></tr>\r\n");
      out.write("                 <tr><td align=\"left\"><h6 style=\"font-size: bold\">Terms and Condition: <br>\r\n");
      out.write("                     <textarea rows=\"4\" cols=\"30\">Passengers should be reminded not to be carrying any flammable and/or sharp objects that would pose threats the other passengers. Given any circumstances, we would like to highlight that you would be sent to the airport police department for further investigation.</textarea>\r\n");
      out.write("                         </h6>\r\n");
      out.write("                     </td>                 \r\n");
      out.write("                 </tr>\r\n");
      out.write("                 <tr><td></td><td><button style=\"width: 160px;\" type=\"submit\" align=\"center\" margin-left=\"auto\" margin-right=\"auto\">Book</button></td></tr>\r\n");
      out.write("                 \r\n");
      out.write("              </table>           \r\n");
      out.write("          </form>       \r\n");
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
