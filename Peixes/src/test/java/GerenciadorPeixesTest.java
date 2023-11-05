import gabriel.brito.ufpb.br.GerenciadorPeixes;
import gabriel.brito.ufpb.br.PeixeCartilaginoso;
import gabriel.brito.ufpb.br.PeixeNaoExisteException;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class GerenciadorPeixesTest {
    private GerenciadorPeixes gerenciadorPeixes;

    @Before
    public void setUp() {
        ArrayList<PeixeCartilaginoso> peixes = new ArrayList<>();
        gerenciadorPeixes = new GerenciadorPeixes(peixes);
    }

    @Test
    public void testAdicionarPeixe() {
        PeixeCartilaginoso peixe = new PeixeCartilaginoso("Peixe1", "Cientifico1");

        gerenciadorPeixes.adicionarPeixe(peixe);

        assertTrue(gerenciadorPeixes.getPeixes().contains(peixe));
    }

    @Test
    public void testPesquisarPeixe() {
        PeixeCartilaginoso peixe = new PeixeCartilaginoso("Peixe2", "Cientifico2");
        gerenciadorPeixes.adicionarPeixe(peixe);

        PeixeCartilaginoso resultado = gerenciadorPeixes.pesquisarPeixe("Peixe2");

        assertEquals(peixe, resultado);
    }

    @Test
    public void testRemoverPeixe() {
        PeixeCartilaginoso peixe = new PeixeCartilaginoso("Peixe3", "Cientifico3");
        gerenciadorPeixes.adicionarPeixe(peixe);

        gerenciadorPeixes.removerPeixe("Peixe3");

        assertFalse(gerenciadorPeixes.getPeixes().contains(peixe));
    }

    @Test(expected = PeixeNaoExisteException.class)
    public void testPesquisarPeixeInexistente() {
        gerenciadorPeixes.pesquisarPeixe("PeixeInexistente");
    }

    @Test(expected = PeixeNaoExisteException.class)
    public void testRemoverPeixeInexistente() {
        gerenciadorPeixes.removerPeixe("PeixeInexistente");
    }
}