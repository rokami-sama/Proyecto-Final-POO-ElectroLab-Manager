package Excepctions;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */

/**
 *
 * @author rodri
 */
public class StockInsuficienteException extends Exception {

    /**
     * Creates a new instance of <code>StockInsuficienteException</code> without
     * detail message.
     */
    public StockInsuficienteException() {
        super("Error: Componente acabado.");
    }

}
