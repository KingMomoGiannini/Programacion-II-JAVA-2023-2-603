/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej5;

/**
 *
 * @author giann
 */
public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
    
    public void getFraccion(){
        System.out.println(numerador + "/" + denominador);
    }
    
    public double getDecimal(){
        return (double) numerador/denominador;
    }
    
    public void sumarEntero(int elEntero ){
        int nuevoNumerador = numerador;
        for (int i = 0; i < elEntero ; i++) {
            nuevoNumerador += denominador;
        }
        System.out.println(nuevoNumerador+ "/" + denominador);
    }
    
    public void sumarFraccion(int otroNum,int otroDenom){
        int nuevoNumerador;
        int nuevoDenominador;
        nuevoDenominador = denominador*otroDenom;
        nuevoNumerador = (nuevoDenominador/denominador)*numerador + (nuevoDenominador/otroDenom)*otroNum;
        System.out.println(nuevoNumerador + "/" + nuevoDenominador);
    }
    
    public void simplificar() {
        int gcd = obtenerMCD(this.numerador, this.denominador);
        this.numerador /= gcd;
        this.denominador /= gcd;
        System.out.println(numerador + "/" + denominador);
    }
    
    // Método para obtener el máximo común divisor (MCD) de dos números
    private int obtenerMCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return obtenerMCD(b, a % b);
        }
    }
    public String determinarTipo() {
        if (this.numerador == 0) {
            return "Aparente";
        } else if (Math.abs(this.numerador) < Math.abs(this.denominador)) {
            return "Propia";
        } else if (Math.abs(this.numerador) > Math.abs(this.denominador)) {
            return "Impropia";
        } else {
            return "Aparente";
        }
    }
    
}
