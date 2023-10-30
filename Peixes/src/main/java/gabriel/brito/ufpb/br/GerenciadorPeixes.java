package gabriel.brito.ufpb.br;

import java.util.ArrayList;


public class GerenciadorPeixes implements PeixeFacade {
    private ArrayList<PeixeCartilaginoso> peixes;

    public GerenciadorPeixes() {
        this.peixes = new ArrayList<>();
    }
    public  GerenciadorPeixes(ArrayList<PeixeCartilaginoso> peixes){
        this.peixes = peixes;
    }

    public void adicionarPeixe(PeixeCartilaginoso peixe){
        peixes.add(peixe);
    }
    public PeixeCartilaginoso pesquisarPeixe(String nome) {
        for (PeixeCartilaginoso peixe : peixes) {
            if (peixe.getNome().equals(nome)) {
                return peixe;
            }
        }
        return null;
    }
    public void removerPeixe(String nome) {
        for (int i = 0; i < peixes.size(); i++) {
            if (peixes.get(i).getNome().equals(nome)) {
                peixes.remove(i);
                break;
            }
        }
    }

    public ArrayList<PeixeCartilaginoso> getPeixes(){
        return  peixes;
    }

}