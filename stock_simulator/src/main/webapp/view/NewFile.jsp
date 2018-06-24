<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script
  src="https://code.jquery.com/jquery-3.3.1.slim.js"></script>
 
	
<title>Stock Market</title>


<script>
var turn=0;
var noTurns=20;
var turnTimes;
var response;

	
	
function getStockMarketDetailFromService() {
	
	
	 var xhttp = new XMLHttpRequest();
	    xhttp.open("GET", "/getMarketPricesTest", false);
	    xhttp.setRequestHeader("Content-type", "application/json");
	    xhttp.send();
	    response = JSON.parse(xhttp.responseText);
	  //  noTurns=response.noTurns;
	    //turnTimes=response.turnTime;
	    
	  // document.getElementById("demop").innerHTML=response[0].FinalPrice;
	    
	    loop();
	   //
	   
	   
}

function loop(){	
	var table = document.getElementById("demoTable");	
	
	for (var i = 0; i < 2; i++) {
		 
		  
		 var row = table.insertRow(i);
		 var cell1 = row.insertCell(0);
		 var cell2 = row.insertCell(1); 		
		
		 cell1.innerHTML = response[i].company_Name;
		    cell2.innerHTML = response[i].FinalPrice[i];
		
	    }   
	 	
	 
	
	   
} 


</script>






</head>
<body  onload="getStockMarketDetailFromService()">



<table class="table table-stripped table-bordered">
			<thead>
				<tr>
					<th>Buy message</th>
					<th>Sell Price</th>
				</tr>

			</thead>
			<tbody id="demoTable">

			</tbody>
		</table>




</body>
</html>
