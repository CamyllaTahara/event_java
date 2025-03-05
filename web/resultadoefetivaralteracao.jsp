<%-- 
    Document   : resultadoefetivaralteracao
    Created on : 30 de abr. de 2024, 15:07:29
    Author     : Sergio
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="resultadoefetivaralteracao.css">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Resultado Efetivar Alteração</h1>
        <h2><% 
            String message = (String) request.getAttribute("message");
            out.println(message);
        %></h2>
    </body>
</html>
