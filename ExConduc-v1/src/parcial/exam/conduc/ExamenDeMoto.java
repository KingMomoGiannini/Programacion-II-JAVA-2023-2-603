package parcial.exam.conduc;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class ExamenDeMoto extends Examen {

    private Vehiculo infoMoto;
    private ArrayList<Circuito> circuitos;

    public ExamenDeMoto(Vehiculo infoMoto, String fecha, Persona persona) {
        super(fecha, persona);
        this.infoMoto = infoMoto;
        circuitos = new ArrayList<>();
    }
    
    public int circuitosAprobados(){
        int aprobados = 0;
        for (Circuito circuito : circuitos) {
            if (circuito.aprueba()) {
                aprobados++;
            }
        }
        return aprobados;
    }
    
    public int tiempoTotal(){
        int tiempo = 0;
        for (Circuito circuito : circuitos) {
            tiempo += circuito.getTiempo();
        }
        return tiempo;
    }

    @Override
    public boolean aprueba() {
        boolean califica = false;
        if (infoMoto.getCilindrada() > 150 && circuitosAprobados() == circuitos.size()) {
            califica = true;
        }
        else if (infoMoto.getCilindrada() <= 150 && circuitosAprobados()==(circuitos.size()-1)  && tiempoTotal() < 120) {
            califica = true;
        }
        return califica;
    }

    @Override
    public Vehiculo infoVehiculo() {
        return infoMoto;
    }

}