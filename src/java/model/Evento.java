
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Sergio
 */
public class Evento {
    
    int id;
    String evento;
    String dia;
    String horario;
    String area;
    String localevento;
    String convidado;
    String email;
    String whatsapp;
    int participantes;

    
    public Evento ( String evento, String dia, String horario, String area, String localevento, String convidado, String email, String whatsapp, int participantes){
        this.evento=evento;
        this.dia=dia;
        this.horario=horario;
        this.area=area;
        this.localevento=localevento;
        this.convidado=convidado;
        this.email=email;
        this.whatsapp=whatsapp;
        this.participantes=participantes;
    }
    
    
    
    
    
    public Evento (int id, String evento, String dia, String horario, String area, String localevento, String convidado, String email, String whatsapp, int participantes){
        this.id=id;
        this.evento=evento;
        this.dia=dia;
        this.horario=horario;
        this.area=area;
        this.localevento=localevento;
        this.convidado=convidado;
        this.email=email;
        this.whatsapp=whatsapp;
        this.participantes=participantes;
    }
    
    public Evento() {
        
    }
    
    
    public int getId() {
        return id;
    }

   
 
    public void setId(int id) {
        this.id = id;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getLocalevento() {
        return localevento;
    }

    public void setLocalevento(String localevento) {
        this.localevento = localevento;
    }

    public String getConvidado() {
        return convidado;
    }

    public void setConvidado(String convidado) {
        this.convidado = convidado;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }
    

    public int getParticipantes() {
        return participantes;
    }

    public void setParticipantes(int participantes) {
        this.participantes = participantes;
    }
    
    
    
    
}
