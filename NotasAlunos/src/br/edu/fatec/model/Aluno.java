package br.edu.fatec.model;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String matricula;
    private String nome;
    private String curso;
    private List<Prova> provas;

    public Aluno(String matricula, String nome, String curso) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
        this.provas = new ArrayList<>();
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public List<Prova> getProvas() {
        return provas;
    }

    public void setProvas(List<Prova> provas) {
        this.provas = provas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Aluno: %-15s | Matricula: %-4s | Curso: %-4s | Provas: ", nome, matricula, curso));
        
        for (Prova prova : provas) {
            if (prova != null) {
                sb.append(prova.toString()).append("; ");
            }
        }

        return sb.toString();
    }
}