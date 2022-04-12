<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%@ page import="com.ecom.entity.Cart"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cart</title>
<script type="text/javascript">
window.onload = function(){
	  document.forms['autosub'].submit();
	}
</script>
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
String Pid = request.getParameter("Pid");


Class.forName("org.postgresql.Driver");
connection = DriverManager.getConnection(connectionUrl + dbName, userId, password);
statement = connection.createStatement();
resultSet = statement.executeQuery("select Pid,Pname,Pprice,Pcategory from product where Pid=" + Pid);

//cart object
//Cart c = new Cart();
while(resultSet.next()) {
	System.out.println("order placed for order id : "+Pid + "\n");
	System.out.println("product id : " + resultSet.getString(1));
	System.out.println("product name : " + resultSet.getString(2));
	System.out.println("product price : " + resultSet.getString(3));
	System.out.println("product category : " + resultSet.getString(4));
	response.sendRedirect("placeorder.jsp");
}

while(resultSet.next()) {
	
	
	/* c.setOid(resultSet.getInt(1));
	c.setOname(resultSet.getString(2));
	c.setOprice(resultSet.getInt(3));
	c.setOcategory(resultSet.getString(4)); */
	
}
%>
<%while(resultSet.next()) {
%>

<form action="/placeorder">
<input type="submit" name="autosub">
</form>
<%} %>
</body>
</html>