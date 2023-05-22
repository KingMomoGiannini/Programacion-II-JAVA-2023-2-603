/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej8;

import java.util.ArrayList;

/**
 *
 * @author giann
 */
public class Empresa {
    
    ArrayList<Personal> empleados;

    public Empresa() {
        empleados = new ArrayList<>();
    }
    
    public void agregarEmpleados(Personal emp){
        if (emp != null) {
            empleados.add(emp);
        }
    }
    
    public Personal empleadoConMasClientes (){
        int masClientes = 0;
        Personal p = null;
        for (Personal empleado : empleados) {
            if(empleado.cantidadDeClientes(empleado) > masClientes){
                masClientes = empleado.cantidadDeClientes(empleado);
                p = empleado;
            }        
        }
        return p;
    }
    
    public void mostrarSalarios(){
        for (Personal empleado : empleados) {
            empleado.mostrarSalarios();
        }
    }
    
}
