/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade;

import dao.EventoDAO;
import java.sql.SQLException;
import model.Evento;

/**
 *
 * @author Sergio
 */
public class jframefacade {
     public String Cadastrar(Evento ev) throws ClassNotFoundException {



        EventoDAO evdao = new EventoDAO ();
        String message = "";
        try {
            evdao.cadastrar(ev);
            message = "CADATRADO COM SUCESSO";
        } catch (SQLException ex) {
            message = "CADASTRO NÃO REALIZADO: " + ex.getMessage();
            System.out.println("Erro: " + ex.getMessage());
        }
        return message;


    }

      public String Deletar(Evento ev) throws ClassNotFoundException, SQLException {



        EventoDAO evdao = new EventoDAO ();
        String message = "";
        evdao.excluir(ev);
        message = "DELETADO COM SUCESSO";
        return message;


    }
}
