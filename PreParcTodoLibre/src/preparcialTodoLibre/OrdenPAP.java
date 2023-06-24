package preparcialTodoLibre;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class OrdenPAP extends OrdenCompra {

    private boolean envioGratuito;
    
    public OrdenPAP(int numero, double monto, Usuario vendedor, Usuario comprador, boolean envioGratuito) {
        super(numero, monto, vendedor, comprador);
        this.envioGratuito = envioGratuito;
    }

    public boolean isEnvioGratuito() {
        return envioGratuito;
    }
    
    public Domicilio domicilioDestino(){
        return super.getComprador().getDomicilio();
    }
    
    public Domicilio domicilioOrigen(){
        return super.getVendedor().getDomicilio();
    }
    
}