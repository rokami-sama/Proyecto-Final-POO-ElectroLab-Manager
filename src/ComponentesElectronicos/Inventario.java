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
public abstract class Inventario extends ComponentesElectronicos{
    private ArrayList<ComponentesElectronicos> componentes;

    public Inventario(String nombre, String codigo,
            ArrayList<ComponentesElectronicos> componentes) {
        super(nombre, codigo);
        this.componentes =new ArrayList<>(componentes);
    }

    public void agregarComponente(){
        List Lista= new 
    }
    
    public void eliminarComponente(){
        
    }
    
    public ComponentesElectronicos buscarComponente(){
        
    }
    
    public void mostrarStockCritico(){
        
    }
}
