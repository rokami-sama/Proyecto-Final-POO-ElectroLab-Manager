/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ComponentesElectronicos;

/**
 *
 * @author rodri
 */
public class Sensor extends ComponentesElectronicos {
    private String tipoMedicion;
    private double rango;
    private int stock;

    public Sensor(String nombre, String codigo, int stock, String tipoMedicion, double rango) {
        super(nombre, codigo);
        this.tipoMedicion = tipoMedicion;
        this.rango = rango;
        this.stock=stock;
    }

    public String getTipoMedicion() {
        return tipoMedicion;
    }

    public double getRango() {
        return rango;
    }

    public void setTipoMedicion(String tipoMedicion) {
        this.tipoMedicion = tipoMedicion;
    }

    public void setRango(double rango) {//falta la condicion para que sea solo positivo
        this.rango = rango;
    }
    
    

    @Override
    public String toString() {
        return "Sensor{" + "tipoMedicion=" + tipoMedicion + ", rango=" + rango + '}';
    }
    
}
