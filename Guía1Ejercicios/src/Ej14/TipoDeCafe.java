/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej14;

/**
 *
 * @author giann
 */
public enum TipoDeCafe {
    
    EXPRESSO(3),
    LATTE(2,2,TipoDeLeche.ESPUMOSA),
    LAGRIMA(1,3,TipoDeLeche.LIQUIDA);
    
    private int puntosAgua;
    private int puntosLeche;
    private TipoDeLeche textura;

    private TipoDeCafe(int puntosAgua, int puntosLeche, TipoDeLeche text) {
        this.puntosAgua = puntosAgua;
        this.puntosLeche = puntosLeche;
        textura = text;
    }
    
    private TipoDeCafe(int puntosAgua) { //Sobrecargamos el constructor, ya que no todos los tipos de café cuentan con atributos de leche.
        this.puntosAgua = puntosAgua;
    }
    
}
