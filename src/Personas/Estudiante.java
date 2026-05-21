/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

/**
 *
 * @author rodri
 */
public class Estudiante extends Usuario {
    private int semestre;
    private String carrera;
    
    public Estudiante(String nombre, String id, String carrera, int semestre) {
        super(nombre, id);
        this.carrera= carrera;
        this.semestre = semestre;
    }
    
    @Override
    public int limitePrestamos(){
        return 3;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "semestre=" + semestre + '}';
    }
    
}
