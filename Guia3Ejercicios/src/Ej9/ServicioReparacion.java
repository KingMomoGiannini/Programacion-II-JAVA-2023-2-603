package Ej9;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class ServicioReparacion extends Servicio {

    private static final double VALOR_HORA = 180;//Se repite en ambos tipos de servicio, con valores constantes diferentes
    private static final int DIFICULTAD_MIN = 3;//No se usan, ni DIFICULTAD MIN ni DIFICULTAD MAX
    private static final int DIFICULTAD_MAX = 5;//pero las dejo para refactorear a futuro
    private int dificultad;

    public ServicioReparacion(int dificultad, int cantHoras) {
        super(cantHoras);
        this.dificultad = dificultad;
    }

    @Override
    public double getVALOR_HORA() {
        return VALOR_HORA;
    }

    
    public int getDificultad() {
        return dificultad;
    }
    
    @Override
    public double getPrecio(){
        double precio = super.getPrecio();
        if (dificultad >= DIFICULTAD_MIN) {
            precio = Matematica.sumarPorcentaje(precio,25);
        }
        return precio;
    }
    
    public boolean reparacionSencilla(){
        boolean validar = false;
        if(dificultad < 2){
            validar = true;
        }
        return validar;
    }
    
}