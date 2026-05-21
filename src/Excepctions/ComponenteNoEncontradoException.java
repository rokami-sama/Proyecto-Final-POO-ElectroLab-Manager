package Excepctions;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */

/**
 *
 * @author rodri
 */
public class ComponenteNoEncontradoException extends Exception {

    /**
     * Creates a new instance of <code>ComponenteNoEncontradoException</code>
     * without detail message.
     */
    public ComponenteNoEncontradoException() {
        super("Error: No se encontro el componente.");
    }

}
