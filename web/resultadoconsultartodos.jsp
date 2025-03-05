<%-- 
    Document   : resultadoconsultartodos
    Created on : 30 de abr. de 2024, 15:06:57
    Author     : Sergio
--%>

<%@page import="java.util.List"%>
<%@page import="model.Evento"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="resultadoconsultartodos.css">
    <title>Consultar Todos</title>
    
    
</head>
<body>
    <h1>Consultar Eventos</h1>

    <%
        List<Evento> lev = (List<Evento>) request.getAttribute("lev");
    %> 
    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Evento</th>
                <th>Data</th>
                <th>Horário</th>
                <th>Área</th>
                <th>Local</th>
                <th>Convidado</th>
                <th>Email</th>
                <th>Whatsapp</th>
                <th>Número de Participantes</th>
                <th>Editar</th>
                <th>Deletar</th>
            </tr>
        </thead>
        <tbody>
            <% for (Evento ev : lev) { %>
            <tr id="row-<%= ev.getId() %>">
                <td><%= ev.getId() %></td>
                <td><%= ev.getEvento() %></td>
                <td><%= ev.getDia() %></td>
                <td><%= ev.getHorario() %></td>
                <td><%= ev.getArea() %></td>
                <td><%= ev.getLocalevento() %></td>
                <td><%= ev.getConvidado() %></td>
                <td><%= ev.getEmail() %></td>
                <td><%= ev.getWhatsapp() %></td>
                <td><%= ev.getParticipantes() %></td>
                <td><a href="http://localhost:8080/evento14/Evento_Controller?btnoperacao=Alterar&txtid=<%= ev.getId() %>"><img src="icons/lapisazul.png" width="35" height="35"></a></td>
                <td><a href="http://localhost:8080/evento14/Evento_Controller?btnoperacao=Deletar&txtid=<%= ev.getId() %>"><img src="icons/x.png" width="30" height="30"></a></td>
            </tr>
            <% } %>
        </tbody>
    </table>
        <div>
            
 
}
        <div id = "centralizar">
        <a href="index.html"> <button id="button2"> Voltar </button> </a>
</div>
</body>
</html>
