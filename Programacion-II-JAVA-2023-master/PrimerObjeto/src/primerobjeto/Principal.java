/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primerobjeto;

import java.util.Scanner;

/**
 *
 * @author giann
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        Auto a1 = new Auto();
        //System.out.println(a1.patente+" "+ a1.color+" "+a1.kms+" "+a1.conAire);
        a1.patente = "ACM1PT";
        a1.color = "Caoba";
        a1.kms = 350;
        a1.conAire = true;
        System.out.println(a1.patente+" "+ a1.color+" "+a1.kms+" "+a1.conAire);
        
        Auto a2 = new Auto();
        //System.out.println(a2.patente+" "+ a2.color+" "+a2.kms+" "+a2.conAire);
        a2.patente = "PEP980";
        a2.color = "azul";
        a2.kms = 10;
        a2.conAire = false;
        System.out.println(a2.patente+" "+ a2.color+" "+a2.kms+" "+a2.conAire);
    }
    
}
