/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ej3;

/**
 *
 * @author giann
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaBancaria p1 = new CuentaBancaria("Cuenta corriente");
        p1.getDatos();
        p1.getSaldo();
        p1.setDepositar(400);
        p1.getSaldo();
        p1.setExtraccion(500);
        p1.getUltimosCBU(3);
        p1.getDatos();    
    }
}
   