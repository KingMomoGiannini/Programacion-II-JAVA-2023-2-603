/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej14;

/**
 *
 * @author giann
 */
public class ModuloDeAgua {
    private double temperatura;
    private boolean mantenimiento;

    public ModuloDeAgua(double temperatura, boolean mantenimiento) {
        this.temperatura = temperatura;
        this.mantenimiento = mantenimiento;
    }
    
    public boolean aguaLista(){  //metodo que devuelve TRUE si el modulo de agua está listo.
        return temperatura >= 70 && mantenimiento;
    }
    
    
}
