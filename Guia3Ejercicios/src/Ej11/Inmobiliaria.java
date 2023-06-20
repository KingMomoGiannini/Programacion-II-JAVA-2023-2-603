package Ej11;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Inmobiliaria implements Interesado {

    private String razonSocial;
    private String dirEmail;
    private double porcComisionVenta;
    private ArrayList<Inmueble> inmuebles;
    private ArrayList<Persona> clientes;

    public Inmobiliaria(double porcComisionVenta, String nombre, String dirEmail) {
        razonSocial = nombre;
        this.dirEmail = dirEmail;
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
    
    public Inmueble getInmueble(Inmueble propiedad){
        Inmueble prop = null;
        for (Inmueble inmueble : inmuebles) {
            if (inmueble == propiedad) {
                prop = inmueble;
            }
        }
        return prop;
    }
    
    
    @Override
    public String recepcionMensaje(String mensaje) {
        return razonSocial + ":\nHemos recibido un email a nuestra casilla " +
                dirEmail + " con el mensaje: \n"+ mensaje;
    }

}