/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej5;

/**
 
 5) Modelá la clase Fraccion, la cual posea como atributos numerador y denominador. 
 Luego, implementá métodos que permitan:
▪ Mostrarse en consola, con el formato "numerador/denominador".
▪ Obtener el valor decimal.
▪ Sumarle un entero.
▪ Sumarle una fracción.
▪ Simplificar la fracción.
▪ Saber si la fracción es propia, impropia u aparente.1
Finalmente, instanciá una fracción en el método main y probá todos sus métodos.

 * @author giann
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fraccion f = new Fraccion(8,12);
        
        f.getFraccion();
        System.out.println(f.getDecimal());
        f.sumarEntero(2);
        f.sumarFraccion(8, 4);
        f.simplificar();
        System.out.println("tipo: " + f.determinarTipo());
    }
    
}
