/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej8;

/**
 *
 * @author giann
 */
public class PAComision extends Personal {
    
    private int SALARIO_MINIMO = 20000;
    private int clientesCaptados;
    private double montoPorCliente;

    public PAComision(int clientesCaptados, String DNI, String nombre, String apellido, int anioIngreso) {
        super(DNI, nombre, apellido, anioIngreso);
        this.clientesCaptados = clientesCaptados;
    }
    
    public double salarioFinal(){
        double salario = SALARIO_MINIMO;
        
        return salario;
    }

    @Override
    public void mostrarSalarios() {
        System.out.println("Nombre completo: " + super.getNombre() + " " + super.getApellido() + " - Salario: $" +salarioFinal() );
    }
    
    
    
}
