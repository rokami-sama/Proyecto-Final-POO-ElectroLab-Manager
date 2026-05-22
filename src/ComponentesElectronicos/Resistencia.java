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

    public Resistencia(String nombre, String codigo, int stock, double resistenciaOhm) {
        super(nombre, codigo, stock);
        this.resistenciaOhm = resistenciaOhm;
    }

    public double getResistenciaOhm() {
        return resistenciaOhm;
    }

    public void setResistenciaOhm(double resistenciaOhm) {//falta la condicion para que sea solo positivo
        this.resistenciaOhm = resistenciaOhm;
    }

    @Override
    public String toString() {
        return "Resistencia{" + "resistenciaOhm=" + resistenciaOhm + '}';
    }
    
}
