/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author informatica
 */

import java.util.Scanner;

import java.util.ArrayList;

public class TaskController {
private ArrayList tareas;
private Scanner scanner;

public TaskController() {
this.tareas = new ArrayList<>();
this.scanner = new Scanner(System.in);
}

public void crearTarea() {
System.out.println("Ingrese el titulo de la tarea:");
String tituloTarea = scanner.nextLine();
System.out.println("Ingrese la descripcion de la tarea:");
String descripcionTarea = scanner.nextLine();
System.out.println("Ingrese el estado de la tarea:");
System.out.println("1. La tarea esta completada");
System.out.println("2. La tarea esta pendiente:");
int estadoTarea = scanner.nextInt();
Tarea tarea = new Tarea(tituloTarea, descripcionTarea, estadoTarea);
tareas.add(tarea);
System.out.println("La tarea se ha creado exitosamente.");
}

public void leerTareas() {
if (tareas.size() == 0) {
System.out.println("No hay tareas registradas.");
} else {
System.out.println("Lista de tareas:");
for (int i = 0; i < tareas.size(); i++) {
Tarea tarea = tareas.get(i);
System.out.println("Tarea #" + (i+1) + ": " + tarea.getTituloTarea());
System.out.println("Descripcion: " + tarea.getDescripcionTarea());
System.out.println("Estado: " + (tarea.getEstadoTarea() == 1 ? "Completada" : "Pendiente"));
}
}
}

public void actualizarTarea() {
if (tareas.size() == 0) {
System.out.println("No hay tareas registradas.");
return;
}

System.out.println("Ingrese el numero de la tarea que desea actualizar:");
int numeroTarea = scanner.nextInt();
scanner.nextLine();
if (numeroTarea < 1 || numeroTarea > tareas.size()) {
System.out.println("Numero de tarea invalido.");
return;
}

Tarea tarea = tareas.get(numeroTarea-1);

System.out.println("Ingrese el nuevo titulo de la tarea:");
String nuevoTituloTarea = scanner.nextLine();
System.out.println("Ingrese la nueva descripcion de la tarea:");
String nuevaDescripcionTarea = scanner.nextLine();
System.out.println("Ingrese el nuevo estado de la tarea:");
System.out.println("1. La tarea esta completada");
System.out.println("2. La tarea esta pendiente:");
int nuevoEstadoTarea = scanner.nextInt();

tarea.tituloTarea = nuevoTituloTarea;
tarea.descripcionTarea = nuevaDescripcionTarea;
tarea.estadoTarea = nuevoEstadoTarea;

System.out.println("La tarea se ha actualizado exitosamente.");
}

public void eliminarTarea() {
if (tareas.size() == 0) {
System.out.println("No hay tareas registradas.");
return;
}

System.out.println("Ingrese el numero de la tarea que desea eliminar:");
int numeroTarea = scanner.nextInt();
scanner.nextLine();
if (numeroTarea < 1 || numeroTarea > tareas.size()) {
System.out.println("Numero de tarea invalido.");
return;
}

Tarea tarea = tareas.get(numeroTarea-1);

}
}