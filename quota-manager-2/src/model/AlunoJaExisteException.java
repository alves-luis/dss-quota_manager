/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Luís Alves,Rafaela Rodrigues, Diogo Gonçalves, André Gonçalves
 */
public class AlunoJaExisteException extends Exception {
    public AlunoJaExisteException() {
        super();
    }
    
    public AlunoJaExisteException(String msg) {
        super(msg);
    }
}
