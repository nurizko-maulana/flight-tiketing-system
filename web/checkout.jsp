<%-- 
    Document   : checkout
    Created on : Feb 4, 2021, 7:18:43 PM
    Author     : SwarnnaNagesvaran
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="simple-sidebar.css" rel="stylesheet">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>Checkout</title>
    </head>
    <body>
         <%  request.getAttribute("schedule"); %> 
       <div class="d-flex" id="wrapper">

    <!-- Sidebar -->
    <div class="bg-light border-right" id="sidebar-wrapper">
        
      <div class="sidebar-heading"><img src="img/logo.png" width="200" height="100" alt=""></div>
      <div class="list-group list-group-flush">
    
        <a href="profile.jsp" class="list-group-item list-group-item-action bg-light">Profile</a>
        <a href="bookingServlet?action=VIEW" class="list-group-item list-group-item-action bg-primary active">Flight Schedule</a>
        <a href="bookingServlet?action=VIEWBOOKING"  class="list-group-item list-group-item-action bg-light">Booking History</a>
        <a href="login.jsp" class="list-group-item list-group-item-action bg-light">Logout</a>
     
      </div>
    </div>
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
  padding: 100px;
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
  background-color: #4CAF50;
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

/* Responsive layout - when the screen is less than 800px wide, make the two columns stack on top of each other instead of next to each other (also change the direction - make the "cart" column go on top) */
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


<div class="row">
  <div class="col-75">
    <div class="container">
     
      
        <div class="row">        

          
          <div class="col-50">
            <h3>Payment</h3>
            <label for="fname" required>Accepted Cards</label>
            <div class="icon-container">
              <i class="fa fa-cc-visa" style="color:navy;"></i>
              <i class="fa fa-cc-amex" style="color:blue;"></i>
              <i class="fa fa-cc-mastercard" style="color:red;"></i>
              <i class="fa fa-cc-discover" style="color:orange;"></i>
            </div>
            <label for="numofpas" required>Number of Passengers</label>
            <input type="text" id="numofpas" name="numofpas" placeholder="1">
            </label>
          <label >Additional Baggage:
    <select class="form-control" name="baggage"required>
        <option selected><c:out value='${booking.baggage}'/></option>
       <option value="7">7 kg</option>
       <option value="10">10 kg</option>
       <option value="15">15 kg</option>
       <option value="20">20 kg</option>
    </select></label>
              <label >Seat Category:
    <select class="form-control" name="seatCat"required>
        <option selected><c:out value='${booking.seatCat}'/></option>
       <option value="economy">Economy</option>
       <option value="premier econmony">Premier Economy</option>
       <option value="business">Business</option>
       <option value="first class">First Class</option>
    </select></label>
  
            <label for="nameofpay">Name on Card</label>
            <input type="text" id="nameofpay" name="nameofpay" placeholder="John More Doe" required>
            <label for="cardnum">Credit card number</label>
            <input type="text" id="cardnum" name="cardnum" placeholder="1111-2222-3333-4444" required>
            <label for="expiry">Expiry</label>
            <input type="text" id="expiry" name="expiry" placeholder="03/24" required>
                         <label for="cvv">CVV</label>
                <input type="text" id="cvv" name="cvv" placeholder="352" required>
                         </div>
          </div>
          
       <button onclick="myfunction()" a href="bookingServlet?action=CHECKOUT" class="btn-btn-primary" align="center" >Checkout</a></button>
          <script>
              function myfunction(){
                  alert("Payment Successfully Made!");
              }
              </script>            
          
          
        </div>
    
    </body>
</html>
