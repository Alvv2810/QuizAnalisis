/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.upb.quizanalisis.quizanalisis;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author informatica
 */
public class Tarea {
    
    Scanner scanner= new Scanner(System.in);
   String tituloTarea;
   String descripcionTarea;
   int estadoTarea;
   public ArrayList<Tarea> tareas;


    public String getTituloTarea() {
        return tituloTarea;
    }

    public String getDescripcionTarea() {
        return descripcionTarea;
    }

    public int getEstadoTarea() {
        return estadoTarea;
    }
   
   
   public Tarea(String tituloTarea,  String descripcionTarea, int estadoTarea){
       this.tituloTarea= tituloTarea;
       this.descripcionTarea= descripcionTarea;
       this.estadoTarea= estadoTarea;
   }
   
   public void ingresarTarea(){
       System.out.println("Ingrese el titulo de la tarea:");
       tituloTarea= scanner.nextLine();
       System.out.println("Ingrese la descripcion de la tarea:");
       descripcionTarea=scanner.nextLine();
       System.out.println("Ingrese el estado de la tarea:");
       System.out.println("1.La tarea esta completada");
       System.out.println("2.La tarea esta pendiente:");
       estadoTarea=scanner.nextInt();
       
   }
  
    public void agregarTarea(Tarea tarea) {
       tareas.add(tarea);
   }

}
