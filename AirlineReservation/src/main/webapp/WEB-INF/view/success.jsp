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

<title>Invoice</title>
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
     <h3 style="text-align:center;">Ticket Booked Successfully</h3>
     <div class="text-center mb-3">
        Name :${user.uname} <br>
        Mail :${user.mail } <br>
        Address :${user.address} <br>
        Passport No :${user.passport} <br>
     </div>
    </div>
    
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script>

</body>
</html>
