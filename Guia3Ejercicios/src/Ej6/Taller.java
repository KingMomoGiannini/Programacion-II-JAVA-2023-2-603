/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej6;

import java.util.ArrayList;

/**
 *
 * @author giann
 */
public class Taller {
    
    public int cantServiciosPosibles(ArrayList<Bicicleta> bicicletas){
        int servicios = 0;
        for (Bicicleta bicicleta : bicicletas) {
            if (bicicleta.cumpleRequisitos()) {
                servicios++;
            }
        }
        return servicios;
    }
    
}
