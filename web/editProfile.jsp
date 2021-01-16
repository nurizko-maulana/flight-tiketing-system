<%-- 
    Document   : flightShedule
    Created on : 14-Jan-2021, 09:19:55
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

                    <a href="profile.jsp" class="list-group-item list-group-item-action bg-primary active">Profile</a>
                    <a href="flightSchedule.jsp" class="list-group-item list-group-item-action bg-light">Flight</a>
                    <a href="bookingDetail.jsp" class="list-group-item list-group-item-action bg-light">Booking</a>

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
                    <div class="w-auto h-100 pt-5"> 
                        <h1>Profile Page</h1>
                    </div>
                    <div class="row justify-content-center">
                    <div class="card " style="max-width:400px">
                        <img class="card-img-top" src="https://st3.depositphotos.com/13159112/17145/v/600/depositphotos_171453724-stock-illustration-default-avatar-profile-icon-grey.jpg" alt="Card image">
                        <div class="card-body">
                            <form >
                                <div class="form-group">
                            </form>
                            <p class="card-text">Email: example@email.com</p>
                            <p class="card-text">ID No:</p>
                            <p class="card-text">Email: example@email.com</p>
                            <a href="#" class="btn btn-primary">Edit</a>
                        </div>
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
