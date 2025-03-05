<%-- 
    Document   : resultadoexcluir
    Created on : 30 de abr. de 2024, 15:08:00
    Author     : Sergio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="resultadoexcluir.css">
        <title>JSP Page</title>
    </head>
    <body>
        
        <div class="mensagem">
        <h2><% 
            String message = (String) request.getAttribute("message");
            out.println(message);
        %></h2>
    </div>
        
    </body>
</html>
