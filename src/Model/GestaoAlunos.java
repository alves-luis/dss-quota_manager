package Model;

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

    public void addAluno(Aluno a) {
        this.alunosPorNumero.put(a.getNumero(),a);
        this.valorPagoPorNumero.put(a.getNumero(),Double.valueOf(0));
    }

    /**
     * Método que devolve se o valor pago por um sócio corresponde ao valor da quota. Se o sócio não existir,
     * devolve false.
     * */
    public boolean quotaEmDia (Integer numero) {
        Double pago = this.valorPagoPorNumero.get(numero);
        if (pago == null) return false;
        else return (pago.equals(Double.valueOf(valorDaQuota)));
    }

    public void pagarQuota(Integer numero, Double valor) throws AlunoNaoExisteException, QuotaJaPagaException {


    }
}
