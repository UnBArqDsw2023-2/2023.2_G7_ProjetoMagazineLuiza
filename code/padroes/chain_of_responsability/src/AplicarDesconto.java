public class AplicarDesconto implements CupomHandler{
    private double valorCompra = new Carrinho(2000.00).getValor();
    private CupomHandler proximo;

    public AplicarDesconto() {}
    @Override
    public void validarCupom(Cupom cupomBaseDeDados, Cupom cupomUsuario) {
        if (cupomBaseDeDados != null && cupomBaseDeDados.getPorcentagemDesconto() > 0) {
            double percentualDesconto = cupomBaseDeDados.getPorcentagemDesconto() / 100.0;
            double valorDesconto = percentualDesconto * this.valorCompra;

            System.out.println("Desconto de " + cupomBaseDeDados.getPorcentagemDesconto() + "% aplicado: -R$" + valorDesconto);

            System.out.println("Valor final da compra: " + (this.valorCompra - valorDesconto));
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
