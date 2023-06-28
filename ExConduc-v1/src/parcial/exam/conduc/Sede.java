package parcial.exam.conduc;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Sede {

    private ArrayList<Evaluable> evaluables;

    public Sede() {
        evaluables = new ArrayList<>();
    }
    
    public double obtenerPorcentajeReprobados(ArrayList<Examen> examenes) {//De la lista de examenes obtenemos los reprobados.
        int contReprobados = 0;
        double porcentaje;
        for (Examen examen : examenes) {
            if (!examen.aprueba()) {
                contReprobados++;
            }
        }
        porcentaje = (contReprobados*100)/examenes.size();//calculamos el porcentaje
        return porcentaje;
    }
    
    public double promedioTiempo() {//Del ArrayList de evaluables conseguimos los examenes de auto aprobados
        double acumTiempo = 0;
        int contAprobados = 0;
        for (Evaluable evaluable : evaluables) {
            if (evaluable instanceof ExamenDeAuto && evaluable.aprueba()) {
                acumTiempo += obtenerTiempoCircuitos((ExamenDeAuto) evaluable);
                contAprobados++;
            }
        }
        return acumTiempo/contAprobados;//Retornamos el promedio del tiempo de los examenes aprobados (de auto)
    }
    
    public double obtenerTiempoCircuitos(ExamenDeAuto examen){
        return examen.getCircuito().getTiempo();
    }

    public Informe obtenerInforme() {
        ArrayList<Examen> examenes = new ArrayList<>();//Creamos el la lista de examenes que obtendremos de la lista de evaluables
        for (Evaluable evaluable : evaluables) {
            if (evaluable instanceof Examen) {
                examenes.add((Examen)evaluable);
            }
        }
        return new Informe(obtenerPorcentajeReprobados(examenes),promedioTiempo());//Retornamos el informe
    }

}