/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author rodri
 */
public class Prestamo extends Usuario {
    private LocalDate fecha;
    private LocalTime hora;
    private boolean devuelto; 

    public Prestamo(String nombre, String id, String carrera, LocalDate fecha, LocalTime hora, boolean devuelto) {
        super(nombre, id, carrera);
        this.fecha = fecha;
        this.hora = hora;
        this.devuelto = devuelto;
    }
    
    public void devolver(){
        
    }

    @Override
    public String toString() {
        return "Prestamo{" + "fecha=" + fecha + ", hora=" + hora + ", devuelto=" + devuelto + '}';
    }
    
    
}
