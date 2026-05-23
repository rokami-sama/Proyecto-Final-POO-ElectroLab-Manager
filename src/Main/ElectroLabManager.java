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
        Scanner sc = new Scanner(System.in);

        Inventario inventario = PersistenciaInventario.cargar();
        ArrayList<Usuario> usuarios = PersistenciaUsuarios.cargar();
        ArrayList<Prestamo> prestamo = PersistenciaPrestamos.cargar();

        int opcion;

        do {
            System.out.println("------------BIENVENIDO A ELECTROLAB MANAGER----------");
            System.out.println("1.Registrar Usuario");
            System.out.println("2.Agregar Componente");
            System.out.println("3.Prestar Componente");
            System.out.println("4.Mostrar Prestamos");
            System.out.println("5.Devolver Prestamo");
            System.out.println("6.Mostrar Inventario");
            System.out.println("7.Buscar Componente");
            System.out.println("8.Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1://Registrar Usuario
                    System.out.println("a.Estudiante");
                    System.out.println("b.Docente");
                    char profesion;
                    profesion = sc.next().charAt(0);
                    switch (profesion) {
                        case 'a':
                            System.out.println("Nombre: ");
                            String nombreEst = sc.next();
                            System.out.println("ID: ");
                            String idEst = sc.next();
                            System.out.println("Carrera: ");
                            String carreraEst = sc.next();
                            System.out.println("Semestre: ");
                            int semestreEst = sc.nextInt();

                            Estudiante estudiante = new Estudiante(nombreEst, idEst, carreraEst, semestreEst);
                            System.out.println(estudiante.toString());
                            break;
                        case 'b':
                            System.out.println("Nombre: ");
                            String nombreDoc = sc.next();
                            System.out.println("ID: ");
                            String idDoc = sc.next();
                            System.out.println("Especialidad: ");
                            String especialidadDoc = sc.next();

                            Docente docente = new Docente(nombreDoc, idDoc, especialidadDoc);
                            System.out.println(docente.toString());
                            break;
                    }
                case 2://Agregar componente
                    System.out.println("a.Resistenica");
                    System.out.println("b.Capacitor");
                    System.out.println("c.Sensor");
                    char componente;
                    componente = sc.next().charAt(0);
                    switch (componente) {
                        case 'a':
                            System.out.println("Nombre: ");
                            String nombreRes = sc.next();
                            System.out.println("Codigo: ");
                            String codigoRes = sc.next();
                            System.out.println("Stock: ");
                            int stockRes = sc.nextInt();
                            System.out.println("Resistencia: ");
                            double resistenciaRes = sc.nextDouble();

                            Resistencia resistencia = new Resistencia(nombreRes, codigoRes, stockRes, resistenciaRes);
                            System.out.println(resistencia.toString());
                            break;
                        case 'b':
                            System.out.println("Nombre: ");
                            String nombreCap = sc.next();
                            System.out.println("Codigo: ");
                            String codigoCap = sc.next();
                            System.out.println("Stock: ");
                            int stockCap = sc.nextInt();
                            System.out.println("Resistencia: ");
                            double capacitanciaCap = sc.nextDouble();

                            Capacitor capacitor = new Capacitor(nombreCap, codigoCap, stockCap, capacitanciaCap);
                            System.out.println(capacitor.toString());
                            break;
                        case 'c':
                            System.out.println("Nombre: ");
                            String nombreSen = sc.next();
                            System.out.println("Codigo: ");
                            String codigoSen = sc.next();
                            System.out.println("Stock: ");
                            int stockSen = sc.nextInt();
                            System.out.println("TipoMedicion: ");
                            String capacitanciaSen = sc.next();

                            Sensor sensor = new Sensor(nombreSen, codigoSen, stockSen, capacitanciaSen);
                            System.out.println(sensor.toString());
                            break;
                    }
                case 3://Prestar Componente

                case 6://Mostrar Inventario
                    inventario.mostrarComponentes();
                    break;

                case 7://Buscar Componente
                    System.out.println("Codigo: ");
                    String codigoComp= sc.next();
                    try {
                        inventario.buscarComponente(codigoComp);
                    } catch (ComponenteNoEncontradoException ex) {
                        System.out.println(ex);
                    }
                    break;

                case 8://Salir
                    PersistenciaInventario.guardar(inventario);
                    System.out.println("Muchas Gracias por usar ELECTROLAB MANAGER! Adios.");
                    break;

            }

        } while (opcion != 8);

    }

}
