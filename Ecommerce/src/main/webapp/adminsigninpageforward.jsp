
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

<form action="/adminseller" name="autosub" >
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

String Aid = request.getParameter("Aid");
System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<=====================<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
System.out.println("++++++++++++++"+Aid);
String Aemail = request.getParameter("Aemail");

String Apassword = request.getParameter("Apassword");
System.out.println(Aemail);
System.out.println(Apassword);
Class.forName("org.postgresql.Driver");
connection = DriverManager.getConnection(connectionUrl + dbName, userId, password);
statement = connection.createStatement();
resultSet = statement.executeQuery("select * from admin where Aid=" + Aid);
try {
	resultSet.next();
	if (resultSet.getString("Apassword").equals(Apassword) && resultSet.getString("Aemail").equals(Aemail)) {
		out.println("Welcome " + Aemail);
	} else {
		System.out.println("Invalid Cpassword or username.");
		response.sendRedirect("adminSignIn.jsp");
	}
} catch (Exception e) {
	e.printStackTrace();
}
%>
</body>
</html>