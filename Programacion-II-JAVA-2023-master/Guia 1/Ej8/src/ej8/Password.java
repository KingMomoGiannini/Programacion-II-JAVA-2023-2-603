/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej8;

/**
 *
 * @author giann
 */
public class Password {
    private String contrasenia;
    
    public Password(){
    
    }
    
    public Password (String contrasenia){
        
        this.contrasenia = contrasenia;
    }
    
    public boolean esFuerte(){
        int caracteres;
        caracteres = contrasenia.length();
        if(caracteres >= 8){
            return true;
        }
        else{
            return false;
        }
        
    }
    public boolean nuevoValor(String valor){
    
        if(valor.length() >= 6){
            this.contrasenia = valor;
            return true;
        }
        else {
            return false;
        }
        
    }
    
    /*Ejercicio sin terminar. Dudas: 
    º   Cómo generar un valor aleatorio, con la cantidad de 
    caracteres que se indique en el metodo. */
    
}
