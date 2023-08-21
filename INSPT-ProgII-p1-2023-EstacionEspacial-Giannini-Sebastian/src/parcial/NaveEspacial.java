package parcial;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public abstract class NaveEspacial {

    private String planetaOrigen;
    private int cantTripulantes;

    public NaveEspacial(String planetaOrigen, int cantTripulantes) {
        this.planetaOrigen = planetaOrigen;
        this.cantTripulantes = cantTripulantes;
    }

    public String getPlanetaOrigen() {
        return planetaOrigen;
    }

    public int getCantTripulantes() {
        return cantTripulantes;
    }
    
    public abstract String informarManifiesto();
    
    
    public abstract boolean puedeEstacionar();
    public abstract String getTipo();
}