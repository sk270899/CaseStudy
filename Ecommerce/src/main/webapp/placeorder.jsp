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
<title>Orders</title>
<style type="text/css">
body {
font-family: "Segoe UI",Arial,sans-serif;
}
#orders {
  font-family: Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

#orders td, #orders th {
  border: 1px solid #ddd;
  padding: 8px;
}

#orders tr:nth-child(even){background-color: #f2f2f2;}
#orders tr:nth-child(odd){background-color: #f2f2f2;}
#orders tr:hover {background-color: #ddd;}

#orders th {
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
System.out.println("order placed");
%>
<h2 align="center"><font><strong>Cart</strong></font></h2>
<table id="orders">

<tr>
<th><b>Product Id</b></th>
<th><b>Product Name</b></th>
<th><b>Product Price</b></th>
<th><b>Product Category</b></th>
</tr>
<%
try{ 
connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
statement=connection.createStatement();
String sql ="SELECT * FROM Cart";

resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr>
<td><%=resultSet.getString("Oid") %></td>
<td><%=resultSet.getString("Oname") %></td>
<td><%=resultSet.getString("Oprice") %></td>
<td><%=resultSet.getString("Ocategory") %></td>
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