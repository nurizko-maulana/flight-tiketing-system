<%-- 
    Document   : booking
    Created on : Jan 19, 2021, 9:20:33 PM
    Author     : SwarnnaNagesvaran
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="simple-sidebar.css" rel="stylesheet">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>Book A Ticket</title>
 
    </head>
    <body>
       <div class="d-flex" id="wrapper">

        <!-- Sidebar -->
        <div class="bg-light border-right" id="sidebar-wrapper">

          <div class="sidebar-heading"><img src="img/logo.png" width="200" height="100" alt=""></div>
          <div class="list-group list-group-flush">

            <a href="profile.jsp" class="list-group-item list-group-item-action bg-light">Profile</a>
            <a href="flightSchedule.jsp" class="list-group-item list-group-item-action bg-light">Flight Schedule</a>
            <a href="bookingDetail.jsp" class="list-group-item list-group-item-action bg-light">Booking Details</a>
           

          </div>
        </div>
        <!-- /#sidebar-wrapper -->
    
     <!-- Page Content -->
    <div id="page-content-wrapper">
      <div class="container-fluid">
          
          <div class="dropdown float-right my-5 mr-5  ">
</div>
      
          <form action="bookingServlet1" method="post">   
              <table    
                  <br><br><tr><td align="left"><h6 style="font-size: bold">Number of Passengers: </h6></td>
                      <td> <select name="numofpas">
                              <option value="1">1</option>
                              <option value="2">2</option>
                              <option value="3">3</option>
                              <option value="4">4</option>
                              <option value="5">5</option>
                            </select></td></tr>
                  
                  <br><tr><td align="left"><h6 style="font-size: bold">Departure Date : </h6></td><td><input type="date" name="date"/></td>
                 <td><td><td align="left"><h6 style="font-size: bold">Return Date: </h6></td><td><input type="date" name="date"/></td></td></td>
                 </tr> 
                 <tr><td align="left"><h6 style="font-size: bold">Seat Type: </h6></td>
                     <td> <select name="seattype">
                              <option value="First Class">First Class</option>
                              <option value="Business Class">Business Class</option>
                              <option value="Economy">Economy</option>                            
                            </select></td></tr>
                 <tr>                     
                <td align="left"<h6 style="font-size: bold">Passenger Name: </h6></td><td><input type="text" name="nameofPas"/></td>
                 <td><td><td align="right"<h6 style="font-size: normal">Passenger ID: </h6></td><td><input type="text" name="idofPas"/></td></td></td></tr>                
                 </tr>                   
                
                 <tr><td align="left"<h6 style="font-size: bold">Contact Details</h6></td></tr>
                 <tr><td align="left"<h6 style="font-size: bold">Mobile Number: </h6></td><td><input type="text" name="contNum"/></td></tr>
                 <tr><td align="left"<h6 style="font-size: bold">Email: </h6></td><td><input type="text" name="email"/></td></tr>
                 <tr><td align="left"><h6 style="font-size: bold">Extra Baggage: </h6></td>
                      <td> <select name="baggage">
                              <option value="7">7 kg</option>
                              <option value="10">10 kg</option>
                              <option value="15">15 kg</option>
                              <option value="20">20 kg</option>
                              <option value="25">25 kg</option>
                            </select></td></tr>
                 <tr><td align="left"><h6 style="font-size: bold">Terms and Condition: <br>
                     <textarea rows="4" cols="30">Passengers should be reminded not to be carrying any flammable and/or sharp objects that would pose threats the other passengers. Given any circumstances, we would like to highlight that you would be sent to the airport police department for further investigation.</textarea>
                         </h6>
                     </td>                 
                 </tr>
                 <tr><td></td><td><button style="width: 160px;" type="submit" align="center" margin-left="auto" margin-right="auto">Book</button></td></tr>
                 
              </table>           
          </form>       
    </body>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</html>
