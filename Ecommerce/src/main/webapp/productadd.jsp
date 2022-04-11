<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product</title>
<style type="text/css">
input[type=text], select {
	width: 100%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
}

input[type=email], select {
	width: 100%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
}

input[type=password], select {
	width: 100%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
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

div {
	border-radius: 5px;
	background-color: #f2f2f2;
	padding: 20px;
}

h2 {
  color: #4CAF50;
  letter-spacing: 2px;
  font-family: "Segoe UI",Arial,sans-serif;	
  position: relative;
}

span {
	  font-family: "Segoe UI",Arial,sans-serif;

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
<h2>Add a New Product</h2>
<p><span class="astric"> * </span>Marked fields are required</p>
<form action="/addProduct">
<span class="required">Enter Product Id:</span>
<input type="number" name="Pid" placeholder="Enter Numeric Id" required="required" oninvalid="this.setCustomValidity('Please Enter Valid Id')" oninput="this.setCustomValidity('')"><br>
<span class="required">Enter Product Name:</span>
<input type="text" name="Pname" placeholder="Enter Product Name" required="required" oninvalid="this.setCustomValidity('Please Enter Name')" oninput="this.setCustomValidity('')"><br>
<span class="required">Enter Product Price:</span>
<input type="number" name="Pprice" placeholder="Enter Product Price" required="required" oninvalid="this.setCustomValidity('Please Enter Price')" oninput="this.setCustomValidity('')"><br>
<span>Enter Product Category:</span>
<input type="text" name="Pcategory" placeholder="Enter Product Category"><br>
<input type="submit">
</form>
</body>
</html>