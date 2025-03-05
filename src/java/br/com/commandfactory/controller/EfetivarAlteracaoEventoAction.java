/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.commandfactory.controller;

import dao.EventoDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Evento;

/**
 *
 * @author Sergio
 */
public class EfetivarAlteracaoEventoAction implements ICommand {
     @Override
    public String executar(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("txtid"));
        String evento = request.getParameter("txtevento");
        String dia = request.getParameter("txtdia");
        String horario = request.getParameter("txthorario");
        String area = request.getParameter("txtarea");
        String localevento = request.getParameter("txtlocalevento");
        String convidado = request.getParameter("txtconvidado");
        String email = request.getParameter("txtemail");
        String whatsapp = request.getParameter("txtwhatsapp");
        int participantes = Integer.parseInt(request.getParameter("txtparticipantes"));

        Evento ev = new Evento();
        EventoDAO evdao = new EventoDAO();

        ev.setId(id);
        ev.setEvento(evento);
        ev.setDia(dia);
        ev.setHorario(horario);
        ev.setArea(area);
        ev.setLocalevento(localevento);
        ev.setConvidado(convidado);
        ev.setEmail(email);
        ev.setWhatsapp(whatsapp);
        ev.setParticipantes(participantes);

        
        List<Evento> lev = new ArrayList<Evento>();
        try {
            evdao.editar(ev);            
            lev = evdao.consultarTodos();            
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
        request.setAttribute("lev", lev);
        return "resultadoconsultartodos.jsp";
    }
    
}
