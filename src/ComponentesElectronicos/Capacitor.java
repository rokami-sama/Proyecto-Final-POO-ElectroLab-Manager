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

    public Capacitor(String nombre, String codigo, int stock, double capacitancia) {
        super(nombre, codigo, stock);
        this.capacitancia = capacitancia;
    }

    public double getCapacitancia() {return capacitancia;}

    public void setCapacitancia(double capacitancia) {this.capacitancia = capacitancia;}
   

    @Override
    public String toString() {
        return "Capacitor{" + "capacitancia=" + capacitancia +'}';
    }
    
}
