
import controller.*;
import java.time.LocalDate;
import model.*;
import view.*;

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
    
    public static GestaoAlunos populate() {
        GestaoAlunos result = new GestaoAlunos();
        for(int i = 0; i < 10; i++) {
            Aluno a = new Aluno(i+1000, "João " + i, "MIEI", "Rua dos Jões", LocalDate.now().minusYears(i));
            result.addAluno(a);
            System.out.println(a.getAnoRegisto());
        }
        return result;
    }
    public static void main(String[] args) {
        GestaoAlunos model = QuotaManager.populate();
        JView view = new JView();
        Controller control = new Controller();
        control.setModel(model);
        control.startController();
        System.out.println("Fim da aplicação!");
        
        
    }
}
