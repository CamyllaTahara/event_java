<%-- 
    Document   : erro
    Created on : 30 de abr. de 2024, 15:04:52
    Author     : Sergio
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>ERRO</h1>
        <h2><% 
            String message = (String) request.getAttribute("erro");
            out.println(message);
        %></h2>
    </body>
</html>
