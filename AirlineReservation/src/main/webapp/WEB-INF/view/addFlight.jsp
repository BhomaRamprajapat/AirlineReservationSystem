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

<title>admin page</title>
</head>
<body>
	<div class="topnav">
		<a href="home">Home</a> <a href="#logout">Logout</a> <a
			href="#contact">Contact Us</a> <a href="#about">About Us</a>
	</div>
	<!-- container start -->
	<div class="container" style="padding-top: 40px; padding-left: 350px;">
		<div class="card" style="width: 500px;">
			<div class="card-header text-center">
				<h3>Flight Details</h3>
			</div>
			<div class="card-body">
				<form:form action="add" method="post" modelAttribute="flight">
					<div class="row">
						<div class="mb-3">
							<form:input type="text" path="fname"
								placeholder="Enter Flight Name" class="form-control" />
							<form:errors path="fname" cssClass="error" element="div" />
						</div>
					</div>
					<div class="row">
						<div class="col">
							<div class="mb-3">
								<form:input type="text" path="src" placeholder="Source" 
									class="form-control" />
								<form:errors path="src" cssClass="error" element="div" />
							</div>
						</div>
						<div class="col">
							<div class="mb-3">
								<form:input type="text" path="dst" placeholder="Destination"
									 class="form-control" />
								<form:errors path="dst" cssClass="error" element="div" />
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col">
							<div class="mb-3">
								<label class="form-label">Depart</label>
								<form:input type="date" path="depart" placeholder="depart"
									 class="form-control" />
							    <form:errors path="depart" cssClass="error" element="div" />
							</div>
						</div>
						<div class="col">
							<div class="mb-3">
								<label class="form-label">Return</label>
								<form:input type="date" path="ret"  class="form-control" />
								<form:errors path="ret" cssClass="error" element="div" />
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col">
							<div class="mb-3">
								<form:input type="number" path="capacity" placeholder="Capacity"
									 class="form-control" />
								<form:errors path="capacity" cssClass="error" element="div" />
							</div>
						</div>
						<div class="col">
							<div class="mb-3">
								<form:input type="number" path="price" placeholder="Price"
									 class="form-control" />
								<form:errors path="price" cssClass="error" element="div" />
							</div>
						</div>
					</div>
					<div class="row">
						<div class="mb-3">
							<form:select path="fClass" class="form-select"
								aria-label="Default select example">
								<option selected>Choose class</option>
								<option value="Economy">Economy</option>
								<option value="First">First</option>
								<option value="Business">Business</option>
							</form:select>
							<form:errors path="fClass" cssClass="error" element="div" />
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










