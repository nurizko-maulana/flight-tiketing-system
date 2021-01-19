<%-- 
    Document   : adminPlaneList
    Created on : 19-Jan-2021, 12:12:52
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
            <a href="flightSchedule.jsp" class="list-group-item list-group-item-action bg-primary active">Plane</a>
            <a href="bookingDetail.jsp" class="list-group-item list-group-item-action bg-light">Booking</a>
          </div>
        </div>
        <!-- /#sidebar-wrapper -->
    
        <!-- Page Content -->
        <div id="page-content-wrapper">
          <div class="container-fluid">
              <div class="dropdown float-right my-5 mr-5  ">
                <button class="btn btn-primary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                  admin
                </button>
                <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                    <a class="dropdown-item" href="#">Logout</a>
                </div>
              </div>
              <!--Table-->
              <table id="tablePreview" class="table container-fluid">
              <!--Table head-->
                <thead>
                  <tr>
                    <th>#</th>
                    <th>Model</th>
                    <th>Capacity</th>
                    <th>Airlines</th>
                  </tr>
                </thead>
                <!--Table head-->
                <!--Table body-->
                <tbody>
                  <tr>
                    <th scope="row">1</th>
                    <td>Airbus 737</td>
                    <td>237</td>
                    <td>22.50</td>
                  </tr>
                  <tr>
                    <th scope="row">2</th>
                    <td>MQ2221</td>
                    <td>Langkawi - Johor</td>
                    <td>18.20</td>
                  </tr>
                  <tr>
                    <th scope="row">3</th>
                    <td>MQ2258</td>
                    <td>Penang - Johor</td>
                    <td>03.25</td>
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