/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej13;

/**
 *
 * @author giann
 */
public class TarjetaDeCredito {
    private String entidadBancaria;
    private String numero;
    private double saldo;
    private Persona titular;
    private EntidadFinanciera entidadFinanciera;

    public TarjetaDeCredito(String entidadBancaria, String numero, double saldo, Persona titular, EntidadFinanciera entidadFinanciera) {
        this.entidadBancaria = entidadBancaria;
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
        this.entidadFinanciera = entidadFinanciera;
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "entidadBancaria=" + entidadBancaria + ", numero=" + numero + ", saldo=" + saldo + ", titular=" + titular + ", entidadFinanciera=" + entidadFinanciera + '}';
    }
    
    
    
    
}
