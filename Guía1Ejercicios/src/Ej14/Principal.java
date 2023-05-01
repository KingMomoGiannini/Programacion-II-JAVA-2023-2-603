/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ej14;

/**
 *
 * @author giann
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ModuloDeAgua agua = new ModuloDeAgua(70,true);
        ModuloDeLeche leche = new ModuloDeLeche(0,TipoDeLeche.LIQUIDA);
        MaquinaDeCafe cafetera = new MaquinaDeCafe("Teros",true,leche,agua);
        
        leche.estadoModulo();//Vemos el estado inicial del modulo de leche.
        leche.llenarModulo(); //Recargamos el modulo.
        leche.estadoModulo();
        cafetera.servirCafe(TipoDeCafe.LATTE); //Servimos cafe hasta agotar el contenido del modulo.
        cafetera.servirCafe(TipoDeCafe.LAGRIMA);
        leche.estadoModulo();
        cafetera.servirCafe(TipoDeCafe.LATTE); // Al no recargarlo muestra mensaje de error.
        cafetera.servirCafe(TipoDeCafe.EXPRESSO); // Pero si podemos servir Expresso, debido a que no utiliza modulo de leche.

//        cafetera.servirCafe(TipoDeCafe.LATTE);
        
    }
    
}
