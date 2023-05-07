/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej4;

import java.util.ArrayList;

/**
 *
 * @author giann
 */
public class Marca {
    
    private ArrayList<Concesionaria> concesionarias;

    public Marca() {
        concesionarias = new ArrayList<>();
    }
    
    public void agregarConcesionaria(Concesionaria concesionaria){
        if (concesionaria != null) {
            concesionarias.add(concesionaria);
        }
    }
    
    public void mostrarVehiculos(){
        for (int i = 0; i < concesionarias.size() ; i++) {
           concesionarias.get(i).mostrarVehiculos();
        }
    }
    
    public ArrayList<Concesionaria> obtenerConcesionariaMaxVeh(){
        int mayorCantVeh = 0;
        ArrayList<Concesionaria> conMasVeh = new ArrayList<>();
        for (int i = 0; i < concesionarias.size(); i++) {
            if (concesionarias.get(i).getCantidadDeVehiculos() >= mayorCantVeh) {
                mayorCantVeh = concesionarias.get(i).getCantidadDeVehiculos();
            }
        }
        for (int i = 0; i < concesionarias.size(); i++) {
            if (concesionarias.get(i).getCantidadDeVehiculos() == mayorCantVeh) {
                conMasVeh.add(concesionarias.get(i));
            }
        }
        return conMasVeh;
    }
    
    public void borrarVehiculo (String patente){
        for (int i = 0; i < concesionarias.size(); i++) {
            for (int j = 0; j < concesionarias.get(i).getCantidadDeVehiculos(); j++) {
                if (patente.equals(concesionarias.get(i).patenteVehiculo(patente))) {
                    concesionarias.get(i).removerVehiculo(j); 
                }
            }
        }
    }
    
    public void cambiarVehiculoDeConsecionaria (String patente,Concesionaria consecionaria){
    
    }
    
    public int vehiculosPorConcesionaria(Concesionaria concesionaria){
        return concesionaria.getCantidadDeVehiculos();
    }
    
    
}
