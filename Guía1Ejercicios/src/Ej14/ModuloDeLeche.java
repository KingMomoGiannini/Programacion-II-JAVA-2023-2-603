/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej14;

/**
 *
 * @author giann
 */
public class ModuloDeLeche {
    private int medidorDeLiquido;
    private int puntosLeche;
    private TipoDeLeche textura;

    public ModuloDeLeche(int medidorDeLiquido, TipoDeLeche textura) {
        this.medidorDeLiquido = medidorDeLiquido;
        this.textura = textura;
    }
    
    public void restarPuntos (int puntosLeche){  //Si la leche alcanza restará los puntos al modulo.
        if(puntosLeche > 0 && lecheSuficiente()){
            this.medidorDeLiquido -= puntosLeche;
        }
    }
    
    public void llenarModulo(int puntosLeche){ //Metodo para llenar o rellenar el modulo con mas puntos de leche.
        if(puntosLeche > 0  && (puntosLeche + medidorDeLiquido) <=5 ){
            this.medidorDeLiquido += puntosLeche;
        }
    }
    
    public boolean lecheSuficiente(){ //Metodo para verificar si hay leche suficiente en el modulo.
        return puntosLeche <= medidorDeLiquido; 
    }
    
}
