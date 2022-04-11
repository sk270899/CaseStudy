<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Admin !</title>
<style type="text/css">
#controls {
  font-family: Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

#controls td, #controls th {
  border: 1px solid #ddd;
  padding: 8px;
}

#controls tr:nth-child(even){background-color: #f2f2f2;}
#controls tr:nth-child(odd){background-color: #f2f2f2;}
#controls tr:hover {background-color: #ddd;}

#controls th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #04AA6D;
  color: white;
}




.button-38 {
  background-color: #FFFFFF;
  border: 0;
  border-radius: .5rem;
  box-sizing: border-box;
  color: #111827;
  font-family: "Inter var",ui-sans-serif,system-ui,-apple-system,system-ui,"Segoe UI",Roboto,"Helvetica Neue",Arial,"Noto Sans",sans-serif,"Apple Color Emoji","Segoe UI Emoji","Segoe UI Symbol","Noto Color Emoji";
  font-size: .875rem;
  font-weight: 600;
  line-height: 1.25rem;
  padding: .75rem 1rem;
  text-align: center;
  text-decoration: none #D1D5DB solid;
  text-decoration-thickness: auto;
  box-shadow: 0 1px 3px 0 rgba(0, 0, 0, 0.1), 0 1px 2px 0 rgba(0, 0, 0, 0.06);
  cursor: pointer;
  user-select: none;
  -webkit-user-select: none;
  touch-action: manipulation;
}

.button-38:hover {
  background-color: rgb(255,99,71);
}

.button-38:focus {
  outline: 2px solid transparent;
  outline-offset: 2px;
}

.button-38:focus-visible {
  box-shadow: none;
}


.button-39 {
  background-color: #ef9a9a;
  border: 0;
  border-radius: .5rem;
  box-sizing: border-box;
  color: #111827;
  font-family: "Inter var",ui-sans-serif,system-ui,-apple-system,system-ui,"Segoe UI",Roboto,"Helvetica Neue",Arial,"Noto Sans",sans-serif,"Apple Color Emoji","Segoe UI Emoji","Segoe UI Symbol","Noto Color Emoji";
  font-size: .875rem;
  font-weight: 600;
  line-height: 1.25rem;
  padding: .75rem 1rem;
  text-align: center;
  text-decoration: none #D1D5DB solid;
  text-decoration-thickness: auto;
  box-shadow: 0 1px 3px 0 rgba(0, 0, 0, 0.1), 0 1px 2px 0 rgba(0, 0, 0, 0.06);
  cursor: pointer;
  user-select: none;
  -webkit-user-select: none;
  touch-action: manipulation;
}

.button-39:hover {
  background-color: rgb(255,99,71);
}

.button-39:focus {
  outline: 2px solid transparent;
  outline-offset: 2px;
}

.button-39:focus-visible {
  box-shadow: none;
}
h1 {
	 font-family: "Segoe UI",Arial,sans-serif;
}
</style>
</head>
<body>
<h1>Admin Controls</h1>

<table id="controls">

<tr>
    <th>Seller Controls</th>
    <th>Customer Controls</th>
  </tr>
  <tr>
    <td><form action="/addseller">
<button type="submit" class="button-38">Add Seller</button>
</form></td>
    <td><form action="/viewcustomer">
<button type="submit" class="button-38">View Customer</button>
</form></td>
  </tr>
  <tr>
  <td><form action="/deleteseller">
<button type="submit" class="button-38">Remove Seller</button>
</form></td>
  <td><form action="/deletecustomer">
<button type="submit" class="button-38">Remove Customer</button>
</form></td>
  </tr>
  <tr>
  <td><form action="/viewseller">
<button type="submit" class="button-38">View Seller</button>
</form>
  </td>
  <td><form action="#">
<button type="submit" class="button-38">Empty</button>
</form>
  </td>
  </tr>
</table>
<br><br><br>
<form action="/admin" style="text-align: center;">
<button type="submit" class="button-39">Logout</button>
</form>

</body>
</html>

