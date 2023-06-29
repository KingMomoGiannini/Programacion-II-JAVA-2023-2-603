package ej6;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class ClonFlix {

    private ArrayList<Pelicula> peliculas;
    private ArrayList<Cliente> clientes;

    public ClonFlix() {
        clientes = new ArrayList<>();
        peliculas = new ArrayList<>();
    }
    
    public void agregarPeliculas(Pelicula pelicula){
        if (pelicula != null) {
            peliculas.add(pelicula);
        }
    }
    
    public void altaCliente(Cliente cliente1) {
        if (cliente1 != null) {
            clientes.add(cliente1);
        }
    }
    
    public String verPelicula(String DNI, String nomPelicula) {
        String mensaje = null;
        if ( (buscarClientePorDNI(DNI)!= null) && (buscarPelicula(nomPelicula) != null) ) {
            if(buscarClientePorDNI(DNI).esPremium() || !buscarPelicula(nomPelicula).isPremium() ){
                mensaje = "ALQUILER_OK";
            }
        }
        else if(buscarClientePorDNI(DNI) == null){
            mensaje = "CLIENTE_INEXISTENTE";
        }
        else if(buscarPelicula(nomPelicula) == null){
            mensaje = "CONTENIDO_INEXISTENTE";
        }
        else if(buscarClientePorDNI(DNI).esDeudor()){
            mensaje = "CLIENTE_DEUDOR";
        }
        else if (!buscarClientePorDNI(DNI).esPremium() && buscarPelicula(nomPelicula).isPremium() ) {
            mensaje = "CONTENIDO_NO_DISPONIBLE";
        }
        return mensaje;
    }
    
    public void darDeBaja(String DNI) {
        if (!clientes.isEmpty()) {
            for (Cliente cliente : clientes) {
                if (cliente.getDNI().equals(DNI)) {
                    clientes.remove(cliente);
                }
            }
        }
    }
    
    public Cliente buscarClientePorDNI(String DNI ){
        Cliente elCliente = null;
        if ( DNI!=null && !clientes.isEmpty()) {
            for (Cliente cliente : clientes) {
                if (cliente.getDNI().equals(DNI)) {
                    elCliente = cliente;
                }
            }
        }
        return elCliente;
    }
    
    public Pelicula buscarPelicula(String nombrePelicula){
        Pelicula laPelicula = null;
        if (!peliculas.isEmpty()) {
            for (Pelicula pelicula : peliculas) {
                if (nombrePelicula.equals(pelicula.getNombre())) {
                    laPelicula = pelicula;
                }
            }
        }
        return laPelicula;
    }
    
}