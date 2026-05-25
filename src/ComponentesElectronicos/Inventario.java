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
    
    
    public ArrayList<ComponentesElectronicos> getComponentes() {
        return componentes;
    }

    public void agregarComponente(ComponentesElectronicos c){
        componentes.add(c);
    }
    
    /*Public void eliminarComponente(String codigo) throws ComponenteNoEncontradoException{
        for(ComponentesElectricos c: componentes){
            if(c.getCodigo().equalsIgnoreCase(codigo)){
                c.remove();
            }
        }
        throws new ComponenteNoEncontradoExcepcition();
    }
    */
    
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
            System.out.println("----------------");
        }
    }
}
