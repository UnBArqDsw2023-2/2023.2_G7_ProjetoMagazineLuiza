import classes.CalcDescontoStrategy;
import classes.CalcDescontoPorcento;
import classes.CalcDescontoValor;
import classes.NoDiscount;
import classes.Sacola;

public class Main {
    public static void main(String[] args) {

        Sacola sacola = new Sacola();
        
        float valorTotal = sacola.calcularTotal();

        CalcDescontoStrategy desconto10Porcento = new CalcDescontoPorcento(10);
        float valorComDescontoPorcento = desconto10Porcento.calculaDesconto(valorTotal);
        System.out.println("Valor com desconto de 10%: " + valorComDescontoPorcento);

        CalcDescontoStrategy descontoFixo = new CalcDescontoValor(20);
        float valorComDescontoFixo = descontoFixo.calculaDesconto(valorTotal);
        System.out.println("Valor com desconto fixo de 20: " + valorComDescontoFixo);

        CalcDescontoStrategy semDesconto = new NoDiscount();
        float valorSemDesconto = semDesconto.calculaDesconto(valorTotal);
        System.out.println("Valor sem desconto: " + valorSemDesconto);
    }
}