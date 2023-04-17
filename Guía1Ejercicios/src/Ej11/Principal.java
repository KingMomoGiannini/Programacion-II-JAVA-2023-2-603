/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ej11;

/**
 * 
11) 
Utilizando las clases generadas hasta ahora, codificá en Java la siguiente situación:
    Una cuenta bancaria de tipo caja de ahorros le pertenece a Fulano Gomez, nacido 
    el 16/04/1990 y otra de tipo cuenta corriente le pertenece a Mengana Torres, 
    nacida el 23/11/1991. Ambos están casados y viven juntos en Av. Triunvirato 
    3174, Villa Ortúzar.
Supongamos que Fulano y Mengana se mudan a nuevo hogar: ¿Hay que cambiar el domicilio de 
cada uno o basta con cambiar uno de los dos?

 *
 * @author giann
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Domicilio dom = new Domicilio("Av. Triunvirato",3174,"Villa Ortuzar");
        Fecha f = new Fecha(16,4,1990);
        Fecha f1 = new Fecha(23,11,1991);
        Persona p = new Persona("Fulano","Gomez",f,dom);
        Persona p1 = new Persona("Mengana","Torres",f1,dom);
        CuentaBancaria c = new CuentaBancaria("Caja de ahorros",p);
        CuentaBancaria c1 = new CuentaBancaria("Cuenta corriente",p1);
        c.getDatos();
        c1.getDatos();
        dom.setDomicilio("Av. Libertador",5641,"Beccar");
        c.getDatos();
        c1.getDatos();
    }
    
}
