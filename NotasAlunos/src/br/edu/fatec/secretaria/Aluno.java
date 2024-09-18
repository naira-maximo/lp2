package br.edu.fatec.secretaria;

public class Aluno {
    private String matricula;
    private String nome;
    private String curso;
    private Prova[] provas;

    public Aluno(String matricula, String nome, String curso) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
        this.provas = new Prova[4];
    }

    public String getMatricula() {return matricula;}

    public void setMatricula(String matricula) {this.matricula = matricula;}

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public String getCurso() {return curso;}

    public void setCurso(String curso) {this.curso = curso;}

    public Prova[] getProvas() {return provas;}

    public void setProvas(Prova[] provas) {this.provas = provas;}

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Aluno: %-15s | Matricula: %-4s | Curso: %-4s | Provas: ", nome, matricula, curso));
        // sb.append("Aluno: ").append(nome)
        //   .append(" | Matricula: ").append(matricula)
        //   .append(" | Curso: ").append(curso)
        //   .append(" | Provas: ");
        
        for (Prova prova : provas) {
            if (prova != null) {
                sb.append(prova.toString()).append(", ");
            }
        }

        return sb.toString();
    }
}
