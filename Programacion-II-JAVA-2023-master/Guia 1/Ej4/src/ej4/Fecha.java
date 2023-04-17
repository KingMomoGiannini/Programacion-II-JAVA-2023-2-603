/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej4;

/**
 *
 * @author giann
 */
public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public void getfechaCadena(){
        if ((dia>0&&dia<32)&&(mes>0 && mes< 13)&&(anio>0)) {
            String diaCadena = Integer.toString(dia);
            String mesCadena = Integer.toString(mes);
            String anioCadena = Integer.toString(anio);
            System.out.println( diaCadena + "/" + mesCadena + "/" + anioCadena);
            esNavidad();
        }
        else{
            System.out.println("Fecha ingresada no válida.");
        }
    }
    
    public void esNavidad(){
        if(dia==25 && mes ==12){
            System.out.println("Es navidad");
        }
    }
    
    public void sumarMes(){
        mes += 1;
        if(mes>12){
            mes = 1;
            anio = anio + 1;
        }
    }
    
    
    
}
