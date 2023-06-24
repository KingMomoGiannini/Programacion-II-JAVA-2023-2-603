package preparcialTodoLibre;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Principal {

    public static void main(String[] args) {
        
        TodoLibreApp aplicacion = new TodoLibreApp();
        
        Domicilio dom = new Domicilio("Cochabamba",1564,90);
        Domicilio dom1 = new Domicilio("Uriburu",16,80);
        
        Usuario user = new Usuario("ROD87","Rodrigo","Fernandez","rofer@shimail.com",dom);
        Usuario user1= new Usuario("SERGIO15","Sergio","Perez","sergio@shimail.com",dom1);
        
        OrdenCompra oc = new OrdenPAP(123,2400.50,user,user1,true);
        //Faltan crear objetos
    }

}