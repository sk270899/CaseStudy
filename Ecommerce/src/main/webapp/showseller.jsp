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
<title>Seller Information</title>
<style type="text/css">
body {
font-family: "Segoe UI",Arial,sans-serif;
}
#seller {
  font-family: Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

#seller td, #seller th {
  border: 1px solid #ddd;
  padding: 8px;
}

#seller tr:nth-child(even){background-color: #f2f2f2;}
#seller tr:nth-child(odd){background-color: #f2f2f2;}
#seller tr:hover {background-color: #ddd;}

#seller th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #04AA6D;
  color: white;
}
</style>
</head>
<body>
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
<h2 align="center"><font><strong>Seller Table</strong></font></h2>
<table id="seller">

<tr>
<th><b>Seller Id</b></th>
<th><b>Seller Name</b></th>
<th><b>Seller Address</b></th>
<th><b>Seller Number</b></th>
<th><b>Seller Email</b></th>
</tr>
<%
try{ 
connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
statement=connection.createStatement();
String sql ="SELECT * FROM Seller";

resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr>
<td><%=resultSet.getString("Sid") %></td>
<td><%=resultSet.getString("Sname") %></td>
<td><%=resultSet.getString("Saddress") %></td>
<td><%=resultSet.getString("Sno") %></td>
<td><%=resultSet.getString("Semail") %></td>
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






