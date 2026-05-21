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

    public Capacitor(String nombre, String codigo, int stock, String tipo, double capacitancia) {
        super(nombre, codigo, stock);
        this.capacitancia = capacitancia;
        this.tipo = tipo;
    }

    public double getCapacitancia() {
        return capacitancia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setCapacitancia(double capacitancia) {
        this.capacitancia = capacitancia;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    

    @Override
    public String toString() {
        return "Capacitor{" + "capacitancia=" + capacitancia + ", tipo=" + tipo + '}';
    }
    
}
