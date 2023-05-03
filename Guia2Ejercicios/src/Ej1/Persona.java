package Ej1;

/**
 *
 * @author giann
 */
public class Persona {
    private String DNI;
    private String nombre;
    private String apellido;
    private Domicilio dom;

    public Persona(String DNI, String nombre, String apellido, Domicilio dom) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dom = dom;
    }

    public String getDNI() {
        return DNI;
    }

    public String getBarrioDom() {
        return dom.getBarrio();
    }

    public void setDom(Domicilio dom) {
        this.dom = dom;
    }
    
    
    
    @Override
    public String toString() {
        return "Persona{" + "DNI=" + DNI + ", nombre=" + nombre + ", apellido=" + apellido + ", dom=" + dom + '}';
    }
    
    
    
}
