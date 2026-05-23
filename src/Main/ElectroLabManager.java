/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import java.io.*;
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
        
        int opcion;
        
        do{
            System.out.println("------------BIENVENIDO A ELECTROLAB MANAGER----------");
            System.out.println("1.Registrar Usuario");
            System.out.println("2.Agregar Componente");
            System.out.println("3.Prestar Componente");
            System.out.println("4.Salir");
            
            opcion=sc.nextInt();
            sc.nextLine();
            
            switch(opcion){
                case 1://Registrar Usuario
                    System.out.println("a.Estudiante");
                    System.out.println("b.Docente");
                    char profesion;
                    profesion=sc.next().charAt(0);
                    switch(profesion){
                        case 'a':
                            System.out.println("Nombre: ");
                            System.out.println("ID: ");
                            System.out.println("Carrera: ");
                            System.out.println("Semestre: ");
                            
                            Estudiante estudiante=new Estudiante(nombre, id, carrera, opcion);
                            break;
                        case 'b':
                            
                            break;
                    }
                    System.out.println("/nUsuario: ");
                    usuarios=sc.nextLine();
                    Usuario usuario=new Usuario(nombre, id) {
                    
                    }
                case 2:
                    
                case 3:
                    
                case 4:
                    
            }
            
        }
        
        
        
    }
    
}
