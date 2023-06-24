package preparcialTodoLibre;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public abstract class OrdenCompra implements Entregable {

    private int numero;
    private double monto;
    private Usuario vendedor;
    private Usuario comprador;

    public OrdenCompra(int numero, double monto, Usuario vendedor, Usuario comprador) {
        this.numero = numero;
        this.monto = monto;
        this.vendedor = vendedor;
        this.comprador = comprador;
    }

    public Usuario getVendedor() {
        return vendedor;
    }

    public Usuario getComprador() {
        return comprador;
    }
    
    @Override
    public Domicilio retornoDomicilioOrigen(){
        return vendedor.getDomicilio();
    }
    
    @Override
    public Domicilio retornoDomicilioDestino(){
        return comprador.getDomicilio();
    }

}