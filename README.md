# Jogo das Palavras Embaralhadas - ITA

## Descrição
O Jogo das Palavras Embaralhadas é um jogo de console, desenvolvido para o curso [Orientação a Objetos com Java](https://www.coursera.org/learn/orientacao-a-objetos-com-java) do ITA, onde o jogador deve adivinhar palavras cujas letras estão embaralhadas.

## Componentes do Jogo

- [x] **Principal:** Classe com o método `main()`. Responsável por ler a entrada do usuário e imprimir informações no console.
- [x] **BancoDePalavras:** Classe que retorna uma palavra aleatória de uma lista lida a partir de um arquivo.
- [x] **Embaralhador:** Interface que representa classes responsáveis por embaralhar palavras. Pelo menos duas implementações.
- [x] **FabricaEmbaralhadores:** Classe que retorna um embaralhador aleatoriamente.
- [x] **MecanicaDoJogo:** Interface que representa a lógica do jogo, determinando se o jogo acabou, se o usuário acertou a palavra, etc. Pelo menos duas implementações.
- [x] **FabricaMecanicaDoJogo:** Classe que retorna a implementação de MecanicaDoJogo a ser utilizada.

## Funcionalidades Implementadas

- [x] Jogo inicializa corretamente.
- [x] Palavras são embaralhadas de forma diferente dependendo do embaralhador.
- [x] Diferentes mecânicas de jogo podem ser selecionadas.
- [x] Palavras são lidas de um arquivo.
- [x] Interação do usuário é feita apenas na classe Principal.
- [x] Implementações das interfaces são obtidas através de fábricas.

## Diagrama de Classes
![diagramanew](https://github.com/user-attachments/assets/fcdbcfee-cac0-4f6e-b243-a509bdfc03cc)

## Testes de Unidade

- [x] Testes para classes de embaralhamento.
    - [x] EmbaralhadorAleatorioTest.java
    - [x] EmbaralhadorInvertidoTest.java
- [x] Testes para classes de mecânica.
    - [x] MecanicaDoJogoMorteSubitaTest.java
    - [x] MecanicaDoJogoNormalTest.java

## Vídeo de Demonstração
- [x] Link para o vídeo de uma partida do jogo: [Vídeo de Demonstração]([http://link-para-video](https://youtu.be/7fmfJ5CnFPg))
