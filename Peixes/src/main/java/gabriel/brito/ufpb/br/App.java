package gabriel.brito.ufpb.br;

import java.io.IOException;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) throws IOException {

        RecuperarDados recuperarDados = new RecuperarDados();
        GerenciadorPeixes gerenciadorPeixes = new GerenciadorPeixes((ArrayList<PeixeCartilaginoso>) recuperarDados.recuperarDados("arquivo.txt"));


        PeixeGUI interfacePeixe = new PeixeGUI(gerenciadorPeixes);
    }
}
