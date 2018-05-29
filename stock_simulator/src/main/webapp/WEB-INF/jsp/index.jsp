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
			<c:when test="${mode == 'BANK_VIEW'}">
				<table class="table">
					<thead>
						<tr>
							<th>Banks</th>
							<th>Sector</th>
							<th>Edit</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="bank" items="${banks}">
							<tr>
								<td>${bank.name}</td>
								<td>${bank.sector}</td>
								<td><a href="updateBank?id=${bank.id}">Edit</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</c:when>
			<c:when test="${mode == 'BANK_EDIT'}">
				<form action="save" method="POST">
					<input type="hidden" class="form-control" value="${bank.id}"
						name="id" id="id">
					<div class="form-group">
						<label for="bankName">Bank Name:</label> <input type="text"
							class="form-control" value="${bank.name}" name="name"
							id="bankName">
					</div>
					<div class="form-group">
						<label for="sector">Sector:</label> <input type="text"
							class="form-control" value="${bank.sector}" name="sector"
							id="sector">
					</div>
					<button type="submit" class="btn btn-default" value="submit">Submit</button>
				</form>

			</c:when>

		</c:choose>

	</div>

</body>
</html>
