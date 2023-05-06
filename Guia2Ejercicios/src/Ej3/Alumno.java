package Ej3;
import java.util.ArrayList;

/**
 *
 * @author giann
 */
public class Alumno {
    
    private String nombre;
    private String DNI;
    private ArrayList<Evaluacion> evaluaciones;
    
    public Alumno(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
        evaluaciones = new ArrayList<>();
    }
    
    public void calcularPromedio (){
        double sumatoriaNotas = 0;
        int i;
        for (i = 0; i < evaluaciones.size(); i++) {
            if (evaluaciones.get(i).getNota() > 0) {
                sumatoriaNotas += evaluaciones.get(i).getNota();                
            }
        }
        System.out.println(sumatoriaNotas/3);
    }
    
    public void agregarNotaEvaluaciones(Evaluacion eval, int notaEval){
        if(notaEval>0){
            eval.setNota(notaEval);
            evaluaciones.add(eval);
        }
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", DNI=" + DNI + ", \nevaluaciones =" + evaluaciones +  "}\n";
    }
    
    
    
}
