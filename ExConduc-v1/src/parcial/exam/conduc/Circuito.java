package parcial.exam.conduc;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Circuito implements Evaluable {

    private int tiempo;
    private int falta;

    public Circuito(int tiempo, int falta) {
        this.tiempo = tiempo;
        this.falta = falta;
    }

    public int getTiempo() {
        return tiempo;
    }

    public int getFalta() {
        return falta;
    }
    
    @Override
    public boolean aprueba() {
        boolean califica = false;
        if (falta<=2) {
            califica = true;
        }
        return califica;
    }

}