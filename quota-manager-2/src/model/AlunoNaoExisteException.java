package model;

public class AlunoNaoExisteException extends Exception {
    public AlunoNaoExisteException() {
        super();
    }

    public AlunoNaoExisteException(Integer num) {
        super(num.toString());
    }
}
