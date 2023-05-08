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
    
    public void borrarVehiculo(String patente) {
        for (Concesionaria concesionaria : concesionarias) {
            ArrayList<Vehiculo> vehiculos = concesionaria.getVehiculos();
            for (int j = 0; j < vehiculos.size(); j++) {
                Vehiculo vehiculo = vehiculos.get(j);
                if (patente.equals(vehiculo.getPatente())) {
                    concesionaria.removerVehiculo(j);
                    return; //v3 Sale del método después de eliminar el primer vehículo que coincida con la patente indicada
                }
            }
        }
    }
//    public void borrarVehiculo(String patente) {
//        boolean vehiculoEncontrado = false; // Variable para indicar si se ha encontrado el vehículo

//        for (int i = 0; i < concesionarias.size() && !vehiculoEncontrado; i++) {
//            Concesionaria concesionaria = concesionarias.get(i);
//            for (int j = 0; j < concesionaria.getCantidadDeVehiculos() && !vehiculoEncontrado; j++) {
//                if (patente.equals(concesionaria.patenteVehiculo(patente))) {
//                    concesionaria.removerVehiculo(j);
//                    vehiculoEncontrado = true; // Actualizar la variable indicando que se ha encontrado el vehículo
//                }
//            }
//        }v2 metodo eliminaba otro Vehiculo cuya patente no coincidia

    
//    public void borrarVehiculo (String patente){
//        for (int i = 0; i < concesionarias.size(); i++) {
//            for (int j = 0; j < concesionarias.get(i).getCantidadDeVehiculos(); j++) {
//                if (patente.equals(concesionarias.get(i).patenteVehiculo(patente))) {
//                    concesionarias.get(i).removerVehiculo(j); 
//                }
//            }
//        }
//    } //v1 metodo eliminaba otros Vehiculos cuya patente no coincidia(Ademas de la que sí). 
    
    public void cambiarVehiculoDeConsecionaria (String patente,Concesionaria concesionariaDestino){
            for (Concesionaria concesionaria : concesionarias) {
                ArrayList<Vehiculo> vehiculos = concesionaria.getVehiculos();
                for (int j = 0; j < vehiculos.size(); j++) {
                    Vehiculo vehiculo = vehiculos.get(j);
                    if (patente.equals(vehiculo.getPatente())) {
                        concesionariaDestino.agregarVehiculo(vehiculo);
                        concesionaria.removerVehiculo(j);
                        return; //v3 Sale del método después de eliminar el primer vehículo que coincida con la patente indicada
                    }
                }
        }
        
    }
    
} 
    

