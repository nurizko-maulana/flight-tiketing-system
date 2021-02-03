<%-- 
    Document   : SearchFlight
    Created on : Jan 26, 2021, 2:55:03 AM
    Author     : SwarnnaNagesvaran
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="simple-sidebar.css" rel="stylesheet">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>SearchFlight</title>
    </head>
    <body>
          
       <div class="d-flex" id="wrapper">

    <!-- Sidebar -->
    <div class="bg-light border-right" id="sidebar-wrapper">
        
      <div class="sidebar-heading"><img src="img/logo.png" width="200" height="100" alt=""></div>
      <div class="list-group list-group-flush">
    
        <a href="#" class="list-group-item list-group-item-action bg-light">Profile</a>
        <a href="bookingServlet?action=VIEW" class="list-group-item list-group-item-action bg-primary active">Flight Schedule</a>
        <a href="bookingServlet?action=VIEWBOOKING"  class="list-group-item list-group-item-action bg-light">Booking History</a>
        <a href="#" class="list-group-item list-group-item-action bg-light">Logout</a>
     
      </div>
    </div>
    <!-- /#sidebar-wrapper -->
    
     <!-- Page Content -->
    <div id="page-content-wrapper">
      <div class="container-fluid">
         
              <br><br>
               <h2>Search Flight</h2>
               <br>
<div class="card">
    <div class="card-body">
        

 <div class="form-group">
  <label >Departure</label>
    <select class="form-control" name="departure">
      <option selected><c:out value='${schedule.destination_arrival}'/></option>
      <option value="jb">Johor Bahru</option>
      <option value="kl">Kuala Lumpur</option>
      <option value="pen">Penang</option>
      <option value="syd">Sydney</option>
      
    </select>
  </div>
 <div class="form-group">
  <label >Destination</label>
    <select class="form-control" name="destination">
      <option selected><c:out value='${schedule.destination_arrival}'/></option>
       <option value="jb">Johor Bahru</option>
       <option value="kl">Kuala Lumpur</option>
       <option value="pen">Penang</option>
       <option value="syd">Sydney</option>
    </select>
  </div>
 <div class="form-group">
  <label >Departure Date:</label>
  <input type="date" name="departureDate" min="2021-02-04"/>
 </div>
  <div class="form-group">
  <label >Number of Passengers:</label>
  <input type="text" id="numofPas" name="numofPas"/>
 </div>     
 <div class="form-group">
  <label >Additional Baggage:</label>
    <select class="form-control" name="baggage">
        <option selected><c:out value='${booking.baggage}'/></option>
       <option value="7">7 kg</option>
       <option value="10">10 kg</option>
       <option value="15">15 kg</option>
       <option value="20">20 kg</option>
    </select>
  </div>
       <div class="form-group">
  <label >Seat Category:</label>
    <select class="form-control" name="seatCat">
        <option selected><c:out value='${schedule.seatCat}'/></option>
       <option value="Economy">Economy</option>
       <option value="Premium Economy">Premium Economy</option>
       <option value="Business">Business</option>
       <option value="First Class">First Class</option>
    </select>
  </div>
  <input type="hidden" name="id" value="${schedule.id}"/>
  <button type="submit" class="btn btn-primary">Search</button>
</form>
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

