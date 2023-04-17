/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2;


/**
 *
 * @author giann
 */
public class Empleado {
    private int dni;
    private int cantHijos;
    private double salarioBase;
    private String apellido;
    private String nombre;
    private String estadoCivil;
    
    //Creamos un Constructor para inicializar los atributos del objeto
    //creado en la clase principal.
    
    /*Los constructores, a diferencia de los metodos, no devuelven valores
    sino que se usan con el fin de asignarle un valor a determinado 
    atributo/variable*/
    
    public Empleado(int dni, int cantHijos, double salarioBase, String apellido, String nombre, String estadoCivil) {
        this.dni = dni;
        this.cantHijos = cantHijos;
        this.salarioBase = salarioBase;
        this.apellido = apellido;
        this.nombre = nombre;
        this.estadoCivil = estadoCivil;
    }

    /*  Este es el momento en el que perdimos 3 horas codificanto getters y setters
    
    public void setDni(int dni){
       this.dni = dni;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre; 
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido; 
    }
    
    public void setSalario(double salarioBase){
        this.salarioBase = salarioBase;
    }
    
    public void setEstado(String estadoCivil){
        this.estadoCivil = estadoCivil;
    }
    
    public void setCantHijos(int cantHijos){
        this.cantHijos = cantHijos;
    }
    */
    public void getDatos(){
        System.out.println(nombre + " " + apellido + " " + dni + " " + estadoCivil + " $" + salarioBase + " " + cantHijos);   
    }
    
    public double getSalarioFinal(){ //Forma facil: return base + plusPorHijo - dctoPorEstadoCivil;
        double salarioFinal = salarioBase;
        if (cantHijos > 0 && cantHijos <= 3 ){
            salarioFinal = salarioBase + ( salarioBase*(0.03)*cantHijos);
        }
        if (cantHijos >= 4){
            salarioFinal = salarioBase * 1.1;
        }
        if (estadoCivil.equals("Soltero")){
            salarioFinal = salarioFinal - (salarioFinal * 0.04);
        }
        return salarioFinal;
    }
    
}
