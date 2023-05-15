/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej6;

/**
 *
 * @author giann
 */
public class BicicletaElectrica extends Bicicleta {
    
    private final int POTENCIA_MAX = 250;
    private int potencia;

    public BicicletaElectrica(int potencia, String marca, String modelo, int kilometros) {
        super(marca, modelo, kilometros);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }
    
    @Override
    public boolean cumpleRequisitos(){
        boolean requisitos;
        requisitos =  potencia <= POTENCIA_MAX && super.cumpleRequisitos();
        return requisitos;
    }
}
