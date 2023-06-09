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
public class Concesionaria {
    
    private String nombre;
    private ArrayList<Vehiculo> vehiculos;

    public Concesionaria(String nombre) {
        this.nombre = nombre;
        vehiculos = new ArrayList<>();
    }
    
    public void agregarVehiculo(Vehiculo vehiculo){
        if (vehiculo != null) {
            vehiculos.add(vehiculo);
        }
    }
    public void mostrarVehiculos(TipoVehiculo tipoDeVehiculo){
        for (int i = 0; i < vehiculos.size(); i++) {
            if (tipoDeVehiculo == vehiculos.get(i).getTipoDeVehiculo()) {
                System.out.println(vehiculos.get(i));
            }
        }
    }
    
//    public ArrayList<Vehiculo> getVehiculos() {//Metodo para enviar ArrayList de vehiculos en la concesionaria.
//        return vehiculos;
//    }
    
    public void mostrarVehiculos(){
        for (int i = 0; i < vehiculos.size(); i++) {
            System.out.println(vehiculos.get(i));
        }
    }
    
    public int getCantidadDeVehiculos(){
        return vehiculos.size();
    }
    
    public String patenteVehiculo(String patente) {
        for (int i = 0; i < vehiculos.size(); i++) {
            if (patente.equals(vehiculos.get(i).getPatente())) {
                return vehiculos.get(i).getPatente();
                
            }
        }
        return null; // Devuelve null si no se encuentra la patente en los vehículos de la concesionaria
    }
    
    public Vehiculo buscarVehiculo(String patente){
        Vehiculo v = null;
        int i = 0;
        while(i<vehiculos.size() && v == null){
            if (vehiculos.get(i).getPatente().equals(patente)){
                v = vehiculos.get(i);
            }
            i++;
        }
        return v;
    }
    
    public void eliminarVehiculo(Vehiculo v){
        
        int i = 0;
        while (i < vehiculos.size()){
            if (vehiculos.get(i).equals(v)) {
                vehiculos.remove(i);
                i = vehiculos.size();
            }
            i++;
        }
    }

    
//    public String patenteVehiculo(String patente){
//        String retorno = null;
//        for (int i = 0; i < vehiculos.size(); i++) {
//            if (patente.equals(vehiculos.get(i).getPatente())) {
//                retorno = patente;
//            }
//        }
//        return retorno;
//    }
    
    public String getNombre(){
        return nombre;
    }

    public void removerVehiculo(int i) {
        vehiculos.remove(i);
    }
    
    @Override
    public String toString() {
        return "Concesionaria{" + "nombre = " + nombre + ", vehiculos = \n" + vehiculos + '}';
    }
    
    
}
