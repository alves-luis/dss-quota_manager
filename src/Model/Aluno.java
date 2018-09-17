package Model;

public class Aluno {
    private int numero;
    private String nome;

    public Aluno() {
        this.numero = 0;
        this.nome = "Foo";
    }

    public Aluno(int num, String nom) {
        this.numero = num;
        this.nome = nom;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;

        if (obj == null || obj.getClass() != this.getClass()) return false;

        Aluno a = (Aluno) obj;
        return a.getNome().equals(this.nome);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: ").append(nome).append(";\n").append("Nº: ").append(this.numero).append(".\n");
        return sb.toString();
    }
}
