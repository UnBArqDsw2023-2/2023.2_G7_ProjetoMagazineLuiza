import java.time.LocalDate;

public class ValidarData implements CupomHandler {
    private LocalDate dataAtual = LocalDate.now();
    private CupomHandler proximo;

    public ValidarData() {}

    @Override
    public void validarCupom(Cupom cupomBaseDeDados, Cupom cupomUsuario) {
        LocalDate dataInicio = cupomBaseDeDados.getDataInicio();
        LocalDate dataFim = cupomBaseDeDados.getDataFim();

        if (dataInicio != null && dataFim != null &&
                !dataAtual.isBefore(dataInicio) && !dataAtual.isAfter(dataFim)) {
            System.out.println("Cupom válido no período de " + dataInicio + " até " + dataFim);
        } else {
            System.out.println("Cupom fora do período de validade: " + dataInicio + " até " + dataFim);
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
