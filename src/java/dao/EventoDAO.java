/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Evento;
import util.FabricaConexao;

/**
 *
 * @author Sergio
 */

public class EventoDAO {

    public void cadastrar(Evento evento) throws ClassNotFoundException, SQLException {

        Connection conexao = FabricaConexao.getConexao();
        String sql = "INSERT INTO cadastrar (evento, dia, horario, area, localevento, convidado, email, whatsapp, participantes) VALUES (?,?,?,?,?,?,?,?,?)";
        PreparedStatement pstmt = conexao.prepareStatement(sql);

        pstmt.setString(1, evento.getEvento());
        pstmt.setString(2, evento.getDia());
        pstmt.setString(3, evento.getHorario());
        pstmt.setString(4, evento.getArea());
        pstmt.setString(5, evento.getLocalevento());
        pstmt.setString(6, evento.getConvidado());
        pstmt.setString(7,evento.getEmail());
        pstmt.setString(8, evento.getWhatsapp());
        pstmt.setInt(9, evento.getParticipantes());
        pstmt.execute();
        conexao.close();
    }

    public void excluir(Evento evento) throws ClassNotFoundException, SQLException {

        Connection conexao = FabricaConexao.getConexao();
        String sql = "DELETE FROM cadastrar WHERE id=?";
        PreparedStatement pstmt = conexao.prepareStatement(sql);
        pstmt.setInt(1, evento.getId());
        pstmt.execute();
        conexao.close();
    }

    public void editar(Evento evento) throws ClassNotFoundException, SQLException {
        Connection conexao = FabricaConexao.getConexao();
        String sql = "UPDATE cadastrar SET evento=?, dia=?, horario=?, area=?, localevento=?, convidado=?,email=?,whatsapp=?,participantes=? WHERE id=?";
        PreparedStatement pstmt = conexao.prepareStatement(sql);

       
        pstmt.setString(1, evento.getEvento());
        pstmt.setString(2, evento.getDia());
        pstmt.setString(3, evento.getHorario());
        pstmt.setString(4, evento.getArea());
        pstmt.setString(5, evento.getLocalevento());
        pstmt.setString(6, evento.getConvidado());
        pstmt.setString(7,evento.getEmail());
        pstmt.setString(8, evento.getWhatsapp());
        pstmt.setInt(9, evento.getParticipantes());
        pstmt.setInt(10, evento.getId());
        pstmt.executeUpdate(); 
        conexao.close();
    }

    public List<Evento> consultarTodos() throws ClassNotFoundException, SQLException {
        Connection conexao = FabricaConexao.getConexao();
        String sql = "SELECT * FROM cadastrar";
        PreparedStatement pstmt = conexao.prepareStatement(sql);
        ResultSet resultado = pstmt.executeQuery();

        List<Evento> lca = new ArrayList<Evento>();
        while (resultado.next()) {
            Evento ev = new Evento();
            ev.setId(resultado.getInt("id"));
            ev.setEvento(resultado.getString("evento"));
            ev.setDia(resultado.getString("dia"));
            ev.setHorario(resultado.getString("horario"));
            ev.setArea(resultado.getString("area"));
            ev.setLocalevento(resultado.getString("localevento"));
            ev.setConvidado(resultado.getString("convidado"));
            ev.setEmail(resultado.getString("email"));
            ev.setWhatsapp(resultado.getString("whatsapp"));
            ev.setParticipantes(resultado.getInt("participantes"));

            lca.add(ev);

        }
        conexao.close();
        return lca;
    }

    public Evento consultarById(Evento ev) throws ClassNotFoundException, SQLException {
        Connection conexao = FabricaConexao.getConexao();
        String sql = "SELECT * FROM cadastrar WHERE id = ?";
        PreparedStatement pstmt = conexao.prepareStatement(sql);
        pstmt.setInt(1, ev.getId());
        ResultSet resultado = pstmt.executeQuery();
        if (resultado.next()) {
            ev.setId(resultado.getInt("id"));
            ev.setEvento(resultado.getString("evento"));
            ev.setDia(resultado.getString("dia"));
            ev.setHorario(resultado.getString("horario"));
            ev.setArea(resultado.getString("area"));
            ev.setLocalevento(resultado.getString("localevento"));
            ev.setConvidado(resultado.getString("convidado"));
            ev.setEmail(resultado.getString("email"));
            ev.setWhatsapp(resultado.getString("whatsapp"));
            ev.setParticipantes(resultado.getInt("participantes"));

        } else {
            ev = null;
        }
        conexao.close();
        return ev;
    }
}
