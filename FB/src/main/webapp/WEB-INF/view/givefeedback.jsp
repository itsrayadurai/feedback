<!-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
* {
	font-family: 'Concert One', cursive;
	font-size: 30px;
	max-zoom: calc(100);
	min-zoom: 10%;
	overflow-y: hidden;
}

body {
	margin: 0;
	padding: 0;
	background: #ffff;
}

header {
	color: #ffff;
	height: 10vh;
	text-align: center;
	position: fixed;
	width: 100%;
	background-color: 		#20b2aa;
}

header {
	top: 0;
}

footer {
    color: #ffff;
	height: 11vh;
	text-align: center;
	position: fixed;
	width: 100%;
	background-color:		#20b2aa;
	bottom:0px;
}
.menu{
position: absolute;
}
.sidenav {
float:left;
	height: 505px;
	width: 259px;
	position: fixed;
	bottom:0;
	left: 0;
	background-color:#faebd7;
	padding-top: 50px;
	top: 10%;
}

.sidenav a {
display:block;
margin-left:10px;
	text-align:left;
	text-decoration: none;
	font-size: 25px;
	color: #818181;
	padding: 0px;
}

.sidenav a:hover {
	font-size:25px;
	border: 1px solid white;
}

.main {
margin-left:275px;
margin-top:100px;
position:relative;
float:right;
	width:1132px;
	height: 540px;
	
}

@media screen and (max-height: 450px) {
	.sidenav {
		padding-top: 15px;
	}
	.sidenav a {
		font-size: 18px;
		
	}
}

</style>
</head>
<body>
	<header>
		<h1>FEEDBACK</h1>
	</header>

	<div class="menu">
		<div class="sidenav">
			<a style="margin-top: 19px"onclick="add()">TRANSPORT</a>
			<a style="margin-top: 19px"onclick="add()">MAINTAINANCE</a>
			<a style="margin-top: 19px"onclick="add()">GROUND</a>
			<a style="margin-top: 19px"onclick="add()">LAB</a>
			<a style="margin-top: 19px"onclick="add()">CLASS ROOM</a>
			<a style="margin-top: 19px"onclick="add()">OTHERS</a>
			<a style="margin-top: 19px"onclick="home()">RETURN HOME</a>
		</div>
		<iframe class="main" id="main"></iframe>
	</div>
	<footer>
		<h3>College Name_</h3>
	</footer>

	<script type="text/javascript">
		function add() {
			document.getElementById('main').src = 'giveffedback';
		}
		function home() {
			document.getElementById('main').src = 'index';
		}
		
		
	
	</script>


</body>
</html>