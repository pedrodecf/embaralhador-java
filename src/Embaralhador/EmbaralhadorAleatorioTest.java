package Embaralhador;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmbaralhadorAleatorioTest {
    private Embaralhador embaralhador;
  
    @BeforeEach
    public void setUp() {
      embaralhador = new EmbaralhadorAleatorio();
    }

    @Test
    public void testEmbaralhar() {
      String palavra = "teste";
      String resultado = embaralhador.embaralhar(palavra);
      assertEquals(palavra.length(), resultado.length());
      assertNotEquals(palavra, resultado);

      char[] palavraArray = palavra.toCharArray();
      char[] resultadoArray = resultado.toCharArray();
      java.util.Arrays.sort(palavraArray);
      java.util.Arrays.sort(resultadoArray);
      assertEquals(new String(palavraArray), new String(resultadoArray));  
    }

    @Test
    public void testGetDificuldade() {
      assertEquals("Palavra Embaralhada", embaralhador.getDificuldade());
    }
}
