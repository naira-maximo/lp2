# Sistema de Registro de Alunos - Linguagem de Programação II

## Descrição do Projeto

Este projeto é uma aplicação Java desenvolvida como atividade de fixação para a matéria de Linguagem de Programação II, do 3º semestre do curso de Banco de Dados, ministrada pelo professor Lucas Gonçalves Nadalete. O objetivo é armazenar e gerenciar os dados de uma turma de alunos, incluindo matrícula, nome, curso e notas das quatro provas realizadas durante o semestre.

O projeto utiliza conceitos fundamentais de Programação Orientada a Objetos (POO) em Java e manipulação de arrays para gerenciamento de dados, atendendo aos requisitos propostos na atividade.

## Funcionalidades Implementadas

A aplicação permite realizar as seguintes operações:

1. **Incluir Aluno à Turma**: Permite adicionar um aluno à turma, respeitando o limite máximo de alunos.
2. **Alterar Dados de um Aluno**: Permite modificar as informações de um aluno previamente cadastrado.
3. **Consultar por Nome**: Busca e exibe as informações de um aluno com base no seu nome.
4. **Consultar por Matrícula**: Busca e exibe as informações de um aluno com base no seu número de matrícula.
5. **Excluir Aluno**: Remove um aluno da turma com base no seu nome.
6. **Imprimir Lista de Alunos**: Exibe todos os alunos da turma na ordem em que foram inseridos.
7. **Validar Matrícula**: Verifica se um aluno com a matrícula informada já foi inserido na turma. Se sim, impede a inclusão e retorna `false`; caso contrário, realiza a inclusão e retorna `true`.

## Tecnologias Utilizadas

- Linguagem de Programação: Java
- IDE: Eclipse / Visual Studio Code
- Conceitos de Programação Orientada a Objetos (POO)

## Como Executar o Projeto

1. Faça o download ou clone este repositório.
2. Abra o projeto na sua IDE de preferência (recomendado: Eclipse).
3. Compile o projeto.
4. Execute a classe `Main` para interagir com a aplicação e testar suas funcionalidades.

## Estrutura de Código

### Classe `Aluno`

Esta classe armazena os detalhes dos alunos, como matrícula, nome, curso e um array de objetos `Prova` para armazenar as notas e pesos das quatro provas realizadas durante o semestre.

### Classe `Prova`

Representa uma prova com os atributos `nota` e `peso`.

### Classe `Turma`

Esta classe gerencia os alunos matriculados, utilizando um array para armazenar os objetos `Aluno`. O número máximo de alunos é definido na instanciação da turma.

### Classe `Secretaria`

Responsável por implementar a lógica das operações de inclusão, consulta, alteração, exclusão e validação dos alunos.


## Autor

Naira Maximo - Desenvolvido para a atividade de fixação da disciplina Linguagem de Programação II do 3º Semestre em Banco de Dados

## Referência

Santos, Rafael. *Introdução à Programação Orientada a Objetos - JAVA*.