
import controller.Controller;
import model.GestaoAlunos;
import view.JView;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luís Alves
 */
public class QuotaManager {
    public static void main(String[] args) {
        GestaoAlunos model = new GestaoAlunos();
        JView view = new JView();
        Controller control = new Controller();
        control.startController();
        System.out.println("Fim da aplicação!");
        
        
    }
}
