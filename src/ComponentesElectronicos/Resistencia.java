/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ComponentesElectronicos;

/**
 *
 * @author rodri
 */
public class Resistencia extends ComponentesElectronicos {
    private double resistenciaOhm;
    private double potenciaWatts;

    public Resistencia(String nombre, String codigo, int stock, double voltaje, double resistenciaOhm, double potenciaWatts) {
        super(nombre, codigo, stock, voltaje);
        this.resistenciaOhm = resistenciaOhm;
        this.potenciaWatts = potenciaWatts;
    }
    
    public double calcularCorriente(){
        return Math.sqrt(potenciaWatts)/Math.sqrt(resistenciaOhm);
    }
    

    @Override
    public String toString() {
        return "Resistencia{" + "resistenciaOhm=" + resistenciaOhm + ", potenciaWatts=" + potenciaWatts + '}';
    }
    
}
