/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package preparcialTodoLibre;

/**
 *
 * @author giann
 */
public class SucursalCorreo {
    private String nombre;
    private Domicilio dom;

    public SucursalCorreo(String nombre,Domicilio dom) {
        this.nombre = nombre;
        this.dom = dom;
    }

    public Domicilio getDom() {
        return dom;
    }
    
}
