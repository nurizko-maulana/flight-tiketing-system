<%-- 
    Document   : User-form
    Created on : Jan 30, 2021, 9:59:54 PM
    Author     : SwarnnaNagesvaran
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="simple-sidebar.css" rel="stylesheet">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>Add User</title>
    </head>
    <body>
       <div class="d-flex" id="wrapper">

    <!-- Sidebar -->
    <div class="bg-light border-right" id="sidebar-wrapper">
        
      <div class="sidebar-heading"><img src="img/logo.png" width="200" height="100" alt=""></div>
      <div class="list-group list-group-flush">
    
        <a href="#" class="list-group-item list-group-item-action bg-light">Profile</a>
        <a href="featuresServlet?action=VIEW" class="list-group-item list-group-item-action bg-light">Seat Feature</a>
        <a href="scheduleServlet?action=VIEW" class="list-group-item list-group-item-action bg-light" >Manage Schedule</a>
        <a href="UserServlet?action=VIEW" class="list-group-item list-group-item-action bg-primary acitve">Manage User</a>
        <a href="#" class="list-group-item list-group-item-action bg-light">Logout</a>
     
      </div>
    </div>
    <!-- /#sidebar-wrapper -->
    
     <!-- Page Content -->
    <div id="page-content-wrapper">
      <div class="container-fluid">
         
              <br><br>
               <h2>Edit User</h2>
               <br>
<div class="card">
    <div class="card-body">
        
        <form action="UserServlet?action=ADD" method="post">
  <div class="form-group">
      <label>Name: </label>
    <input type="text" id="name" name="name">      
  </div>

  <div class="form-group">
      <label>Username: </label>
    <input type="text" id="name" name="username">      
  </div>
 <div class="form-group">
      <label>Email: </label>
    <input type="text" id="name" name="email">      
  </div>
   <div class="form-group">
      <label>Password: </label>
    <input type="text" id="name" name="password">      
  </div>
   
  <div class="form-group">
  <label >User Type</label>
    <select class="form-control" name="userType">
      <option value="admin">Admin</option>
      <option value="manager">Manager</option>
      <option value="customer">Customer</option>
    </select>
  </div>
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
            </div>
         </div>
      </div>
    </div>
    <!-- /#page-content-wrapper -->

    </body>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</html>

