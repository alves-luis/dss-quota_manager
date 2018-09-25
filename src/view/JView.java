/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Luís Alves
 */
public class JView {
    private AdicionarAluno adicionarAluno;
    private ConsultarAlunos consultarAluno;
    private MenuSocio menuSocio;
    private PagarQuota pagarQuota;
    
    public JView() {
        this.adicionarAluno = new AdicionarAluno();
        this.consultarAluno = new ConsultarAlunos();
        this.menuSocio = new MenuSocio();
        this.pagarQuota = new PagarQuota();
    }
    
    
}
