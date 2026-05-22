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

    public Sensor(String nombre, String codigo, int stock, String tipoMedicion) {
        super(nombre, codigo, stock);
        this.tipoMedicion = tipoMedicion;
    }

    public String getTipoMedicion() {return tipoMedicion;}

    public void setTipoMedicion(String tipoMedicion) {this.tipoMedicion = tipoMedicion;}    

    @Override
    public String toString() {
        return "Sensor{" + "tipoMedicion=" + tipoMedicion + '}';
    }
    
}
