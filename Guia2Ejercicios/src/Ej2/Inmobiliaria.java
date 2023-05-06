/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej2;

import java.util.ArrayList;

/**
 *
 * @author giann
 */
public class Inmobiliaria {
    
    ArrayList<Propiedad> propiedades;

    public Inmobiliaria() {
        this.propiedades = new ArrayList<>();
    }
    
    public double promedioDePrecio(){
        
        double sumaPrecios = 0;
        int i;
        for ( i = 0; i < propiedades.size(); i++) {
            sumaPrecios += propiedades.get(i).getPrecio();
        }
        return sumaPrecios/i;
    }
    
    public void agregarPropiedades(Propiedad inmueble){
        if (inmueble != null) {
            this.propiedades.add(inmueble);
        }
    }
    
    public ArrayList<Propiedad> propiedadesMasEconomicas(){
        ArrayList<Propiedad> economicas = new ArrayList<>();
        for (int i = 0; i < propiedades.size(); i++) {
            if( propiedades.get(i).getPrecio() <= promedioDePrecio() ){
                economicas.add(propiedades.get(i));
            }
        }
        return economicas;
    }
    
    public int cantidadDePropiedadesSegunTipo (TipoPropiedad tipoDePropiedad){
        int cantTipo = 0;
        for (int i = 0; i < propiedades.size(); i++) {
            if (propiedades.get(i).getTipoDePropiedad() == tipoDePropiedad) {
                cantTipo ++;
            }
        }
        return cantTipo;
    }

//    @Override
//    public String toString() {
//        return "Inmobiliaria{" + "propiedades=" + propiedades + '}';
//    }
    
}
