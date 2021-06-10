<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
</head>
<body>

	<form id="form-1" action="Database.jsp" method="post">
		<label for="input-1">ID:</label>
		<input id="input-1" placeholder="Text" name="id" type="number"/>
		
		<br>
		<br>
		<label for="input-2">NAME:</label>
		<input id="input-2" placeholder="Text" type="text" name="name" style="height: 30px"/>
		<br> 
		<br> 
		
		<label for="input-3">Age:</label>
		<input id="input-3" placeholder="Text" type="number" name="age"/>
		<br>
		<br>
		<input type="submit" value="ADD RECORD" id="button-1"/>
	</form>
	<hr>
	<br>
	<br>
	<a href="DatabaseRecords.jsp">
	<button id="button-3"  class="button">Get Records</button>
	</a>
	
	<hr>
	Delete record by Id:
	<br>
	<br>
	<form id="form-2" action="DeleteRecord.jsp" method="post">
	
	<input id="input-4" placeholder="enter id" type="number" name="id"/>
		<br>
		<br>
		<input type="submit" value="DeleteRecord " id="button-1"/>
		<hr>
		</form>

</body>
</html>