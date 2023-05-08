package co.edu.upb.quizAnalisis2;


import co.edu.upb.quizanalisis.quizanalisis.Tarea;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author informatica
 */
public class ConsoleView {
    public ArrayList<Tarea> tareas;
    
   public void verTareas(){
       for (Tarea tarea : tareas) {
           System.out.println("El titulo de la tarea es: "+ tarea.getTituloTarea());
           System.out.println("La descripcion de la tares es:"+tarea.getDescripcionTarea());
           
       }
           
       }
        
   }
   
    
   
   
