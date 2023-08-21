package parcial;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Atlantis {

    private ArrayList<PuntoDeAtraque> puntosAtraque;

    public Atlantis() {
        puntosAtraque = new ArrayList<>();
    }
    
    public void agregarPuntosAtraque(PuntoDeAtraque pa){
        if (pa != null) {
            puntosAtraque.add(pa);
        }
    }

    public void estacionarNave(NaveEspacial nave){
        boolean estacionada = false;
        int i = 0;
        if (!puntosAtraque.isEmpty()) {
            while(estacionada == false && i < puntosAtraque.size()){
                if (!puntosAtraque.get(i).isOcupado() && nave.puedeEstacionar()) {//Si el punto de atraque no esta ocupado y la nave está en condiciones, puede estacionar.
                    puntosAtraque.get(i).setNave(nave);
                    estacionada = true;
                    i = puntosAtraque.size();
                }
                else if (!nave.puedeEstacionar()) {
                    i = puntosAtraque.size();
                    estacionada = true;
                }
                else{
                    i++;
                }
                
            }
        }
    }
    
    public void mostrarManifiestos(){
        for (PuntoDeAtraque puntoDeAtraque : puntosAtraque) {
            if (puntoDeAtraque.isOcupado()) { //Si el punto de atraque está ocupado, tiene una nave.
                System.out.println(puntoDeAtraque.getNave().informarManifiesto());//Mostrar manifiesto de cada nave estacionada
            }
        }
    }
}