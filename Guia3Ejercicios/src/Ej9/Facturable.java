/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej9;

/**
 *
 * @author giann
 */
public abstract class Facturable {
    
    private Matematica calculo;

    public Facturable(Matematica calculo) {
        this.calculo = calculo;
    }

    public Matematica getCalculo() {
        return calculo;
    }

    public abstract double montoDeFacturacion();

}
