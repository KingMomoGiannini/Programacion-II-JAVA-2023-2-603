/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ej3;

/**
 *
 * @author giann
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaBancaria p1 = new CuentaBancaria("Cuenta corriente");
        p1.getDatos();
        p1.getSaldo();
        p1.setDepositar(400);
        p1.getSaldo();
        p1.setExtraccion(500);
        p1.getUltimosCBU(3);
        p1.getDatos();    }
    
<<<<<<< HEAD
}
=======
}/*
private String CBU;
    private String tipoCaja;
    private double saldo;

    public CuentaBancaria(String tipoCaja) {
        this.tipoCaja = tipoCaja;
        this.CBU = generarCBU();
    }

    public void getDatos(){
        System.out.println(toString());
    }
    
    public void getSaldo() {
        System.out.println("Saldo: $" + saldo);
    }
    
    public void setDepositar(double monto){
        if(monto>0){
            saldo += monto;
        }
        else{
            System.out.println("Error de depósito");
        }
    }
    
    public void setExtraccion(double monto){
        if(tipoCaja.equals("Cuenta corriente") || saldo>=monto ){
            saldo -=monto;
            System.out.println("Se han extraido: $" + monto);
        }
        else{
            System.out.println("Saldo insuficiente para el tipo de cuenta que posee.");
        }
    }
    
    private String generarCBU() {
        Random r = new Random();
        String elCbu = "";
        for (int i = 0; i < 22; i++) {
            elCbu += r.nextInt(10);
        }
        return elCbu;        
    }
    
    public void getUltimosCBU(int cuantos){
        String ultimos = CBU.substring(CBU.length() - cuantos);
        System.out.println("Últimos " + cuantos + " dígitos del CBU: " + ultimos);
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "CBU=" + CBU + ", tipoCaja=" + tipoCaja + ", saldo=" + saldo + '}';
    }

*/
>>>>>>> 1e7e90b (Ejercicio 8)
