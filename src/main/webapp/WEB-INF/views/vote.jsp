<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="vote">
<meta name="author" content="umoo">

<!-- Bootstrap core CSS -->
<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom fonts for this template -->
<link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet"
	type="text/css">
<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700"
	rel="stylesheet" type="text/css">
<link href='https://fonts.googleapis.com/css?family=Kaushan+Script'
	rel='stylesheet' type='text/css'>
<link
	href='https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic'
	rel='stylesheet' type='text/css'>
<link
	href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700'
	rel='stylesheet' type='text/css'>

<!-- Custom styles for this template -->
<link href="css/agency.min.css" rel="stylesheet">

</head>

<body id="page-top">

	<!-- Vote -->
	<%!String op1;
	String op2;
	String op3;
	String op4;
	String op5;
	String patch = "9.4";%>
	<%@ page import="java.util.*, java.text.*"%>


	<header class="masthead">
		<div class="intro-text">
			<h2 class="section-heading text-uppercase">OP 투표</h2>
			<section class="bg-light" id="portfolio">
				<div class="container">
					<div class="row">
						<div class="col-lg-12 text-center">
							<div style="font-size: 200%; color: black;">
								<%
									java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yy.MM");
									String today = formatter.format(new java.util.Date());

									out.println(today);
									out.println("    " + patch + " 패치");
								%>
							</div>
							<table style="margin:100px 0px; width: 100%; height: 75px; text-align: center; ">
								<tr>
									<td>1</td>
									<td>2</td>
									<td>3</td>
									<td>4</td>
									<td>5</td>
								</tr>
								<tr>
									<td>1</td>
									<td>2</td>
									<td>3</td>
									<td>4</td>
									<td>5</td>
								</tr>
								<tr>
									<td><% out.println(op1);%></td>
									<td><% out.println(op2);%></td>
									<td><% out.println(op3);%></td>
									<td><% out.println(op4);%></td>
									<td><% out.println(op5);%></td>
								</tr>

							</table>

							<form class="navbar-form pull-left">
								<input type="text" class="span2">
								<button type="submit" class="btn">JGCY</button>
							</form>
						</div>
					</div>
				</div>
			</section>
		</div>

	</header>

</body>

</html>
