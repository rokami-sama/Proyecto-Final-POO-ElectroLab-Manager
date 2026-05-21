/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

import java.time.LocalDate;
import java.time.LocalTime;
import ComponentesElectronicos.*;
/**
 *
 * @author rodri
 */
public abstract class Prestamo extends Usuario {
    private LocalDate fecha;
    private LocalTime hora;
    private boolean devuelto; 

    public Prestamo(String nombre, String id, LocalDate fecha, LocalTime hora, boolean devuelto) {
        super(nombre, id);
        this.fecha = fecha;
        this.hora = hora;
        this.devuelto = devuelto;
    }
    
    public void solicitarPrestamo(){
        
    }
    
    public void devolver(){
        
    }

    @Override
    public String toString() {
        return "Prestamo{" + "fecha=" + fecha + ", hora=" + hora + ", devuelto=" + devuelto + '}';
    }
    
    
}
