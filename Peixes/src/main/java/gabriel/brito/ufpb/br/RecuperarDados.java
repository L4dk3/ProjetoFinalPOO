package gabriel.brito.ufpb.br;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RecuperarDados {

    public List<PeixeCartilaginoso> recuperarDados(String caminhoArquivo) throws IOException {
        List<PeixeCartilaginoso> peixes = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(caminhoArquivo))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String nome = parts[0];
                    String nomeCientifico = parts[1];
                    PeixeCartilaginoso peixe = new PeixeCartilaginoso(nome, nomeCientifico);
                    peixes.add(peixe);
                }
            }
        }

        return peixes;
    }
}