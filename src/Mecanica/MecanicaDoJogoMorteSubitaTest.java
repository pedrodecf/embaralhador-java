package Mecanica;

import java.io.IOException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MecanicaDoJogoMorteSubitaTest {
    private MecanicaDoJogoMorteSubita mecanica;

    @BeforeEach
    public void setUp() throws IOException {
        mecanica = new MecanicaDoJogoMorteSubita();
    }

    @Test
    public void testGetModoDeJogo() {
        assertEquals("Morte Súbita", mecanica.getModoDeJogo());
    }

    @Test
    public void testGetPalavraDaRodada() throws IOException {
        String palavra = mecanica.getPalavraDaRodada();
        assertNotNull(palavra);
        assertFalse(palavra.isEmpty());
    }

    @Test
    public void testFimDeJogo() {
        assertFalse(mecanica.fimDeJogo());
        mecanica.getPalavraDaRodada();
        mecanica.acertouPalavra("wrong");
        assertTrue(mecanica.fimDeJogo());
    }

    @Test
    public void testAcertouPalavra() throws IOException {
        String palavra = mecanica.getPalavraDaRodada();
        assertTrue(mecanica.acertouPalavra(palavra));
        assertFalse(mecanica.acertouPalavra("wrong"));
    }

    @Test
    public void testGetTotalPontos() {
        assertEquals(0, mecanica.getTotalPontos());
        mecanica.acertouPalavra(mecanica.getPalavraDaRodada());
        assertEquals(1, mecanica.getTotalPontos());
    }
}
