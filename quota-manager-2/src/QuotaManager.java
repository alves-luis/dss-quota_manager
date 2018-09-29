


import java.time.LocalDate;
import model.*;
import view.JQuotaManager;

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
            try {
                result.addAluno(a);
            }
            catch (AlunoJaExisteException e) {
                System.out.println("Alguém não sabe pré popular!");
            }
        }
        return result;
    }
    public static void main(String[] args) {
        GestaoAlunos model = QuotaManager.populate();
        AlunosTableModel table = new AlunosTableModel(model);
        JQuotaManager view = new JQuotaManager(table, model);
        System.out.println("Fim da aplicação!");
    }
}
