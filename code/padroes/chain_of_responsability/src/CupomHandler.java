public interface CupomHandler {
    public void validarCupom(Cupom cupomBaseDeDados, Cupom cupomUsuario);
    public void setProximo(CupomHandler cupomHandler);
}
