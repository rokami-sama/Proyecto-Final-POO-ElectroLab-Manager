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
public class PersistenciaUsuarios {
    
    public static void guardar(ArrayList<Usuario> usuario){
        try {
            ObjectOutputStream salida= new ObjectOutputStream(new FileOutputStream("Usuarios.dat",true));
            salida.writeObject(usuario);
            salida.close();
        } catch (IOException e) {
            System.out.println("Error: No se pudo guardar el archivo.");
        }
    }
    
    public static ArrayList<Usuario> cargar(){
        
    }
}
