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
<title>Stock Market</title>
</head>
<body>

	<div class="container">
		<c:choose>
			<c:when test="${mode == 'STOCK_VIEW'}">
			<table class="table" id="tb1">
					<thead>
						<tr>
							<th>Banks</th>
							<th>Sector</th>
							<th>Edit</th>
						</tr>
					</thead>
			</table>
				<c:forEach var="stocks" items="${companyStocks}">
					<c:forEach begin="0" end="19" step="1" varStatus="loop">
						<c:set var="myTest" value="${loop.count}"/>
						<script>
						function insertData() {
							var table = document.getElementById("tb1");
							var row = table.insertRow(1);
							 var cell1 = row.insertCell(0);
							 var cell2 = row.insertCell(1);
							
							<%=pageContext.getAttribute("myTest") %>;
						}
						
						</script>
						<script>
						insertData();
						</script>
					</c:forEach>
				</c:forEach>

			</c:when>


		</c:choose>

	</div>

</body>
</html>
