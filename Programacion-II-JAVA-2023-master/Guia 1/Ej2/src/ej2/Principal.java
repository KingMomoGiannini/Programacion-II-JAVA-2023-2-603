/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2;

/**
 *
 * @author giann
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado p1 = new Empleado(39156280,2,80000,"Giannini","Sebastian","Soltero");
        
        /* Anteriormente creamos metodos para poder inicializar 
        los atributos del objeto creado "p1". Pero como se vé en la linea 17
        empleamos el uso de un constructor para poder realizar esta acción.
        
        p1.setNombre("Sebastian");
        p1.setApellido("Giannini");
        p1.setDni(39156280);
        p1.setEstado("Soltero");
        p1.setSalario(80000);
        p1.setCantHijos(2);
        */
        p1.getDatos();
        System.out.println("Salario final: " + p1.getSalarioFinal());
        
    }
    
}
