package br.edu.fatec.main;

import br.edu.fatec.secretaria.Prova;
import br.edu.fatec.secretaria.Secretaria;
import br.edu.fatec.secretaria.Aluno;

public class Main {
    public static void main(String[] args) {
        Secretaria secretaria = new Secretaria();

        Aluno aluno1 = secretaria.matricularAluno("001", "João", "ADS", secretaria.getTurma1());
        Aluno aluno2 = secretaria.matricularAluno("002", "Maria", "ADS", secretaria.getTurma1());
        Aluno aluno3 = secretaria.matricularAluno("003", "Pedro", "ADS", secretaria.getTurma1());

        System.out.println("-".repeat(20) + "\nALUNOS MATRICULADOS");
        System.out.println(aluno1);
        System.out.println(aluno2);
        System.out.println(aluno3);

        // Criar objetos Prova
        Prova prova1 = new Prova(8.5, 2);
        Prova prova2 = new Prova(7.0, 2);
        Prova prova3 = new Prova(9.0, 2);

        secretaria.atribuirProva("001", prova1, secretaria.getTurma1());
        secretaria.atribuirProva("001", prova2, secretaria.getTurma1());
        secretaria.atribuirProva("001", prova3, secretaria.getTurma1());

        secretaria.atribuirProva("002", prova1, secretaria.getTurma1());
        secretaria.atribuirProva("002", prova2, secretaria.getTurma1());
        secretaria.atribuirProva("002", prova3, secretaria.getTurma1());

        secretaria.atribuirProva("003", prova1, secretaria.getTurma1());
        secretaria.atribuirProva("003", prova2, secretaria.getTurma1());
        secretaria.atribuirProva("003", prova3, secretaria.getTurma1());

        System.out.println("-".repeat(20) + "\nPROVAS ATRIBUÍDAS");
        System.out.println(aluno1);
        System.out.println(aluno2);
        System.out.println(aluno3);

        Aluno alunoAtualizado = secretaria.alterarAluno("001", "João Silva", "ADS", secretaria.getTurma1());
        if (alunoAtualizado != null) {
            System.out.println("-".repeat(20) + "\nATUALIZAÇÃO CONCLUÍDA:\n" + alunoAtualizado);
        } else {
            System.out.println("Aluno não encontrado para alteração.");
        }

        Aluno consultaNome = secretaria.consultarPorNome("Maria", secretaria.getTurma1());
        System.out.println("-".repeat(20) + "\nCONSULTA POR NOME:\n" + consultaNome);

        Aluno consultaMatricula = secretaria.consultarPorMatricula("003", secretaria.getTurma1());
        System.out.println("-".repeat(20) + "\nCONSULTA POR MATRÍCULA:\n" + consultaMatricula);

        boolean alunoRemovido = secretaria.excluirAlunoPorNome("Maria", secretaria.getTurma1());
        if (alunoRemovido) {
            System.out.println("-".repeat(20) + "\nALUNO REMOVIDO");
        } else {
            System.out.println("Falha ao remover aluno.");
        }

        System.out.println("-".repeat(20) + "\n" + secretaria.getTurma1());
    }
}