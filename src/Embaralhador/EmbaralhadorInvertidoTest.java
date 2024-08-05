package Embaralhador;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmbaralhadorInvertidoTest {
    private Embaralhador embaralhador;
  
    @BeforeEach
    public void setUp() {
      embaralhador = new EmbaralhadorInvertido();
    }

    @Test
    public void testEmbaralhar() {
      String palavra = "teste";
      String resultado = embaralhador.embaralhar(palavra);
      assertEquals(palavra.length(), resultado.length());
      assertNotEquals(palavra, resultado);
      assertEquals(resultado, "etset");
    }

    @Test
    public void testGetDificuldade() {
      assertEquals("Palavra Invertida", embaralhador.getDificuldade());
    }
}
