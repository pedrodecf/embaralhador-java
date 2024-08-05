package Embaralhador;

public class FabricaEmbaralhadores {

  public Embaralhador getEmbaralhador(int dificuldade) {
    if (dificuldade == 1) {
      return new EmbaralhadorInvertido();
    } else {
      return new EmbaralhadorAleatorio();
    }
  }
}
