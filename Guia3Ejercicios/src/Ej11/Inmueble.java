package Ej11;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Inmueble {

    private String domicilio;
    private double superficie;
    private int cantAmbientes;
    private double precio;
    private ArrayList<Interesado> interesados;

    public Inmueble(String domicilio, double superficie, int cantAmbientes, double precio) {
        this.domicilio = domicilio;
        this.superficie = superficie;
        this.cantAmbientes = cantAmbientes;
        this.precio = precio;
        interesados = new ArrayList<>();
    }
    
    public void listarInteresados(Interesado interesado){
        if(interesado != null){
            interesados.add(interesado);
        }
    }

    public String getDomicilio() {
        return domicilio;
    }
    
    public void setPrecio(double precio) {
        double montoAnterior = this.precio;
        if (precio > 0) {
            this.precio = precio;
        }
        String mensaje = "El inmueble " + toString()  + "por el que ha demostrado\n" +
        "interés cambió su precio de usd$"+ montoAnterior + " a usd$" + this.precio;
        for (Interesado interesado : interesados) {
            System.out.println(interesado.recepcionMensaje(mensaje));
            System.out.println("----------------------------------\n");
        }
    }

    @Override
    public String toString() {
        return domicilio + ", " + superficie + " m2, "+ cantAmbientes + " ambientes ";
    }

}