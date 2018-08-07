<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html 
     PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
     "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet"
	href="<c:url value="resources/styles/bootstrap/3.3.5/css/bootstrap.min.css" />" />
<link rel="stylesheet"
	href="<c:url value="resources/styles/bootstrap/3.3.5/css/bootstrap-theme.min.css" />" />
<link rel="stylesheet"
	href="<c:url value="resources/styles/pivotal.css" />" />
<title>spring-microservices: User Details</title>
</head>

<body>

	<div class="container">
		<div class="row">
			
			<div style="text-align: right">
				[ <a href="<c:url value='/'/>">Home</a> | <a href="userList">Users</a>
				]
			</div>
		</div>

		<div class="row">

			<h1>User Details</h1>

			<div class="container-fluid">
				<div class="row">
					<div class="col-sm-3">User:</div>
					<div class="col-sm-9">${user.user}</div>
				</div>
				<div class="row">
					<div class="col-sm-3">Name:</div>
					<div class="col-sm-9">${user.name}</div>
				</div>

			</div>

		</div>

	</div>

</body>

</html>