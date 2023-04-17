/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej3;

/**
 *
 * @author giann
 */
public class CuentaBancaria {
    private int CBU;
    private String tipoCaja;
    private double saldo;

    public CuentaBancaria(int CBU, String tipoCaja, double saldo) {
        this.CBU = CBU;
        this.tipoCaja = tipoCaja;
        this.saldo = saldo;
    }       

    public void getDatos() {
        System.out.println("CBU: "+CBU);
        System.out.println("Tipo de cuenta: " + tipoCaja);
    }

    public void getSaldo() {
        System.out.println("Saldo: $" + saldo);
    }
    
    public void depositar(double monto){
        saldo = saldo + monto;
        System.out.println("Se han depositado $ " + monto);
    }
    
    public void extraer(double monto)  {
        if (tipoCaja.equals("Cuenta corriente")|| saldo >= monto){
            saldo = saldo - monto;
            System.out.println("Se han extraído $ " + monto);
            System.out.println("Saldo actual: $ " + saldo);
        }
        else {
            System.out.println("El saldo es insuficiente para el tipo de cuenta que posee.");
        }
    }
    
    public void getDigCBU(){
        int CBUdig;
        CBUdig = CBU % 1000;
        System.out.println("Ultimos 3 digitos del CBU: " + CBUdig);
    }
    
}
