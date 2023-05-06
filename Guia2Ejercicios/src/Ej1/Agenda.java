package Ej1;

import java.util.ArrayList;

/**
 * @author giann
 */
public class Agenda {
    
    private ArrayList<Persona> personas;

    public Agenda() {
        this.personas = new ArrayList<>();
    }
    
//************************************************
    
    public void listarPersonas(){
        if (personas.isEmpty()) {
            System.out.println("No hay personas.");
        }
        for (int i = 0; i < personas.size(); i++) {
            System.out.println(personas.get(i));
        }
        System.out.println(" ");
    }
    
    public Persona devolverUltimo(){
        return this.personas.get(personas.size()-1);
    }
//    
    public Persona buscarPersona(String dni){
        for (int i = 0; i < personas.size(); i++) {
            if(dni.equals(personas.get(i).getDNI())){
                return personas.get(i);
            }
        }
        return null;
    }
//    
    public boolean agregarPersona (Persona persona){
        if(persona != null && distintoDNI(persona.getDNI())){
            personas.add(persona);
            return true;
        }
        else{
            System.out.println("La persona con DNI " + persona.getDNI() + " no se agrego a la agenda.\n");
            System.out.println("DNI repetido.");
            return false;
        }
    }
//    
    public Persona removerPersona(String dni){
        for (int i = 0; i < personas.size(); i++) {
            if(dni.equals(personas.get(i).getDNI())){
                
                Persona persona = personas.get(i);
                personas.remove(i);
                return persona;
            }
        }
        return null;
    }
//    
    public boolean modificarDomicilio(String dni, Domicilio dom){
        for (int i = 0; i < personas.size(); i++) {
            if (dni.equals(personas.get(i).getDNI())) {
                personas.get(i).setDom(dom);
                return true;
            }
        }
        return false;
    }
//    
    public Persona obtenerPorBarrio(String barrio){
        for (int i = 0; i < personas.size(); i++) {
            if (barrio.equals(personas.get(i).getBarrioDom())) {
                System.out.println("Barrio: " + barrio +" --- "+ personas.get(i) + "\n" );
                return personas.get(i);
            }
        }
        return null;
    }
    
    public void vaciar(){
        
        for (int i = 0 ; i < personas.size(); i++) {
            personas.remove(i);
            i--;
        }
        
    }
   
//    ***************************************
    
    private boolean distintoDNI(String dni){
        for (int i = 0; i < personas.size(); i++) {
            if(dni.equals(personas.get(i).getDNI())){
                System.out.println("Ya existe alguien con el mismo DNI en la lista.\n");
                return false;
            }
        }
        return true;
    }
}
