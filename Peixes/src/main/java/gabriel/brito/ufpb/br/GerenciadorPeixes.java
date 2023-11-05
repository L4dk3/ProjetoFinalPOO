package gabriel.brito.ufpb.br;

import java.util.ArrayList;


public class GerenciadorPeixes implements PeixeFacade {
    private ArrayList<PeixeCartilaginoso> peixes;//
//eu só tou colocando umasparada
    public GerenciadorPeixes() {
        this.peixes = new ArrayList<>();
    }
    public  GerenciadorPeixes(ArrayList<PeixeCartilaginoso> peixes){
        this.peixes = peixes;
    }

    public void adicionarPeixe(PeixeCartilaginoso peixe){
        if(peixes.contains(peixe)){
            throw new PeixeJaExisteException("peixe já foi adicionado");
        }


        peixes.add(peixe);

    }
    public PeixeCartilaginoso pesquisarPeixe(String nome)  {
        for (PeixeCartilaginoso peixe : peixes) {
            if (peixe.getNome().equals(nome)) {
                return peixe;
            }
        }
        throw  new PeixeNaoExisteException("Peixe não existe");
    }
    public void removerPeixe(String nome) {
        for (int i = 0; i < peixes.size(); i++) {
            if (peixes.get(i).getNome().equals(nome)) {
                peixes.remove(i);
                return;
            }
        }
        throw  new PeixeNaoExisteException("Peixe não existe");

    }

    public ArrayList<PeixeCartilaginoso> getPeixes(){
        return  peixes;
    }

}