package parcial;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class NaveCruiser extends NaveEspacial {

    private int cantPasajeros;

    public NaveCruiser(int cantPasajeros, String planetaOrigen, int cantTripulantes) {
        super(planetaOrigen, cantTripulantes);
        this.cantPasajeros = cantPasajeros;
    }
    
    public double obtenerPorcentajePasajeros(){
        int total = cantPasajeros + super.getCantTripulantes();
        return (cantPasajeros*100)/total;
    }
    
    @Override
    public boolean puedeEstacionar(){
        boolean estaciona = false;
        if (cantPasajeros > 0) {
            estaciona = true;
        }
        else{
            System.out.println("La nave que desea estacionar no esta en condiciones de hacerlo.");
        }
        return estaciona;
    }
    
    @Override
    public String getTipo() {
        return "Cruiser";
    }
    
    @Override
    public String informarManifiesto() {
        return "------------\nManifiesto Nave Cruiser:\n " 
                + "- Planeta de origen: " + super.getPlanetaOrigen()
                + "\n- Cantidad de tripulantes: " + super.getCantTripulantes()
                + "\n- Porcentaje de pasajeros respecto al total : " +  obtenerPorcentajePasajeros()
                + "\n";
    }

}