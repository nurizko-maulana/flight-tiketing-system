<%-- 
    Document   : ManageUser
    Created on : Jan 24, 2021, 10:02:52 AM
    Author     : SwarnnaNagesvaran
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="simple-sidebar.css" rel="stylesheet">
        <title>Manage User</title>
    </head>
    <body>
        <div class="d-flex" id="wrapper">
            <!-- Sidebar -->
            <div class="bg-light border-right" id="sidebar-wrapper">

                <div class="sidebar-heading"><img src="img/logo.png" width="200" height="100" alt=""></div>
                <div class="list-group list-group-flush">

                   <a href="#" class="list-group-item list-group-item-action bg-light ">Profile</a>
                   <a href="Manage Schedule.jsp" class="list-group-item list-group-item-action bg-light">Schedule</a>
                    <a href="#" class="list-group-item list-group-item-action bg-light ">Seat List</a>
                    <a href="#" class="list-group-item list-group-item-action bg-light">Seat Updates</a>
                    <a href="featuresServlet?action=VIEW" class="list-group-item list-group-item-action bg-light">Seat Feature</a>                    
                    <a href="#" class="list-group-item list-group-item-action bg-light">Seat Price</a>                    
                    <a href="UserServlet?action=VIEW" class="list-group-item list-group-item-action bg-primary active">Users</a>
                </div>
            </div>
                
              <br></br>
              <center>
               <h3>Manage User</h3>
               <br></br>

                    <br></br>
            
 

                    <div>
        <a class="button" href="registerUser-admin.jsp">Add User</a>
  </div>

                    <br>
            
             <table class="table table-bordered">
  <thead>
    <tr>
      <th scope="col">ID</th>    
      <th scope="col">Username</th>
      <th scope="col">Email</th>
      <th scope="col">Password</th>
      <th scope="col">User Type</th>      
      <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
    <c:forEach items="${list}" var="users" varStatus="loop">
    <tr>
      <td><c:out value="${users.id}" /></td> 
      <td><c:out value="${users.username}" /></td> 
      <td><c:out value="${users.email}"/></td>
      <td><c:out value="${users.password}" /></td>
      <td><c:out value="${users.userType}" /></td> 
      <td> <a href="UserServlet?action=DELETE&id=${users.id}" class="btn btn-info">Delete</a> </td>
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
