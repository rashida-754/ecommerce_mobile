<%@ page language="java" contentType="text/html"%>
<%@ include file="CommonHeader.jsp"%>
<html>
<head>

		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>Register</title>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
<form  modelAttribute="user" method="post" action="saveregister" class="form-signing" id="Register" >
			<div class="container">
				<div class="row">		
					<div class="col-sm-6 col-sm-offset-3 col-lg-6 col-lg-offset-3">
						<div class="box">
							<!-- <div class="center-block"> -->
								<h2>Sign Up</h2>
								<table>
									<tr>
										<td>UserName</td>
									</tr>
									<tr>
										<td><input type="text" class="form-control" placeholder="UserName" name="username" Required/></td>
									</tr>
									<tr>
										<td>Address</td>
									</tr>
									<tr>
										<td><input type="text" class="form-control" placeholder="Address" name="address" Required/></td>
									</tr>
									<tr>
										<td>Email-ID</td>
									</tr>
									<tr>
										<td><input type="email" class="form-control" placeholder="Email-id" name="email" Required/></td>
									</tr>
									<tr>
										<td>Enabled</td>
									</tr>
									<tr>
										<td><input type="text" class="form-control" name="enabled"value="TRUE" readonly Required/></td>
									</tr>
									<tr>
										<td>Mobile Number</td>
									</tr>
									<tr>
										<td><input type="text" class="form-control" placeholder="Mobile No." name="mobile" Required/></td>
									</tr>
									<tr>
										<td>Name</td>
									</tr>
									<tr>
										<td><input type="text" class="form-control" placeholder="Name" name="name" Required/></td>
									</tr>
									<tr>
										<td>Create a Password</td>
									</tr>
									
									<tr>
										<td><input type="password" class="form-control" placeholder="Password" name="Password" Required/></td>
									</tr>
									<tr>
										<td>Gender</td>
									</tr>
									<tr>
										<td>
											<select class="form-control" name="gender" Required>
												<option value="">Gender</option>
												<option value="Male">Male</option>
												<option value="Female">Female</option>
											</select>
										</td>
									</tr>
								</table>
								<button type="submit" class="btn btn-success">Sumbit</button>
							<!-- </div> -->
						</div>
					</div>
				</div>
			</div>
		</form>
</body>
</html>