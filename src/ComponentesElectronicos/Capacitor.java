/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ComponentesElectronicos;

/**
 *
 * @author rodri
 */
public class Capacitor extends ComponentesElectronicos {
    private double capacitancia;
    private String tipo;

    public Capacitor(String nombre, String codigo, int stock, double voltaje, double capacitancia, String tipo) {
        super(nombre, codigo, stock, voltaje);
        this.capacitancia = capacitancia;
        this.tipo = tipo;
    }
    
    public void cargar(){
        
    }
    public void descargar(){
        
    }

    @Override
    public String toString() {
        return "Capacitor{" + "capacitancia=" + capacitancia + ", tipo=" + tipo + '}';
    }
    
}
