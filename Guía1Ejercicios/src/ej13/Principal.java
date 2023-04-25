/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej13;

/**
 *
 * @author giann
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Posnet posnet = new Posnet();
        Persona p = new Persona("79123876","Sebastian","Giannini","48482410","sebastianGiannini@falsemodem.com");
        TarjetaDeCredito tc = new TarjetaDeCredito("Banco pingo","4580987645763789",15000,p,EntidadFinanciera.CASTERMARD); 
        
        System.out.println("Tarjeta antes del pago : ");
        System.out.println(tc);
        
        System.out.println("Ticket tras pagar...");
        Ticket ticketGenerado = posnet.efectuarPago(tc, 10000, 5);
        System.out.println(ticketGenerado);
        
        System.out.println("Tarjeta despues del pago: ");
        System.out.println(tc);
    }
    
}
