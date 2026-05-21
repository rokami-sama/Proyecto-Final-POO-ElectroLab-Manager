/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ComponentesElectronicos;

import java.util.ArrayList;

/**
 *
 * @author rodri
 */
public class Inventario extends ComponentesElectronicos{
    private ArrayList<ComponentesElectronicos> componentes;
    private ArrayList<Prestamo> prestamos;

    public Inventario(String nombre, String codigo, int stock, double voltaje,
            ArrayList<ComponentesElectronicos> componentes, ArrayList<Prestamo> prestamos) {
        super(nombre, codigo, stock, voltaje);
        this.componentes = componentes;
        this.prestamos = prestamos;
    }

    public void agregarComponente(){
        
    }
    
    public void eliminarComponente(){
        
    }
    
    public ComponentesElectronicos buscarComponente(){
        
    }
    
    public void mostrarStockCritico(){
        
    }
}
