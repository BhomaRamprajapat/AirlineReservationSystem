<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

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

.error
{
 color:red;	
}
</style>
</style>

<title>search Flights</title>
</head>
<body>
	<div class="topnav">
		<a href="home">Home</a> 
		<a href="#contact">Contact Us</a> 
		<a href="#about">About Us</a>
	</div>
	<!-- container start -->
	<div class="container" style="padding-left: 400px; padding-top: 40px;">
		<h3 style="padding-left: 120px;padding-bottom:40px;">User Login</h3>
		<!-- start of card -->
		<div class="card" style="width: 400px; background-color: #fcfafb;">
			<div class="card-body">
				<form:form action="userLogin" method="post" modelAttribute="userLogin">
					<div class="row">
						<div class="col">
							<div class="mb-3">
								<label for="exampleInputEmail1" class="form-label">User Name</label>
								<form:input type="text" path="uname" class="form-control"
									aria-describedby="emailHelp" />
						        <form:errors path="uname" cssClass="error" element="div"/>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col">
							<div class="mb-3">
								<label for="exampleInputEmail1" class="form-label">Password</label>
								<form:input type="password" path="pass" class="form-control"
									aria-describedby="emailHelp"/>
							   <form:errors path="pass" cssClass="error" element="div"/>
							</div>
						</div>
					</div>
					<div class="mt-3">
						<div class="text-center">
							<button type="submit" class="btn btn-success">Submit</button>
						</div>
					</div>
				</form:form>
			</div>
		</div>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script>

</body>
</html>
