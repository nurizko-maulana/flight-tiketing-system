<%-- 
    Document   : homepage_manager
    Created on : Feb 3, 2021, 11:50:26 PM
    Author     : thattshini
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                    
                    <a href="homepage_manager.jsp" class="list-group-item list-group-item-action bg-primary active">Home</a>
                    <a href="profileServlet?action=VIEW" class="list-group-item list-group-item-action bg-light">Profile</a>
                    <a href="featuresServlet?action=VIEW" class="list-group-item list-group-item-action bg-light">Seat Feature</a>
                    <a href="scheduleServlet?action=VIEW" class="list-group-item list-group-item-action bg-light" >Schedule Updates</a>
                    <a href="#" class="list-group-item list-group-item-action bg-light">Plane Details</a>
                    <a href="#" class="list-group-item list-group-item-action bg-light">Statistic</a>
                    <a href="#" class="list-group-item list-group-item-action bg-light">Logout</a>

                </div>
            </div>
            <!-- /#sidebar-wrapper -->

            <!-- Page Content -->
            <div id="page-content-wrapper">
               
                    <img  src="img/homepage2.jpg" width="1290" alt="logo">
            
                <div class="text-center p-3" style="background-color: #F5F5F5;">
    © 2020 Copyright:
    <a class="text-dark" href="#">Flight Ticketing System(FTS)</a>
  </div>
            </div>
            
            <!-- /#page-content-wrapper -->

    </body>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</html>

