package ej6;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Cliente {

    private String DNI;
    private String nombre;
    private double saldo;
    private Servicio servicio;

    public Cliente(String DNI, String nombre, double saldo, Servicio servicio) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.saldo = saldo;
        this.servicio = servicio;
    }

    public String getDNI() {
        return DNI;
    }
    
    public boolean esDeudor() {
        return saldo < 0;
    }
    
    public boolean esPremium(){
        return Servicio.PREMIUM.equals(this.servicio);
    }
    
    public double obtenerSaldo() {
        return saldo;
    }
}