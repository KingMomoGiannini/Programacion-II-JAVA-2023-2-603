package Ej9;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Principal {

    public static void main(String[] args) {
        
        Comercio com = new Comercio();
        
        Matematica m = new Matematica();
        
        Facturable in = new Insumo("teclado mecanico",20,1000,tipoInsumo.PERIFERICO,m);
        Facturable in1 = new Insumo("mouse",20,800,tipoInsumo.PERIFERICO,m);
        Facturable in2 = new Insumo("mouse gamer",20,1000,tipoInsumo.PERIFERICO,m);
        Facturable in3 = new Insumo("FuerzaG ReTX 2060",20,12000,tipoInsumo.HARDWARE,m);
        Facturable in4 = new Insumo("SSD 240gb",20,2000,tipoInsumo.HARDWARE,m);
        
        Facturable ser = new ServicioArmado (3,m);
        Facturable ser1 = new ServicioArmado (3,m);
        Facturable ser2 = new ServicioArmado (3,m);
        Facturable ser3 = new ServicioReparacion(5,3,m);
        Facturable ser4 = new ServicioReparacion(1,3,m);
        
        com.factura(ser);
        com.factura(ser1);
        com.factura(ser2);
        com.factura(ser3);
        com.factura(ser4);
        
        com.factura(in);
        com.factura(in1);
        com.factura(in2);
        com.factura(in3);
        com.factura(in4);
        
        System.out.println("Monto total de facturacion: $ " + com.montoTotalFacturado());
        System.out.println("Cantidad de servicios simples: " + com.cantServiciosSimples());
    }

}