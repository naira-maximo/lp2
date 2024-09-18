# AreaChecker 

> Desenvolvido como exercício de fixação da disciplina Linguagem de Programação II do 3º Semestre em Banco de Dados

## Descrição do Projeto
Um professor de uma faculdade precisa desenvolver um aplicativo para conferência de cálculos simples da área de algumas figuras geométricas. Para isso, ele convocou um aluno da disciplina de LP II para desenvolver uma solução que possibilite efetuar o cálculo da área dessas figuras, a saber:

- Circulo
- Cubo
- Hexágono
- Losango
- Paralelogramo
- Quadrado
- Retângulo
- Trapézio
- Triângulo

O projeto foi nomeado de **AreaChecker**.

## Estrutura do Projeto
O projeto é estruturado de forma a garantir que todas as classes que representam figuras geométricas implementem a interface `Calculable`. A classe `ShapeFactoryImpl` serve como ponto único de acesso para a criação das figuras geométricas. As demais classes e interfaces existentes no pacote (exceto `Calculable` e `ShapeType`) não deverão estar acessíveis por outros pacotes.

### Diagrama de Classes

![DIAGRAMA DE CLASSES](https://github.com/user-attachments/assets/7cdee38d-5353-4379-8e0f-212426054253)


## Requisitos
- Todas as classes que representam os objetos geométricos deverão implementar a interface `Calculable`.
- O projeto deve incluir uma classe de teste (`Main`) com no mínimo um cenário de teste para cada cálculo de área implementada.

## Estrutura de Pacotes
- `br.edu.fatec.factory`: Contém todas as classes e interfaces relacionadas à criação e cálculo das áreas das figuras geométricas.
- `br.edu.fatec.test`: Contém a classe `Main` para testes.

