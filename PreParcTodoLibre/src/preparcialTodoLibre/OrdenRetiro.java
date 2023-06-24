package preparcialTodoLibre;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class OrdenRetiro extends OrdenCompra {

    private SucursalCorreo correo;
    
    public OrdenRetiro(int numero, double monto, Usuario vendedor, Usuario comprador, SucursalCorreo correo) {
        super(numero, monto, vendedor, comprador);
        this.correo = correo;
    }
    
    public Domicilio getDomCorreo(){
        return correo.getDom();
    }

}