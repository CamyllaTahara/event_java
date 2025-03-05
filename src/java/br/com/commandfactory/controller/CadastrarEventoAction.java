/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.commandfactory.controller;

import dao.EventoDAO;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Evento;

/**
 *
 * @author Sergio
 */
public class CadastrarEventoAction implements ICommand {
    @Override
    public String executar(HttpServletRequest request, HttpServletResponse response) {
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

        ev.setEvento(evento);
        ev.setDia(dia);
        ev.setHorario(horario);
        ev.setArea(area);
        ev.setLocalevento(localevento);
        ev.setConvidado(convidado);
        ev.setEmail(email);
        ev.setWhatsapp(whatsapp);
        ev.setParticipantes(participantes);
        String message = "";
        try {
            evdao.cadastrar(ev);
            message = "O evento foi cadastrado com sucesso!";
        } catch (ClassNotFoundException | SQLException ex) {
            message = "Não foi possível cadastrar o evento: " + ex.getMessage();
            System.out.println("Erro: " + ex.getMessage());
        }
        request.setAttribute("message", message);
        return "resultadocadastrar.jsp";

    }
}
