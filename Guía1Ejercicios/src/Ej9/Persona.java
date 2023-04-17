/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej9;

import Ej1.*;

/**
 *
 * @author giann
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int anioNacimiento;
    private Domicilio dom;

    public Persona(String nombre, String apellido, int anioNacimiento, Domicilio miCasa) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.anioNacimiento = anioNacimiento;
        dom = miCasa;
    }
    
    public void getNombreCompleto(){
        System.out.println(nombre + " " + apellido);
    }
    
    public void mostrarEstado(){
        System.out.println(toString());
    }
    
    public int edadActual(){
        int edad = 2023 - anioNacimiento;
        System.out.println("edad: " + edad);
        return edad;
    }
    
    public boolean esMayor(int eDada){
        if(edadActual()>eDada){
            System.out.println("Es mayor");
            return true;
        }
        else{
            System.out.println("Es menor");
            return false;
        }
    }
    
    public void cambioNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }
    
    public void cambioApellido(String nuevoApellido){
        apellido = nuevoApellido;
    }
    
    public void nuevoCompleto(String nuevoNombre, String nuevoApellido){
        nombre = nuevoNombre;
        apellido = nuevoApellido;
    }

    @Override
    public String toString() {
        return "nombre = " + nombre + ", apellido = " + apellido + ", anioNacimiento = " + anioNacimiento + ", " +dom;
    }
    
    
    
}
