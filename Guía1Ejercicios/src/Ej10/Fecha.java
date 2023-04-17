/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej10;


/**
 *
 * @author giann
 */
public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio) {
        setDia(dia);
        setMes(mes);
        setAnio(anio); 
    }
    
    public void setDia(int dia) {
        //validar día
        if(dia >=1 && dia <=31){
            this.dia = dia;
        }
        else{
            System.out.println("Nro. de DÍA inválido para una fecha");
        } 
    }

    public void setMes(int mes) {
        //validar mes
        if(mes >=1 && mes <=12){
            this.mes = mes;
        }
        else{
            System.out.println("Nro. de MES inválido para una fecha");
        }    
    }

    public void setAnio(int anio) {
        if (anio > 0) {
            this.anio = anio;     
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
    
    public void getFechaCadena(){
        System.out.println(toString());
        esNavidad();
    }

    @Override
    public String toString() {
        return "Fecha de apertura: " + dia + "/" + mes + "/" + anio ;
    }
    
    
}
