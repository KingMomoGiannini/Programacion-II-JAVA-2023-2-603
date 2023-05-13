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
        
        Video v = new Video(240,false,"clase 1",200,true,"c:<downloads","640x480",FormatoVideo.FLV);
        Video v1 = new Video(200,false,"clase 2",250,true,"c:<downloads","1920x1080",FormatoVideo.MP4);
        Video v2 = new Video(240,false,"clase 3",260,true,"c:<downloads","640x480",FormatoVideo.MKV);
        
        Audio a = new Audio(200,false,"bili shin",200,"c:<Musica",false,"maikel shacson","triler",FormatoAudio.AAC);
        Audio a1 = new Audio(150,true,"master of popets",200,"c:<Musica",true,"metalica","raid de laitin",FormatoAudio.AAC);
        Audio a2 = new Audio(320,false,"souls of blac",200,"c:<Musica",false,"testamen","souls of blac",FormatoAudio.AAC);
        
        Texto text = new Texto("receta blondies",1,"c:<mama",false,"UTF-8",false);
        Texto text1 = new Texto("recetas brownies",2,"c:<mama",false,"UTF-9",false);
        Texto text2 = new Texto("recetas bolognesa",2.4,"c:<mama",true,"UTF-9",false);
        Texto text3 = new Texto("recetas empanadas de carne",2,"c:<mama",false,"UTF-8",false);
        Texto text4 = new Texto("recetas albondigas",2.1,"c:<mama",true,"UTF-8",false);
        
        c.crearArchivos(a);
        c.crearArchivos(a1);
        c.crearArchivos(a2);
        
        c.crearArchivos(v);
        c.crearArchivos(v1);
        c.crearArchivos(v2);
        
        c.crearArchivos(text);
        c.crearArchivos(text1);
        c.crearArchivos(text2);
        c.crearArchivos(text3);
        c.crearArchivos(text4);
        
        System.out.println(c.duracionPromedio());//ok
        
        c.cifradoArchivos();
        System.out.println("");
        
        c.cifrarArchivos();// ok 
        
        System.out.println(c.cantArchivosDeTexto());// ok 
        
        c.archivosAbiertos();
        c.cerrarTodos();// ok
        c.archivosAbiertos();
        System.out.println("");
        
        System.out.println(c.videosFullHD());//ok
        
    }
    
}
