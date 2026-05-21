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

    public Estudiante(String nombre, String id, String carrera, int semestre) {
        super(nombre, id, carrera);
        this.semestre = semestre;
    }
    
    @Override
    public int limitePrestamos(){
        
    }

    @Override
    public String toString() {
        return "Estudiante{" + "semestre=" + semestre + '}';
    }
    
}
