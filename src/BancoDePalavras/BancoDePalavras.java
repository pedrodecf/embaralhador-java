package BancoDePalavras;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

public class BancoDePalavras {
  private List<String> palavras;
  private static final Random RANDOM = new Random();

  public BancoDePalavras(String path) {
    lerPalavrasDoArquivo(path);
  }

  private void lerPalavrasDoArquivo(String path) {
    try {
      palavras = Files.readAllLines(Paths.get(path));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public String getPalavraAleatoria() {
    int indice = RANDOM.nextInt(palavras.size());
    return palavras.get(indice);
  }
}
