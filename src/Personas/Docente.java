/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

/**
 *
 * @author rodri
 */
public class Docente extends Usuario {
    private String especialidad;

    public Docente(String nombre, String id, String carrera, String especialidad) {
        super(nombre, id, carrera);
        this.especialidad = especialidad;
    }
    
    @Override
    public int limitePrestamos(){
        return 10;
    }

    @Override
    public String toString() {
        return "Docente{" + "especialidad=" + especialidad + '}';
    }
    
    
}
