package br.edu.fatec.main;

import br.edu.fatec.model.Aluno;
import br.edu.fatec.model.Prova;
import br.edu.fatec.service.Secretaria;

public class Main {
    public static void main(String[] args) {
        Secretaria secretaria = new Secretaria();

        Aluno aluno1 = secretaria.matricularAluno("001", "João", "ADS", secretaria.getTurma(1));
        System.out.println("-".repeat(20));
        Aluno aluno2 = secretaria.matricularAluno("002", "Maria", "ADS", secretaria.getTurma(1));
        System.out.println("-".repeat(20));
        Aluno aluno3 = secretaria.matricularAluno("003", "Pedro", "ADS", secretaria.getTurma(1));
        System.out.println("-".repeat(20));
        Aluno aluno4 = secretaria.matricularAluno("001", "João", "ADS", secretaria.getTurma(1));
        System.out.println("-".repeat(20));

        // Criar objetos Prova
        Prova prova1 = new Prova(8.5, 2);
        Prova prova2 = new Prova(7.0, 2);
        Prova prova3 = new Prova(9.0, 2);

        secretaria.atribuirProva("001", prova1, secretaria.getTurma(1));
        System.out.println("-".repeat(20));
        secretaria.atribuirProva("001", prova2, secretaria.getTurma(1));
        System.out.println("-".repeat(20));
        secretaria.atribuirProva("001", prova3, secretaria.getTurma(1));
        System.out.println("-".repeat(20));

        secretaria.atribuirProva("002", prova1, secretaria.getTurma(1));
        System.out.println("-".repeat(20));
        secretaria.atribuirProva("002", prova2, secretaria.getTurma(1));
        System.out.println("-".repeat(20));
        secretaria.atribuirProva("002", prova3, secretaria.getTurma(1));
        System.out.println("-".repeat(20));

        secretaria.atribuirProva("003", prova1, secretaria.getTurma(1));
        System.out.println("-".repeat(20));
        secretaria.atribuirProva("003", prova2, secretaria.getTurma(1));
        System.out.println("-".repeat(20));
        secretaria.atribuirProva("003", prova3, secretaria.getTurma(1));
        System.out.println("-".repeat(20));

        System.out.println(aluno1);
        System.out.println("-".repeat(20));
        System.out.println(aluno2);
        System.out.println("-".repeat(20));
        System.out.println(aluno3);
        System.out.println("-".repeat(20));

        secretaria.alterarAluno("001", "João Silva", "ADS", secretaria.getTurma(1));
        System.out.println("-".repeat(20));

        secretaria.consultarPorNome("Maria", secretaria.getTurma(1));
        System.out.println("-".repeat(20));

        secretaria.consultarPorMatricula("003", secretaria.getTurma(1));
        System.out.println("-".repeat(20));

        secretaria.excluirAlunoPorNome("Maria", secretaria.getTurma(1));
        System.out.println("-".repeat(20));

        secretaria.imprimirAlunos("Turma 2");;
    }
}