<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ECommerce Application</title>

<style type="text/css">
body {
background-image: url('https://images.pexels.com/photos/1040499/pexels-photo-1040499.jpeg?cs=srgb&dl=pexels-oleg-magni-1040499.jpg&fm=jpg');
	text-align:center;
}
.container {
    height: 10em;
    position: relative;
    margin: 0;
    position: absolute;
    top: 20%;
    left: 50%;
    margin-right: -50%;
    transform: translate(-50%, -50%);
}
.button {
  display: inline-block;
  border-radius: 4px;
  background-color: #808080;
  border: none;
  color: #FFFFFF;
  text-align: center;
  font-size: 18px;
  font-family: "Segoe UI",Arial,sans-serif;
  padding: 15px;
  width: 140px;
  transition: all 0.5s;
  cursor: pointer;
  margin: 5px;
}

.button span {
  cursor: pointer;
  display: inline-block;
  position: relative;
  transition: 0.5s;
}

.button span:after {
  content: '\00bb';
  position: absolute;
  opacity: 0;
  top: 0;
  right: -20px;
  transition: 0.5s;
}

.button:hover span {
  padding-right: 25px;
}

.button:hover span:after {
  opacity: 1;
  right: 0;
}
h1 {
  text-align: center;
  color: #4CAF50;
  letter-spacing: 2px;
  font-family: "Segoe UI",Arial,sans-serif;	
  position: relative;
}
h1::before {
    content: '';
    position: absolute;
    width: 100%;
    height: 4px;
    border-radius: 4px;
    background-color: #4CAF50;
    bottom: 0;
    left: 0;
    transform-origin: right;
    transform: scaleX(0);
    transition: transform .3s ease-in-out;
  }
  h1:hover::before {
  transform-origin: left;
  transform: scaleX(1);
}
h2{
display: block;
  opacity: 0.75;
  font-family: "Segoe UI",Arial,sans-serif;
  color: #ffff66;
}
#blinkText
{
  animation: blink 1s infinite;  
}
@keyframes blink 
{  
  0% { opacity: 1.0; }
  50% { opacity: 0.0; }
  100% { opacity: 1.0; }
}
</style>

</head>
<body class="container">
<h1>Welcome to ECommerce Application !!</h1>
<h2 id="blinkText">Click button to Continue...</h2>
<form action="/admin">
<button type="submit" class="button" style="font-weight:bold;"><span>Admin</span></button>
</form>
<br>
<form action="/seller">
<button type="submit" class="button" style="font-weight:bold;"><span>Seller</span></button>
</form>
<br>
<form action="/customer">
<button type="submit" class="button" style="font-weight:bold;"><span>Customer</span></button>
</form>
</body>
</html>