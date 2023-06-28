package parcial.exam.conduc;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Informe {
    
    private double porcentajeReprobados;
    private double promedioTiempoAprobados;

    public Informe(double porcentajeReprobados, double promedioTiempoAprobados) {
        this.porcentajeReprobados = porcentajeReprobados;
        this.promedioTiempoAprobados = promedioTiempoAprobados;
    }

    @Override
    public String toString() {
        return "Informe: \n" 
                + "\tPorcentaje de examenes reprobados = % \n" + porcentajeReprobados 
                + "\tPromedio de tiempo de los examenes de auto aprobados = " + promedioTiempoAprobados 
                + " segundos";
    }
    

}