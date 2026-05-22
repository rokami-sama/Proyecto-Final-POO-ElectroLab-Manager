/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

import Excepctions.*;
import ComponentesElectronicos.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.io.Serializable;
/**
 *
 * @author rodri
 */
public abstract class Usuario implements Serializable{
    protected String nombre;
    protected String id;

    public Usuario(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {return nombre;}
    public String getId() {return id;}

    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setId(String id) {this.id = id;}
 
    public abstract void prestamosActivos();
    

    @Override
    public String toString() {
        return "nombre=" + nombre + ", id=" + id + ',';
    }
    
    
}
