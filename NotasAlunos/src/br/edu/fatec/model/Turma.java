package br.edu.fatec.model;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String nome;
    private List<Aluno> alunos;
    private int qttdeAlunos; // Adiciona o campo qttdeAlunos

    public Turma(String nome, int qttdeAlunos) {
        this.nome = nome;
        this.qttdeAlunos = qttdeAlunos; // Inicializa o campo qttdeAlunos
        this.alunos = new ArrayList<>(); // Inicializa a lista de alunos sem tamanho fixo
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public int getQttdeAlunos() {
        return qttdeAlunos; // Método getter para acessar qttdeAlunos
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Turma: ").append(nome).append("\nAlunos:\n");
        for (Aluno aluno : alunos) {
            if (aluno != null) {
                sb.append(aluno).append("\n");
            }
        }
        return sb.toString();
    }
}