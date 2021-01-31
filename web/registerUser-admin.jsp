<%-- 
    Document   : registerUser-admin
    Created on : Jan 24, 2021, 6:19:00 PM
    Author     : thattshini
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <style>
      #leftContent{
        background-color: #F5F5F5;
       
        background-repeat: no-repeat;
        width: 50%;
        position: absolute;
        left: 0px;
        height: 100%;
      }
      #rightHalf {

        width: 50%;
        position: absolute;
        right: 0px;
        height: 100%;
        float:right;
      }
      
       #rightHalf2 {

        width: 50%;
        position: absolute;
        right: 0px;
        align-content: center;
        height: 100%;
        float:right;
        padding-top: 100px;
        padding-left: 70px;
      }
    </style>
        <title>Registration</title>
 
    </head>
    <body>
       <div class="container">
        <div class="row">
          <div id="leftContent" class="col" >
            <img class="w-100" src="img/TagLine.png" alt="plane">
          </div>

          <div class="col p-5 ">
            <div class="text-center" id="rightHalf">
              <img class="w-50 " src="img/logo.png" alt="logo">
            </div>
              <div class="col p-5 " >
              <form action="regServlet" method="post" id="rightHalf2">
              <div class="form-group">
                <label class="text-left">Username</label>
                <input type="text" class="form-control" id="username" name="username" placeholder="Enter Username" required>
              </div>
              <div class="form-group">
                <label class="text-left">Email address</label>
                <input type="email" class="form-control" id="email" name="email" placeholder="Enter email" required>
              </div>
              <div class="form-group">
                <label class="text-left">Password</label>
                <input type="password" class="form-control" id="password" name="password" placeholder="Password" required>
              </div>
              <div class="form-group">
                     <label class="text-left">User Role</label><br>
                <select class="form-control" name="userType">
                    <option value="customer">Customer</option>
                    <option value="admin">Admin</option>
                    <option selected value="manager">Manager</option>
                </select>
              </div>
              <button type="submit" class="btn btn-primary btn-block">Submit</button>
            </form>
          </div>
          </div>
        </div>
      </div>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>