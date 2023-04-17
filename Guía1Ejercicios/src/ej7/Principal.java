/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej7;

/**

 7) Se precisa un robot (que tiene nombre) que permita atender llamadas telefónicas. La compañía 
puede detectar algunos clientes según su número de teléfono, sin embargo, en otros casos no. Por 
ello, el robot debe ser capaz de procesar alguno de los siguientes métodos homónimos:
▪ saludar(): void
Emite por consola un saludo diciendo: "Hola, mi nombre es ___. ¿En qué puedo 
ayudarte?".

▪ saludar(Persona): void
Emite por consola un saludo diciendo: "Hola ___, mi nombre es ___. ¿En qué puedo 
ayudarte?".

Modelá la clase Robot en Java. Luego, invocá varias veces el método saludar a través del método 
main de la clase Principal con diferentes variantes para ver si saluda como corresponde.

 * @author giann
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Robot r = new Robot("Robotin");
        r.saludar();
        r.saludar("jorgito");
        r.saludar("Estebanquito");
        r.saludar("Juancito");
        r.saludar();
        
    }
    
}
