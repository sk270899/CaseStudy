<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import = "java.sql.DriverManager"%>
<%@page import = "java.sql.Connection"%>
<%@page import = "java.sql.Statement"%>
<%@page import = "java.sql.ResultSet"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
h2,h3	{font-family:sans-serif;}
#covid {
  font-family: Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

#covid td, #covid th {
  border: 1px solid #ddd;
  padding: 8px;
}

#covid tr:nth-child(even){background-color: #f2f2f2;}

#covid tr:hover {background-color: #ddd;}

#covid th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: center;
  background-color: #008CBA;
  color: white;
}
</style>
<meta charset="ISO-8859-1">
<title>Result Data</title>
</head>
<body>
<%
try{
	Class.forName("org.postgresql.Driver");
	Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost/student","postgres","postgres");
	Statement stmt = conn.createStatement();
	ResultSet result = stmt.executeQuery("SELECT location, total_cases FROM coviddata WHERE new_cases> 10000 GROUP BY location,total_cases ORDER BY total_cases;");
%>
<h2 align="center">INFO</h2>
<h3 align="center">SELECT location, total_cases FROM coviddata</h3>
<h3 align="center">WHERE new_cases>10000 GROUP BY location,total_cases ORDER BY total_cases;</h3>
<h3 align="center">CSV File : covid-19-data/public/data/latest/owid-covid-latest.csv</h3>
<table id="covid">
<tr></tr>

<tr>
<th>location</th>
<th>total cases</th>
</tr>
<%
while(result.next()) {
%>
<tr>
<td ><%=result.getString("location") %></td>
<td><%=result.getString("total_cases") %></td>
</tr>
<%
}}
catch(Exception e) {
	e.printStackTrace();
}%>

</table>
</body>
</html>