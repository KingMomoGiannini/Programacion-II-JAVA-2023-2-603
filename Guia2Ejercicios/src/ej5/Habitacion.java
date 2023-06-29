package ej5;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Habitacion {

    private int numero;
    private double precioPorDia;
    private boolean ocupada;
    private String nomCliente;
    private int cantDias;
    private ArrayList<Adicional> adicionales;

    public Habitacion(int numero, double precioPorDia) {
        this.numero = numero;
        this.precioPorDia = precioPorDia;
    }

    public Habitacion(int numero, double precioPorDia, boolean ocupada, String nomCliente, int cantDias) {
        this.numero = numero;
        this.precioPorDia = precioPorDia;
        this.ocupada = ocupada;
        this.nomCliente = nomCliente;
        this.cantDias = cantDias;
        adicionales = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }
    
    public boolean isOcupada() {
        return ocupada;
    }
    
    public double calcularTotal(){
        double total = 0;
        if (!adicionales.isEmpty()) {
            for (Adicional adicional : adicionales) {
                total += adicional.getPrecio();
            }
        }
        total =+ precioPorDia * cantDias;
        return total;
    }

    @Override
    public String toString() {
        return "-----------------\n"+"Habitacion:" 
                + "\n- nro = " + numero 
                + "\n- precio por dia =" + precioPorDia 
                + "\n- ocupada =" + ocupada 
                + "\n- nombre del cliente =" + nomCliente 
                + "\n- cantidad de dias de hospedaje =" + cantDias 
                + "\n- prestaciones adicionales = " + adicionales + ";\n";
    }
    
}