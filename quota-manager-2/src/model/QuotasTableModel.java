/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.Map;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

/**
 * 
 * @author Luís Alves,Rafaela Rodrigues, Diogo Gonçalves, André Gonçalves
 */
public class QuotasTableModel extends AbstractTableModel implements TableModelListener {
    
    private Quota historico;
    
    public QuotasTableModel(){
       this.historico=new Quota();
    }
    
    public QuotasTableModel(GestaoAlunos model, int aluno){
        this.historico= model.getQuotas().get(aluno);
    }
    
    @Override
    public int getRowCount() {
        return this.historico.getPagamentos().size();
    }

    @Override
    public int getColumnCount() {
        return 2; // data e respetivo valor da cota 
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        switch(columnIndex) {
            case 0: return "Data";
            case 1: return "Valor quota";
            default: return "Erro";
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch(columnIndex) {
            case 0: return LocalDate.now().getClass(); //não está certo
            case 1: return Double.TYPE;
            default: return Integer.TYPE;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    
    /**
     * Dado um índice n da linha, devolve o nome do n-ésimo aluno
     */
    private LocalDate getValueAtDate(int rowIndex) {
        Iterator it = this.historico.getPagamentos().keySet​().iterator();
        int i = 0;
        Object value = it.next();
        while(it.hasNext() && i != rowIndex) {
            i++;
            value = it.next();
        }
        return ((LocalDate) value);
    }
    
    /**
     * Dado um índice n da linha, devolve se tem as quotas em dia ou não
     */
    private Double getValueAtValor(int rowIndex) {
        Iterator it = this.historico.getPagamentos().values().iterator();
        int i = 0;
        Object value = it.next();
        while(it.hasNext() && i != rowIndex) {
            i++;
            value = it.next();
        }
        return ((Double) value);
    }
    
    /**
     * Dados dois índices, chama métodos correspondentes a cada coluna
     */
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 0: return getValueAtDate(rowIndex);
            case 1: return getValueAtValor(rowIndex);
            default: return getValueAtDate(rowIndex);
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 0: setValueAtDate(rowIndex, (LocalDate) aValue);
            case 1: setValueAtValor(rowIndex, (Double) aValue);
        }
    }

    private void setValueAtDate(int rowIndex, LocalDate aValue) {
        Iterator it = this.historico.getPagamentos().keySet​().iterator();
        int i = 0;
        LocalDate old = (LocalDate) it.next();
        while(it.hasNext() && i != rowIndex) {
            old = (LocalDate) it.next();
            i++;
        }
        // Apenas altera o número, mantém o resto
        double valor= this.historico.getPagamentos().get(old);
        this.historico.getPagamentos().remove(old);
        this.historico.getPagamentos().put(aValue,valor);
    }

    private void setValueAtValor(int rowIndex, Double aValue) {
        Iterator it = this.historico.getPagamentos().keySet​().iterator();
        int i = 0;
        LocalDate old = (LocalDate) it.next();
        while(it.hasNext() && i != rowIndex) {
            old = (LocalDate) it.next();
            i++;
        }
        // Apenas altera o número, mantém o resto
        this.historico.getPagamentos().replace(old,aValue);
    }


    @Override
    // THIS NEEDS TO BE DONE IN A WAY I DON'T KNOW
    public void tableChanged(TableModelEvent e) {
        
    }
}

