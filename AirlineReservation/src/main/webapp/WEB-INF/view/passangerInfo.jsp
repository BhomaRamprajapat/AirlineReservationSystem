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

.error {
	color: red;
}
</style>

<title>Signup page</title>
</head>
<body>
	<div class="topnav">
		<a href="home">Home</a> <a href="#contact">Contact Us</a> <a
			href="#about">About Us</a>
	</div>
	<!-- container start -->
	<div class="container" style="padding-top: 40px; padding-left: 350px;">
		<div class="card" style="width: 500px;">
			<div class="card-header text-center">
				<h3>Enter Passanger Details</h3>
			</div>
			<div class="card-body">
				<form:form action="passangerDetail" method="post" modelAttribute="user">
					<div class="row">
						<div class="mb-3">
							<form:input type="text" path="uname" placeholder="Enter Passanger Name" class="form-control" />
							<form:errors path="uname" cssClass="error" element="div" />
						</div>
					</div>
					<div class="row">
						<div class="mb-3">
							<form:input type="text" path="mail" placeholder="Enter e-mail"
								class="form-control" />
							<form:errors path="mail" cssClass="error" element="div" />
						</div>
					</div>
					<div class="row">
						<div class="mb-3">
							<form:input type="password" path="pass"
								placeholder="Enter password" class="form-control" />
							<form:errors path="pass" cssClass="error" element="div" />
						</div>
					</div>
					<div class="row">
						<div class="mb-3">
							<form:input type="text" path="passport"
								placeholder="Enter Passport Number" class="form-control" />
							<form:errors path="passport" cssClass="error" element="div" />
						</div>
					</div>
					<div class="row">
						<div class="mb-3">
							<div>
								<label class="form-label">Address</label>
							</div>

							<form:textarea path="address" />
							<form:errors path="address" cssClass="error" element="div" />
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










