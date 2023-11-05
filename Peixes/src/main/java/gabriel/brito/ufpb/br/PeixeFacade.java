package gabriel.brito.ufpb.br;


import java.util.ArrayList;

public interface PeixeFacade {
    void adicionarPeixe(PeixeCartilaginoso peixe);
    PeixeCartilaginoso pesquisarPeixe(String nome);
    void removerPeixe(String nome);
    ArrayList<PeixeCartilaginoso> getPeixes();
}
