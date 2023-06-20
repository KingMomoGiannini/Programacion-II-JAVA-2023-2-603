package Ej11;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Principal {

    public static void main(String[] args) {
        
        UProp uprop = new UProp();
        
        Inmobiliaria i = new Inmobiliaria(2,"Soldano", "soldanoinmuebles@soldano.com.ar");
        Inmobiliaria i1 = new Inmobiliaria(1,"Rimxa", "atencionrimxa@rimxa.com.ar");
        Inmobiliaria i2 = new Inmobiliaria(3,"Tu Lugar", "tulugar@inmolugar.com.ar");
        Inmobiliaria i3 = new Inmobiliaria(2,"Pepino inmobiliaria", "viviendaspepino@pepino.com.ar");
        
        Persona p = new Persona("15-83918512","Juan","Pelotas","juanpe@gemail.com");
        Persona p1 = new Persona("15-12309489","Matias","Enriquez","matenriq@gemail.com");
        Persona p2 = new Persona("15-98324791","Norma","Jala","jala-norma@gemail.com");
        Persona p3 = new Persona("15-73093842","Yesica","Gandara","Yesi93@gemail.com");
        Persona p4 = new Persona("15-83918512","Conejo","Pepito","mmmm@gemail.com");
        Persona p5 = new Persona("15-76452141","Soledad","Gerez","@gemail.com");
        Persona p6 = new Persona("15-67812390","Iara","Peña","peñara@gemail.com");        
        Persona p7 = new Persona("15-12389074","Salvador","Borges","salvaborges86@gemail.com");
        
        Inmueble in = new Inmueble("Thames 123,Malvinas Argentinas",29.3,5,95000);
        Inmueble in1 = new Inmueble("Jose Marmol 323, Martin Coronado",16.7,3,53000);
        Inmueble in2 = new Inmueble("Sarmiento 1233,Loma Hermosa",40.5,6,114000);
        Inmueble in3 = new Inmueble("Juan Domingo Perdon 1123, Pablo Podestá",14,2,48000);
        Inmueble in4 = new Inmueble("Lavalle 6581, Berazachuzets",30.6,4,85000);
        Inmueble in5 = new Inmueble("Madrid 3127, Malvinas Argentinas",36,5,99000);
        
        //agrego inmuebles a las inmobiliarias
        i.agregarInmueble(in);
        
        i1.agregarInmueble(in1);
        i1.agregarInmueble(in2);
        
        i2.agregarInmueble(in3);
        
        i3.agregarInmueble(in4);
        i3.agregarInmueble(in5);
        
        //Agregando clientes a las inmobiliarias
        
        i.agregarCliente(p1);
        i.agregarCliente(p2);
        
        i1.agregarCliente(p3);
        i1.agregarCliente(p4);
        i1.agregarCliente(p5);
        
        i2.agregarCliente(p6);
        i2.agregarCliente(p7);
        
        i3.agregarCliente(p3);
        i3.agregarCliente(p1);
        
        //agrego interesados a los inmuebles
        in.listarInteresados(i1);
        in.listarInteresados(p3);
        in.listarInteresados(p);
        
        in2.listarInteresados(p1);
        in2.listarInteresados(p2);
        in2.listarInteresados(p3);
        in2.listarInteresados(i);
        
        in3.listarInteresados(p4);
        
        in4.listarInteresados(i2);
        in4.listarInteresados(p5);
        
        in5.listarInteresados(i2);
        in5.listarInteresados(p6);
        in5.listarInteresados(p7);
        
        uprop.listarInmobiliarias(i);
        uprop.listarInmobiliarias(i1);
        uprop.listarInmobiliarias(i2);
        uprop.listarInmobiliarias(i3);
        
        //Probamos setPrecio() en un inmueble.
        
        //in2.setPrecio(120000);
        
        //Probamos setPrecio() dentro de otro metodo de la clase UProp en un inmueble.
        uprop.cambiarPrecioPropiedad(in2, 120000);
    }

    public Principal() {
    }
               
    

}