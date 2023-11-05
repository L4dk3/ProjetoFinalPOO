package gabriel.brito.ufpb.br;

import java.io.PrintWriter;
import java.io.IOException;

public class SalvarDados {
    private PeixeFacade gerenciador;

    public SalvarDados(PeixeFacade gerenciador) {
        this.gerenciador = gerenciador;
    }

    public void salvarDados(String arquivo) throws IOException {
        PrintWriter writer = new PrintWriter(arquivo, "UTF-8");
        for (PeixeCartilaginoso peixe :  gerenciador.getPeixes()) {
            writer.println(peixe.getNome() + "," + peixe.getNomeCientifico());
        }
        writer.close();
    }
}