<%-- 
    Document   : bookingDetail
    Created on : 14-Jan-2021, 11:02:59
    Author     : duncanleo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="simple-sidebar.css" rel="stylesheet">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>Booking Details</title>
    </head>
    
    
    <body>
       <div class="d-flex" id="wrapper">

        <!-- Sidebar -->
        <div class="bg-light border-right" id="sidebar-wrapper">

          <div class="sidebar-heading"><img src="img/logo.png" width="200" height="100" alt=""></div>
          <div class="list-group list-group-flush">

            <a href="profile.jsp" class="list-group-item list-group-item-action bg-light">Profile</a>
            <a href="flightSchedule.jsp" class="list-group-item list-group-item-action bg-light">Flight Schedule</a>
            <a href="bookingDetail.jsp" class="list-group-item list-group-item-action bg-primary active">Booking Details</a>
            
          </div>
        </div>
        <!-- /#sidebar-wrapper -->
    
     <!-- Page Content -->
    <div id="page-content-wrapper">
      <div class="container-fluid">
          
          <div class="dropdown float-right my-5 mr-5  ">
  <button class="btn btn-primary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
    USER
  </button>
  <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
      <a class="dropdown-item" href="#">Logout</a>
  </div>
</div>
<!--Table-->
<table id="tablePreview" class="table">
<tr><td align="left"><h6 style="font-size: bold">Flight No: EK1971 </h6></td>
<tr><td align="left"<h6 style="font-size: bold">Number of Passengers: 1 </h6></td></tr>
<tr><td align="left"<h6 style="font-size: bold">Passenger Name: Johnson Lim</h6></td></tr>
<tr><td align="left"<h6 style="font-size: bold">Passenger ID: 1234567</h6></td></tr>
<tr><td align="left"<h6 style="font-size: bold">Contact Details: 0123456789</h6></td></tr>
<tr><td align="left"<h6 style="font-size: bold">Destination - Arrival: DHAKA - KUALA LUMPUR</h6></td></tr>
<tr><td align="left"<h6 style="font-size: bold">Departure Time: 1320</h6></td></tr>
<tr><td align="left"<h6 style="font-size: bold">Arrival Time: 1630 </h6></td></tr>
<tr><td align="left"<h6 style="font-size: bold">Price: RM1 500</h6></td></tr>

</table>
    </body>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</html>
