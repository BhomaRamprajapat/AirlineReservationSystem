<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
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
		<a href="home">Home</a> <a href="#logout">Logout</a> <a
			href="#contact">Contact Us</a> <a href="#about">About Us</a>
	</div>
	<!-- container start -->
	<div class="container" style="padding-top: 60px; padding-left: 350px;">
		<div class="card" style="width: 400px;">
			<div class="card-header text-center">
				<h3>Flight Details</h3>
			</div>
			<div class="card-body">
				<form action="updateFlight" method="post">
					<div class="row">
						<div class="mb-3">
							<input type="text" name="fname" value="${flight.fname}" required
								class="form-control">
						</div>
						<input type="hidden" name="fid" value="${flight.fid }">
					</div>
					<div class="row">
						<div class="col">
							<div class="mb-3">
								<input type="text" name="src" value="${flight.src}" required
									class="form-control">
							</div>
						</div>
						<div class="col">
							<div class="mb-3">
								<input type="text" name="dst" value="${flight.dst}" required
									class="form-control">
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col">
							<div class="mb-3">
								<label class="form-label">Depart</label> <input type="date"
									name="depart" value="${flight.depart}" required
									class="form-control">
							</div>
						</div>
						<div class="col">
							<div clas="mb-3">
								<label class="form-label">Return</label> <input type="date"
									name="ret" value="${flight.ret}" required class="form-control">
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col">
							<div class="mb-3">
								<input type="number" name="capacity" value="${flight.capacity}"
									required class="form-control">
							</div>
						</div>
						<div class="col">
							<div class="mb-3">
								<input type="number" name="price" value="${flight.price}"
									required class="form-control">
							</div>
						</div>
					</div>
					<div class="row">
						<div class="mb-3">
							<select name="fClass" class="form-select">
								<option selected value="${flight.fClass}"></option>
								<option value="Economy">Economy</option>
								<option value="First">First</option>
								<option value="Business">Business</option>
							</select>
						</div>
					</div>
					<div class="mt-3">
						<div class="text-center">
							<button type="submit" class="btn btn-success">Submit</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>


	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script>

</body>
</html>










