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
    private String nombre;
    private String codigo;
    
    public ComponentesElectronicos(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() {return nombre;}
    public String getCodigo() {return codigo;}

    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setCodigo(String codigo) {this.codigo = codigo;}

    @Override
    public String toString() {
        return "ComponentesElectronicos{" + "nombre=" + nombre + ", codigo=" + codigo + ", stock=" + stock + '}';
    }
    
    
}
