/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Excepctions.*;
import ComponentesElectronicos.*;
import Persistencia.*;
import Personas.*;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author rodri
 */
public class ElectroLabManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        Inventario inventario= PersistenciaInventario.cargar();
        ArrayList<Usuario> usuarios= PersistenciaUsuarios.cargar();
        ArrayList<Prestamo> prestamo= PersistenciaPrestamos.cargar();
        
        
        
    }
    
}
