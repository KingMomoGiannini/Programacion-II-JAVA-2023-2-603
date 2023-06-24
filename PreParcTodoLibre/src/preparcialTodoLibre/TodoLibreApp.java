package preparcialTodoLibre;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class TodoLibreApp {

    private ArrayList<Usuario> usuarios;
    private ArrayList<OrdenCompra> ordenes;

    public TodoLibreApp() {
        usuarios = new ArrayList<>();
        ordenes = new ArrayList<>();
        
    }
    
    public void agregarUsuario (Usuario user){
        if (user != null) {
            usuarios.add(user);
        }
    }
    
    public void agregarOrden(OrdenCompra orden){
        if (orden != null) {
            ordenes.add(orden);
        }
    }
    
    public double porcOrdenMismaComuna(){
        int cant = 0;
        for (OrdenCompra orden : ordenes) {
            if (obtenerComuna(vendedor(orden)) == obtenerComuna(comprador(orden))) {
                cant++;
            }
        }
        return cant*100/ordenes.size();
    }
    
    public int cantOrdenesPAPGratis(){
        int cant = 0;
        for (OrdenCompra orden : ordenes) {
            if (orden instanceof OrdenPAP) {
                if(((OrdenPAP) orden).isEnvioGratuito()){
                    cant++;
                }
            }
        }
        return cant; 
    }
    
    public Usuario vendedor(OrdenCompra orden){
        return orden.getVendedor();
    }
    
    public Usuario comprador(OrdenCompra orden){
        return orden.getComprador();
    }
    
    public int obtenerComuna(Usuario user){
        return user.getDomicilio().getNumComuna();
    }
    
}