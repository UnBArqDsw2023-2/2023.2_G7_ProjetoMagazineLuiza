import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        CupomHandler validarExistencia = new ValidarExistencia();
        CupomHandler validarTipoProduto = new ValidarTipoProduto();
        CupomHandler validarData = new ValidarData();
        CupomHandler aplicarDesconto = new AplicarDesconto();
        // Definir a ordem da cadeia de responsabilidade
        validarExistencia.setProximo(validarTipoProduto);
        validarTipoProduto.setProximo(validarData);
        validarData.setProximo(aplicarDesconto);

        // Cenário 1: Cupom inválido devido à falta de código
        Cupom cupomInvalidoSemCodigo = new Cupom();
        validarExistencia.validarCupom(null, cupomInvalidoSemCodigo);
        System.out.println("\n----------------------------------------\n");

        // Cenário 2: Cupom inválido devido ao tipo de produto incorreto
        Cupom cupomInvalidoTipoProduto = new Cupom();
        cupomInvalidoTipoProduto.setCodigo("CODIGO2");
        cupomInvalidoTipoProduto.setTipoProduto("Comida");
        validarExistencia.validarCupom(null, cupomInvalidoTipoProduto);
        System.out.println("\n----------------------------------------\n");

        // Cenário 3: Cupom inválido devido à data fora do intervalo
        Cupom cupomInvalidoDataForaIntervalo = new Cupom();
        cupomInvalidoDataForaIntervalo.setCodigo("CODIGO3");
        cupomInvalidoDataForaIntervalo.setTipoProduto("Livros");
        validarExistencia.validarCupom(null, cupomInvalidoDataForaIntervalo);
        System.out.println("\n----------------------------------------\n");

        // Cenário 4: Cupom válido, passando por todas as validações
        Cupom cupomValido = new Cupom();
        cupomValido.setCodigo("CODIGO4");
        cupomValido.setTipoProduto("Eletrônicos");
        validarExistencia.validarCupom(null, cupomValido);
    }
}