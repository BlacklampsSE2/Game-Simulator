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
	href="http://localhost:8080/view/images/favicon/android-icon-192x192.png">
<link rel="icon" type="image/png" sizes="32x32"
	href="http://localhost:8080/view/images/favicon/favicon-32x32.png">
<link rel="icon" type="image/png" sizes="96x96"
	href="http://localhost:8080/view/images/favicon/favicon-96x96.png">
<link rel="icon" type="image/png" sizes="16x16"
	href="http://localhost:8080/view/images/favicon/favicon-16x16.png">

<!-- STYLES -->
<!-- Bootstrap -->
<link href="http://localhost:8080/view/css/bootstrap.min.css" rel="stylesheet">
<!-- Main Stylesheet -->
<link href="http://localhost:8080/view/css/style.css" rel="stylesheet">
<!-- FontAwesome -->
<link href="http://localhost:8080/view/css/font-awesome.min.css" rel="stylesheet">
<!-- Animations -->
<link href="http://localhost:8080/view/css/animations.css" rel="stylesheet">
<!-- Lightbox -->
<link href="http://localhost:8080/view/css/lightbox.min.css" rel="stylesheet">

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
			</div>
		</nav>
	</header>
	<!-- Header End -->
	<div id="hero-section" class="small-margin">
		<div id="particles-web"></div>

	</div>

	<div class="container">
		<div id="loginpage" class="large-margin">

			<div class="row heading tiny-margin">
				<div class="col-md-auto">
					<h1 class="animation-element slide-down">
						LIVE<span class="colored">MARKET</span>
					</h1>
				</div>
				<div class="col">
					<hr class="animation-element extend">
					<h2 align="right">
						Cash: <span class="colored">Rs.100</span>
					</h2>
					<h2 align="right">
						Time: <span class="colored">00:12</span>
					</h2>
					<h2 align="right">
						Turn: <span class="colored">5/20</span>
					</h2>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<form>


						<div class="container_my">
							<!--<div class="box_1">-->

							<div class="row">
								<div class="column">

									<div class="col-md-auto">
										<h1 class="animation-element slide-down">
											Company <span class="colored">Details</span>
										</h1>

									</div>
									<table class="table table-striped">

										<thead>
											<tr>
												<th>Company</th>
												<th>Stock Price</th>
												<th>Qty</th>
												<th>Buy</th>
												<th>Sell</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<td>John</td>
												<td>Doe</td>
												<td><input type="text" class="form-control" id="usr"></td>
												<td><p>
														<button class="fa fa-shopping-cart" type="button"></button>
													</p></td>
												<td><p>
														<button class="fa fa-shopping-cart" type="button"></button>
													</p></td>
											</tr>
											</tr>
										</tbody>
									</table>
								</div>
								<div class="column">
									<div class="col-md-auto">
										<h1 class="animation-element slide-down">
											Rumo<span class="colored">urs</span>
										</h1>
									</div>
									<form>
										<div class="form-group">
											<textarea class="form-control" rows="10" id="comment"
												cols="70"
												style="color: black; background-color: transparent;"></textarea>
										</div>
									</form>
								</div>
							</div>
							<div class="row">
								<div class="column">
									<div class="col-md-auto">
										<h1 class="animation-element slide-down">
											News<span class="colored">Feed</span>
										</h1>
									</div>
									<form>
										<div class="form-group">
											<textarea id="disText" class="form-control"
												readonly="readonly" rows="10" cols="70"
												tyle="color: black; background-color: transparent;"></textarea>
											<script>
												var eventSource = null;
												function start() {
													eventSource = new EventSource(
															"/sseTest");
													eventSource.onopen = function() {
														disText.value += 'Connected...'
																+ '\n';
													};
													eventSource.onmessage = function(
															message) {
														disText.value += message.data
																+ '\n\n'
													};
													eventSource.onerror = function() {
														disText.value += 'Error Occured...'
																+ '\n'
													};

												}
											</script>
											<script>
												start(); //No need to put java script code inside scriptlet
											</script>
										</div>



									</form>

								</div>
							</div>


						</div>





					</form>
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
    <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyB64kJJiSynOc9ZqkNMOyl94cvsw5Z2uno"></script>
</body>
</html>