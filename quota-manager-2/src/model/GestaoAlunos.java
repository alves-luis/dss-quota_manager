package model;


import java.time.LocalDate;
import java.util.Map;
import java.util.Observable;
import java.util.TreeMap;

public class GestaoAlunos extends Observable {

    private TreeMap<Integer,Aluno> alunosPorNumero;
    private Map<Integer,Quota> quotasPorNumero;
    private LocalDate ultimaAtualizacao;

    public GestaoAlunos() {
        this.alunosPorNumero = new TreeMap<>();
        this.quotasPorNumero = new TreeMap<>();
        this.ultimaAtualizacao = LocalDate.now();
    }

    public Map<Integer, Aluno> getAlunos() {
        return alunosPorNumero;
    }
    
    public Map<Integer,Quota> getQuotas() {
        return quotasPorNumero;
    }

    public Aluno getAluno(int num) throws AlunoNaoExisteException {
        Aluno result = this.alunosPorNumero.get(num);
        if (result == null)
            throw new AlunoNaoExisteException(num);
        else
            return result;
    }
    
    /**
     * Método que coloca novas entradas para pagamentos pendentes de quotas
     * caso o mês atual ainda não esteja incluído no "plano de quotas" dos alunos
     */
    public void atualizaData() {
        this.quotasPorNumero.values().stream().forEach(q -> q.atualizaUltimaQuotaPorPagar());
        this.ultimaAtualizacao = LocalDate.now();
        this.setChanged();
        this.notifyObservers();
    }

    /**
     * Método que adiciona um novo aluno ao sistema. Se já existir, é substituído
     */
    public void addAluno(Aluno a) {
        if (a != null) {
            this.alunosPorNumero.put(a.getNumero(), a);
            Quota quotas = new Quota(a.getAnoRegisto());
            this.quotasPorNumero.put(a.getNumero(),quotas);
            this.setChanged();
            this.notifyObservers();
        }
    }

    /**
     * Método que devolve se o valor pago por um sócio corresponde ao valor da quota. Se o sócio não existir,
     * devolve false.
     */
    public boolean quotaEmDia(Integer numero) {
        Quota quotas = this.quotasPorNumero.get(numero);
        if (quotas == null) return false;
        else return quotas.temQuotasEmDia();
    }

    /**
     * Método que devolve o valor em dívida de um dado sócio. Se o sócio não existir, devolve 0.
     */
    public double valorEmDivida(Integer numero) {
        Quota quotas = this.quotasPorNumero.get(numero);
        if (quotas == null) return 0;
        return quotas.valorEmDivida();
    }

    /**
     * Método que dado o ID de um sócio e um valor a pagar, atualiza os dados relativos ao estado de pagamento
     * das quotas do dado ID.
     */
    public void pagarQuota(Integer numero, Double valor) {
        Quota quotas = this.quotasPorNumero.get(numero);
        if (quotas == null) return;
        quotas.pagarQuota(valor);
        this.setChanged();
        this.notifyObservers();
    }
    
    /**
     * Método que dado um aluno e novas informações, atualiza essas mesmas informações
     */
    public void atualizaDados(Aluno a, int num, String nom, String curso, String morada, LocalDate data) throws AtualizaDadosException{
        if (this.alunosPorNumero.containsKey(num) && !this.alunosPorNumero.get(num).equals(a))
            throw new AtualizaDadosException(String.valueOf(num));
        else {
            int oldNum = a.getNumero();
            a.setNumero(num);
            a.setAnoRegisto(data);
            a.setNome(nom);
            a.setCurso(curso);
            a.setMorada(morada);
            this.alunosPorNumero.remove(oldNum);
            this.alunosPorNumero.put(num,a);
            Quota q = this.quotasPorNumero.get(oldNum);
            this.quotasPorNumero.remove(oldNum);
            this.quotasPorNumero.put(num, q);
            this.setChanged();
            this.notifyObservers();
        }
    }

}
