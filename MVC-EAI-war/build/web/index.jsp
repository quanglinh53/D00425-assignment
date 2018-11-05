<%-- 
    Document   : index
    Created on : Nov 5, 2018, 1:43:54 AM
    Author     : quanglinh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Login Form!</h1>
        <form action="LoginServlet" method="POST">
            Username: <input type="text" placeholder="quanglinh" name="username"/> <br/>
            Password <input type="password" placeholder="******" name="password"/> <br/>
            <input type="submit" value="Login"/> <br/>
            <input type="reset" value="Reset"/> <br/>
        </form>
    </body>
</html>
