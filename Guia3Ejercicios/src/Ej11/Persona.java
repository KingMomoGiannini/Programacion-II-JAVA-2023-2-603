package Ej11;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Persona implements Interesado {

    private String nombre;
    private String dirEmail;
    private String apellido;
    private String telefono;

    public Persona(String telefono, String nombre, String apellido, String dirEmail) {
        this.nombre = nombre;
        this.dirEmail = dirEmail;
        this.apellido = apellido;
        this.telefono = telefono;
    }
    
    
    @Override
    public String recepcionMensaje(String mensaje) {
        return nombre +" "+ apellido + ":\nHe recibido un SMS en mi teléfono " +
                telefono + " con el mensaje: \n"+ mensaje;
    }

}