<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Product</title>
<style type="text/css">
body {
font-family: "Segoe UI",Arial,sans-serif;
}
input[type=number], select {
	width: 100%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
}

input[type=submit] {
	width: 100%;
	background-color: #4CAF50;
	color: white;
	padding: 14px 20px;
	margin: 8px 0;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}
input[type=submit]:hover {
	background-color: #275440;
}
#products {
  font-family: Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

#products td, #products th {
  border: 1px solid #ddd;
  padding: 8px;
}

#products tr:nth-child(even){background-color: #f2f2f2;}

#products tr:hover {background-color: #ddd;}

#products th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #04AA6D;
  color: white;
}
p {
font-family: "Segoe UI",Arial,sans-serif;
font-weight: 200;	
}
.required:after {
    content:" *";
    color: red;
}
.astric {
  color: red;
  letter-spacing: 2px;
  font-family: "Segoe UI",Arial,sans-serif;	
  position: relative;
}
</style>
</head>
<body>
<h2>Delete Product</h2>
<p><span class="astric"> * </span>Marked fields are required</p>
<form action="/deleteProduct">
<span class="required">Enter Product Id to delete:</span>
<input type="number" name="id" required="required" oninvalid="this.setCustomValidity('Please Enter Valid Id')" oninput="this.setCustomValidity('')"><br>
<input type="submit">
</form>
<%
String driverName = "org.postgresql.Driver";
String connectionUrl = "jdbc:postgresql://localhost/";
String dbName = "student";
String userId = "postgres";
String password = "postgres";

try {
Class.forName(driverName);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<h2 align="center"><font><strong>Product Information</strong></font></h2>
<table id="products">

<tr>
<th><b>Product Id</b></th>
<th><b>Product Name</b></th>
<th><b>Product Product</b></th>
<th><b>Product Category</b></th>
</tr>
<%
try{ 
connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
statement=connection.createStatement();
String sql ="SELECT * FROM Product";

resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr>
<td><%=resultSet.getString("Pid") %></td>
<td><%=resultSet.getString("Pname") %></td>
<td><%=resultSet.getString("Pprice") %></td>
<td><%=resultSet.getString("Pcategory") %></td>


</tr>

<% 
}

} catch (Exception e) {
e.printStackTrace();
}
%>
</table>
</body>
</html>