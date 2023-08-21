package parcial;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class PuntoDeAtraque {

    private boolean ocupado;
    private NaveEspacial nave;

    public PuntoDeAtraque(boolean ocupado) {
        this.ocupado = ocupado;
    }
    
    public boolean isOcupado() {
        return ocupado;
    }

    public void setNave(NaveEspacial nave) {
        if (!ocupado) {
            this.nave = nave;
            this.ocupado = true;
        }
    }

    public NaveEspacial getNave() {
        return nave;
    }
    
}