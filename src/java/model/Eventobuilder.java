/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Sergio
 */
public class Eventobuilder {
   public int id;
   public String evento;
   public String dia;
   public String horario;
   public String area;
   public String localevento;
   public String convidado;
   public String email;
   public String whatsapp;
   public int participantes;

    public void setId(int id) {
        this.id = id;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setLocalevento(String localevento) {
        this.localevento = localevento;
    }

    public void setConvidado(String convidado) {
        this.convidado = convidado;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    public void setParticipantes(int participantes) {
        this.participantes = participantes;
    }
   
   
   public Evento constroi (){
       return new Evento (id, evento, dia, horario,area, localevento,convidado,email,whatsapp,participantes);
   }
   
}
