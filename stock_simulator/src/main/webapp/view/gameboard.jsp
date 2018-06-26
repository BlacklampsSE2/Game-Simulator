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
<link href="http://localhost:8080/view/css/animate.css" rel="stylesheet">
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.1/darkly/bootstrap.min.css"
	rel="stylesheet">
<!-- Lightbox -->
<link href="http://localhost:8080/view/css/lightbox.min.css"
	rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Inconsolata"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css?family=Lato:300,400,400i,700,700i"
	rel="stylesheet">

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>


<script>
var turn=0;
var noTurns=20;
var dTurns=1;
var turnTimes;
var response;
var cash;
	
	
function getStockMarketDetailFromService() {
	
	
	 var xhttp = new XMLHttpRequest();
	    xhttp.open("GET", "/getMarketPricesTest", false);
	    xhttp.setRequestHeader("Content-type", "application/json");
	    xhttp.send();
	    response = JSON.parse(xhttp.responseText);
	  //  noTurns=response.noTurns;
	    //turnTimes=response.turnTime;
	    
	  // document.getElementById("demop").innerHTML=response[0].FinalPrice;
	  getCashbal();
	  loop();
	   //
	   
	   
}



function getCashbal()
{
	console.log("cash");
	 var user={};
	  
	  user.id="1";
	  user.name="mad";
	  
	  var xhttp3=new XMLHttpRequest();
	  xhttp3.open("POST", "/getCash", false);
	  xhttp3.setRequestHeader("Content-type", "application/json");
	  
	  var jsonUsr=JSON.stringify(user);
	  xhttp3.send(jsonUsr);
	  
	  cash = JSON.parse(xhttp3.responseText);
	  
	 document.getElementById("cash").textContent = cash[0].accbal;
	  console.log(cash[0].accbal);//cash
}



function loop(){	
	var table = document.getElementById("demoTable"),rIndex;	
	
	for (var i = 0; i < 10; i++) {
		 
		  
		 var row = table.insertRow(i);
		 var cell1 = row.insertCell(0);
		 var cell2 = row.insertCell(1);
		 var cell4 = row.insertCell(2);
		 //var cell5=row.insertCell(3);
		 
		 var txtBox = document.createElement("INPUT");
		 txtBox.setAttribute("type", "text");
		 var btn_buy = document.createElement("BUTTON");
		 btn_buy.setAttribute("id", "buy");
		 var btn_sell = document.createElement("BUTTON");
		 var buy_text = document.createTextNode("Buy");
		 var sell_text = document.createTextNode("Sell");
		 
		 
		/* var Qtys={}; 
		 
		  Qtys.company=response[i].company_Name;
		  Qtys.player="Snookie"
		   var ablqty2=new XMLHttpRequest();
		   ablqty2.open("POST", "http://localhost:8080/getAblStk", false);
		   ablqty2.setRequestHeader('Content-type','application/json; charset=utf-8');
		   var json2=JSON.stringify(Qtys);
		   ablqty2.send(json2);*/
		 
		
		 btn_buy.onclick = function() { // Note this is a function
			   var data={};
				    
				    swal({
						   title:this.parentNode.parentNode.cells[0].innerHTML,
						   text: this.parentNode.parentNode.cells[1].innerHTML,
						   content: "input",
						   button: {
						     text: "Buy",
						     closeModal: false,
						   },
						
						 })
						 .then(Qty => {

	  						 data.qty=Qty; 
							 console.log(Qty);
                            if(Qty>0)
                            	{
		  						swal({
		  						  title: "Are you sure?",
		  						  text: "Do You Want Sell!",
		  						  icon: "warning",
		  						  buttons: true,
		  						})
		  						.then((willBuy) => {
		  						  if (willBuy) {
		  							  
		  							  
		  						   data.buy="1";
		  						   data.player="Snookie";
		  						   data.company=this.parentNode.parentNode.cells[0].innerHTML
		  						   data.name="pawan";
		  						   data.price=this.parentNode.parentNode.cells[1].innerHTML
		  						   
		  							  
		  							 var xhttp2 = new XMLHttpRequest();
		  						    xhttp2.open("POST", "http://localhost:8080/tanSave", false);
		  						    xhttp2.setRequestHeader('Content-type','application/json; charset=utf-8');
		  						    xhttp2.onload = function () {
		  						    	if (xhttp2.readyState == 4 && xhttp2.status == 200) {
		  						    		console.log(xhttp2.readyState);
		  						    		console.log(xhttp2.status);
		  						    		console.log("ok")
		  						    	} else {
		  						    		console.log(xhttp2.readyState);
		  						    		console.log(xhttp2.status);
		  						    		console.log("not ok");
		  						    		
		  						    	}
		  						    }
		  						    
		  						var json=JSON.stringify(data);
		  						xhttp2.send(json);
		  						//Acc Bal function
		  						var user={};
		  						var cBal=document.getElementById("cash").textContent;  
		  						user.id="2";
		  						user.name="mad";
		  						
		  					   	var cbal=document.getElementById("cash").textContent;
		  					    var tranval=cbal-(data.price*data.qty);
		  					  	user.accbal=tranval;
		  					  	
		  					  	if((data.price*data.qty)<cbal)
		  					  		{
		  					  			var xhttpCashUp=new XMLHttpRequest();
		  					  			xhttpCashUp.open("POST", "/setCash", false);
		  					  			xhttpCashUp.setRequestHeader("Content-type", "application/json");
		  						
		  								var jsonchup=JSON.stringify(user);
		  				  				xhttpCashUp.send(jsonchup);
		  				  				
		  				  			getCashbal();
		  					  		}
		  					  	
		  					  	else
		  					  		{
		  					  	    swal("Oh noes!", "Not enof Mony !", "error");
		  					  	    return;
		  					  		}
		  						
		  						//end of acc bal
		  						//cell4.innerHTML=cell4.innerHTML+data.qty;
		  						//console.log(cell4.innerHTML+data.qty);
		  						    swal("Poof! Your Stocks has been Brought!", {
		  						      icon: "success",
		  						    });
		  						  } else {
		  						    swal("Your Stocks has not been Brought!!");
		  						  }
		  						}); 
						 }  
                            else
            					swal("Oh noes!", "Enter Valid Stock Amunt !", "error");
		  					
						})
						 .catch(err => {
						   if (err) {
						     swal("Oh noes!", "request failed!", "error");
						   } else {
						     swal.stopLoading();
						     swal.close();
						   }
						 });   
		  };
		  
		  btn_sell.onclick = function() { // Note this is a function
		 
			  var responseqty;
			  
			  var stock={};
			  stock.buy="0";
			  stock.player="Snookie";
			  stock.company=this.parentNode.parentNode.cells[0].innerHTML
			  stock.price=this.parentNode.parentNode.cells[1].innerHTML	  
	  
			   var data1={};
			  
			  
			
			   swal({
				   title:this.parentNode.parentNode.cells[0].innerHTML,
				   text: this.parentNode.parentNode.cells[1].innerHTML,
				   content: "input",
				   button: {
				     text: "Sell",
				     closeModal: false,
				   },
				
				 })
				 .then(Qty => {
					 
					// console.log(Qty);
					 stock.qty=Qty
					 
 					 data1.company=this.parentNode.parentNode.cells[0].innerHTML
 					   data1.player="Snookie"
 					   var ablqty=new XMLHttpRequest();
 					   ablqty.open("POST", "http://localhost:8080/getAblStk", false);
 					   ablqty.setRequestHeader('Content-type','application/json; charset=utf-8');
 					   var json1=JSON.stringify(data1);
 					   ablqty.send(json1);
 					   
  					 
 					   //console.log((ablqty.responseText));
 					   
  					if (JSON.parse(ablqty.responseText)>=Qty)
					 {
  						swal({
  						  title: "Are you sure?",
  						  text: "Do You Want Sell!",
  						  icon: "warning",
  						  buttons: true,
  						})
  						.then((willSell) => {
  						  if (willSell) {
  							  
  							 var xhttp2 = new XMLHttpRequest();
  						    xhttp2.open("POST", "http://localhost:8080/tanSave", false);
  						    xhttp2.setRequestHeader('Content-type','application/json; charset=utf-8');
  						    xhttp2.onload = function () {
  						    	if (xhttp2.readyState == 4 && xhttp2.status == 200) {
  						    	
  						    		console.log("ok")
  						    	} else {
  						    		
  						    		console.log("not ok");
  						    		
  						    	}
  						    }
  						  var jsonstk=JSON.stringify(stock);
  						xhttp2.send(jsonstk);
  						
  						
  						
  					//Acc Bal function
  						var user2={};
  						var cBal=document.getElementById("cash").textContent;  
  						user2.id="2";
  						user2.name="mad";
  						
  					   	var cbal= parseFloat(document.getElementById("cash").textContent);
						var Mul=(stock.price*stock.qty);
						console.log("Mul :"+Mul);
						
  					    var tranval=parseFloat((stock.price*stock.qty)) + parseFloat(cbal);
  					  console.log("tranval :"+tranval);
  					    
  					  	user2.accbal=parseFloat(tranval);
  					  	
  					  			var xhttpCashUp=new XMLHttpRequest();
  					  			xhttpCashUp.open("POST", "/setCash", false);
  					  			xhttpCashUp.setRequestHeader("Content-type", "application/json");
  						
  								var jsonchup=JSON.stringify(user2);
  								xhttpCashUp.send(jsonchup);
  								getCashbal();
  						
  						//end of acc bal
  
  						
  						
  						
  						
  							  
  						//cell4.innerHTML=cell4.innerHTML-stock.qty;
  						    swal("Poof! Your Stocks has been Sold!", {
  						      icon: "success",
  						    });
  						  } else {
  						    swal("Your Stocks has not been Sold!!");
  						  }
  						});
					 }
				 else
					swal("Oh noes!", "Not Enof Stock to Sell !", "error");
				})
				 .catch(err => {
				   if (err) {
				     swal("Oh noes!", "request failed!", "error");
				   } else {
				     swal.stopLoading();
				     swal.close();
				   }
				 });
				    
		  };
		  
		  timeUp();
		 cell1.innerHTML = response[i].company_Name;
		 cell2.innerHTML = response[i].FinalPrice[turn];
		 
		 cell2.setAttribute("class", "animated fadeIn");
		 
		 cell4.appendChild(btn_sell);
		 btn_sell.appendChild(sell_text);//btn btn-success
		 btn_sell.setAttribute("class", "btn btn-success");
		 btn_sell.setAttribute("style", "margin:5px;padding:5px 10px");
		 cell4.appendChild(btn_buy);
		 btn_buy.appendChild(buy_text);
		 btn_buy.setAttribute("class", "btn btn-info");//style=;
		 btn_buy.setAttribute("style", "margin:5px;padding:5px 10px");
		 
		// cell5.innerHTML=ablqty2.responseText;
		 
		 
		 
	    }
	
	 setTimeout(function () {          

	      turn++; 
	      dTurns++;
	      if(dTurns<=20){
	      document.getElementById("tc").textContent=dTurns+"/20"; }

	      if (turn < noTurns) {
	    	  table.deleteRow(0);
	    	  table.deleteRow(0);
	    	  table.deleteRow(0);
	    	  table.deleteRow(0);
	    	  table.deleteRow(0);
	    	  table.deleteRow(0);
	    	  table.deleteRow(0);
	    	  table.deleteRow(0);
	    	  table.deleteRow(0);
	    	  table.deleteRow(0);
	    	  timeUp();
	    		
	    	  loop();
	    	  
	    	  
	      }
	      
	      
	      
	
	}, 20000)
	 	
	
	function timeUp()
	 {var timeleft = 20;
	    var downloadTimer = setInterval(function(){
	        timeleft--;
	        if(timeleft<10)
	        	{
	        	document.getElementById("timer").textContent = "0"+timeleft;
	        	}
	        else
	        	{
	        	document.getElementById("timer").textContent = timeleft;
	        	}
	        
	        if(timeleft <= 0)
	            clearInterval(downloadTimer);
	      },1000);
	 }
	 
	 
	 

	
	function save()
	 {
		 document.getElementById("demo").innerHTML = "Hello World";
	 }
	
	   
} 


</script>


<script>
		$(document).ready(function(){
	 	getStockMarketDetailFromService();
		});
	</script>

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
				<!-- <a id="logo" class="navbar-brand" href="#"><img class="img-fluid" src="images/logo.png" alt="site logo"></a>-->
				<!-- Dropdown Button -->

				<!-- Navigation Links -->

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
						SCROLL DOWN <span class="colored">FOR ACTION</span>
					</h1>
				</div>

			</div>
		</div>
	</div>

	<div class="container">
		<div class="row heading tiny-margin">
			<div class="col-md-auto">
				<h1 class="animation-element slide-down">
					LIVE<span class="colored">MARKET</span>
				</h1>
			</div>
			<div class="col">
				<hr class="animation-element extend">
				<h2 align="right">
					Cash: <span class="colored" id="cash"></span>
				</h2>
				<h2 align="right">
					Time: 00 : <span id="timer" class="colored">20</span>
				</h2>
				<h2 align="right">
					Turn: <span class="colored" id="tc">1/20</span>
				</h2>
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
						<textarea id="newsfeed" class="form-control" readonly="readonly"
							rows="10" cols="70"
							style="color: white; background-color: transparent;"></textarea>
						<script type="text/javascript">
							function start(){
								eventSource=new EventSource("/Newsfeeds");
								eventSource.onopen=function(){newsfeed.value+= 'Connected...'+'\n';};
								eventSource.onmessage=function(message){newsfeed.value+=message.data+'\n\n'};
								eventSource.onerror=function(){newsfeed.value+='Error Occured...'+'\n'};
								startButton.disabled=true;
								}										
						</script>
						<script type="text/javascript">
							//start();
						</script>
					</div>

				</form>
			</div>

			<div class="column">
				<div class="col-md-auto">
					<h1 class="animation-element slide-down">
						Rumo<span class="colored">urs</span>
					</h1>
				</div>
				
				<form>
					<div class="form-group">
						<textarea id="comment" class="form-control" rows="10" cols="70"
							style="color: white; background-color: transparent;"></textarea>
						<script type="text/javascript">
							function start(){
								eventSource=new EventSource("/Rumours");
								eventSource.onopen=function(){comment.value+= 'Connected...'+'\n';};
								eventSource.onmessage=function(message){comment.value+=message.data+'\n\n'};
								eventSource.onerror=function(){comment.value+='Error Occured...'+'\n'};
								startButton.disabled=true;
								}										
						</script>
						<script type="text/javascript">
							start();
						</script>
					</div>
				</form>
				
				
				

			</div>


		</div>
		<div class="row">

			<table class="table table-striped center">
				<thead>
					<tr>
						<th>Company Name</th>
						<th>Stock Value</th>
						<th>Action</th>
					</tr>
				</thead>
				<tbody id="demoTable">

				</tbody>
			</table>


		</div>
	</div>



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