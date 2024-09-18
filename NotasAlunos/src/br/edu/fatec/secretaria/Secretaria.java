package br.edu.fatec.secretaria;

public class Secretaria {
    private Turma turma1;
    private Turma turma2;
    private Turma turma3;

    public Secretaria() {
        turma1 = new Turma("Turma 1", 30);
        turma2 = new Turma("Turma 2", 30);
        turma3 = new Turma("Turma 3", 30);
    }

    // Validar se um aluno com matrícula informada já foi inserido na turma
public boolean validarMatriculaExistente(String matricula, Turma turma) {
    for (Aluno aluno : turma.getAlunos()) {
        if (aluno != null && aluno.getMatricula().equals(matricula)) {
            return true;
        }
    }
    return false;
}

// Matricular um aluno em uma turma específica
public Aluno matricularAluno(String matricula, String nome, String curso, Turma turma) {
    if (validarMatriculaExistente(matricula, turma)) {
        System.out.println("Matrícula já existente para a turma.");
        return null;
    }

    // Se a matrícula não existir, matricular o aluno
    Aluno[] alunos = turma.getAlunos();
    for (int i = 0; i < alunos.length; i++) {
        if (alunos[i] == null) {
            Aluno novoAluno = new Aluno(matricula, nome, curso);
            alunos[i] = novoAluno;
            return novoAluno;
        }
    }
    return null; // Retorna null se a turma estiver cheia
}

    public Aluno alterarAluno(String matricula, String novoNome, String novoCurso, Turma turma) {
        Aluno aluno = consultarPorMatricula(matricula, turma);
        if (aluno != null) {
            aluno.setNome(novoNome);
            aluno.setCurso(novoCurso);
            return aluno;
        }
        return null;
    }

    public Aluno consultarPorNome(String nome, Turma turma) {
        for (Aluno aluno : turma.getAlunos()) {
            if (aluno != null && aluno.getNome().equalsIgnoreCase(nome)) {
                return aluno;
            }
        }
        return null;
    }

    public Aluno consultarPorMatricula(String matricula, Turma turma) {
        for (Aluno aluno : turma.getAlunos()) {
            if (aluno != null && aluno.getMatricula().equals(matricula)) {
                return aluno;
            }
        }
        return null;
    }

    public boolean excluirAlunoPorNome(String nome, Turma turma) {
        Aluno[] alunos = turma.getAlunos();
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null && alunos[i].getNome().equalsIgnoreCase(nome)) {
                alunos[i] = null;
                return true;
            }
        }
        return false;
    }

    public Prova atribuirProva(String matricula, Prova prova, Turma turma) {
        for (Aluno aluno : turma.getAlunos()) {
            if (aluno != null && aluno.getMatricula().equals(matricula)) {
                Prova[] provas = aluno.getProvas();
                for (int i = 0; i < provas.length; i++) {
                    if (provas[i] == null) {
                        provas[i] = prova;
                        return prova;
                    }
                }
            }
        }
        return null;
    }

    public Turma getTurma1() {
        return turma1;
    }

    public Turma getTurma2() {
        return turma2;
    }

    public Turma getTurma3() {
        return turma3;
    }
}
