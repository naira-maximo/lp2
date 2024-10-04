# Projeto de Orientação a Objetos - Sistema de Mensagens

Este projeto é parte de uma atividade prática para a disciplina de **Linguagem de Programação II**, com foco em **Programação Orientada a Objetos** (POO). O objetivo é implementar um sistema de mensagens simples baseado no diagrama de classes UML fornecido.

## Índice
- [Projeto de Orientação a Objetos - Sistema de Mensagens](#projeto-de-orientação-a-objetos---sistema-de-mensagens)
  - [Índice](#índice)
  - [Visão Geral](#visão-geral)
  - [Diagrama UML](#diagrama-uml)
  - [Instruções da Atividade](#instruções-da-atividade)

---

## Visão Geral

O projeto implementa um sistema de gerenciamento de contatos e envio de mensagens através de uma aplicação Java. O sistema permite a criação de contatos (chamados de "Contatinhos") e o envio de diferentes tipos de mensagens, como mensagens de texto, áudio e foto, seguindo as abstrações definidas no diagrama UML.

## Diagrama UML

O diagrama de classes UML abaixo foi utilizado como base para a implementação:

![image](https://github.com/user-attachments/assets/b4a42be1-a285-424f-958f-d129baeb2dfa)

Este diagrama descreve as classes, atributos e métodos a serem implementados, assim como suas relações de herança e composição.

## Instruções da Atividade

As instruções fornecidas para esta atividade incluem:

1. **Organização do Projeto**:
   - O projeto deve estar contido no pacote `edu.fatec.lp2.exercicio1`.
   - Os contatos e as mensagens devem ser gerenciados em arrays e inicializados via construtor.
   - Todos os atributos das classes devem ser privados.
   
2. **Classe Abstrata `Mensagem`**:
   - Deve possuir o método abstrato `Mensagem sendMessage(String)` que retorna a própria instância da classe.
   
3. **Herança e Composição**:
   - Classes que representam diferentes tipos de mensagens (`MsgTexto`, `MsgAudio`, `MsgFoto`) devem herdar da classe abstrata `Mensagem`.

4. **Métodos Implementados**:
   - Métodos para listar os contatos e mensagens.
   - Métodos para adicionar contatos e mensagens ao sistema.