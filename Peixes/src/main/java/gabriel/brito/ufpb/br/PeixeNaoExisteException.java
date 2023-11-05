package gabriel.brito.ufpb.br;

public class PeixeNaoExisteException extends RuntimeException{
    public PeixeNaoExisteException (String mensage){
        super(mensage);
    }
}
