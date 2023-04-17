/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ej1;

/**
 *
 * @author giann
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona p = new Persona("Sergio","Momo",1995);
        p.getNombreCompleto();
        p.mostrarEstado();
        p.edadActual();
        p.esMayor(20);
        p.cambioNombre("Yisas");
        p.mostrarEstado();
        p.cambioApellido("Jeoje");
        p.mostrarEstado();
        p.nuevoCompleto("Sebastian", "Giannini");
        p.mostrarEstado();
        
    }
    
}
