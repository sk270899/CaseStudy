
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
window.onload = function(){
	  document.forms['autosub'].submit();
	}
</script>
</head>
<body>

<form action="/sellerafterlogin" name="autosub" >
<input type="submit">
</form>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
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
<%
String Sid = request.getParameter("Sid");
System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<=====================<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
System.out.println("++++++++++++++"+Sid);
String Semail = request.getParameter("Semail");

String Spassword = request.getParameter("Spassword");
System.out.println(Semail);
System.out.println(Spassword);
Class.forName("org.postgresql.Driver");
connection = DriverManager.getConnection(connectionUrl + dbName, userId, password);
statement = connection.createStatement();
resultSet = statement.executeQuery("select * from seller where Sid=" + Sid);
try {
	resultSet.next();
	if (resultSet.getString("Spassword").equals(Spassword) && resultSet.getString("Semail").equals(Semail)) {
		System.out.println("Welcome " + Semail);
	} else {
		System.out.println("Invalid Cpassword or username.");
		response.sendRedirect("sellersignin.jsp");
	}
} catch (Exception e) {
	e.printStackTrace();
}
%>
</body>
</html>