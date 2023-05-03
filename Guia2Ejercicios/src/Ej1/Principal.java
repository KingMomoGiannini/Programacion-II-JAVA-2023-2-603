package Ej1;

import java.util.ArrayList;

/**
 *
 * @author giann
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Domicilio d = new Domicilio("Thames",123,"Malvinas Argentinas");
        Domicilio d1 = new Domicilio("Jose Marmol",323,"Martin Coronado");
        Domicilio d2 = new Domicilio("Sarmiento",1233,"Loma Hermosa");
        Domicilio d3 = new Domicilio("Juan Domingo Perdon",1123,"Pablo Podesta");
        Domicilio d4 = new Domicilio("Lavalle",6581,"Berazachuzets");
        Domicilio d5 = new Domicilio("Tepincho",6565,"Gilmes");
        Domicilio d6 = new Domicilio("Tepinchodenuevo",8432,"Jose Cuchillo Paz");
        Domicilio d7 = new Domicilio("Madrid",3127,"Malvinas Argentinas");
        
        Domicilio d8 = new Domicilio("Goyeneche",4567,"Barrio nuevo");
        
        

        Persona p = new Persona("83918512","Juan","Pelotas",d);
        Persona p1 = new Persona("12309489","Matias","Enriquez",d1);
        Persona p2 = new Persona("98324791","Norma","Jala",d2);
        Persona p3 = new Persona("73093842","Yesica","Gandara",d3);
        Persona p4 = new Persona("83918512","Conejo","Pepito",d4);
        Persona p5 = new Persona("76452141","Soledad","Gerez",d5);
        Persona p6 = new Persona("67812390","Iara","Peña",d6);        
        Persona p7 = new Persona("12389074","Salvador","Borges",d7);

        
        Agenda a = new Agenda();
        
        a.listarPersonas();
        
        a.agregarPersona(p);
        a.agregarPersona(p1);
        a.agregarPersona(p2);
        a.agregarPersona(p3);
        a.agregarPersona(p4);
        a.agregarPersona(p5);
        a.agregarPersona(p6);
        a.agregarPersona(p7);

        a.listarPersonas();
        
        a.removerPersona("12309489");
        
        a.obtenerPorBarrio("Loma Hermosa");
        
        System.out.println(a.buscarPersona("76452141") + "\n");
        
        System.out.println(a.devolverUltimo()+"\n");
        
        a.modificarDomicilio("73093842", d8);
        
        a.listarPersonas();
        
        a.vaciar();
                
        a.listarPersonas();
    }
    
}
