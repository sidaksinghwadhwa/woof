<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
@import url(https://fonts.googleapis.com/css?family=Roboto:400,300,500);

*:focus {
	outline: none;
}

body {
	background: url("https://i.ytimg.com/vi/AZ2ZPmEfjvU/maxresdefault.jpg");
	margin: 0;
	padding: 0;
	font-size: 16px;
	color: #222;
	font-family: 'Roboto', sans-serif;
	font-weight: 300;
}

#login-box {
	position: relative;
	margin: 5% auto;
	width: 600px;
	height: 450px;
	background: #FFF;
	border-radius: 2px;
	box-shadow: 0 2px 4px rgba(0, 0, 0, 0.4);
}

.left {
	position: center;
	top: 0;
	left: 0;
	box-sizing: border-box;
	padding: 40px;
	width: 300px;
	height: 400px;
}

h1 {
	margin: 0 0 20px 0;
	font-weight: 300;
	font-size: 28px;
}

input[type="text"], input[type="password"] {
	display: block;
	box-sizing: border-box;
	margin-bottom: 20px;
	padding: 4px;
	width: 220px;
	height: 32px;
	border: none;
	border-bottom: 1px solid #AAA;
	font-family: 'Roboto', sans-serif;
	font-weight: 400;
	font-size: 15px;
	transition: 0.2s ease;
}

input[type="text"]:focus, input[type="password"]:focus {
	border-bottom: 2px solid #16a085;
	color: #16a085;
	transition: 0.2s ease;
}

input[type="submit"] {
	margin-top: 28px;
	width: 120px;
	height: 32px;
	background: #16a085;
	border: none;
	border-radius: 2px;
	color: #FFF;
	font-family: 'Roboto', sans-serif;
	font-weight: 500;
	text-transform: uppercase;
	transition: 0.1s ease;
	cursor: pointer;
}

input[type="submit"]:hover, input[type="submit"]:focus {
	opacity: 0.8;
	box-shadow: 0 2px 4px rgba(0, 0, 0, 0.4);
	transition: 0.1s ease;
}

input[type="submit"]:active {
	opacity: 1;
	box-shadow: 0 1px 2px rgba(0, 0, 0, 0.4);
	transition: 0.1s ease;
}

.or {
	position: absolute;
	top: 180px;
	left: 280px;
	width: 40px;
	height: 40px;
	background: #DDD;
	border-radius: 50%;
	box-shadow: 0 2px 4px rgba(0, 0, 0, 0.4);
	line-height: 40px;
	text-align: center;
}
</style>
<body>
	<div id="login-box">
		<div class="left">
			<h1>Sign up</h1>
			<form action="signUpSave" method="get"  >
				<input type="text" name="name" placeholder="name" /> 
				<input type="text" name="username" placeholder="username" />
				<input type="text" name="email_id" placeholder="email_id" /> 
				<input type="password" name="password" placeholder="password" />
				<input type="text" name="mobile" placeholder="mobile" /> 
				<input type="submit" name="signup_submit" value="Sign me up" />
			</form>
		</div>

	</div>
</body>
</html>