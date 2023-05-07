package Ej3;
/**
 * @author giann
 */
public class Principal {

    public static void main(String[] args) {
        
        Evaluacion e = new Evaluacion ("PRIMERA");
        Evaluacion e1 = new Evaluacion ("SEGUNDA");
        Evaluacion e2 = new Evaluacion ("FINAL");
        Evaluacion e3 = new Evaluacion ("PRIMERA");
        Evaluacion e4 = new Evaluacion ("SEGUNDA");
        Evaluacion e5 = new Evaluacion ("FINAL");
        Evaluacion e6= new Evaluacion ("PRIMERA");
        Evaluacion e7 = new Evaluacion ("SEGUNDA");
        Evaluacion e8 = new Evaluacion ("FINAL");
        Evaluacion e9 = new Evaluacion ("PRIMERA");
        Evaluacion e10 = new Evaluacion ("SEGUNDA");
        Evaluacion e11 = new Evaluacion ("FINAL");
        Evaluacion e12 = new Evaluacion ("PRIMERA");
        Evaluacion e13 = new Evaluacion ("SEGUNDA");
        Evaluacion e14 = new Evaluacion ("FINAL");
        Evaluacion e15 = new Evaluacion ("PRIMERA");
        Evaluacion e16 = new Evaluacion ("SEGUNDA");
        Evaluacion e17 = new Evaluacion ("FINAL");
        
        Alumno a = new Alumno("Jesica","79189123"); //"Ignacio","79189123"
        Alumno a1 = new Alumno("Jose","89123457");
        Alumno a2 = new Alumno("David","354317543");
        Alumno a3 = new Alumno("Romina","59211921");
        Alumno a4 = new Alumno("Sebastian","91237919");
        Alumno a5 = new Alumno("Sofia","39102849");
        
        Curso c = new Curso("1tecPC","Tecnico en Reparacion de PC",20); //"1tecPC","Tecnico en Reparacion de PC",
        Curso c1 = new Curso("1tecTV","Tecnico en Reparacion de TV",30);
        Curso c2 = new Curso("1DI","Decoracion de Interiores",15);
        
        a.agregarNotaEvaluaciones(e, 9);
        a.agregarNotaEvaluaciones(e1, 9);
        a.agregarNotaEvaluaciones(e2, 9);
        
        a1.agregarNotaEvaluaciones(e3, 7);
        a1.agregarNotaEvaluaciones(e4, 8);
        a1.agregarNotaEvaluaciones(e5, 9);
        
        a2.agregarNotaEvaluaciones(e6, 8);
        a2.agregarNotaEvaluaciones(e7, 8);
        a2.agregarNotaEvaluaciones(e8, 8);
        
        a3.agregarNotaEvaluaciones(e9, 7);
        a3.agregarNotaEvaluaciones(e10, 8);
        a3.agregarNotaEvaluaciones(e11, 10);
        
        a4.agregarNotaEvaluaciones(e12, 8);
        a4.agregarNotaEvaluaciones(e13, 6);
        a4.agregarNotaEvaluaciones(e14, 7);
        
        a5.agregarNotaEvaluaciones(e15, 7);
        a5.agregarNotaEvaluaciones(e16, 8);
        a5.agregarNotaEvaluaciones(e17, 9);
        
        
        c.agregarAlumno(a1);
        c.agregarAlumno(a2);
        
        c1.agregarAlumno(a3);
        c1.agregarAlumno(a4);
        
        c2.agregarAlumno(a);
        c2.agregarAlumno(a5);
        
        System.out.println(c+"\n");
        System.out.println(c1+"\n");
        System.out.println(c2+"\n");
        
        System.out.println(a.calcularPromedio());
        System.out.println(a5.calcularPromedio());
        
        System.out.println("\nAlumnos/as por encima del promedio en "
        + c1.getCodigo() + " son:\n" + c1.buscarAlumnosPorEncimaDe(7));
    }
    
}
