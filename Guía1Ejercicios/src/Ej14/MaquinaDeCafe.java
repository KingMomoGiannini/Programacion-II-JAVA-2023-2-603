/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej14;

/**
 *
 * @author giann
 */
public class MaquinaDeCafe {
    private String marca;
    private boolean estado;
    private ModuloDeLeche moduloLeche;
    private ModuloDeAgua moduloAgua;
//    private TipoDeCafe tipoCafe;

    public MaquinaDeCafe(String marca, boolean estado, ModuloDeLeche moduloLeche, ModuloDeAgua moduloAgua) {
        this.marca = marca;
        this.estado = estado;
        this.moduloLeche = moduloLeche;
        this.moduloAgua = moduloAgua;
    }
    
    public void servirCafe(TipoDeCafe tipoCafe){
//        ModuloDeAgua agua = new ModuloDeAgua(70,true);
//        ModuloDeLeche leche = new ModuloDeLeche(0,TipoDeLeche.LIQUIDA);
        if(maquinaLista()){ //Si la maquina está lista
            if(tipoCafe.getPuntosLeche()>0 && moduloLeche.lecheSuficiente(tipoCafe.getPuntosLeche())){
                moduloLeche.restarPuntos(tipoCafe.getPuntosLeche());
                
//                System.out.println(tipoCafe.toString());
                System.out.println("El cafe " + tipoCafe + " se ha servido correctamente.");
            }
            else if(tipoCafe.getPuntosLeche() == 0 ){
                System.out.println("El cafe " + tipoCafe + " se ha servido correctamente.");
            }
            else{
                System.out.println("No hay leche suficiente. Recargue el modulo.");
            }
        }
    }
    
    public boolean maquinaLista(){ // Comprueba si la maquina está encendida y lista
        return moduloAgua.aguaLista() && estado;
    }
    
//    public boolean conLeche(){
//        
//    }
    
}
