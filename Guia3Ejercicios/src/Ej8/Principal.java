/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ej8;

/**
 *
 * @author giann
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Empresa e = new Empresa();
        
        Personal emp = new PSalarioFijo(50000,"83918512","Juan","Pelotas",2008);
        Personal emp1 = new PSalarioFijo(25000,"12309489","Matias","Enriquez",2019);
        Personal emp2 = new PSalarioFijo(28000,"98324791","Norma","Jala",2020);
        
        Personal emp3 = new PAComision(40,750,"73093842","Yesica","Gandara",2018);
        Personal emp4 = new PAComision(20,750,"12389074","Salvador","Borges",2015);
        Personal emp5 = new PAComision(25,750,"67812390","Iara","Peña",2017);
        
        e.agregarEmpleados(emp);
        e.agregarEmpleados(emp1);
        e.agregarEmpleados(emp2);
        e.agregarEmpleados(emp3);
        e.agregarEmpleados(emp4);
        e.agregarEmpleados(emp5);
        
        e.mostrarSalarios();
        System.out.println("\n---------- \n");
        
        System.out.println(e.empleadoConMasClientes());
        
    }
    
}
