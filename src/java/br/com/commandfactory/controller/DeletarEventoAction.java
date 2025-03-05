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
 public class DeletarEventoAction implements ICommand {
    @Override
    public String executar(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("txtid"));
        Evento ev = new Evento();
        EventoDAO evdao = new EventoDAO();
        ev.setId(id);
        String message = "";
        try {
            evdao.excluir(ev);
            message = "Evento deletado com sucesso";
        } catch (ClassNotFoundException | SQLException ex) {
            message = "Não foi possível deletar o evento: " + ex.getMessage();
            System.out.println("Erro: " + ex.getMessage());
        }
        request.setAttribute("message", message);
        return "resultadoexcluir.jsp";
    }
}
