<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej8;

import java.util.Random;

/**
 *
 * @author giann
 */
public class Password {
    private String contrasenia;
    
    public Password(){
        contrasenia = generarAleatorio(10);
    }
    
    public Password (String contrasenia){
        
        this.contrasenia = contrasenia;
    }
    
    public boolean esFuerte(){
        if(contrasenia.length() >= 8){
            System.out.println("Es fuerte.");
            return true;
        }
        else{
            System.out.println("Es debil.");
            return false;
        }
        
    }
    public boolean nuevoValor(String valor){
    
        if(valor.length() >= 6){
            contrasenia = valor;
            return true;
        }
        else {
            return false;
        }
    }
    
    public String generarAleatorio(int longitud){
        String aleatorio ="";
        Random pas = new Random();
        for (int i = 0; i < longitud; i++) {
            aleatorio += pas.nextInt(10);/*"pas.nextInt(10)" nos permite generar un numero aleatorio entre el 0 y el 10 
            luego se lo sumamos a la variable del tipo String "aleatorio".*/
        }
        //System.out.println(aleatorio);
        return aleatorio;
    }
    
    /*Ejercicio sin terminar. Dudas: 
    º   Cómo generar un valor aleatorio, con la cantidad de 
    caracteres que se indique en el metodo. */

    public void getPassword(){
        System.out.println(toString());
    }
    
    @Override
    public String toString() {
        return "Password{" + "contrasenia = " + contrasenia + '}';
    }
    
}
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej8;

import java.util.Random;

/**
 *
 * @author giann
 */
public class Password {
    private String contrasenia;
    
    public Password(){
        contrasenia = generarAleatorio(10);
    }
    
    public Password (String contrasenia){
        
        this.contrasenia = contrasenia;
    }
    
    public boolean esFuerte(){
        if(contrasenia.length() >= 8){
            System.out.println("Es fuerte.");
            return true;
        }
        else{
            System.out.println("Es debil.");
            return false;
        }
        
    }
    public boolean nuevoValor(String valor){
    
        if(valor.length() >= 6){
            contrasenia = valor;
            return true;
        }
        else {
            return false;
        }
    }
    
    public String generarAleatorio(int longitud){
        String aleatorio ="";
        Random pas = new Random();
        for (int i = 0; i < longitud; i++) {
            aleatorio += pas.nextInt(10);/*"pas.nextInt(10)" nos permite generar un numero aleatorio entre el 0 y el 10 
            luego se lo sumamos a la variable del tipo String "aleatorio".*/
        }
        //System.out.println(aleatorio);
        return aleatorio;
    }
    
    /*Ejercicio sin terminar. Dudas: 
    º   Cómo generar un valor aleatorio, con la cantidad de 
    caracteres que se indique en el metodo. */

    public void getPassword(){
        System.out.println(toString());
    }
    
    @Override
    public String toString() {
        return "Password{" + "contrasenia = " + contrasenia + '}';
    }
    
}
>>>>>>> 1e7e90b (Ejercicio 8)
