import java.util.Scanner;

import Embaralhador.Embaralhador;
import Embaralhador.FabricaEmbaralhadores;
import Mecanica.FabricaMecanicaDoJogo;
import Mecanica.MecanicaDoJogo;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int escolhaMecanica = 0;
        int escolhaDificuldade = 0;
        
        System.out.println("Bem-vindo ao jogo das palavras embaralhadas! 🎉\n");
        System.out.println("--------------------\n");

        while (escolhaMecanica != 1 && escolhaMecanica != 2) {
            System.out.println("Para começarmos, escolha um modo de jogo:\n");
            System.out.println("1. Normal");
            System.out.println("2. Morte Súbita\n");
            System.out.print("Digite o número da sua escolha: \n");

            if (in.hasNextInt()) {
                escolhaMecanica = in.nextInt();
                in.nextLine();
                if (escolhaMecanica != 1 && escolhaMecanica != 2) {
                    System.out.println("Opção inválida. Tente novamente.\n");
                }
            } else {
                System.out.println("Entrada inválida. Tente novamente.\n");
                in.next();
            }
        }

        while (escolhaDificuldade != 1 && escolhaDificuldade != 2) {
            System.out.println("Agora, escolha a dificuldade:\n");
            System.out.println("1. Palavra Invertida");
            System.out.println("2. Palavra Embaralhada\n");
            System.out.print("Digite o número da sua escolha: \n");

            if (in.hasNextInt()) {
                escolhaDificuldade = in.nextInt();
                in.nextLine();
                if (escolhaDificuldade != 1 && escolhaDificuldade != 2) {
                    System.out.println("Opção inválida. Tente novamente.\n");
                }
            } else {
                System.out.println("Entrada inválida. Tente novamente.\n");
                in.next();
            }
        }

        MecanicaDoJogo mecanicaDoJogo = new FabricaMecanicaDoJogo().iniciarMecanicaDoJogo(escolhaMecanica);
        Embaralhador embaralhador = new FabricaEmbaralhadores().getEmbaralhador(escolhaDificuldade);
        System.out.println("--------------------\n");
        System.out.println("Modo de jogo: " + mecanicaDoJogo.getModoDeJogo());
        System.out.println("Descrição: " + mecanicaDoJogo.getDescricao());
        System.out.println("Dificuldade: " + embaralhador.getDificuldade() + "\n");
        System.out.println("--------------------\n");


        while (!mecanicaDoJogo.fimDeJogo()) {
            String palavra = mecanicaDoJogo.getPalavraDaRodada();
            String palavraEmbaralhada = embaralhador.embaralhar(palavra);
            System.out.println("Qual é a palavra: " + palavraEmbaralhada);

            String resposta = in.nextLine().toUpperCase();
            if (mecanicaDoJogo.acertouPalavra(resposta)) {
                System.out.println("Acertou! Você está com " + mecanicaDoJogo.getTotalPontos() + " ponto(s). 🥳" + "\n");
            } else {
                System.out.println("Você errou! A palavra era: " + palavra + " 😓\n");
            }
        }

        System.out.println("Fim de jogo! Você fez " + mecanicaDoJogo.getTotalPontos() + " pontos.");
        in.close();
    }
}
