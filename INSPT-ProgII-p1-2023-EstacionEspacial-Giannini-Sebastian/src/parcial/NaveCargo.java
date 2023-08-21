package parcial;


/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class NaveCargo extends NaveEspacial {

    private Carga detalleCarga;

    public NaveCargo(Carga detalleCarga, String planetaOrigen, int cantTripulantes) {
        super(planetaOrigen, cantTripulantes);
        this.detalleCarga = detalleCarga;
    }
    
    @Override
    public boolean puedeEstacionar(){
        boolean estaciona = false;
        if (detalleCarga.getVolumen()<= 100) {
            estaciona = true;
        }
        else{
            System.out.println("La nave que desea estacionar no esta en condiciones de hacerlo.");
        }    
        return estaciona;
    }

    @Override
    public String informarManifiesto() {
        return "------------\nManifiesto Nave Cargo:\n " 
                + "- Planeta de origen: " + super.getPlanetaOrigen()
                + "\n- Detalle de la carga: " + detalleCarga 
                + "\n- Cantidad de tripulantes: " + super.getCantTripulantes()
                + "\n";
    }

    @Override
    public String getTipo() {
        return "Cargo";
    }

}