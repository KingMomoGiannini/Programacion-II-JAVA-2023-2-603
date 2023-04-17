/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ej9;

/**
 *
 * @author giann
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Domicilio d = new Domicilio("Calle falsa",123,"Santa Raja");
        Persona p = new Persona("Jorgito","Tararira",1990,d);
        p.mostrarEstado();
    }
    
}
