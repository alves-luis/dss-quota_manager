package Model;

public class AlunoNaoExisteException extends Exception {
    public AlunoNaoExisteException() {
        super();
    }

    public AlunoNaoExisteException(String msg) {
        super(msg);
    }
}
