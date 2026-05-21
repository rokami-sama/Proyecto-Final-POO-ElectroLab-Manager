/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;
import Excepctions.PrestamoInvalidoException;
import Excepctions.StockInsuficienteException;
import java.time.LocalDate;
import java.time.LocalTime;
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

    public int getSemestre() {return semestre;}
    public String getCarrera() {return carrera;}

    public void setSemestre(int semestre) {this.semestre = semestre;}
    public void setCarrera(String carrera) {this.carrera = carrera;}
    
    @Override
    public int limitePrestamos(){
        return 3;
    }

    @Override
    public String toString() {
        return "Estudiante{" +super.toString()+ "semestre= " + semestre + '}';
    }
    
}
