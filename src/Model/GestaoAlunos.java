package model;

import java.util.Map;
import java.util.TreeMap;

public class GestaoAlunos {
    private Map<Integer,Aluno> alunosPorNumero;
    private Map<Integer,Double> valorPagoPorNumero;
    private double valorDaQuota;

    public GestaoAlunos() {
        this.alunosPorNumero = new TreeMap<>();
        this.valorPagoPorNumero = new TreeMap<>();
        this.valorDaQuota = 250;
    }

    public double getValorDaQuota() {
        return valorDaQuota;
    }

    public Map<Integer, Aluno> getAlunos() {
        return alunosPorNumero;
    }

    public Aluno getAluno(int num) throws AlunoNaoExisteException {
        Aluno result = this.alunosPorNumero.get(num);
        if (result == null)
            throw new AlunoNaoExisteException(Integer.valueOf(num).toString());
        else
            return result;
    }

    /**
     * Método que adiciona um novo aluno ao sistema. Se já existir, é substituído
     */
    public void addAluno(Aluno a) {
        this.alunosPorNumero.put(a.getNumero(),a);
        this.valorPagoPorNumero.put(a.getNumero(), (double) 0);
    }

    /**
     * Método que devolve se o valor pago por um sócio corresponde ao valor da quota. Se o sócio não existir,
     * devolve false.
     */
    public boolean quotaEmDia (Integer numero) {
        Double pago = this.valorPagoPorNumero.get(numero);
        if (pago == null) return false;
        else return (pago.doubleValue() == valorDaQuota);
    }

    /**
     * Método que dado o ID de um sócio e um valor a pagar, atualiza os dados relativos ao estado de pagamento
     * das quotas do dado ID.
     */
    public void pagarQuota(Integer numero, Double valor) throws AlunoNaoExisteException, QuotaJaPagaException {
        Double pago = this.valorPagoPorNumero.get(numero);

        if (pago == null) throw new AlunoNaoExisteException(numero.toString());
        if (!quotaEmDia(numero)) throw new QuotaJaPagaException(numero.toString());

        double dividaFinal = pago.doubleValue() - valor.doubleValue();
        if (dividaFinal < 0) dividaFinal = 0;
        this.valorPagoPorNumero.put(numero,dividaFinal);
    }
}
