/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1;

/**
 *
 * @author giann
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.nombre = "Sebastian";
        p1.apellido = "Giannini";
        p1.nacimiento = 1995;
        p1.getNombreCompleto();
        
        p1.getTodo();
        p1.getEdad();
        p1.getEsMayor();
        p1.setNombre("Lionel");
        System.out.println(p1.nombre);
        p1.setApellido("Messi");
        System.out.println(p1.apellido);
        p1.setNomCompleto("Francisco","Chiminelli");
        System.out.println(p1.nombre+ " " +p1.apellido);
    }
    
}
