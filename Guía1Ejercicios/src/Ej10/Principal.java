/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ej10;

/**
 10) Refactoreá la clase CuentaBancaria del ejercicio 3), agregando el atributo titular, que 
representa a la persona titular de la cuenta, y el atributo fechaDeApertura

* 
 * @author giann
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fecha f = new Fecha(12,4,2017);
        Persona p = new Persona("Juan","Pelotas");
        CuentaBancaria c = new CuentaBancaria("Caja de ahorros",p,f);
        
        c.getDatos();
        
    }
    
}
