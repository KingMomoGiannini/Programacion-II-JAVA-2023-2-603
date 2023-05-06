/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ej2;

/**
 *
 * @author giann
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Inmobiliaria i = new Inmobiliaria();
        
        Propiedad p = new Propiedad("Callao 405",25000,TipoPropiedad.DEPTO );
        Propiedad p1 = new Propiedad("Rodriguez Peña 301",93200,TipoPropiedad.DEPTO );
        Propiedad p2 = new Propiedad("Sta Fe 15602",30100,TipoPropiedad.CASA );
        Propiedad p3 = new Propiedad("Honduras 1050",64000,TipoPropiedad.DEPTO );
        Propiedad p4 = new Propiedad("Armenia 2198",101300,TipoPropiedad.PH );
        
        i.agregarPropiedades(p);
        i.agregarPropiedades(p1);
        i.agregarPropiedades(p2);
        i.agregarPropiedades(p3);
        i.agregarPropiedades(p4);
        
        System.out.println("Promedio de precios de propiedades: usd $" + i.promedioDePrecio() + "\n" );
        System.out.println(i.propiedadesMasEconomicas()+ "\n");
        System.out.println("Hay " + i.cantidadDePropiedadesSegunTipo(TipoPropiedad.DEPTO) + " propiedad/es de tipo " + TipoPropiedad.DEPTO );
        
        
    }
    
}
