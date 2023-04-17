/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3;

/**
 *
 * 3) Modelá la clase CuentaBancaria, la cual posea como atributos la clave bancaria uniforme (CBU), 
el tipo (caja de ahorro o cuenta corriente) y el saldo (inicialmente en 0). Luego, implementá métodos 
que permitan:
▪ Obtener el saldo actual.
▪ Depositar dinero en la cuenta (actualizando el saldo).
▪ Extraer dinero de la cuenta (actualizando el saldo). Solo puede quedar en saldo negativo si es 
cuenta corriente.
▪ Obtener los últimos 3 dígitos del CBU
 

 * @author giann
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CuentaBancaria p1 = new CuentaBancaria(802134594,"Cuenta corriente",0.00);
        p1.getDatos();
        p1.getSaldo();
        p1.depositar(400);
        p1.extraer(500);
        p1.getDigCBU();
        
    }
    
}
