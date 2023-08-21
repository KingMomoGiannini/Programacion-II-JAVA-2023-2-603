package parcial;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Principal {

    public static void main(String[] args) {
        Atlantis atlantis =  new Atlantis();
        
        PuntoDeAtraque pa = new PuntoDeAtraque(false);
        PuntoDeAtraque pa1 = new PuntoDeAtraque(false);
        PuntoDeAtraque pa2 = new PuntoDeAtraque(false);
        PuntoDeAtraque pa3 = new PuntoDeAtraque(false);
        PuntoDeAtraque pa4 = new PuntoDeAtraque(false);
        
        Carga carga = new Carga("Baterías recargables",120);
        Carga carga2 = new Carga("Sustancias cósmicas",90);
        
        NaveEspacial nave = new NaveCruiser(0,"Mercurio",8);
        NaveEspacial nave1 = new NaveCruiser(12,"Urano",48);
        
        NaveEspacial nave2 = new NaveCargo(carga,"Neptuno",21);
        NaveEspacial nave3 = new NaveCargo(carga2,"Marte",15);
        
        atlantis.agregarPuntosAtraque(pa);
        atlantis.agregarPuntosAtraque(pa1);
        atlantis.agregarPuntosAtraque(pa2);
        atlantis.agregarPuntosAtraque(pa3);
        atlantis.agregarPuntosAtraque(pa4);
        
        atlantis.estacionarNave(nave);
        atlantis.estacionarNave(nave1);
        atlantis.estacionarNave(nave2);
        atlantis.estacionarNave(nave3);
        
        atlantis.mostrarManifiestos();
        
    }

}