<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Login</title>
	<style>
body {
			background-color: white;
			font-family: Arial, sans-serif;
			text-align: center;
		    }
.header {
			background-color:#5f5f66;
			padding: 10px;
			color: white;
		}

.footer {
		   background-color:#5f5f66;
			padding: 10px;
			color: white;
			position: absolute;
			bottom: 0;
			width: 100%;
		}
.box:hover {
			transform: scale(1.05);
			box-shadow: 0px 0px 15px #cccccc;
			}
.form-box {
			background-color: 	#ffa07a;
			width: 500px;
			margin: 0 auto;
			margin-top: 50px;
			padding: 30px;
			border-radius: 10px;
			box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.5);
			}
.form-box label
          {
			display: block;
			margin-bottom: 10px;
			font-size: 16px;
			font-weight: bold;
			text-align: left;
		}
.form-box input[type="text"],		
.form-box input[type="password"]
           {
			display: block;
			width: 100%;
			padding: 10px;
			border: none;
			border-radius: 5px;
			margin-bottom: 20px;
			font-size: 16px;
			transition: all 0.3s ease;
			border-radius:10px;
		}
.form-box input[type="text"]:hover,
.form-box input[type="password"]:hover {
			box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.5);
		}
.form-box input[type="submit"] {
			background-color: #21d61e;
			color: white;
			border: none;
			border-radius: 5px;
			padding: 10px;
			font-size: 16px;
			cursor: pointer;
			transition: all 0.3s ease;
		 }
.form-box input[type="submit"]:hover {
			background-color: #21d61e;
		}
		</style>
</head>
<body>
	<div class="header">
		<h1>FEEDBACK</h1>
	</div>
<div class="box">
<div class="form-box">
<form method="post" action="login">
            <select  id="user"  name="user"> 
            <option value="admin">ADMIN </option>
            <option value="staff">STAFF</option>
            <option value="student">STUDENT</option>
            </select>
			<label for="username">Username:</label>
			<input type="text" name="username" id="username" required>
			<label for="password">Password:</label>
			<input type="password" name="password" id="password" required><br>
			<input type="submit" value="Login">
		</form>
        </div>
	   </div>
<div class="footer">
		<p>Submitted by - name</p>
	</div>
</body>
</html>