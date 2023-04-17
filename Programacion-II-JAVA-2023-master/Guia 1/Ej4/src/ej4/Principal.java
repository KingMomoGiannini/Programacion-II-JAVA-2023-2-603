/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej4;

/**
 4) Modelá la clase Fecha, la cual posea como atributos el día, el mes y el año. Luego, implementá 
métodos que permitan:
▪ Obtener la fecha como cadena, en formato "dd/mm/aaaa".
▪ Saber si es Navidad.
▪ Sumar un mes.
Finalmente, instanciá una fecha en el método main y probá todos sus métodos
 
  
 * @author giann
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fecha f = new Fecha(23,12,2009);
        f.getfechaCadena();
        f.sumarMes();
        f.getfechaCadena();
    }
    
}
