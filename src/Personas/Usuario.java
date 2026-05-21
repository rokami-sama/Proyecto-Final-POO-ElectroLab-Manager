/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

/**
 *
 * @author rodri
 */
public abstract class Usuario {
    private String nombre;
    private String id;
    private String carrera;

    public Usuario(String nombre, String id, String carrera) {
        this.nombre = nombre;
        this.id = id;
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    public void solicitarPrestamo(){
        
    }
    
    public int limitePrestamos(){
        
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", id=" + id + ", carrera=" + carrera + '}';
    }
    
    
}
