/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej6;

/**
 *
 * @author giann
 */
public class Bicicleta {
   private final int CANT_MAX_KM = 2000;
   private String marca;
   private String modelo;
   private int kilometros;

    public Bicicleta(String marca, String modelo, int kilometros) {
        this.marca = marca;
        this.modelo = modelo;
        this.kilometros = kilometros;
    }

    public int getKilometros() {
        return kilometros;
    }
   
   public boolean cumpleRequisitos(){
       boolean requisitos;
       requisitos = kilometros < CANT_MAX_KM;
       return requisitos;
   }
   
}
