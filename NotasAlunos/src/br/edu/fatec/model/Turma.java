package br.edu.fatec.model;

public class Turma {
    private String nome;
    private Aluno[] alunos;

    public Turma(String nome, int qttdeAlunos) {
        this.nome = nome;
        this.alunos = new Aluno[qttdeAlunos];
    }

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public Aluno[] getAlunos() {return alunos;}

    public void setAlunos(Aluno[] alunos) {this.alunos = alunos;}

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
