<%-- 
    Document   : flightShedule
    Created on : 14-Jan-2021, 09:19:55
    Author     : duncanleo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="simple-sidebar.css" rel="stylesheet">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>Flight Schedule</title>
    </head>
    
    
    <body>
       <div class="d-flex" id="wrapper">

        <!-- Sidebar -->
        <div class="bg-light border-right" id="sidebar-wrapper">

          <div class="sidebar-heading"><img src="img/logo.png" width="200" height="100" alt=""></div>
          <div class="list-group list-group-flush">

            <a href="profile.jsp" class="list-group-item list-group-item-action bg-light">Profile</a>
            <a href="flightSchedule.jsp" class="list-group-item list-group-item-action bg-primary active">Flight</a>
            <a href="bookingDetail.jsp" class="list-group-item list-group-item-action bg-light">Booking</a>

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
<form action="booking.jsp" method="post"> 
<table id="tablePreview" class="table">
<!--Table head-->
  <thead>
    <tr>
      <th>#</th>
      <th>Flight No</th>
      <th>Destination - Arrival</th>
      <th>Departure Time</th>
      <th>Arrival Time</th>
      <th>Price</th>
      
    </tr>
  </thead>
  <!--Table head-->
  <!--Table body-->
  <tbody>
    <tr>
      <th scope="row">1</th>
      <td>MQ2213</td>
      <td>Dhaka - Kuala Lumpur</td>
      <td>2250hrs</td>
      <td>0535hrs</td>
      <td>RM 1500</td>
      <td><input type="submit" name="book" value="Book"</button>
      </td>
    </tr>
    <tr>
      <th scope="row">2</th>
      <td>MQ2221</td>
      <td>Langkawi - Johor</td>
      <td>18.20</td>
      <td>2235</td>
      <td>RM 125</td>
      <td><input type="submit" name="book" value="Book"</button>
    </tr>
    <tr>
      <th scope="row">3</th>
      <td>MQ2258</td>
      <td>Penang - Johor</td>
      <td>03.25</td>
      <td>03.25</td>
      <td>RM 175</td>
      <td><input type="submit" name="book" value="Book"</button>
    </tr>
  </tbody>
  <!--Table body-->
</table>
<!--Table-->
      </div>
    </div>
    <!-- /#page-content-wrapper -->

    </body>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</html>