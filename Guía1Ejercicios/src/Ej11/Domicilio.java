/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej11;

import Ej9.*;

/**
 *
 * @author giann
 */
public class Domicilio {
    private String calle;
    private int altura;
    private String barrio;

    public Domicilio(String calle, int altura, String barrio) {
        this.calle = calle;
        this.altura = altura;
        this.barrio = barrio;
    }
    
    public void setDomicilio(String calle, int altura, String barrio){
        this.calle = calle;
        this.altura = altura;
        this.barrio = barrio;        
    }

    @Override
    public String toString() {
        return "Domicilio{" + "calle = " + calle + ", altura = " + altura + ", barrio = " + barrio + '}';
    }
    
    
}
