package gabriel.brito.ufpb.br;

public class PeixeCartilaginoso {
    private String nome;
    private String nomeCientifico;
    private TipoPeixeCartilaginoso tipo;


    public PeixeCartilaginoso(String nome, String nomeCientifico, TipoPeixeCartilaginoso tipo) {
        this.nome = nome;
        this.nomeCientifico = nomeCientifico;
        this.tipo = tipo;
    }

    public PeixeCartilaginoso(String nome, String nomeCientifico) {
        this.nome = nome;
        this.nomeCientifico = nomeCientifico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeCientifico() {
        return nomeCientifico;
    }

    public void setNomeCientifico(String nomeCientifico) {
        this.nomeCientifico = nomeCientifico;
    }

    public TipoPeixeCartilaginoso getTipo() {
        return tipo;
    }

    public void setTipo(TipoPeixeCartilaginoso tipo) {
        this.tipo = tipo;
    }

}