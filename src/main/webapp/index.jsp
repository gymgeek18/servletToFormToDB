<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Java Server Page</title>
</head>
<body>
<h1><%= "Hello World!" %></h1>
<br/>
<form action="hello-servlet">
    <input type="text" name="name" placeholder="User Name"/>
    <input type="text" name="pass" placeholder="Pass word"/>
    <input type="submit" value="Save"/>
</form>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>