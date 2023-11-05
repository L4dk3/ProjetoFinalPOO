import gabriel.brito.ufpb.br.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestePeixes {
    private GerenciadorPeixes gerenciador;


    @BeforeEach
    public void setUp() {
        gerenciador = new GerenciadorPeixes();

    }

    @Test
    public void testeAdicionarRemoverPesquisar() {
        PeixeCartilaginoso peixe1 = new PeixeCartilaginoso("Tubarão Branco", "Carcharodon carcharias");
        PeixeCartilaginoso peixe2 = new PeixeCartilaginoso("Raia Manta", "Manta birostris");

        // Teste adicionar peixes
        gerenciador.adicionarPeixe(peixe1);
        gerenciador.adicionarPeixe(peixe2);
        assertEquals(2, gerenciador.getPeixes().size());

        // Teste pesquisar peixes
        assertEquals(peixe1, gerenciador.pesquisarPeixe("Tubarão Branco"));
        assertEquals(peixe2, gerenciador.pesquisarPeixe("Raia Manta"));

        // Teste remover peixes
        gerenciador.removerPeixe("Tubarão Branco");
        assertEquals(1, gerenciador.getPeixes().size());
        assertNull(gerenciador.pesquisarPeixe("Tubarão Branco"));
    }
}