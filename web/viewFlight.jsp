<%-- 
    Document   : bookingDetail
    Created on : Jan 23, 2021, 11:02:59 am
    Author     : SwarnnaNagesvaran
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>


    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="simple-sidebar.css" rel="stylesheet">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdn.datatables.net/1.10.19/css/dataTables.bootstrap4.min.css">
        <link rel="stylesheet" href="https://cdn.datatables.net/responsive/2.2.3/css/responsive.dataTables.min.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/boxicons@2.0.0/css/boxicons.min.css">
        <title>Flight Schedule</title>
    </head>


    <body>
        <div class="d-flex" id="wrapper">

            <!-- Sidebar -->
            <div class="bg-light border-right" id="sidebar-wrapper">

                <div class="sidebar-heading"><img src="img/logo.png" width="200" height="100" alt=""></div>
                <div class="list-group list-group-flush">

                    <a href="profile.jsp" class="list-group-item list-group-item-action bg-light">Profile</a>
                    <a href="bookingServlet?action=VIEW" class="list-group-item list-group-item-action bg-primary active">Flight Schedule</a>
                    <a href="bookingServlet?action=VIEWBOOKING" class="list-group-item list-group-item-action bg-light">Booking History</a>
                    <a href="#" class="list-group-item list-group-item-action bg-light">Logout</a>
                </div>
            </div>
            <!-- /#sidebar-wrapper -->
            <br></br>
            <center>
                <h3>List Of Flights</h3>
                <br></br>   

                <!-- Page Content -->
                <div id="page-content-wrapper">
                    <div class="container-fluid">

                        <!--Table-->
                        <table class="table table-bordered">
                            <thead>
                                <tr>     
                                    <th scope="col">Flight No</th>
                                    <th scope="col">Destination-Arrival</th>      
                                    <th scope="col">Departure Date</th>
                                    <th scope="col">Departure Time</th>
                                    <th scope="col">Arrival Time</th>      
                                    <th scope="col">Price</th>     
                                    <th scope="col">Action</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach items="${list}" var="schedule" varStatus="loop">
                                    <tr>
                                        <td><c:out value="${schedule.plane_id}" /></td> 
                                        <td><c:out value="${schedule.destination_arrival}" /></td>
                                        <td><c:out value="${schedule.departureDate}" /></td> 
                                        <td><c:out value="${schedule.departureTime}" /></td> 
                                        <td><c:out value="${schedule.arrivalTime}" /></td>   
                                        <td>RM <fmt:formatNumber type="number" maxFractionDigits="2" minFractionDigits="2" value="${schedule.price}" /></td>
                                <td> <a href="bookingServlet?action=VIEWBOOKING">Book</a> </td>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                        </body>
                        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" ></script>
                        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" ></script>
                        <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.3.1/js/bootstrap.min.js" ></script>
                        <script src="https://cdnjs.cloudflare.com/ajax/libs/datatables/1.10.19/js/jquery.dataTables.min.js" ></script>
                        <script src="https://cdn.datatables.net/responsive/2.2.3/js/dataTables.responsive.min.js" ></script>
                        <script src="https://cdn.datatables.net/1.10.19/js/dataTables.bootstrap4.min.js" ></script>
                        <script>
                            $('table').DataTable();
                        </script>


                        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
                        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
                        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
                        </html>
