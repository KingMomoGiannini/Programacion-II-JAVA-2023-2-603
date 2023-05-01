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
    private TipoDeLeche textura;

    public ModuloDeLeche(int medidorDeLiquido, TipoDeLeche textura) {
        this.medidorDeLiquido = medidorDeLiquido;
        this.textura = textura;
    }
    
    public void estadoModulo(){//Muestra cuantos puntos de leche tiene nuestro modulo.
        System.out.println("Leche en el modulo: "+ medidorDeLiquido + " puntos");
    }
    
    public void restarPuntos (int puntosLeche){  //Si la leche alcanza restará los puntos al modulo.
        if(puntosLeche > 0 && lecheSuficiente(puntosLeche)){
            this.medidorDeLiquido -= puntosLeche;
        }
    }
    
    public void llenarModulo(){ //Metodo para llenar o rellenar el modulo con mas puntos de leche.
        if(medidorDeLiquido < 5 ){
            this.medidorDeLiquido = 5;
        }
    }
    
    public boolean lecheSuficiente(int puntosLeche){ //Metodo para verificar si hay leche suficiente en el modulo.
        return puntosLeche <= medidorDeLiquido; 
    }
    
}
