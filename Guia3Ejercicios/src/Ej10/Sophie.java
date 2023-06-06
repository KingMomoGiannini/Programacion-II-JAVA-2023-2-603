package Ej10;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Sophie {

    public Sophie() {
        // Constructor a resolver...
    }
    
    public void generarInforme(Programa programa){
        double indicePrograma = programa.indiceCalidad();
        double indiceLProgra = programa.getIndiceFuenteMarcado();
        double indiceLMarcado = programa.getIndiceFuenteProgram();
        String IDPrograma = programa.getId();
        if (programa != null) {
            Informe inf = new Informe(indicePrograma,indiceLProgra,indiceLMarcado,IDPrograma);
            System.out.println(inf);
        }
    }
    
    public ArrayList<Programa> recibirProgramas(ArrayList<Programa> prog){
        return prog;
    }
    
}