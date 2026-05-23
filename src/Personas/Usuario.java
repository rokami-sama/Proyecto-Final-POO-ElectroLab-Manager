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
import java.util.ArrayList;
/**
 *
 * @author rodri
 */
public abstract class Usuario implements Serializable{
    protected String nombre;
    protected String id;
    protected ArrayList<Prestamo> prestamos;

    public Usuario(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        prestamos=new ArrayList<>;
                
    }

    public String getNombre() {return nombre;}
    public String getId() {return id;}

    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setId(String id) {this.id = id;}
 
    public abstract int limitePrestamos();
    
    public boolean puedePrestar(){
        return prestamos.size()<limitePrestamos();
    }
    
    public void agregarPrestamo(Prestamo p){
        prestamos.add(p);
    }
    
    public void devolverPrestamo(Prestamo p){
        prestamos.remove(p);
    }
    public void mostrarPrestamos(){
        if (prestamos.isEmpty()) {
            System.out.println("No hay prestamos");
        } else {
            for (Prestamo p : prestamos) {
                System.out.println(p);
                System.out.println("----------------");
            }
        }
    }
    

    @Override
    public String toString() {
        return "nombre=" + nombre + ", id=" + id + ',';
    }
    
    
}
