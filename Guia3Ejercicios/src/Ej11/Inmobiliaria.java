package Ej11;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Inmobiliaria extends Cliente implements Interesado {

    private double porcComisionVenta;
    private ArrayList<Inmueble> inmuebles;
    private ArrayList<Persona> clientes;

    public Inmobiliaria(double porcComisionVenta, String nombre, String dirEmail) {
        super(nombre, dirEmail);
        this.porcComisionVenta = porcComisionVenta;
        inmuebles = new ArrayList<>();
        clientes = new ArrayList<>();
        
    }
    
    public void agregarInmueble(Inmueble in){
        if(in != null){
            inmuebles.add(in);
        }
    }
    
    public void agregarCliente(Persona cliente){
        if (cliente != null) {
            clientes.add(cliente);
        }
    }
    
    @Override
    public String recepcionMensaje(String mensaje) {
        return nombre + ":\nHemos recibido un email a nuestra casilla " +
                dirEmail + " con el mensaje: \n"+ mensaje;
    }

}