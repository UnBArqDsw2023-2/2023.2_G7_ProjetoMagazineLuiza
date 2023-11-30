public class ValidarTipoProduto implements CupomHandler {
    private CupomHandler proximo;

    public ValidarTipoProduto() {}

    @Override
    public void validarCupom(Cupom cupomBaseDeDados, Cupom cupomUsuario) {
        boolean cupomExiste = cupomBaseDeDados.getTipoProduto().equals(cupomUsuario.getTipoProduto());

        if (cupomExiste) {
            System.out.println("Cupom válido: " + cupomUsuario.getTipoProduto());
        } else {
            System.out.println("Cupom inválido para essa categoria de produto");
            return;
        }
        if (proximo != null) {
            proximo.validarCupom(cupomBaseDeDados, cupomUsuario);
        }
    }

    @Override
    public void setProximo(CupomHandler cupomHandler) {
        this.proximo = cupomHandler;
    }
}
