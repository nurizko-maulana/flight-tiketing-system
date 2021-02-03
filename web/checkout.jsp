<%-- 
    Document   : checkout
    Created on : Jan 28, 2021, 11:52:39 AM
    Author     : SwarnnaNagesvaran
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="simple-sidebar.css" rel="stylesheet">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>Checkout</title>
        
        <head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body {
  font-family: Arial;
  font-size: 17px;
  padding: 8px;
}

* {
  box-sizing: border-box;
}

.row {
  display: -ms-flexbox; /* IE10 */
  display: flex;
  -ms-flex-wrap: wrap; /* IE10 */
  flex-wrap: wrap;
  margin: 0 -16px;
}

.col-25 {
  -ms-flex: 25%; /* IE10 */
  flex: 25%;
}

.col-50 {
  -ms-flex: 50%; /* IE10 */
  flex: 50%;
}

.col-75 {
  -ms-flex: 75%; /* IE10 */
  flex: 75%;
}

.col-25,
.col-50,
.col-75 {
  padding: 0 16px;
}

.container {
  background-color: #f2f2f2;
  padding: 5px 20px 15px 20px;
  border: 1px solid lightgrey;
  border-radius: 3px;
}

input[type=text] {
  width: 100%;
  margin-bottom: 20px;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 3px;
}

label {
  margin-bottom: 10px;
  display: block;
}

.icon-container {
  margin-bottom: 20px;
  padding: 7px 0;
  font-size: 24px;
}

.btn {
  background-color: blue;
  color: white;
  padding: 12px;
  margin: 10px 0;
  border: none;
  width: 100%;
  border-radius: 3px;
  cursor: pointer;
  font-size: 17px;
}

.btn:hover {
  background-color: #45a049;
}

a {
  color: #2196F3;
}

hr {
  border: 1px solid lightgrey;
}

span.price {
  float: right;
  color: grey;
}

@media (max-width: 800px) {
  .row {
    flex-direction: column-reverse;
  }
  .col-25 {
    margin-bottom: 20px;
  }
}
    </style>
    </head>
    
    
    <body>
       <div class="d-flex" id="wrapper">

        <!-- Sidebar -->
        <div class="bg-light border-right" id="sidebar-wrapper">

          <div class="sidebar-heading"><img src="img/logo.png" width="200" height="100" alt=""></div>
          <div class="list-group list-group-flush">

            <a href="profile.jsp" class="list-group-item list-group-item-action bg-light">Profile</a>
            <a href="flightSchedule.jsp" class="list-group-item list-group-item-action bg-light">Flight Schedule</a>
            <a href="bookingHistory.jsp" class="list-group-item list-group-item-action bg-primary active">Booking History</a>
            
          </div>
        </div>
        <!-- /#sidebar-wrapper -->
    
     <!-- Page Content -->
    <div id="page-content-wrapper">
      <div class="container-fluid">
          
    
  <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
      <a class="dropdown-item" href="#">Logout</a>
  </div>
</div>
    <body>
        <div class="row">
  <div class="col-75">
    <div class="container">
        <form action="bookingHistory.jsp" method="post" >
      
        <div class="row">
          <div class="col-50">
            <h3>Checkout Details</h3>
            <label for="fname">Accepted Cards</label>
            <div class="icon-container">
              <i class="fa fa-cc-visa" style="color:navy;"></i>
              <i class="fa fa-cc-amex" style="color:blue;"></i>
              <i class="fa fa-cc-mastercard" style="color:red;"></i>
              <i class="fa fa-cc-discover" style="color:orange;"></i>
            </div>
             <div class="form-group">
  <label>Name of Passenger:</label>
  <input type="text" class="form-control" name="nameofPas" placeholder="John Doe" required> 
  </div>
 <div class="form-group">
  <label>Number of Passengers:</label>
  <input type="text" class="form-control" name="numofPas" placeholder="1" required>    
  </div>
 <div class="form-group">
  <label >Additional Baggage: </label> 
  <select class="form-control" name="baggage" placeholder="7 kg" required>     
       <option value="7">7 kg</option>
      <option value="10">10 kg</option>
      <option value="15">15 kg</option>
      <option value="20">20 kg</option>
    </select>
  </div>
            <label for="nameofPay">Name on Card</label>
            <input type="text" id="cname" name="nameofPay" placeholder="John More Doe"required>
            <label for="cardNum">Credit card number</label>
            <input type="text" id="ccnum" name="cardNum" placeholder="1111-2222-3333-4444" required="">
            <label for="expiry">Expiry Date</label>
            <input type="text" id="expiry" name="expiry" placeholder="02/22" required>
            <label for="cvv">CVV</label>
            <input type="text" id="cvv" name="cvv" placeholder="352" required>
            <td><input type="submit" class="btn btn-info" >Pay</td>
            </div>
          </div>
          
        </div>
    </body>
</html>
