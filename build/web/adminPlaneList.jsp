<%-- 
    Document   : adminPlaneList
    Created on : 19-Jan-2021, 23:55:35
    Author     : duncanleo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>


    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="simple-sidebar.css" rel="stylesheet">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.23/css/jquery.dataTables.css">
        <script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.23/js/jquery.dataTables.js"></script>

        <title>Plane List</title>
    </head>


    <body>
        <div class="d-flex" id="wrapper">

            <!-- Sidebar -->
            <div class="bg-light border-right" id="sidebar-wrapper">

                <div class="sidebar-heading"><img src="img/logo.png" width="200" height="100" alt=""></div>
                <div class="list-group list-group-flush">

                    <a href="profile.jsp" class="list-group-item list-group-item-action bg-light">Profile</a>
                    <a href="PlaneServlet?action=VIEW" class="list-group-item list-group-item-action bg-primary active">Plane</a>
                    <a href="statistic.jsp" class="list-group-item list-group-item-action bg-light">Statistic</a>

                </div>
            </div>
            <!-- /#sidebar-wrapper -->

            <!-- Page Content -->
            <div id="page-content-wrapper">
                <div class="container-fluid">


                    <!--<div class="dropdown float-right my-5 mr-5  ">
                      <button class="btn btn-primary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        USER
                      </button>
                          
                      <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                          <a class="dropdown-item" href="#">Logout</a>
                      </div>
                    </div>-->

                    <div class="container-fluid mt-5">

                        <a href="adminPlaneAdd.jsp" class="btn btn-primary my-3" id="add">Add Plane</a>
                        <!--Table-->
                        <form action="booking.jsp" method="post"> 
                            <table id="tablePreview my_table" class="table">
                                <!--Table head-->
                                <thead>
                                    <tr>
                                        <th>#</th>
                                        <th>Model</th>
                                        <th>Year</th>
                                        <th>Capacity</th>
                                        <th>Feature</th>
                                        <th>Status</th>
                                        <th>Action</th>
                                    </tr>
                                </thead>
                                <!--Table head-->
                                <!--Table body-->
                                <tbody>
                                 
                                <c:forEach items="${list}" var="plane" varStatus="loop">
                                    <tr>
                                    <td><c:out value="${plane.id}" /></td> 
                                    <td><c:out value="${plane.model}" /></td> 
                                    <td><c:out value="${plane.year}" /></td>
                                    <td><c:out value="${plane.capacity}" /></td>
                                    <td><c:out value="${plane.feature_id}" /></td>
                                    <td><c:out value="${plane.status}" /></td>
                                    <td> <a href="plane?action=EDIT&id=${plane.id}" class="btn btn-warning">Edit</a>  <a href="plane?action=DELETE&id=${plane.id}" class="btn btn-danger">Delete</a> <a href="plane?action=ACTIVATE&id=${plane.id}&status=${plane.status}" class="btn btn-secondary">ACTIVATE/DEACTIVATE</a> </td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                                <!--Table body-->
                            </table>
                            <!--Table-->
                    </div>
                </div>
            </div>

            <!-- /#page-content-wrapper -->

    </body>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    <script>
        $(document).ready(function () {
            $('#my_table').DataTable();
        });
    </script>
</html>