/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej8;

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
        
        return salario;
    }
    
    @Override
    public void mostrarSalarios() {
        System.out.println("Nombre completo: " + super.getNombre() + " " + super.getApellido() + " - Salario: $" +salarioFinal() );
    }
    
    
    
    
}
