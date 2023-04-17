/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comportamientoobjetos;

/**
 *
 * @author giann
 */
public class CuentaBancaria {
    String CBU;
    String alias;
    double saldo;
    
    void mostrarDatos (){
        System.out.println(CBU + " " + alias + " " + saldo);
    }
    double obtenerSaldos(){
        return saldo;
    }
    void depositar(double monto){
        if(monto>0){
            saldo = saldo + monto;
        }
    }
    boolean saldoDisponible(double monto){
        return saldo>=monto;
    }
    void extraer (double monto){
        if( saldoDisponible(monto) ){
            saldo = saldo - monto;
        }
    }
}
