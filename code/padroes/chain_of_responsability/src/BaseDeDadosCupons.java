import java.time.LocalDate;

public class BaseDeDadosCupons {
    public static Cupom[] getCupons() {
        Cupom cupom1 = new Cupom();
        cupom1.setCodigo("CODIGO1");
        cupom1.setTipoProduto("Eletrônicos");
        cupom1.setDataInicio(LocalDate.now().minusDays(2));
        cupom1.setDataFim(LocalDate.now().plusDays(5));
        cupom1.setPorcentagemDesconto(15);

        Cupom cupom2 = new Cupom();
        cupom2.setCodigo("CODIGO2");
        cupom2.setTipoProduto("Roupas");
        cupom2.setDataInicio(LocalDate.now().minusDays(1));
        cupom2.setDataFim(LocalDate.now().plusDays(7));
        cupom2.setPorcentagemDesconto(10);

        Cupom cupom3 = new Cupom();
        cupom3.setCodigo("CODIGO3");
        cupom3.setTipoProduto("Livros");
        cupom3.setDataInicio(LocalDate.now().plusDays(1));
        cupom3.setDataFim(LocalDate.now().plusDays(10));
        cupom3.setPorcentagemDesconto(20);

        Cupom cupom4 = new Cupom();
        cupom4.setCodigo("CODIGO4");
        cupom4.setTipoProduto("Eletrônicos");
        cupom4.setDataInicio(LocalDate.now().minusDays(3));
        cupom4.setDataFim(LocalDate.now().plusDays(6));
        cupom4.setPorcentagemDesconto(10);

        Cupom cupom5 = new Cupom();
        cupom5.setCodigo("CODIGO5");
        cupom5.setTipoProduto("Roupas");
        cupom5.setDataInicio(LocalDate.now().minusDays(1));
        cupom5.setDataFim(LocalDate.now().plusDays(4));
        cupom5.setPorcentagemDesconto(18);

        Cupom cupom6 = new Cupom();
        cupom6.setCodigo("CODIGO6");
        cupom6.setTipoProduto("Livros");
        cupom6.setDataInicio(LocalDate.now().minusDays(2));
        cupom6.setDataFim(LocalDate.now().plusDays(8));
        cupom6.setPorcentagemDesconto(15);

        return new Cupom[]{cupom1, cupom2, cupom3, cupom4, cupom5, cupom6};
    }
}

