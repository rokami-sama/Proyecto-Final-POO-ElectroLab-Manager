/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package Excepctions;

/**
 *
 * @author rodri
 */
public class PrestamoInvalidoException extends Exception {

    /**
     * Creates a new instance of <code>PrestamoInvalidoException</code> without
     * detail message.
     */
    public PrestamoInvalidoException() {
        super("Error: No se puede realizar el prestamo.");    
    }

}
