/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.table.TableModel;
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
    
    public void setModel(GestaoAlunos mod) {
        this.model = mod;
    }
    
    public void setView(JView view) {
        this.view = view;
    }
    
    public void startController() {
        TableModel tabela = new AlunosTableModel(model);
        view.showConsultarAlunos(tabela);
    }
}
