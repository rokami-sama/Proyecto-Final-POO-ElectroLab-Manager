/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;
import InterfazGrafica.ElectroLabFrame;
import java.io.FileNotFoundException;
/**
 *
 * @author rodri
 */
public class MainGUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException {
        // TODO code application logic here
        new ElectroLabFrame().setVisible(true);
    }
    
}
