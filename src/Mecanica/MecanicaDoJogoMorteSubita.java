package Mecanica;

import BancoDePalavras.BancoDePalavras;

public class MecanicaDoJogoMorteSubita implements MecanicaDoJogo {
  private static final String MODO_DE_JOGO = "Morte Súbita";
  private static final String DESCRICAO = "Você tem 1 tentativa para acertar a palavra.";
  private static final int MAX_TENTATIVAS = 1;
  private int tentativas;
  private int acertos;
  private String palavraDaRodada;
  private BancoDePalavras bancoDePalavras = new BancoDePalavras("src/BancoDePalavras/palavras.txt");

  @Override
  public String getModoDeJogo() {
    return MODO_DE_JOGO;
  }

  @Override
  public String getDescricao() {
    return DESCRICAO;
  }

  @Override
  public String getPalavraDaRodada() {
    palavraDaRodada = bancoDePalavras.getPalavraAleatoria();
    return palavraDaRodada;
  }

  @Override
  public boolean fimDeJogo() {
    return tentativas >= MAX_TENTATIVAS;
  }

  @Override
  public boolean acertouPalavra(String resposta) {
    if (palavraDaRodada.equalsIgnoreCase(resposta)) {
      acertos++;
      return true;
    } else {
      tentativas++;
      return false;
    }
  }

  @Override
  public int getTotalPontos() {
    return acertos;
  }
}