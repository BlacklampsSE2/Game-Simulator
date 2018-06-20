<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="author" content="AtypicalThemes">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1"> 

    <!-- WEBSITE TITLE & DESCRIPTION -->
    <title>Blacklamps Stock Market Simulator</title>
    <meta name="description" content="The best template for game developers and small studios">
    <meta name="keywords" content="game, gaming, videogame, developer, steam, studio, team">

    <!-- OG meta tags that improve the look of your post on social media -->
    <meta property="og:site_name" content="" /><!--website name-->
    <meta property="og:site" content="" /> <!--website link-->
    <meta property="og:title" content=""/> <!--Post title-->
    <meta property="og:description" content="" /> <!--Post description-->
    <meta property="og:image" content="" /><!-- Image link (jpg only)-->
    <meta property="og:url" content="" /> <!--where do you want your post to link to-->
    <meta property="og:type" content="article" />

   <!-- Favicon and Apple Icons -->
    <link rel="apple-touch-icon" sizes="57x57" href="http://localhost:8080/view/images/favicon/apple-icon-57x57.png">
    <link rel="apple-touch-icon" sizes="60x60" href="http://localhost:8080/view/images/favicon/apple-icon-60x60.png">
    <link rel="apple-touch-icon" sizes="72x72" href="http://localhost:8080/view/images/favicon/apple-icon-72x72.png">
    <link rel="apple-touch-icon" sizes="76x76" href="http://localhost:8080/view/images/favicon/apple-icon-76x76.png">
    <link rel="apple-touch-icon" sizes="114x114" href="http://localhost:8080/view/images/favicon/apple-icon-114x114.png">
    <link rel="apple-touch-icon" sizes="120x120" href="http://localhost:8080/view/images/favicon/apple-icon-120x120.png">
    <link rel="apple-touch-icon" sizes="144x144" href="http://localhost:8080/view/images/favicon/apple-icon-144x144.png">
    <link rel="apple-touch-icon" sizes="152x152" href="http://localhost:8080/view/images/favicon/apple-icon-152x152.png">
    <link rel="apple-touch-icon" sizes="180x180" href="http://localhost:8080/view/images/favicon/apple-icon-180x180.png">
    <link rel="icon" type="image/png" sizes="192x192" href="http://localhost:8080/view/view/images/favicon/android-icon-192x192.png">
    <link rel="icon" type="image/png" sizes="32x32" href="http://localhost:8080/view/images/favicon/favicon-32x32.png">
    <link rel="icon" type="image/png" sizes="96x96" href="http://localhost:8080/view/images/favicon/favicon-96x96.png">
    <link rel="icon" type="image/png" sizes="16x16" href="http://localhost:8080/view/images/favicon/favicon-16x16.png">

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
    <!-- Loading Screen 
    <div id="loader-wrapper">
        <h1 class="loader-logo"><span class="colored">B</span>lacklamps</h1>
        <div id="progress"></div>
        <h3 class="loader-text">LOADING</h3>
    </div>-->
    
    <!-- //// HEADER //// -->
    <header id="main-header">
        <nav class="navbar fixed-top navbar-expand-lg navbar-dark">
            <div class="container">
				<h3 class="loader-logo"><span class="colored">B</span>lacklamps</h3>
          
                <!-- Dropdown Button -->
                <button id="hamburger" class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                </button>
                <!-- Navigation Links -->
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item active">
                            <a class="nav-link" href="#about">About</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#games">Game</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#team">Team</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#leadershipboard">Leadershipboard</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#Portfolio">Portfolio</a>
                        </li>
						 <li class="nav-item">
                            <a class="nav-link" href="#markethistory">Market History</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
    </header><!-- Header End -->
    
    <!-- /// HERO SECTION /// -->
    <div id="hero-section" class="small-margin">
        <div id="particles-web"></div>
        <div class="row hero-unit">
            <div class="container">
                <div class="hero-caption"><!-- Main Tagline -->
                    <h1>Stock Market <span class="colored">Simulator</span></h1>
                </div>
            </div>
        </div>
    </div><!-- Hero Section End -->
    
    <!-- /// Main Container /// -->
    <div class="container">
        <!-- /// ABOUT SECTION /// -->
        <div id="about" class="large-margin">
            <a href="about.html"></a><!-- Nav Anchor -->
            <div class="row heading tiny-margin">
                <div class="col-md-auto">
                    <h1 class="animation-element slide-down">ABOUT <span class="colored">US</span></h1>
                </div>
                <div class="col">
                    <hr class="animation-element extend">
                </div>
            </div>
            <div class="row">
                <div class="col-md-6">
                    <p class="small-margin">We are developing a stock market simulator game as part of our final project of our Bsc (Hons) Computer Science Degree. Our team name is Blacklamps.</p>
                    <!--<img id="awards" src="http://localhost:8080/view/images/awards.png" class="img-fluid" alt="awads">-->
                </div>
                <div class="col-md-6">
                    <img id="support-image" src="http://localhost:8080/view/images/digital_collage.png" class="img-fluid" alt="digital collage">
                </div>
            </div>
        </div>
        <!-- /// GAMES SECTION /// -->
        <div id="games" class="large-margin">
            <a href="games.html"></a><!-- Nav Anchor -->
            <div class="row heading tiny-margin">
                <div class="col-md-auto">
                    <h1 class="animation-element slide-down">OUR <span class="colored">GAME</span></h1>
                </div>
                <div class="col">
                    <hr class="animation-element extend">
                </div>
            </div>
            <div class="row ">
                <div class="col-md-11 small-margin">
                   <p>This is multi-player which can be played amoung human or AI players. In this game we have created a stock market which changes each and every time a game is played. And players can manage their own portfolios.</p>
                </div>
                
            </div>
            <div class="games-portfolio ">
                <div class="row game-card pc"><!-- Game Card -->
                    <div class="col-lg-12 col-xl-5 game-card-left">
                        <a href="http://localhost:8080/view/images/game1_large.jpg" data-lightbox="screenshots_aurora">
                            <div class="overlay">
                                <i class="fa fa-picture-o fa-3x"></i>
                            </div>
                            <picture>
                                <source media="(min-width: 1200px)" srcset="http://localhost:8080/view/images/game1.jpg">
                                <source media="(min-width: 768px)" srcset="http://localhost:8080/view/images/game1_large.jpg">
                                <img src="http://localhost:8080/view/images/game1.jpg" class="img-fluid" alt="aurora image">
                            </picture>
                        </a>
                    </div>
                    <div class="col-lg-12 col-xl-7 game-card-right">
                        <h2 class="short-hr-left">Stock Market Simulator</h2>
                        
                        <p class="game-description">To play this game you need a minimum of 3 players. If no human players are joined you will be automatically be assigned with AI players. So Enjoy our Simulator..........</p>
                        <form action="/playgame" method="POST">
                        <button type="submit" id="form-signup" class="button">Play Game</button>
                        <div id="msgSignup" class="h3 text-center hidden"></div>
                    </form>
                    </div>
                    <!-- Modal -->
                    
                </div><!-- Game Card End -->
               <!-- Game Card End -->
            </div>
        </div>
        <!-- /// TEAM SECTION /// -->
        <div id="team" class="large-margin">
            <a href="team.html"></a><!-- Nav Anchor -->
            <div class="row heading tiny-margin">
                <div class="col-md-auto">
                    <h1 class="animation-element slide-down">THE <span class="colored">TEAM</span></h1>
                </div>
                <div class="col">
                    <hr class="animation-element extend">
                </div>
            </div>
            <div class="row medium-margin">
                <div class="col-md-11 tiny-margin">
                   
                </div>
                <div class="row text-center">
                    <div class="col-md-3 team-card">
                        <figure>
                            <img src="http://localhost:8080/view/images/team1.jpg" class="img-fluid team-img" alt="teammember">
                            
                        </figure>
                        <p class="team-name">R.M.B.Senanayake</p>
                        <p class="subtle">Team Leader</p>
                    </div>
                    <div class="col-md-3 team-card">
                        <figure>
                            <img src="http://localhost:8080/view/images/team2.jpg" class="img-fluid" alt="teammember">
                            
                        </figure>
                        <p class="team-name">R.M.A.P.Sandaru</p>
                        <p class="subtle">Team Member</p>
                    </div>
                    <div class="col-md-3 team-card">
                        <figure>
                            <img src="http://localhost:8080/view/images/team3.jpg" class="img-fluid" alt="teammember">
                           
                        </figure>
                        <p class="team-name">A.P.P.Perera</p>
                        <p class="subtle">Team Member</p>
                    </div>
                    <div class="col-md-3 team-card">
                        <figure>
                            <img src="http://localhost:8080/view/images/team4.jpg" class="img-fluid" alt="teammember">
                           
                        </figure>
                        <p class="team-name">D.U.C.Ranathunga</p>
                        <p class="subtle">Team Member</p>
                    </div>
					<div class="col-md-3 team-card">
                        <figure>
                            <img src="http://localhost:8080/view/images/team5.jpg" class="img-fluid" alt="teammember">
                        </figure>
                        <p class="team-name">R.P.V.L.Madushanka</p>
                        <p class="subtle">Team Member</p>
                    </div>
					<div class="col-md-3 team-card">
                        <figure>
                            <img src="http://localhost:8080/view/images/team6.jpg" class="img-fluid" alt="teammember">
                        </figure>
                        <p class="team-name">E.M.M.Ekanayake</p>
                        <p class="subtle">Team Member</p>
                    </div>
                </div>
            </div>
        </div>
        <!-- /// Leadershipboard SECTION /// -->
        <div id="leadershipboard" class='large-margin'>
            <a href="leadershipboard.html"></a><!-- Nav Anchor -->
            <div class="row heading tiny-margin">
                <div class="col-md-auto">
                    <h1 class="animation-element slide-down">LEADERSHIP <span class="colored">BOARD</span></h1>
                </div>
                <div class="col">
                    <hr class="animation-element extend">
                </div>
				</div>
				<c:choose>
				<c:when test="${mode == 'GAMEHISTORY_VIEW'}">
			
				<table class="table table-striped">

					<thead>
					  <tr>
						<th>Date/Time</th>
						<th>Win/Loss</th>
					  </tr>
					</thead>
					<tbody>
					  <c:forEach var="gamehistory" items="${gamehist}">
						<tr>
							<td>${game.timeStamp}</td>
							<td>${game.gameStatus}</td>
			        	</tr>
					  </c:forEach>
					</tbody>
				  </table>
        		</c:when>

			</c:choose>
            
        </div>
        <!-- /// Portfolio SECTION /// -->
        <div id="Portfolio" class="large-margin">
            <a href="portfolio.html"></a><!-- Nav Anchor -->
            <div class="row heading tiny-margin">
                <div class="col-md-auto">
                    <h1 class="animation-element slide-down">PORT<span class="colored">FOLIO</span></h1>
                </div>
                <div class="col">
                    <hr class="animation-element extend">
                </div>
            </div>
			
			 <c:choose>
				<c:when test="${mode == 'PORTFOLIO_VIEW'}">
			
				<table class="table table-striped">

					<thead>
					  <tr>
						<th>Company</th>
						<th>Buy/Sell</th>
						<th>Stock Qty</th>
						<th>Stock Price</th>
					  </tr>
					</thead>
					<tbody>
					  <c:forEach var="portfolio" items="${portfolios}">
						<tr>
							<td>${portfolio.Timestamp}</td>
							<td>${portfolio.Game_Status}</td>
							<td>${portfolio.Timestamp}</td>
							<td>${portfolio.Game_Status}</td>
			        	</tr>
					  </c:forEach>
					</tbody>
				  </table>
        		</c:when>

			</c:choose>
        </div>
		
		
		<div id="markethistory" class="large-margin">
            <a href="markethistory.html"></a><!-- Nav Anchor -->
            <div class="row heading tiny-margin">
                <div class="col-md-auto">
                    <h1 class="animation-element slide-down">Market <span class="colored">History</span></h1>
                </div>
                <div class="col">
                    <hr class="animation-element extend">
                </div>
            </div>
			
			 <c:choose>
				<c:when test="${mode == 'GAMEHISTORY_VIEW'}">
			
				<table class="table table-striped">

					<thead>
					  <tr>
						<th>Date/Time</th>
						<th>Win/Loss</th>
					  </tr>
					</thead>
					<tbody>
					  <c:forEach var="bank" items="${banks}">
						<tr>
							<td>${bank.Timestamp}</td>
							<td>${bank.Game_Status}</td>
			        	</tr>
					  </c:forEach>
					</tbody>
				  </table>
        		</c:when>

			</c:choose>
			
          
		</div>
		
    </div><!-- Main Container End -->
    <!-- /// FOOTER /// -->
    <footer id="main-footer">
        <div id="footer"> 
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <p id="copyright">© 2018 Stock Market Simulator. All rights reserved | Design by Blacklamps</p><!-- Copyright Text -->
                        <ul class="social-links"> <!-- Social Media Icons -->
                            <li><a href="https://github.com/BlacklampsSE2/Game-Simulator"><i class="fa fa-github icon-social"></i></a></li>
                        </ul>
                    </div>
                </div>
            </div><!-- Container End -->
        </div>
    </footer><!-- Footer End -->
    
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