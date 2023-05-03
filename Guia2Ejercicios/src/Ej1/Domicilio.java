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

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }
    
    
    
    @Override
    public String toString() {
        return "Domicilio{" + "calle=" + calle + ", numero=" + numero + ", barrio=" + barrio + '}';
    }
    
    
    
}
