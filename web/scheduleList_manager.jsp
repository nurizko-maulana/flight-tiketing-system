<%-- 
    Document   : scheduleList_admin
    Created on : Jan 28, 2021, 10:08:34 PM
    Author     : thattshini
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="simple-sidebar.css" rel="stylesheet">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
     <% //In case, if Admin session is not set, redirect to Login page
        if((request.getSession(false).getAttribute("isValidate")== null) )
        {
      %>
        <jsp:forward page="login.jsp"></jsp:forward>
     <%} %>
    <body>
       <div class="d-flex" id="wrapper">

    <!-- Sidebar -->
    <div class="bg-light border-right" id="sidebar-wrapper">
        
      <div class="sidebar-heading"><img src="img/logo.png" width="200" height="100" alt=""></div>
      <div class="list-group list-group-flush">
    
        <a href="#" class="list-group-item list-group-item-action bg-light">Profile</a>
        <a href="featuresServlet?action=VIEW" class="list-group-item list-group-item-action bg-light">Seat Feature</a>
        <a href="scheduleServlet?action=VIEW" class="list-group-item list-group-item-action bg-primary active" class="list-group-item list-group-item-action bg-light">Manage Schedule</a>
        <a href="#" class="list-group-item list-group-item-action bg-light">Logout</a>
     
      </div>
    </div>
    <!-- /#sidebar-wrapper -->
    
     <!-- Page Content -->
    <div id="page-content-wrapper">
      <div class="container-fluid">
          <br><br><br>
 <div class="dropdown show">
  <a class="btn btn-secondary dropdown-toggle" href="#" role="button" id="dropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
    Filter List
  </a>

  <div class="dropdown-menu" aria-labelledby="dropdownMenuLink">
    <a class="dropdown-item" href="scheduleServlet?action=VIEWapprove">Approved</a>
    <a class="dropdown-item" href="scheduleServlet?action=VIEWrejected">Rejected</a>
    <a class="dropdown-item" href="scheduleServlet?action=VIEW">Pending</a>
  </div>
</div>
          <br>
<table class="table table-bordered">
  <thead>
    <tr>
      <th scope="col">ID</th>
      <th scope="col">Plane ID</th>
      <th scope="col">Destination-Arrival</th>
      <th scope="col">Departure Time</th>
      <th scope="col">Arrival Time</th>
      <th scope="col">Departure Date</th>
      <th scope="col">Arrival Date</th>
      <th scope="col">Seat Category</th>
      <th scope="col">Price</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
    <c:forEach items="${list}" var="schedule" varStatus="loop">
    <tr>
      <td><c:out value="${schedule.id}" /></td> 
      <td><c:out value="${schedule.plane_id}" /></td>
      <td><c:out value="${schedule.destination_arrival}" /></td> 
      <td><c:out value="${schedule.departureTime}" /></td>
      <td><c:out value="${schedule.arrivalTime}" /></td>
      <td><c:out value="${schedule.departureDate}" /></td>
      <td><c:out value="${schedule.arrivalDate}" /></td>
      <td><c:out value="${schedule.seatCat}" /></td>
      <td>RM <fmt:formatNumber type="number" maxFractionDigits="2" minFractionDigits="2" value="${schedule.price}" /></td>
       <td> <a href="scheduleServlet?action=UNDO&id=${schedule.id}" class="btn btn-info">Undo</a> </td>
    </tr>
     </c:forEach>
  </tbody>
</table>
      </div>
    </div>
    <!-- /#page-content-wrapper -->

    </body>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</html>
