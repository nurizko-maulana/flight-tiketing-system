<%-- 
    Document   : bookingDetail
    Created on : Jan 23, 2021, 11:02:59 am
    Author     : SwarnnaNagesvaran
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
<table class="table table-bordered">
  <thead>
    <tr>
      <th scope="col">No</th>
      <th scope="col">Flight No</th>
      <th scope="col">Departure</th>
      <th scope="col">Destination</th>
      <th scope="col">Departure Date</th>
      <th scope="col">Departure Time</th>
      <th scope="col">Arrival Time</th>
      <th scope="col">Duration</th>
      <th scope="col">Economic Price</th>
      <th scope="col">Business Price</th>
      <th scope="col">First Class Price</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
  <th scope="row">1</th>
  <td>AK6412</td>
  <td>Penang</td>
  <td>Johor Bahru</td>
  <td>2021-02-04</td>
  <td>0910hrs</td>
  <td>1020hrs</td>
  <td>1hr10min</td>
  <td>RM 80</td>
  <td>RM 100</td>
  <td>RM 120</td>
  <td> <a href="checkout" class="btn btn-info">Book</a> </td>    
    <c:forEach items="${list}" var="Flight" varStatus="loop">
    <tr>
      <td><c:out value="${flight.id}" /></td> 
      <td><c:out value="${flight.flightNo}" /></td>
      <td><c:out value="${flight.departure}" /></td> 
      <td><c:out value="${flight.destination}" /></td>
      <td><c:out value="${flight.departureDate}" /></td>
      <td><c:out value="${flight.departureTime}" /></td>
      <td><c:out value="${flight.arrivalTime}" /></td>
      <td><c:out value="${flight.duration}}" /></td>
      <td>RM <fmt:formatNumber type="number" maxFractionDigits="2" minFractionDigits="2" value="${flight.economicPrice}" /></td>
      <td>RM <fmt:formatNumber type="number" maxFractionDigits="2" minFractionDigits="2" value="${flight.businessPrice}" /></td>
      <td>RM <fmt:formatNumber type="number" maxFractionDigits="2" minFractionDigits="2" value="${flight.firstclassPrice}" /></td>
       <td> <a href="checkout" class="btn btn-info">Book</a> </td>
    </tr>
     </c:forEach>
  </tbody>
</table>
    </body>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</html>