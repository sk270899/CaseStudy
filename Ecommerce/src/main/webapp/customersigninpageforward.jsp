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
<form action="/signin" name="autosub">
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
//String Cid = request.getParameter("Cid");
System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<=====================<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
//System.out.println(Cid);
String Cemail = request.getParameter("Cemail");
/*session.putValue("Cemail", email);*/
String Cpassword = request.getParameter("Cpassword");
System.out.println(Cemail);
System.out.println(Cpassword);
Class.forName("org.postgresql.Driver");
connection = DriverManager.getConnection(connectionUrl + dbName, userId, password);
statement = connection.createStatement();
resultSet = statement.executeQuery("select * from Customer where Cemail=" + "'" + Cemail + "'");
try {
	resultSet.next();
	if (resultSet.getString("cpassword").equals(Cpassword) && resultSet.getString("cemail").equals(Cemail)) {
		System.out.println("Welcome " + Cemail);
	} else {
		System.out.println("Invalid Cpassword or username.");
		response.sendRedirect("customerSignIn.jsp");
	}
} catch (Exception e) {
	e.printStackTrace();
}
%>
</body>
</html>