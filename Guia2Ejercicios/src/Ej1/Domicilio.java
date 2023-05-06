package Ej1;

/**
 *
 * @author giann
 */
public class Domicilio {
    private String calle;
    private int numero;
    private String barrio;

    public Domicilio(String calle, int numero, String barrio) {
        this.calle = calle;
        this.numero = numero;
        this.barrio = barrio;
    }

    public String getBarrio() {
        return barrio;
    }    
    
    @Override
    public String toString() {
        return "Domicilio{" + "calle = " + calle + ", altura = " + numero + ", barrio = " + barrio + '}';
    }
    
    
    
}
