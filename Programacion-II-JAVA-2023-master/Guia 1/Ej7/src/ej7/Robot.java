/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej7;

/**
 *
 * @author giann
 */
public class Robot {
    private String nomRobot;
    
    public Robot(String nomRobot){
        this.nomRobot = nomRobot;
    }
    
    public void saludar(){
        System.out.println("Hola, mi nombre es "+ nomRobot + ". ¿En que puedo ayudarte?");
    }
    
    public void saludar(String persona){
        System.out.println("Hola " + persona + ", mi nombre es "+ nomRobot + ". ¿En que puedo ayudarte?");
    }
}
