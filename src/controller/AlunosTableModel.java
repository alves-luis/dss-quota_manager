/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import model.Aluno;
import model.GestaoAlunos;
import model.Quota;

/**
 * Esta classe recebe informação sobre os alunos guardados no modelo e integra essa informação num TableModel
 * @author Luís Alves
 */
public class AlunosTableModel extends AbstractTableModel implements TableModelListener{
    
    private Map<Integer,Aluno> alunosPorNumero;
    private Map<Integer,Quota> quotasPorNumero;
    
    public AlunosTableModel(GestaoAlunos model) {
        alunosPorNumero = model.getAlunos();
        quotasPorNumero = model.getQuotas();
    }
    
    @Override
    public int getRowCount() {
        return this.alunosPorNumero.size();
    }

    @Override
    public int getColumnCount() {
        return 3; // numero, nome e quotas em dia
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch(columnIndex) {
            case 0: return "Número";
            case 1: return "Nome";
            case 2: return "Quotas em Dia";
            default: return "Erro";
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch(columnIndex) {
            case 0: return Integer.TYPE;
            case 1: return "foo".getClass();
            case 2: return Boolean.TYPE;
            default: return Integer.TYPE;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    
    /**
     * Dado um índice n da linha, devolve o identificador do n-ésimo aluno por ordem
     * decrescente
     */
    private Integer getValueAtNumero(int rowIndex) {
        Iterator it = this.alunosPorNumero.values().iterator();
        int i = 0;
        Object value = it.next();
        while(it.hasNext() && i != rowIndex) {
            i++;
            value = it.next();
        }
        return ((Aluno) value).getNumero();
    }
    
    /**
     * Dado um índice n da linha, devolve o nome do n-ésimo aluno
     */
    private String getValueAtNome(int rowIndex) {
        Iterator it = this.alunosPorNumero.values().iterator();
        int i = 0;
        Object value = it.next();
        while(it.hasNext() && i != rowIndex) {
            i++;
            value = it.next();
        }
        return ((Aluno) value).getNome();
    }
    
    /**
     * Dado um índice n da linha, devolve se tem as quotas em dia ou não
     */
    private Boolean getValueAtTemQuotasEmDia(int rowIndex) {
        Iterator it = this.quotasPorNumero.values().iterator();
        int i = 0;
        Object value = it.next();
        while(it.hasNext() && i != rowIndex) {
            i++;
            value = it.next();
        }
        return ((Quota) value).temQuotasEmDia();
    }
    
    /**
     * Dados dois índices, chama métodos correspondentes a cada coluna
     */
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 0: return getValueAtNumero(rowIndex);
            case 1: return getValueAtNome(rowIndex);
            case 2: return getValueAtTemQuotasEmDia(rowIndex);
            default: return getValueAtNumero(rowIndex);
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 0: setValueAtNumero(rowIndex, (Integer) aValue);
            case 1: setValueAtNome(rowIndex, (String) aValue);
            case 2: setValueAtTemQuotasEmDia(rowIndex, (Boolean) aValue);
        }
    }

    private void setValueAtNumero(int rowIndex, Integer aValue) {
        Iterator it = this.alunosPorNumero.values().iterator();
        int i = 0;
        Aluno old = (Aluno) it.next();
        while(it.hasNext() && i != rowIndex) {
            old = (Aluno) it.next();
            i++;
        }
        // Apenas altera o número, mantém o resto
        Aluno novo = new Aluno(old);
        int numeroAntigo = old.getNumero();
        novo.setNumero(aValue);
        this.alunosPorNumero.remove(numeroAntigo);
        this.alunosPorNumero.put(aValue,novo);
        Quota oldQuotas = this.quotasPorNumero.get(numeroAntigo);
        this.quotasPorNumero.remove(numeroAntigo);
        this.quotasPorNumero.put(aValue,oldQuotas);   
    }

    private void setValueAtNome(int rowIndex, String aValue) {
        Iterator it = this.alunosPorNumero.values().iterator();
        int i = 0;
        Aluno old = (Aluno) it.next();
        while(it.hasNext() && i != rowIndex) {
            old = (Aluno) it.next();
            i++;
        }
        // Apenas altera o nome, mantém o resto
        old.setNome(aValue); 
    }

    private void setValueAtTemQuotasEmDia(int rowIndex, Boolean aValue) {
        Iterator it = this.quotasPorNumero.values().iterator();
        int i = 0;
        Quota value = (Quota) it.next();
        while(it.hasNext() && i != rowIndex) {
            i++;
            value = (Quota) it.next();
        }
        if (!aValue)
            value.pagarQuota();
    }

    @Override
    public void tableChanged(TableModelEvent e) {
        int row = e.getFirstRow();
        int column = e.getColumn();
        TableModel model = (TableModel)e.getSource();
        String columnName = model.getColumnName(column);
        Object data = model.getValueAt(row, column);
        
    }
}
