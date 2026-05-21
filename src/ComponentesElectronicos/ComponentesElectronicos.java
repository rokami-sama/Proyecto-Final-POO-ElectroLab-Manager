/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ComponentesElectronicos;

/**
 *
 * @author rodri
 */
public abstract class ComponentesElectronicos {
    private String nombre;
    private String codigo;
    private int stock;
    private double voltaje;

    public ComponentesElectronicos(String nombre, String codigo, int stock, double voltaje) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.stock = stock;
        this.voltaje = voltaje;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getStock() {
        return stock;
    }

    public double getVoltaje() {
        return voltaje;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setVoltaje(double voltaje) {
        this.voltaje = voltaje;
    }
    
    public void agregarStock(int c){
        
    } 
    
    public void retirarStock(int c){
        
    }
    
    public String mostrarInfo(){
        
    }
    
    public double calcularConsumo(){
        
    }

    @Override
    public String toString() {
        return "ComponentesElectronicos{" + "nombre=" + nombre + ", codigo=" + codigo + ", stock=" + stock + ", voltaje=" + voltaje + '}';
    }
    
    
}
