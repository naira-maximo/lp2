package br.edu.fatec.service;

import br.edu.fatec.model.Aluno;
import br.edu.fatec.model.Prova;
import br.edu.fatec.model.Turma;

import java.util.ArrayList;
import java.util.List;

public class Secretaria {
    private List<Turma> turmas;

    public Secretaria() {
        this.turmas = new ArrayList<>();

        // Instanciar turmas
        adicionarTurma(new Turma("Turma 1", 3));
        adicionarTurma(new Turma("Turma 2", 30));
        adicionarTurma(new Turma("Turma 3", 30));
    }

    public void adicionarTurma(Turma turma) {
        if (turmas.size() < 4) {
            turmas.add(turma);
        } else {
            System.out.println("Capacidade máxima de turmas atingida.");
        }
    }

    public Turma getTurma(int indice) {
        return turmas.get(indice);
    }

    // Validar se um aluno com matrícula informada já foi inserido. Caso já tenha sido inserido, a operação não deve ser realizada e um valor lógico (False) deve ser retornado, caso contrário a inserção deve ocorrer normalmente e o valor lógico (True) retornado.
    public boolean validarMatriculaExistente(String matricula, Turma turma) {
        for (Aluno aluno : turma.getAlunos()) {
            if (aluno != null && aluno.getMatricula().equals(matricula)) {
                return false;
            }
        }
        return true;
    }

    // Incluir Aluno à Turma (até o máximo de alunos delimitado para a turma);
    public Aluno matricularAluno(String matricula, String nome, String curso, Turma turma) {
        // Verificação de aluno já matriculado. Se a matrícula não existir, matricular o aluno
        if (!validarMatriculaExistente(matricula, turma)) {
            System.out.println("Matrícula já existente para a turma.");
            return null;
        }
        List<Aluno> alunos = turma.getAlunos();
        if (alunos.size() < turma.getQttdeAlunos()) {
            Aluno novoAluno = new Aluno(matricula, nome, curso);
            alunos.add(novoAluno);
            System.out.println("ALUNO MATRICULADO\n" + novoAluno);
            return novoAluno;
        }
        System.out.println("A turma já atingiu o número máximo de alunos.");
        return null;
    }

    // Alterar os dados de um Aluno já registrado;
    public Aluno alterarAluno(String matricula, String novoNome, String novoCurso, Turma turma) {
        Aluno aluno = consultarPorMatricula(matricula, turma);
        if (aluno != null) {
            aluno.setNome(novoNome);
            aluno.setCurso(novoCurso);
            System.out.println("ALTERAÇÕES REALIZADAS\n" + aluno);
            return aluno;
        }
        System.out.println("Matrícula inexistente para a turma.");
        return null;
    }

    // Consultar por Nome; 
    public Aluno consultarPorNome(String nome, Turma turma) {
        for (Aluno aluno : turma.getAlunos()) {
            if (aluno != null && aluno.getNome().equalsIgnoreCase(nome)) {
                System.out.println("CONSULTA POR NOME\n" + aluno);
                return aluno;
            }
        }
        return null;
    }

    // Consultar por Matricula;
    public Aluno consultarPorMatricula(String matricula, Turma turma) {
        for (Aluno aluno : turma.getAlunos()) {
            if (aluno != null && aluno.getMatricula().equals(matricula)) {
                System.out.println("CONSULTA POR MATRICULA\n" + aluno);
                return aluno;
            }
        }
        System.out.println("Aluno não encontrado.");
        return null;
    }

    // Excluir um aluno existente na Lista com base no seu Nome;
    public boolean excluirAlunoPorNome(String nome, Turma turma) {
        List<Aluno> alunos = turma.getAlunos();
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i) != null && alunos.get(i).getNome().equalsIgnoreCase(nome)) {
                alunos.remove(i);
                System.out.println("ALUNO EXCLUIDO\n" + nome);
                return true;
            }
        }
        System.out.println("Aluno não encontrado.");
        return false;
    }

    public Prova atribuirProva(String matricula, Prova prova, Turma turma) {
        for (Aluno aluno : turma.getAlunos()) {
            if (aluno != null && aluno.getMatricula().equals(matricula)) {
                List<Prova> provas = aluno.getProvas();
                if (provas.size() >= 4) { // Verificar se todas as provas já estão preenchidas
                    System.out.println("O aluno já possui 4 provas atribuídas.");
                    return null;
                }
                provas.add(prova); // Atribuir a nova prova
                System.out.println("PROVA ATRIBUIDA PARA A MATRÍCULA " + matricula + "\n" + prova);
                return prova;
            }
        }
        System.out.println("Aluno não encontrado.");
        return null; // Retorna null se não encontrar o aluno ou não conseguir atribuir a prova
    }

    // Imprimir a lista de alunos na sua ordem de inserção
    public void imprimirAlunos(String nomeTurma) {
        for (Turma turma : turmas) {
            if (turma != null && turma.getNome().equalsIgnoreCase(nomeTurma)) {
                System.out.println("LISTA DA TURMA " + turma.getNome() + ":");
                for (Aluno aluno : turma.getAlunos()) {
                    if (aluno != null) {
                        System.out.println(aluno);
                    }
                }
                return;
            }
        }
        System.out.println("Turma inexistente.");
    }
}