/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import ComponentesElectronicos.*;
import java.io.*;

/**
 *
 * @author rodri
 */
public class PersistenciaInventario {
    
    public static void guardar(Inventario inventario){
        try {
            ObjectOutputStream salida= new ObjectOutputStream(new FileOutputStream("Inventario.dat",true));
            salida.writeObject(inventario);
            salida.close();
        } catch (IOException e) {
            System.out.println("Error al guardar  el archivo.");
        }
    }
    
    public static Inventario cargar(){
        try {
            ObjectInputStream entrada= new ObjectInputStream(new FileInputStream("Inventario.dat"));
            Inventario inventario=(Inventario) entrada.readObject();
            entrada.close();
            return inventario;
        } catch (IOException e) {
            //System.out.println("Error al cargar el archivo.");
            return new Inventario();
        }
    }
}
