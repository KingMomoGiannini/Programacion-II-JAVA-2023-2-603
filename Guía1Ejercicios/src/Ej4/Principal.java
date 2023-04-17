/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ej4;

import ej4.Fecha;

/**
 *
 * @author giann
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fecha f = new Fecha(25,12,2009);
        f.getFechaCadena();
        f.sumarMes();
        f.getFechaCadena();
    }
    
}
