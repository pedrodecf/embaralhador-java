package Mecanica;

public interface MecanicaDoJogo {
  String getModoDeJogo();
  String getDescricao();
  String getPalavraDaRodada();
  int getTotalPontos();
  boolean fimDeJogo();
  boolean acertouPalavra(String resposta);
}
