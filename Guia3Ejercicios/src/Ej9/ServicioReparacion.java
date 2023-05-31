package Ej9;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class ServicioReparacion extends Servicio {

    private static final double VALOR_HORA = 180;//Se repite en ambos tipos de servicio, con valores constantes diferentes
    private static final int DIFICULTAD_MIN = 1;//No se usan, ni DIFICULTAD MIN ni DIFICULTAD MAX
    private static final int DIFICULTAD_MAX = 5;//pero las dejo para refactorear a futuro
    private int dificultad;

    public ServicioReparacion(int dificultad, int cantHoras, Matematica calculo) {
        super(cantHoras, calculo);
        this.dificultad = dificultad;
    }

    public int getDificultad() {
        return dificultad;
    }
    
    public boolean reparacionSencilla(){
        boolean validar = false;
        if(dificultad < 2){
            validar = true;
        }
        return validar;
    }
    
    
    @Override
    public double montoDeFacturacion(){
        double costoTotal = VALOR_HORA * super.getCantHoras();
        if (dificultad > 3) {
            costoTotal = super.getCalculo().costoServicio(costoTotal);
        }
        costoTotal += super.getCalculo().IVA(costoTotal)/2;
        return costoTotal;
    }



}