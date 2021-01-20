<%-- 
    Document   : updateuser
    Created on : Jan 19, 2021, 9:23:57 PM
    Author     : SwarnnaNagesvaran
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>


    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="simple-sidebar.css" rel="stylesheet">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>Update User Details</title>
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
                    <a href="ManageUser.jsp" class="list-group-item list-group-item-action bg-primary active">Users</a>

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
                        <h1>Update User Details</h1>
                    </div>
                    <div class="row justify-content-center pt-5">
                        <div class="card  " style="max-width:400px">

                            <div class="card-body">
                                <form>
                                    <div class="form-group">
                                        <label for="username">Username: </label>
                                        <input type="text" class="form-control" id="username" placeholder="John Doe">
                                        <label for="email">E-Mail Address: </label>
                                        <input type="email" class="form-control" id="email" placeholder="example@email.com">
                                        <label for="name">Name: </label>
                                        <input type="text" class="form-control" id="name">
                                        <label for="id">ID: </label>
                                        <input type="text" class="form-control" id="id">
                                        <br>                                       
                                         <label for="user">User Type: </label>
                                        <select id="mySelect">
                                        <option value="apple">Customer</option>
                                        <option value="orange">Staff</option>
                                        <option value="pineapple">Admin</option>
    
                                        </select>
                                    </div>
                                </form>

                                <button onclick="myFunction()" >Submit</button>
                                
                                <script>
                                    function myFunction(){
                                        alert("User Details Updated Successfully!")
                                    }
                                    </script>
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

