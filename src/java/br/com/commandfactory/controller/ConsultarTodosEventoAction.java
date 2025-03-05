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
public class ConsultarTodosEventoAction implements ICommand {
     @Override
    public String executar(HttpServletRequest request, HttpServletResponse response) {
        EventoDAO evdao = new EventoDAO();
        List<Evento> lev = new ArrayList<Evento>();
        try {
            lev = evdao.consultarTodos();
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
        request.setAttribute("lev", lev);
        return "resultadoconsultartodos.jsp";
    }
}
