<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">

<head>
<meta charset="utf-8">
<meta name="author" content="AtypicalThemes">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">

<!-- WEBSITE TITLE & DESCRIPTION -->
<title>Blacklamps Stock Market Simulator</title>
<meta name="description"
	content="The best template for game developers and small studios">
<meta name="keywords"
	content="game, gaming, videogame, developer, steam, studio, team">

<!-- OG meta tags that improve the look of your post on social media -->
<meta property="og:site_name" content="" />
<!--website name-->
<meta property="og:site" content="" />
<!--website link-->
<meta property="og:title" content="" />
<!--Post title-->
<meta property="og:description" content="" />
<!--Post description-->
<meta property="og:image" content="" />
<!-- Image link (jpg only)-->
<meta property="og:url" content="" />
<!--where do you want your post to link to-->
<meta property="og:type" content="article" />

<!-- Favicon and Apple Icons -->
<link rel="apple-touch-icon" sizes="57x57"
	href="http://localhost:8080/view/images/favicon/apple-icon-57x57.png">
<link rel="apple-touch-icon" sizes="60x60"
	href="http://localhost:8080/view/images/favicon/apple-icon-60x60.png">
<link rel="apple-touch-icon" sizes="72x72"
	href="http://localhost:8080/view/images/favicon/apple-icon-72x72.png">
<link rel="apple-touch-icon" sizes="76x76"
	href="http://localhost:8080/view/images/favicon/apple-icon-76x76.png">
<link rel="apple-touch-icon" sizes="114x114"
	href="http://localhost:8080/view/images/favicon/apple-icon-114x114.png">
<link rel="apple-touch-icon" sizes="120x120"
	href="http://localhost:8080/view/images/favicon/apple-icon-120x120.png">
<link rel="apple-touch-icon" sizes="144x144"
	href="http://localhost:8080/view/images/favicon/apple-icon-144x144.png">
<link rel="apple-touch-icon" sizes="152x152"
	href="http://localhost:8080/view/images/favicon/apple-icon-152x152.png">
<link rel="apple-touch-icon" sizes="180x180"
	href="http://localhost:8080/view/images/favicon/apple-icon-180x180.png">
<link rel="icon" type="image/png" sizes="192x192"
	href="http://localhost:8080/view/view/images/favicon/android-icon-192x192.png">
<link rel="icon" type="image/png" sizes="32x32"
	href="http://localhost:8080/view/images/favicon/favicon-32x32.png">
<link rel="icon" type="image/png" sizes="96x96"
	href="http://localhost:8080/view/images/favicon/favicon-96x96.png">
<link rel="icon" type="image/png" sizes="16x16"
	href="http://localhost:8080/view/images/favicon/favicon-16x16.png">

<!-- STYLES -->
<!-- Bootstrap -->
<link href="http://localhost:8080/view/css/bootstrap.min.css"
	rel="stylesheet">
<!-- Main Stylesheet -->
<link href="http://localhost:8080/view/css/style.css" rel="stylesheet">
<!-- FontAwesome -->
<link href="http://localhost:8080/view/css/font-awesome.min.css"
	rel="stylesheet">
<!-- Animations -->
<link href="http://localhost:8080/view/css/animations.css"
	rel="stylesheet">
<!-- Lightbox -->
<link href="http://localhost:8080/view/css/lightbox.min.css"
	rel="stylesheet">
<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>




</head>
<body>

	<div id="loader-wrapper">
		<h1 class="loader-logo">
			<span class="colored">B</span>lacklamps
		</h1>
		<div id="progress"></div>
		<h3 class="loader-text">LOADING</h3>
	</div>
	<header id="main-header">
		<nav class="navbar fixed-top navbar-expand-lg navbar-dark">
			<div class="container">
				<h3 class="loader-logo">
					<span class="colored">B</span>lacklamps
				</h3>
				<!-- Site Logo -->
				<!-- <a id="logo" class="navbar-brand" href="#"><img class="img-fluid" src="http://localhost:8080/view/images/logo.png" alt="site logo"></a>-->
				<!-- Dropdown Button -->
				<button id="hamburger" class="navbar-toggler" type="button"
					data-toggle="collapse" data-target="#navbarSupportedContent"
					aria-controls="navbarSupportedContent" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<!-- Navigation Links -->
				<div class="collapse navbar-collapse" id="navbarSupportedContent">
					<ul class="navbar-nav ml-auto">
						<li class="nav-item active"><a class="nav-link"
							href="#loginpage">Login</a></li>
						<li class="nav-item"><a class="nav-link" href="#signup">Register</a>
						</li>
					</ul>
				</div>
			</div>
		</nav>
	</header>
	<!-- Header End -->
	<!-- /// HERO SECTION /// -->
	<div id="hero-section" class="small-margin">
		<div id="particles-web"></div>
		<div class="row hero-unit">
			<div class="container">
				<div class="hero-caption">
					<!-- Main Tagline -->
					<h1>
						Stock Market <span class="colored">Simulator</span>
					</h1>
				</div>
			</div>
		</div>
	</div>
	<!-- Hero Section End -->


	<div class="container">
		<div id="loginpage" class="large-margin">
			<a href="logining.html"></a>
			<!-- Nav Anchor -->
			<div class="row heading tiny-margin">
				<div class="col-md-auto">
					<h1 class="animation-element slide-down">
						LOG<span class="colored">IN</span>
					</h1>
				</div>
				<div class="col">
					<hr class="animation-element extend">
				</div>
			</div>
			<div class="row">
				<div class="col-md-6">
					<p class="small-margin">Please enter you login credentials</p>
					<!--<img id="awards" src="http://localhost:8080/view/images/awards.png" class="img-fluid" alt="awads">-->

					<form action="/login-user" method="POST">
						<div class="form-group">
							<label for="usr">Name:</label> <input type="text"
								class="form-control" name="username" value="${player.username}">
						</div>
						<div class="form-group">
							<label for="usr">Password:</label> <input type="password"
								class="form-control" name="password" value="${player.password}">
							<button type="submit" id="form-signup" class="button">Login</button>
						</div>
					</form>
				</div>

				<div class="col-md-6">
					<img id="support-image"
						src="http://localhost:8080/view/images/digital_collage.png"
						class="img-fluid" alt="digital collage">
				</div>

			</div>
		</div>

		<div id="signup" class="large-margin">
			<a href="about.html"></a>
			<!-- Nav Anchor -->
			<div class="row heading tiny-margin">
				<div class="col-md-auto">
					<h1 class="animation-element slide-down">
						SIGN<span class="colored">UP</span>
					</h1>
				</div>
				<div class="col">
					<hr class="animation-element extend">
				</div>
			</div>
			<div class="row">
				<div class="col-md-6">
					<p class="small-margin">Please enter you desired login
						credentials</p>
					<!--<img id="awards" src="http://localhost:8080/view/images/awards.png" class="img-fluid" alt="awads">-->
						<form action="/register-user" method="POST">
						<div class="form-group">
							<label for="usr">Name:</label> <input type="text"
								class="form-control" name="username" value="${player.username}">
						</div>
						<div class="form-group">
							<label for="usr">Password:</label> <input type="password"
							class="form-control" name="password" value="${player.password}"> 
							 
							
							<button type="submit" class="button" onclick="getElementById('formreg').innerHTML = myFunction()">Signup</button>
						</div>
					</form>
					</div>
				
				<script>
			function myFunction() {
				swal("Registration Complete","You have a bank account of Rs.1000");

			}
					</script>
				
				 <!-- <script>
					$('#formreg').click(function() {
								swal("Registration Complete","You have a bank account of Rs.1000");

							});
				</script> -->
				
				

				<div class="col-md-6">
					<img id="support-image"
						src="http://localhost:8080/view/images/digital_collage.png"
						class="img-fluid" alt="digital collage">
				</div>

			</div>
		</div>

	</div>


	<!-- /// FOOTER /// -->
	<footer id="main-footer">
		<div id="footer">
			<div class="container">
				<div class="row">
					<div class="col-md-12">
						<p id="copyright">© 2018 Stock Market Simulator. All rights
							reserved | Design by Blacklamps</p>
						<!-- Copyright Text -->
						<ul class="social-links">
							<!-- Social Media Icons -->
							<li><a
								href="https://github.com/BlacklampsSE2/Game-Simulator"><i
									class="fa fa-github icon-social"></i></a></li>
						</ul>
					</div>
				</div>
			</div>
			<!-- Container End -->
		</div>
	</footer>
	<!-- Footer End -->

	<!-- //// SCRIPTS //// -->
	<script src="http://localhost:8080/view/js/jquery-3.2.1.min.js"></script>
	<script src="http://localhost:8080/view/js/popper.min.js"></script>
	<script src="http://localhost:8080/view/js/bootstrap.min.js"></script>
	<script src="http://localhost:8080/view/js/particles.js"></script>
	<script src="http://localhost:8080/view/js/isotope.pkgd.min.js"></script>
	<script src="http://localhost:8080/view/js/lightbox.min.js"></script>
	<script src="http://localhost:8080/view/js/validator.min.js"></script>
	<script src="http://localhost:8080/view/js/strider.js"></script>
	<script
		src="https://maps.googleapis.com/maps/api/js?key=AIzaSyB64kJJiSynOc9ZqkNMOyl94cvsw5Z2uno"></script>
</body>
</html>