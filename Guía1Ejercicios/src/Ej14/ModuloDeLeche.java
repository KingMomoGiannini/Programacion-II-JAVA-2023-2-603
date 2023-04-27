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

    public ModuloDeLeche(int medidorDeLiquido, int puntosLeche, TipoDeLeche textura) {
        this.medidorDeLiquido = medidorDeLiquido;
        this.puntosLeche = puntosLeche;
        this.textura = textura;
    }
    
    
    
    public boolean lecheSuficiente(){
        return puntosLeche < medidorDeLiquido; 
    }
    
}
