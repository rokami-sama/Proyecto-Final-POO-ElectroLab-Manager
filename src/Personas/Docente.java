/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;
import Excepctions.PrestamoInvalidoException;
import Excepctions.StockInsuficienteException;
import ComponentesElectronicos.*;
import java.time.LocalDate;
import java.time.LocalTime;
/**
 *
 * @author rodri
 */
public abstract class Docente extends Usuario {
    private String especialidad;

    public Docente(String nombre, String id, String especialidad) {
        super(nombre, id);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {return especialidad;}

    public void setEspecialidad(String especialidad) {this.especialidad = especialidad;}
    
    public void solicitarPrestamo(){
        try {
            if(){
                
            }
        } catch (Exception e) {
        }
    }
    
    public int limitePrestamos(){
        return 10;
    }

    @Override
    public String toString() {
        return "Docente{" +super.toString()+ "especialidad=" + especialidad + '}';
    }
    
    
}
