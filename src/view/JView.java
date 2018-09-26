/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.table.TableModel;

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
    }
    
    public void showConsultarAlunos(TableModel model) {
        this.consultarAluno = new ConsultarAlunos(model);
        consultarAluno.setVisible(true);
        consultarAluno.tabela_SociosSetModel(model);
        
    }
    
}
