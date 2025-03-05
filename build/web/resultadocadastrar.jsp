<%-- 
    Document   : resultadocadastrar
    Created on : 30 de abr. de 2024, 15:06:25
    Author     : Sergio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="resultadocadastrar.css">
        <title>JSP Page</title>
    </head>
    <body>
       
        <h2><% 
            String message = (String) request.getAttribute("message");
            out.println(message);
            
        %>
        <a href="index.html"> <button id="button1"> Voltar </button> </a>
        
        
        </h2>
    </body>
</html>
