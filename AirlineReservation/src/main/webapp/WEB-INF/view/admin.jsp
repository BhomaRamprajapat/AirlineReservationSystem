<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 	
<%@ page isELIgnored="false"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">

<style>
.topnav {
	overflow: hidden;
	background-color: #000099;
}

.topnav a {
	float: left;
	color: white;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
	font-size: 17px;
}

.topnav a:hover {
	background-color: #ddd;
	color: black;
}
</style>

<title>admin page</title>
</head>
<body>
	<div class="topnav">
		<a href="home">Home</a> 
		<a href="addFlight">AddFlight</a>
		<a href="logout">Logout</a>
		<a href="#contact">Contact Us</a> 
		<a href="#about">About Us</a>
	</div>
	<!-- container start -->
    <div class="container" style="padding-top:20px;">
     <div class="text-center mb-3">
      <h3>Welcome Bhoma</h3>
     </div>
     <div class="ftable">
      <table class="table table-bordered">
       <thead>
        <th scope="col">ID</th>
        <th scope="col">Name</th>
        <th scope="col">From</th>
        <th scope="col">To</th>
        <th scope="col">Depart</th>
        <th scope="col">Return</th>
        <th scope="col">Capacity</th>
        <th scope="col">Available</th>
        <th scope="col">Flight Class</th>
        <th scope="col">Update</th>
        <th scope="col">Delete</th>
       </thead>
       <c:forEach items="${flight}" var="item">
        <tr>
         <td>${item.fid }</td>
         <td>${item.fname}</td>
         <td>${item.src}</td>
         <td>${item.dst}</td>
         <td>${item.depart}</td>
         <td>${item.ret}</td>
         <td>${item.capacity}</td>
         <td>${item.avail}</td>
         <td>${item.fClass}</td>
         <td><a href="update/${item.fid}">Update</a></td>
         <td><a href="delete/${item.fid}">Delete</a></td>
        </tr>
       </c:forEach>
      </table>
     </div>
    </div>
    
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script>

</body>
</html>
