/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Personas.*;

import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author rodri
 */
public class PersistenciaPrestamos {
    
    public static void guardar(ArrayList<Prestamo> prestamo){
        try {
            ObjectOutputStream salida=new ObjectOutputStream(new FileOutputStream("Prestamos.dat",true));
            salida.writeObject(prestamo);
            salida.close();
        } catch (IOException e) {
            System.out.println("Error al guardar los prestamos.");
        }
    }
    
    public static ArrayList<Prestamo> cargar() throws ClassNotFoundException, FileNotFoundException{
        try {
            ObjectInputStream entrada=new ObjectInputStream(new FileInputStream("Prestamos.dat"));
            ArrayList<Prestamo> prestamos=(ArrayList<Prestamo>) entrada.readObject();
            entrada.close();
            return prestamos;
                    
        } catch (IOException e) {
            return new ArrayList<>();
        }
    }
}
