package Ej3;
import java.util.ArrayList;

/**
 * @author giann
 */
public class Curso {
    
    private String codigo;
    private String titulo;
    private int cantHoras;
    private ArrayList<Alumno> alumnosInscriptos;

    public Curso(String codigo, String titulo, int cantHoras) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.cantHoras = cantHoras;
        alumnosInscriptos = new ArrayList<>();
    }
    
    public ArrayList<Alumno> buscarAlumnosPorEncimaDe(double promedio) {
        ArrayList<Alumno> alumnos = new ArrayList<>();
        for (int i = 0; i < alumnosInscriptos.size(); i++) {
            if (alumnosInscriptos.get(i).calcularPromedio() > promedio) {
                alumnos.add(alumnosInscriptos.get(i));
            }
        }
        return alumnos;
    }
    
    public void agregarAlumno(Alumno alu){
        if (alu != null) {
            alumnosInscriptos.add(alu);
        }
    }

    public String getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "Curso { " + "codigo = " + codigo + ", titulo = " + titulo + ", cantidad de horas = " + cantHoras + ", \nAlumnos Inscriptos = \n" + alumnosInscriptos + '}';
    }
    
}
