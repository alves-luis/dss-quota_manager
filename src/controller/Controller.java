/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.GestaoAlunos;
import view.JView;

/**
 *
 * @author Luís Alves
 */
public class Controller {
    
    private GestaoAlunos model;
    private JView view;
    
    public Controller() {
        this.model = new GestaoAlunos();
        this.view = new JView();
    }
}
