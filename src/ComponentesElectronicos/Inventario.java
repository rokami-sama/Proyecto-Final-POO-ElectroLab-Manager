/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ComponentesElectronicos;

import java.util.ArrayList;

import Personas.Prestamo;
/**
 *
 * @author rodri
 */
public abstract class Inventario extends ComponentesElectronicos{
    private ArrayList<ComponentesElectronicos> componentes;
    private ArrayList<Prestamo> prestamos;

    public Inventario(String nombre, String codigo, int stock,
            ArrayList<ComponentesElectronicos> componentes, ArrayList<Prestamo> prestamos) {
        super(nombre, codigo, stock);
        this.componentes =new ArrayList<>(componentes);
        this.prestamos =new ArrayList<>(prestamos);
    }
    
    public ComponentesElectronicos buscarComponente(){
        
    }
    
    public void mostrarStockCritico(){
        
    }
}
