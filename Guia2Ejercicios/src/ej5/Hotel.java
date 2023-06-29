package ej5;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Hotel {

    private String nombre;
    private String direccion;
    private ArrayList<Habitacion> habitaciones;

    public Hotel(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        habitaciones = new ArrayList<>();
    }
    
    public ArrayList<Habitacion> obtenerHabitacionesDisponibles(){
        ArrayList<Habitacion> disponibles = new ArrayList<>();
        if (!habitaciones.isEmpty()) {
            for (Habitacion habitacion : habitaciones) {
                if (!habitacion.isOcupada()) {
                    disponibles.add(habitacion);
                }
            }
        }
        return disponibles;
    }
    
    public double realizarCheckout(int numHabitacion){
        double montoAAbonar = -1;
        for (Habitacion habitacion : habitaciones) {
            if ((habitacion.getNumero() == numHabitacion) && habitacion.isOcupada()) {
                montoAAbonar = habitacion.calcularTotal();
            }
        }
        return montoAAbonar;
    }
}