<%-- 
    Document   : resultadoalterar
    Created on : 30 de abr. de 2024, 15:05:25
    Author     : Sergio
--%>

<%@page import="model.Evento"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="resultadoalterar.css">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>ALTERAR INFORMAÇÕES</h1>
        <%

            Evento ev = (Evento) request.getAttribute("ev");
        %> <form name="f1" action="Evento_Controller" method="post"> <%
            %>ID: <%out.print(ev.getId()); %> <input type="hidden" name="txtid" value="<%out.print(ev.getId()); %>"><BR><%
            %>Evento: <input type="text" name="txtevento" value="<%out.print(ev.getEvento()); %>"><BR><%
            %>Data: <input type="text" name="txtdia" value="<%out.print(ev.getDia()); %>"><BR><%
            %>Horário: <input type="text" name="txthorario" value="<%out.print(ev.getHorario()); %>"><BR><%  
            %>Área: <input type="text" name="txtarea" value="<%out.print(ev.getArea()); %>"><BR><%
            %>Local: <input type="text" name="txtlocalevento" value="<%out.print(ev.getLocalevento()); %>"><BR><%   
            %>Convidado: <input type="text" name="txtconvidado" value="<%out.print(ev.getConvidado()); %>"><BR><%
            %>Email: <input type="text" name="txtemail" value="<%out.print(ev.getEmail()); %>"><BR><% 
            %>Whatsapp: <input type="text" name="txtwhatsapp" value="<%out.print(ev.getWhatsapp()); %>"><BR><%
            %>Número de Participantes: <input type="text" name="txtparticipantes" value="<%out.print(ev.getParticipantes()); %>"><BR><%    
            %>
            <input type="submit" name ="btnoperacao" value="EfetivarAlteracao"> 
             
        </form>
    </body>
</html>
