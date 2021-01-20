<%-- 
    Document   : seatUpdate_admin
    Created on : Jan 4, 2021, 6:40:40 PM
    Author     : thattshini
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="simple-sidebar.css" rel="stylesheet">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
       <div class="d-flex" id="wrapper">

    <!-- Sidebar -->
    <div class="bg-light border-right" id="sidebar-wrapper">
        
      <div class="sidebar-heading"><img src="img/logo.png" width="200" height="100" alt=""></div>
      <div class="list-group list-group-flush">
    
        <a href="#" class="list-group-item list-group-item-action bg-light">Profile</a>
        <a href="featuresServlet?action=VIEW" class="list-group-item list-group-item-action bg-primary active">Seat Feature</a>
        <a href="#" class="list-group-item list-group-item-action bg-light">Seat Updates</a>
        <a href="#" class="list-group-item list-group-item-action bg-light">Logout</a>
     
      </div>
    </div>
    <!-- /#sidebar-wrapper -->
    
     <!-- Page Content -->
    <div id="page-content-wrapper">
      <div class="container-fluid">
          <br><br><br>
          <a href="features-form.jsp" class="btn btn-primary">Add Seat</a> 
<br><br>
<table class="table table-bordered">
  <thead>
    <tr>
      <th scope="col">ID</th>
      <th scope="col">Seat Class</th>
      <th scope="col">Seat Width</th>
      <th scope="col">Seat Type</th>
      <th scope="col">Video Type</th>
      <th scope="col">Power Type</th>
      <th scope="col">Wifi</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
     <c:forEach items="${list}" var="features" varStatus="loop">
    <tr>
      <td><c:out value="${features.id}" /></td> 
      <td><c:out value="${features.seatCat}" /></td> 
      <td><c:out value="${features.seatWidth}" /></td>
      <td><c:out value="${features.seatType}" /></td>
      <td><c:out value="${features.videoType}" /></td>
      <td><c:out value="${features.powerType}" /></td>
      <td><c:out value="${features.wifi}" /></td>
      <td> <a href="featuresServlet?action=EDIT&id=${features.id}" class="btn btn-warning">Edit</a>  <a href="featuresServlet?action=DELETE&id=${features.id}" class="btn btn-danger">Delete</a> </td>
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
