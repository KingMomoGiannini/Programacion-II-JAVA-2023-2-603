/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1;

/**
 *
 * @author giann
 */
public class Persona {
    String nombre;
    String apellido;
    int nacimiento;
    int edad;
    
    void getNombreCompleto(){
        System.out.println("Nombre: " + nombre + "; Apellido: "+ apellido);
    }
    
    void getTodo(){
        System.out.println(nombre + " " + apellido + " " + nacimiento);
    }
    
    void getEdad(){
        edad = 2023 - nacimiento;
        System.out.println("Edad actual : " + edad);
    }
    
    void getEsMayor(){
        int edadDada = 30;
        if(edad > edadDada){
            System.out.println("Es mayor");
        }
        else{
            System.out.println("Es menor que la edad dada");
        }
    }
    
    void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    void setNomCompleto(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
}
