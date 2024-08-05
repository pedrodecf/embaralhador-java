package Mecanica;

import BancoDePalavras.BancoDePalavras;

public class MecanicaDoJogoNormal implements MecanicaDoJogo {
  private static final String MODO_DE_JOGO = "Normal";
  private static final String DESCRICAO = "Você tem 3 tentativas para acertar a palavra.";
  private static final int MAX_TENTATIVAS = 3;
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