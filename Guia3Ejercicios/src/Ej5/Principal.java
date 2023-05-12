/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ej5;

/**
 *
 * @author giann
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Computadora c = new Computadora();
        
        Video v = new Video(240,false,"clase 1",200,false,"c:<downloads","640x480",FormatoVideo.FLV);
        Audio a = new Audio(200,false,"bili shin",200,"c:<Musica",false,"maikel shacson","triler",FormatoAudio.AAC);
        Texto text = new Texto("recetas",1,"c:<mama",false,"UTF-8");
        
        
    }
    
}
