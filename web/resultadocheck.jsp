<%-- 
    Document   : resultadocheckbox
    Created on : 22 de mai. de 2024, 19:52:50
    Author     : Sergio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="resultadocheck.css">
        <title>Notificações</title>

    </head>
    <body>
        <div id="formulario" >
            <br> <center>
                <%
         String x = (String) request.getAttribute("msg");
         out.print(x);

                %>
                <br><br>
                <a href="index.html"> <button>Voltar</button> </a>
            </center>
        </div>
    </body>
</html>
