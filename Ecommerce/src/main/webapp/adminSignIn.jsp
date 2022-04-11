<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin SignIn</title>
<script type="text/javascript">
window.onload = function(){
	  document.forms['autosub'].submit();
	}
</script>
<style type="text/css">
input[type=number], select {
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
<h2>Enter Admin SignIN Details</h2>
<p><span class="astric"> * </span>Marked fields are required</p>
<form action="adminsigninpageforward.jsp" method="POST">
	<span class="required">Enter Id:</span><input placeholder="Enter Id" type="number" name="Aid" required="required" required="required" oninvalid="this.setCustomValidity('Please Enter Valid Id')" oninput="this.setCustomValidity('')">
	<span class="required">Enter E-mail:</span><input type="email" placeholder="Enter Your Email" placeholder="example@abc.com" name="Aemail" required="required" oninvalid="this.setCustomValidity('Please Enter Valid Email as abc@example.com')" oninput="this.setCustomValidity('')">
	<span class="required">Enter Password:</span><input type="password" placeholder="Enter Your Password" name="Apassword" required="required" oninvalid="this.setCustomValidity('Please Enter Valid Password')" oninput="this.setCustomValidity('')">
					<input type="submit" value="LogIn">
</form>

</body>
</html>
