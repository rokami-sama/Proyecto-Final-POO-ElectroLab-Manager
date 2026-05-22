/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ComponentesElectronicos;

import java.io.Serializable;

/**
 *
 * @author rodri
 */
public abstract class ComponentesElectronicos implements Serializable {
    protected String nombre;
    protected String codigo;
    protected int stock;
    
    
    public ComponentesElectronicos(String nombre, String codigo, int stock) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.stock = stock;
    }

    public String getNombre() {return nombre;}
    public String getCodigo() {return codigo;}
    public int getStock() {return stock;}
    
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setCodigo(String codigo) {this.codigo = codigo;}
    public void setStock(int stock) {this.stock = stock;}

    public void agregarStock(int s){
        stock+=s;
    }
    public void reducirStock(){
        
        
    }
    
    @Override
    public String toString() {
        return "ComponentesElectronicos{" + "nombre=" + nombre + ", codigo=" + codigo + '}';
    }
    
    
}
