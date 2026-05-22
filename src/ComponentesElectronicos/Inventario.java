/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ComponentesElectronicos;

import java.util.ArrayList;
import java.io.Serializable;
import Excepctions.*;
/**
 *
 * @author rodri
 */
public class Inventario implements Serializable{
    private ArrayList<ComponentesElectronicos> componentes= new ArrayList<>();

    public void agregarComponente(ComponentesElectronicos c){
        componentes.add(c);
    }
    
    public void eliminarComponente(ComponentesElectronicos c){
        if(c){
            
        }
    }
    
    public ComponentesElectronicos buscarComponente(String codigo) throws ComponenteNoEncontradoException{
        for(ComponentesElectronicos c: componentes){
            if(c.getCodigo().equalsIgnoreCase(codigo)){
                return c;
            }
        }
        throw new ComponenteNoEncontradoException();
    }
    
    public void mostrarComponentes(){
        for(ComponentesElectronicos c: componentes){
            System.out.println(c);
        }
    }
}
