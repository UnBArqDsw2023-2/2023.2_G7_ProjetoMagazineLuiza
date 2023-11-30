public class ValidarExistencia implements CupomHandler {
    private CupomHandler proximo;
    private Cupom[] cuponsExistentes = BaseDeDadosCupons.getCupons();

    public ValidarExistencia() {}

    @Override
    public void validarCupom(Cupom cupomBaseDeDados, Cupom cupomUsuario) {
        boolean cupomExiste = false;
        Cupom cupomEncontrado = null;

        for (Cupom cupomExistente : cuponsExistentes) {
            if (cupomUsuario != null) {
                if (cupomExistente.getCodigo().equals(cupomUsuario.getCodigo())) {
                    cupomExiste = true;
                    cupomEncontrado = cupomExistente;
                    break;
                }
            }
        }

        if (cupomExiste) {
            System.out.println("Cupom válido: " + cupomEncontrado.getCodigo());
        } else {
            System.out.println("Cupom inexistente." );
            return;
        }
        if (proximo != null) {
            proximo.validarCupom(cupomEncontrado, cupomUsuario);
        }
    }

    @Override
    public void setProximo(CupomHandler cupomHandler) {
        this.proximo = cupomHandler;
    }
}
