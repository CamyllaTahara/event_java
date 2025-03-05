/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.commandfactory.controller;

import decorator.EmailDecorator;
import decorator.IDecorator;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sergio
 */
public class NotifEventoAction implements ICommand {
    public String executar(HttpServletRequest request, HttpServletResponse response) {
        
         String[] array = request.getParameterValues("cbnotify");
         
         IDecorator base = new EmailDecorator();
         IDecorator evento10;
         String ax = base.send();
         
        
          try {   
              
         
         for (String x : array) {
             
             String nomeDaClasse = "decorator." + x + "Decorator";
             
             
             Class[] t = new Class[1] ;  
             t[0] = IDecorator.class;
             
             
             
             Class classe = Class.forName(nomeDaClasse);
             
             evento10 = (IDecorator) classe.getDeclaredConstructor(t).newInstance(base);
             base = evento10;
             ax = evento10.send();
                 
             } 
         
         
         
          } 
          
          catch (ClassNotFoundException ex) {
                 Logger.getLogger(NotifEventoAction.class.getName()).log(Level.SEVERE, null, ex);
             } catch (NoSuchMethodException ex) {
            Logger.getLogger(NotifEventoAction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            Logger.getLogger(NotifEventoAction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(NotifEventoAction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(NotifEventoAction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(NotifEventoAction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(NotifEventoAction.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        
          
         
         
         
         
         request.setAttribute("msg", ax);
         
         return "resultadocheck.jsp";
        
    };
    
}
