/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comportamientoobjetos;

/**
 *
 * @author giann
 */
public class Principal {
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaBancaria cb = new CuentaBancaria();
        
        cb.mostrarDatos();//Invocamos el metodo creado en la clase "CuentaBancaria"
                          //creado para mostrar por consola los datos solicitados.  
        cb.CBU = "0000123878398377832";
        cb.alias = "PAN.BIGOTE.JAVIER";
        cb.mostrarDatos();
        
        double x = cb.obtenerSaldos();
        System.out.println(x);
        cb.depositar(200);
        cb.mostrarDatos();
        cb.depositar(-50);
        cb.mostrarDatos();
        cb.extraer(180);
        cb.mostrarDatos();
        cb.extraer(100);
        cb.mostrarDatos();        
    }
    
}
