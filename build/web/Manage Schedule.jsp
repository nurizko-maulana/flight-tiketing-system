<%-- 
    Document   : Manage Profile
    Created on : Jan 5, 2021, 8:33:20 PM
    Author     : Asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <title>Manage Schedule</title>
    </head>
    <body>
        <div class="d-flex" id="wrapper">
            <!-- Sidebar -->
            <div class="bg-light border-right" id="sidebar-wrapper">

                <div class="sidebar-heading"><img src="img/logo.png" width="200" height="100" alt=""></div>
                <div class="list-group list-group-flush">

                    <a href="#" class="list-group-item list-group-item-action bg-light ">Profile</a>
                    <a href="#" class="list-group-item list-group-item-action bg-light ">Seat List</a>
                    <a href="#" class="list-group-item list-group-item-action bg-light">Seat Updates</a>
                    <a href="#" class="list-group-item list-group-item-action bg-primary active">Schedule</a>
                    <a href="#" class="list-group-item list-group-item-action bg-light">Seat Price</a>

                </div>
            </div>
            <!-- /#sidebar-wrapper -->
            <div class="bg-secondary" id="page-content-wrapper">
                <div class="container-fluid">
                    <br><br><br>
                    <table class=" bg-light table table-bordered">
                        <thead>
                            <tr>
                                <th scope="col">Flight No</th>
                                <th scope="col">Destination</th>
                                <th scope="col">Origin</th>
                                <th scope="col">Departure Time</th>
                                <th scope="col">Arrival Time</th>
                                <th scope="col">Duration</th>
                                <th scope="col">Actions</th>

                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <th scope="row">EK486</th>
                                <td>Dubai</td>
                                <td>Kuala Lumpur</td>
                                <td>1920</td>
                                <td>0530</td>
                                <td>8H 20M </td>
                                <td>
                                    <button type="button" class="btn btn-success">Edit</button>
                                    <button type="button" class="btn btn-danger">Delete</button>
                                </td>
                            </tr>
                            <tr>
                                <th scope="row">EK1971</th>
                                <td>Dhaka</td>
                                <td>Kuala Lumpur</td>
                                <td>1320</td>
                                <td>1630</td>
                                <td>3H 15M </td>
                                <td>
                                    <button type="button" class="btn btn-success">Edit</button>
                                    <button type="button" class="btn btn-danger">Delete</button>
                                </td>
                            </tr>
                            <tr>
                                <th scope="row">EK486</th>
                                <td>Madrid</td>
                                <td>Kuala Lumpur</td>
                                <td>1720</td>
                                <td>0930</td>
                                <td>9H 20M </td>
                                <td>
                                    <button type="button" class="btn btn-success">Edit</button>
                                    <button type="button" class="btn btn-danger">Delete</button>
                                </td>
                            </tr>

                        </tbody>
                    </table>
                </div>
            </div>
            <!-- /#page-content-wrapper -->

        </div>



        <!-- Option 2: jQuery, Popper.js, and Bootstrap JS
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>
        -->
    </body>
</html>
