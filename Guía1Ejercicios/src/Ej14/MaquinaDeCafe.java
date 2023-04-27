/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej14;

/**
 *
 * @author giann
 */
public class MaquinaDeCafe {
    private String marca;
    private boolean estado;
    private ModuloDeLeche moduloLeche;
    private ModuloDeAgua moduloAgua;
    private TipoDeCafe tipoCafe;
    
    public MaquinaDeCafe(String marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;   
    }
    
    public void servirCafe(){
//        ModuloDeAgua agua = new ModuloDeAgua(70,true);
//        ModuloDeLeche leche = new ModuloDeLeche(0,TipoDeLeche.LIQUIDA);
        if(maquinaLista()){ //Si la maquina está lista
            moduloLeche.llenarModulo(5);
        }
    }
    
    public boolean maquinaLista(){ // Comprueba si la maquina está encendida y lista
        return moduloAgua.aguaLista() && estado;
    }
    
}
