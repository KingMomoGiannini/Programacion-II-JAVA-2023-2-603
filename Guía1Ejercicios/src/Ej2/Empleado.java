/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej2;

/**
 *
 * @author giann
 */
public class Empleado {
    private String DNI;
    private String nom;
    private String apellido;
    private double salarioBase;
    private String estadoCivil;
    private int hijos;

    public Empleado(String DNI, String nom, String apellido, double salarioBase, String estadoCivil, int hijos) {
        this.DNI = DNI;
        this.nom = nom;
        this.apellido = apellido;
        this.salarioBase = salarioBase;
        this.estadoCivil = estadoCivil;
        this.hijos = hijos;
    }
    
    public void mostrarEstado(){
        System.out.println(toString());
    }
    
    private double plusPorHijo(){
        double plus=0;
        if(hijos<=3){
            for (int i = 0; i < hijos; i++) {
                plus += salarioBase * 0.03;
            }
        }
        else if (hijos<0){
            System.out.println("Error en ingreso de hijos.");
        }
        else {
            plus = salarioBase * 0.1;
        }
        return plus;
    }
        
    private double descuento(double salario){
        return salario*0.04;
    }
    
    public void getSalarioFinal(){ 
        double salario;
        salario = salarioBase + plusPorHijo();
        if(estadoCivil.equals("Soltero")){
            System.out.println("Salario Final: $" + (salario - descuento(salario)));    
        }
        else{
            System.out.println("Salario Final: $" + salario);
        }
    }

    @Override
    public String toString() {
        return "Empleado{" + "DNI = " + DNI + ", nombre = " + nom + ", apellido = " + apellido + ", salarioBase = $" + salarioBase + ", estado civil = " + estadoCivil + ", hijos = " + hijos + '}';
    }
    
}
