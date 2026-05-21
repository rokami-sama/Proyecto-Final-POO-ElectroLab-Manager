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
    private int stock;

    public Resistencia(String nombre, String codigo, int stock, double resistenciaOhm, double potenciaWatts) {
        super(nombre, codigo, stock);
        this.resistenciaOhm = resistenciaOhm;
        this.potenciaWatts = potenciaWatts;
    }

    public double getResistenciaOhm() {
        return resistenciaOhm;
    }

    public double getPotenciaWatts() {
        return potenciaWatts;
    }

    public void setResistenciaOhm(double resistenciaOhm) {//falta la condicion para que sea solo positivo
        this.resistenciaOhm = resistenciaOhm;
    }

    public void setPotenciaWatts(double potenciaWatts) {//falta la condicion para que sea solo positivo
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
