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

    public Sensor(String nombre, String codigo, int stock, double voltaje, String tipoMedicion, double rango) {
        super(nombre, codigo, stock, voltaje);
        this.tipoMedicion = tipoMedicion;
        this.rango = rango;
    }
    
    public void calibrar(){
        
    }
    
    @Override
    public double calcularConsumo(){
        
    }

    @Override
    public String toString() {
        return "Sensor{" + "tipoMedicion=" + tipoMedicion + ", rango=" + rango + '}';
    }
    
}
