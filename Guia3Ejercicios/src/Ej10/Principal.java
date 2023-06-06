package Ej10;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Principal {

    public static void main(String[] args) {
                
        Sophie sophie = new Sophie();
        
        CoCode empresa = new CoCode(sophie);
        
        Programa p = new Programa("110","Programa","Jose Cuervo",true);
        Programa p1 = new Programa("111","Programa1","Rodrigo Sanchez",true);
        Programa p2 = new Programa("112","Programa2","Fulano Alvarez",true);
        Programa p3 = new Programa("113","Programa3","Mengano Sosa",false);
        Programa p4 = new Programa("114","Programa4","Mengana Paz",true);
        
        Fuente f = new LenguajeDeMarcado(200,"VisualPrograma.html","DESKTOP-KQ42YM5\\user\\proyecto1");
        Fuente f1 = new LenguajeDeMarcado(45,"VisualPrograma1.xml","DESKTOP-UI78KL3\\user\\proyecto1");
        Fuente f2 = new LenguajeDeMarcado(87,"VisualPrograma2.html","DESKTOP-LV89JU9\\user\\proyecto1");
        Fuente f3 = new LenguajeDeMarcado(73,"VisualPrograma3.html","DESKTOP-DV66JO3\\user\\proyecto1");
        Fuente f4 = new LenguajeDeMarcado(40,"visualPrograma4.html","DESKTOP-GH83SW7\\user\\proyecto1");
        
        LenguajeDeProgramacion f5 = new LenguajeDeProgramacion("appPrograma.java","DESKTOP-KQ42YM5\\user\\proyecto1\\archivos-de-fuente-de-programacion");
        LenguajeDeProgramacion f6 = new LenguajeDeProgramacion("appPrograma1.js","DESKTOP-UI78KL3\\user\\proyecto1\\archivos-de-fuente-de-programacion");
        LenguajeDeProgramacion f7 = new LenguajeDeProgramacion("appPrograma2.java","DESKTOP-LV89JU9\\user\\proyecto1\\archivos-de-fuente-de-programacion");
        LenguajeDeProgramacion f8 = new LenguajeDeProgramacion("appPrograma3.cs","DESKTOP-DV66JO3\\user\\proyecto1\\archivos-de-fuente-de-programacion");
        LenguajeDeProgramacion f9 = new LenguajeDeProgramacion("appPrograma4.js","DESKTOP-GH83SW7\\user\\proyecto1\\archivos-de-fuente-de-programacion");
        
        Metodo m = new Metodo("metodo1",1,4,1); //hay que seguir creando metodos
        Metodo m1 = new Metodo("metodo2",2,5,2);
        Metodo m2 = new Metodo("metodo3",3,3,2);
        
        Metodo m3 = new Metodo("metodo4",5,4,6);
        Metodo m4 = new Metodo("metodo5",6,4,8);
        
        Metodo m5 = new Metodo("metodo6",4,7,6);
        Metodo m6 = new Metodo("metodo7",5,4,5);
        
        Metodo m7 = new Metodo("metodo8",8,8,8);
        Metodo m8 = new Metodo("metodo9",4,4,1);
        Metodo m9 = new Metodo("metodo10",5,8,4);
        
//        Metodo m10 = new Metodo("metodo11",4,8,5);
//        Metodo m11 = new Metodo("metodo12",1,4,4);
//        Metodo m12 = new Metodo("metodo13",6,7,4);
        
        Metodo m13 = new Metodo("metodo14",1,1,1);
        Metodo m14 = new Metodo("metodo15",2,3,2);
        
        f5.agregarMetodos(m);
        f5.agregarMetodos(m1);
        f5.agregarMetodos(m2);
        
        f6.agregarMetodos(m3);
        f6.agregarMetodos(m4);
        
        f7.agregarMetodos(m5);
        f7.agregarMetodos(m6);
        
        f8.agregarMetodos(m7);
        f8.agregarMetodos(m8);
        f8.agregarMetodos(m9);
        
        f9.agregarMetodos(m13);
        f5.agregarMetodos(m14);
        
        p.agregarFuentes(f,f5);
        p1.agregarFuentes(f1, f6);
        p2.agregarFuentes(f2, f7);
        p3.agregarFuentes(f3, f8);
        p4.agregarFuentes(f4, f9);
        
        empresa.listarProgramas(p);
        empresa.listarProgramas(p1);
        empresa.listarProgramas(p2);
        empresa.listarProgramas(p3);
        empresa.listarProgramas(p4);
        
        //Item C
        System.out.println(empresa.programasPorDebajoDe(7));
        
        //item D
        p.mostrarDetalleDeMetodo("metodo2");//Metodo existente en el programa P 
        p.mostrarDetalleDeMetodo("metodo5");//Metodo inexistente en el programa P
        
        p3.mostrarDetalleDeMetodo("metodo8");
        
        p4.mostrarDetalleDeMetodo("metodo14");
        
        empresa.analizarPorOrdenDeLlegada();
        //Falta ITEM E
        

    }

}