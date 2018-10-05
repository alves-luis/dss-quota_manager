


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
 * @author Luís Alves,Rafaela Rodrigues, Diogo Gonçalves, André Gonçalves
 */
public class QuotaManager {
    
    public static GestaoAlunos populate() {
        GestaoAlunos result = new GestaoAlunos();
        Aluno a = new Aluno(1, "Afonso Henriques ", "MIEI", "Guimarães, Coimbra ou Viseu ", LocalDate.of(1139,7,26));
        Aluno b = new Aluno(6, "Dinís I ", "Direito", "Santarém ", LocalDate.of(1279,2,16));
        Aluno c = new Aluno(10, "João I ", "LCC", "Lisboa ", LocalDate.of(1385,4,6));
        Aluno d = new Aluno(16, "Sebastião I", "CA", "Lisboa", LocalDate.of(1557,6,11));
        Aluno e = new Aluno(21, "João IV ", "CC", "Vila Viçosa", LocalDate.of(1640,12,15));
        Aluno f = new Aluno(26, "Maria I ", "Biologia Aplicada", "Lisboa ", LocalDate.of(1777,2,24));
        Aluno g = new Aluno(30, "Miguel I ", "Enfermagem", "Quéluz ", LocalDate.of(1828,7,11));
        
        try {
                result.addAluno(a);
                result.addAluno(b);
                result.addAluno(c);
                result.addAluno(d);
                result.addAluno(e);
                result.addAluno(f);
                result.addAluno(g);
            }
            catch (AlunoJaExisteException r) {
                System.out.println("Alguém não sabe pré popular!");
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
