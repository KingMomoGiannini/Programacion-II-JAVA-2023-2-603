/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej5;

import java.util.ArrayList;

/**
 *
 * @author giann
 */
public class Computadora {
    
    private ArrayList<Archivo> a;
    

    public Computadora() {
        a = new ArrayList<>();
    }
    
    public void crearArchivos(Archivo archivo){
        if (archivo != null) {
            a.add(archivo);
        }
    }
    
    public void cerrarTodos (){//Ok, comprobado en main
        for (Archivo archivo : a) { // Por cada archivo de la lista
            if (archivo.isEstado()) {
                archivo.setEstado(false);
            }
        }
    }
    
    public void archivosAbiertos(){
        int abiertos = 0;
        for (Archivo archivo : a) {
            if (archivo.isEstado()) {
                abiertos++;
            }
        }
        System.out.println("Archivos abiertos: " + abiertos);
    }
    
    public int cantArchivosDeTexto(){//Ok, comprobado en main
        int cantTexto = 0;
        for (Archivo archivo : a) {
            if (archivo instanceof Texto) {
                cantTexto++;
            }
        }
        return cantTexto;
    }
    
    public void cifrarArchivos(){//Ok, comprobado en main
        for (Archivo archivo : a) {
            if (archivo instanceof Texto ) {
                ((Texto) archivo).setCifrado(true);
            }
        }
    }
    
    public void cifradoArchivos(){//Ok, comprobado en main
        for (Archivo archivo : a) {
            if (archivo instanceof Texto ) {
                System.out.println(((Texto) archivo).isCifrado());
            }
        }
    }
    
    public double duracionPromedio(){//Ok, comprobado en main
        double durArchivos = 0;
        int cantArchivos = 0;
        for (Archivo archivo : a) {
            if (archivo instanceof ArchivoMultimedia) {
                cantArchivos ++;
                durArchivos += ((ArchivoMultimedia) archivo).getDuracion();
            }
        }
        return durArchivos/cantArchivos;
    }
    
    public ArrayList<Archivo> videosFullHD(){//Ok, comprobado en main
        ArrayList<Archivo> fullHD = new ArrayList<>(); 
        for (Archivo archivo : a) {
            if (archivo instanceof Video) {
                if(((Video) archivo).getResolucion().equals("1920x1080")){
                    fullHD.add(archivo);
                }
            }
        }
        return fullHD;
    }
    
}
