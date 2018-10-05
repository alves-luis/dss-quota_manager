package model;

import java.time.LocalDate;

public class Aluno {
    private int numero;
    private String nome;
    private String curso;
    private LocalDate ano_registo;
    private String morada;

    public Aluno() {
        this.numero = 0;
        this.nome = "Foo";
        this.curso = "Educação";
        this.ano_registo = LocalDate.now();
        this.morada = "Rua do Foo";
    }

    public Aluno(int num, String nom, String curso, String morada, LocalDate data) {
        this.numero = num;
        this.nome = nom;
        this.curso = curso;
        this.morada = morada;
        this.ano_registo = data;
    }

    public Aluno(Aluno a) {
        this.numero = a.getNumero();
        this.nome = a.getNome();
        this.curso = a.getCurso();
        this.ano_registo = a.getAnoRegisto();
        this.morada = a.getMorada();
    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }

    public LocalDate getAnoRegisto() {
        return ano_registo;
    }

    public String getMorada() {
        return morada;
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

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setAnoRegisto(LocalDate ano_registo) {
        this.ano_registo = ano_registo;
    }

    public void setMorada(String morada) {
        this.morada = morada;
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

    public Object clone() {
        return new Aluno(this);
    }
}
