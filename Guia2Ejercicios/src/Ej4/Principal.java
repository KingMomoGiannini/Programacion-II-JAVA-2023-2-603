/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ej4;

/**
 *
 * @author giann
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Marca m = new Marca();
        
        Concesionaria c = new Concesionaria("Pepito");
        Concesionaria c1 = new Concesionaria("Roldan");
        Concesionaria c2 = new Concesionaria("El Mono");
        
        Vehiculo v = new Vehiculo("ABC123",203000,TipoVehiculo.CAMIONETA);
        Vehiculo v1 = new Vehiculo("GHJ983",83091,TipoVehiculo.AUTO);
        Vehiculo v2 = new Vehiculo("QWE431",73194,TipoVehiculo.AUTO);
        Vehiculo v3 = new Vehiculo("ERT980",91023,TipoVehiculo.UTILITARIO);
        Vehiculo v4 = new Vehiculo("YTR234",181000,TipoVehiculo.CAMIONETA);
        Vehiculo v5 = new Vehiculo("IUY546",78201,TipoVehiculo.AUTO);
        Vehiculo v6 = new Vehiculo("OPI724",301000,TipoVehiculo.CAMIONETA);
        Vehiculo v7 = new Vehiculo("KEQ730",83100,TipoVehiculo.AUTO);
        Vehiculo v8 = new Vehiculo("MFJ135",145000,TipoVehiculo.UTILITARIO);
        Vehiculo v9 = new Vehiculo("OSK241",176000,TipoVehiculo.CAMIONETA);
        Vehiculo v10 = new Vehiculo("HAM916",64200,TipoVehiculo.AUTO);
        
        m.agregarConcesionaria(c);
        m.agregarConcesionaria(c1);
        m.agregarConcesionaria(c2);
        
        c.agregarVehiculo(v);
        c.agregarVehiculo(v1);
        c.agregarVehiculo(v2);
        c.agregarVehiculo(v3);
        c.agregarVehiculo(v10);
        
        c1.agregarVehiculo(v4);
        c1.agregarVehiculo(v5);
        c1.agregarVehiculo(v6);
        
        c2.agregarVehiculo(v7);
        c2.agregarVehiculo(v8);
        c2.agregarVehiculo(v9);
        
        //c.mostrarVehiculos();
        c.mostrarVehiculos(TipoVehiculo.AUTO);// item B
        
        System.out.println("\nVehiculos que la marca ofrece: ");
        m.mostrarVehiculos(); // item C
        System.out.println("\n");
        
        System.out.println(m.obtenerConcesionariaMaxVeh()+"\n");// item D
        
        m.borrarVehiculo("HAM916");
        
        System.out.println("\nVehiculos concesionaria " +c.getNombre() );
        c.mostrarVehiculos();
        
        m.cambiarVehiculoDeConsecionaria("ERT980", c2);
        
        System.out.println("\nVehiculos concesionaria " +c.getNombre() );
        c.mostrarVehiculos();
        
        System.out.println("\nVehiculos concesionaria "+ c2.getNombre());
        c2.mostrarVehiculos();
        
        System.out.println(m.obtenerConcesionariaMaxVeh()+"\n");// item D

        
    }
    
}
