/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

import Excepctions.*;
import java.time.LocalDate;
import java.time.LocalTime;
import ComponentesElectronicos.*;
import java.io.Serializable;
/**
 *
 * @author rodri
 */
public abstract class Prestamo implements Serializable{
    private Usuario usuario;
    private ComponentesElectronicos componente;
    private LocalDate fechaPrestamo;
    private LocalDate fechaLimite;
    private boolean devuelto;
    private int cantidad;

    public Prestamo(Usuario usuario, ComponentesElectronicos componente, int cantidad) {
        this.usuario= usuario;
        this.componente = componente;
        this.cantidad=cantidad;
        fechaPrestamo = LocalDate.now();
        fechaLimite = fechaPrestamo.plusDays(7);
        devuelto = false;
    }
    
    public void devolver(){
        devuelto= true;
        componente.devolverStock(cantidad);
        usuario.devolverPrestamo();
    }

    @Override
    public String toString() {
        return "Prestamo{" + "usuario=" + usuario + ", componente=" + componente + 
                ", fechaPrestamo=" + fechaPrestamo + ", fechaLimite=" + fechaLimite + ", devuelto=" + devuelto + '}';
    }
    

    
    
    
}
