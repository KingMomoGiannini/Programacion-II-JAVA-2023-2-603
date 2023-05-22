/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej8;

import java.util.Calendar;

/**
 *
 * @author giann
 */
public class PSalarioFijo extends Personal {
    
    private double sueldoBasico;
    private double adicional; 

    public PSalarioFijo(double sueldoBasico, String DNI, String nombre, String apellido, int anioIngreso) {
        super(DNI, nombre, apellido, anioIngreso);
        this.sueldoBasico = sueldoBasico;
    }
    
    public double salarioFinal(){
        double salario = sueldoBasico;
        if (aniosActivo() >= 0 && aniosActivo() < 2) {
            this.adicional = 0;
        }
        else if(aniosActivo() >= 2 && aniosActivo() <= 5){
            this.adicional = sueldoBasico*0.05;
        }
        else if(aniosActivo() >= 6 && aniosActivo() <= 10){
            this.adicional = sueldoBasico*0.1;
        }
        else if(aniosActivo() > 10 ){
            this.adicional = sueldoBasico*0.15;
        }
        salario += adicional;
        return salario;
    }
    
    public int aniosActivo(){
        int anios = 0;
        Calendar cal = Calendar.getInstance();
        int anioActual = cal.get(Calendar.YEAR);
        anios = anioActual - super.getAnioIngreso();
        return anios;
    }
    
    @Override
    public void mostrarSalarios() {
        System.out.println("Nombre completo: " + super.getNombre() + " " + super.getApellido() + " - Salario: $" +salarioFinal() );
    }
    
    
    
    
}
