/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej13;

/**
 *
 * @author giann
 */
public class Posnet {
    public static final double RECARGO_POR_CUOTA = 0.03;
    public static final double MIN_CANT_CUOTAS = 1; 
    public static final double MAX_CANT_CUOTAS = 6;
    
    public Ticket efectuarPago(TarjetaDeCredito tarjeta, double montoAAbonar, int cantCuotas){
        Ticket ticketGenerado = null;
        if(datosValidos(tarjeta,montoAAbonar,cantCuotas)){
            double montoFinal = montoAAbonar + montoAAbonar * recargoSegunCuotas(cantCuotas);
            if(tarjeta.tieneSaldoDisponible(montoFinal)){
                tarjeta.descontar(montoFinal);
                String nombreApellido= tarjeta.nombreCompletoTitular();
                double montoPorCuota = montoFinal /cantCuotas;
                ticketGenerado = new Ticket(nombreApellido, montoFinal, montoPorCuota);
            }
        }
        return ticketGenerado;
        
    }
    
    private boolean datosValidos(TarjetaDeCredito tarjeta,double monto, int cant){
        boolean tarjetaValida = (tarjeta != null);
        boolean montoValido = (monto > 0);
        boolean cuotasValidas = (cant >= MIN_CANT_CUOTAS && cant <= MAX_CANT_CUOTAS);

        return tarjetaValida && montoValido && cuotasValidas;
    }
    
    private double recargoSegunCuotas(int cantCuotas){
        return (cantCuotas - 1 ) * RECARGO_POR_CUOTA ;
    }
    
}
