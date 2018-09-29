package model;

import java.time.LocalDate;
import java.time.Month;
import java.util.Map;
import java.util.TreeMap;

public class Quota {
    private TreeMap<LocalDate,Double> pagamentos;
    private double valorDaQuota;

    public Quota() {
        this.pagamentos = new TreeMap<>();
        pagamentos.put(LocalDate.now(), (double) 0);
        this.valorDaQuota = 5;
    }

    public Quota(LocalDate dataInicial) {
        this.pagamentos = new TreeMap<>();
        this.valorDaQuota = 5;
        this.pagamentos.put(dataInicial,(double) 0);
        while(dataInicial.isBefore(LocalDate.now())) {
            this.pagamentos.put(dataInicial,(double) 0);
            dataInicial = dataInicial.plusMonths(1);
        }
    }

    public double getValorDaQuota() {
        return valorDaQuota;
    }

    public void setValorDaQuota(double valorDaQuota) {
        this.valorDaQuota = valorDaQuota;
    }

    public TreeMap<LocalDate, Double> getPagamentos() {
        return pagamentos;
    }

    /**
     * Coloca todas as quotas em dia
     */
    public void pagarQuota() {
        for(Map.Entry entry : this.pagamentos.entrySet()) {
            if (((Double) entry.getValue()).doubleValue() == 0)
                this.pagamentos.put((LocalDate) entry.getKey(),this.valorDaQuota);
        }
    }

    /**
     * Coloca as quotas da dada data em dia
     */
    public void pagarQuota(LocalDate date) {
        Month mesDaQuota = date.getMonth();
        int ano = date.getYear();
        if (date.isAfter(LocalDate.now())) return; // não é possível pagar quotas antecipadamente
        if (this.pagamentos.subMap(LocalDate.of(ano,mesDaQuota,1),LocalDate.of(ano,mesDaQuota,mesDaQuota.maxLength())).entrySet() != null) {
            this.pagamentos.put(LocalDate.now(),this.valorDaQuota);
        }
    }

    /**
     * Dado um valor, atualiza o máximo de quotas possível
     */
    public void pagarQuota(double valor) {
        for(Map.Entry entry : this.pagamentos.entrySet()) {
            double pagamento = valor >= valorDaQuota ? valorDaQuota : valor;
            entry.setValue(pagamento);
            valor -= pagamento;
            if (valor == 0) break;
        }
    }

    /**
     * Devolve se o utilizador tem as quotas em dia. Caso não tenha realizado pagamentos, devolve true.
     */
    public boolean temQuotasEmDia() {
        Map.Entry entry = this.pagamentos.lastEntry();
        if (entry == null) return true;
        if (((Double) entry.getValue()).doubleValue() >= valorDaQuota) return true;
        else return false;
    }

    /**
     * Método que devolve o valor total em dívida
     */
    public double valorEmDivida() {
        double divida = 0;
        for(Map.Entry entry : this.pagamentos.entrySet()) {
            double valorPago = ((Double) entry.getValue()).doubleValue();
            if (valorPago < this.valorDaQuota)
                divida += valorDaQuota - valorPago;
        }
        return divida;
    }
    
    /**
     * Adiciona uma nova entry ao plano de pagamentos da quota
     */
    public void atualizaUltimaQuotaPorPagar() {
        LocalDate agora = LocalDate.now();
        LocalDate ultimaVez = this.pagamentos.lastKey();
        while (agora.isAfter(ultimaVez) && agora.getMonthValue() > ultimaVez.getMonthValue()) {
            ultimaVez = ultimaVez.plusMonths(1);
            this.pagamentos.put(ultimaVez, (double) 0);
        }
            
    }


}
