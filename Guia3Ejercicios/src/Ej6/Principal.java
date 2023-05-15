/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ej6;

import java.util.ArrayList;

/**
 *
 * @author giann
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Bicicleta> bicicletas = new ArrayList<>();
        
        Bicicleta b = new Bicicleta("Omlo","rapidita",1500);
        Bicicleta b1 = new Bicicleta("Omlo","rapidona",1000);
        Bicicleta b2 = new BicicletaElectrica(200,"Omlo","RapiditaPower",1500);
        Bicicleta b3 = new Bicicleta("Omlo","rapidita",2600);
        Bicicleta b4 = new BicicletaElectrica(200,"Omlo","RapiditaPower 500",1000);
        bicicletas.add(b);
        bicicletas.add(b1);
        bicicletas.add(b2);
        bicicletas.add(b3);
        bicicletas.add(b4);
        
        Taller taller = new Taller();
        
        System.out.println(taller.cantServiciosPosibles(bicicletas));
        
        
    }
    
}
