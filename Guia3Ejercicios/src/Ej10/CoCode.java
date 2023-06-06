/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej10;

import java.util.ArrayList;

/**
 *
 * @author giann
 */
public class CoCode {
        
        private Sophie sophie;
        private ArrayList<Programa> programas;

        public CoCode(Sophie sophie) {
            this.sophie = sophie;
            programas = new ArrayList<>();
        }
        
        public void listarProgramas(Programa prog){
            if (prog != null) {
                programas.add(prog);
            }
        }
        
        public boolean umbralValido(double umbral){
            boolean valido = false;
            if (umbral >0 && umbral <10) {
                valido = true;
            }
            return valido;
        }
        
        public void analizarPorOrdenDeLlegada(){
            for (Programa programa : programas) {
                sophie.generarInforme(programa);
            }
        }
        
        public ArrayList<Programa> programasPorDebajoDe(double umbral){
            ArrayList<Programa> lista = new ArrayList<>();
            if (umbralValido(umbral)) {
                for (Programa programa : programas) {
                    if (programa.indiceCalidad()< umbral) {
                        lista.add(programa);
                    }
                }
            }
            return lista;
        }
        
}
