# GOF - Chain of Responsibility

## Introdução
O padrão de projeto Chain of Responsibility, ou Cadeia de Responsabilidade em português, representa outra peça fundamental no arsenal de padrões comportamentais da programação orientada a objetos ¹. Este padrão visa criar uma cadeia de objetos que podem tratar solicitações de maneira independente. Cada objeto na cadeia possui a capacidade de processar a solicitação ou passá-la adiante na cadeia, permitindo que diferentes partes do sistema tratem a solicitação de forma flexível.

A estrutura do padrão Chain of Responsibility é composta por handlers (manipuladores) que formam uma sequência. Cada handler tem a responsabilidade de processar uma parte específica da solicitação e decidir se a manipula ou a encaminha para o próximo handler na cadeia. Isso promove a redução do acoplamento entre os componentes e permite que novos handlers sejam adicionados ou removidos sem afetar o restante da cadeia.

Ao utilizar o Chain of Responsibility, um pedido percorre a cadeia até que um handler o processe ou até o final da cadeia ser alcançado. Essa abordagem é valiosa em cenários nos quais diferentes componentes podem lidar com uma solicitação, e a escolha do handler apropriado depende da situação.

## Metodologia
Na fase inicial do projeto, os participantes realizaram uma revisão do conteúdo, dedicando tempo a estudos individuais sobre o sistema de compras da plataforma em foco neste trabalho. Após essa etapa, ocorreu uma reunião virtual via Discord em 28/11/2023, com duração de quatro horas.

Nesse primeiro encontro, todas as informações coletadas durante o estudo individual foram discutidas em detalhes. A partir dessas discussões, decidiu-se pela implementação do padrão Chain of Responsibility na fase de aplicação de cupons, e também foi iniciado o desenvolvimento da problemática, solução e esboços da UML.

Posteriormente, os participantes se reuniram novamente em 29/11/2023, em uma sessão de três horas. Durante esse encontro, concentraram-se na elaboração deste documento e na implementação do código do artefato em questão.

## Problemática e Solução

### Problemática
No contexto do sistema de compras da plataforma, identificou-se a necessidade de implementar um mecanismo flexível para a aplicação de cupons, onde diferentes tipos de validações e descontos podem ser aplicados de forma dinâmica e independente. A complexidade reside na variedade de condições que podem ser associadas aos cupons, como a validação da existência do cupom, a verificação da data de aplicação, a validação do tipo de produto e a aplicação de descontos baseados no valor da compra.

### Solução
Para lidar com a problemática identificada, optou-se por implementar o padrão de projeto Chain of Responsibility na fase de aplicação de cupons no sistema de compras. A solução consiste em criar uma cadeia de manipuladores (CupomHandler), onde cada manipulador tem a responsabilidade de realizar uma parte específica da validação ou aplicação de desconto associada ao cupom.

* ValidarExistencia: Responsável por validar a existência do cupom com base no nome fornecido.

* ValidarData: Responsável por verificar se a data atual está dentro do período de validade do cupom.

* ValidarTipoProduto: Responsável por validar se os produtos no carrinho correspondem ao tipo especificado no cupom.

* AplicarDesconto: Responsável por aplicar descontos com base no valor total da compra.

Cada manipulador na cadeia possui a capacidade de processar a solicitação (validar o cupom) e passá-la adiante para o próximo manipulador na cadeia ou interromper a cadeia caso identifique invalidade do cupom. Essa abordagem proporciona uma solução flexível e extensível, permitindo que novos tipos de validações sejam adicionados para lidar com novos tipos de cupons, sem afetar o restante do sistema. A cadeia de responsabilidade oferece uma divisão clara de responsabilidades, facilitando a manutenção e a evolução do sistema no que diz respeito à lógica de aplicação de cupons.

## UML

<div class="mermaid"> 
classDiagram
class CupomHandler{
    &#60;&#60;interface&#62;&#62;
    + validarCupom(Cupom cupomBaseDeDados, Cupom cupomUsuario) void
    + setProximo(cupomHandler: CupomHandler) void
}
class ValidarExistencia{
    - proximo: CupomHandler
    - Cupom[] cuponsExistentes
    + validarCupom(Cupom cupomBaseDeDados, Cupom cupomUsuario) void
    + setProximo(cupomHandler: CupomHandler) void
}
class ValidarData{
    - dataAtual: LocalDate
    - proximo: CupomHandler
    + validarCupom(Cupom cupomBaseDeDados, Cupom cupomUsuario) void
    + setProximo(cupomHandler: CupomHandler) void
}
class ValidarTipoProduto{
    - proximo: CupomHandler
    + validarCupom(Cupom cupomBaseDeDados, Cupom cupomUsuario) void
    + setProximo(cupomHandler: CupomHandler) void
}
class AplicarDesconto{
    - valorCompra: double
    - proximo: CupomHandler
    + validarCupom(Cupom cupomBaseDeDados, Cupom cupomUsuario) void
    + setProximo(cupomHandler: CupomHandler) void
}
Client --> CupomHandler : Manda comando
CupomHandler <|.. ValidarExistencia
CupomHandler <|.. ValidarData
CupomHandler <|.. ValidarTipoProduto
CupomHandler <|.. AplicarDesconto
</div>
<div style="text-align:center;">
Figura 1: UML Chain Of Responsibility
</div>

O diagrama de classes representado pela Figura 1 acima* reflete a arquitetura implementada para a aplicação do padrão de projeto Chain of Responsibility no sistema de compras da plataforma. A seguir, uma explicação detalhada dos principais elementos do diagrama:

* CupomHandler (Interface): A interface CupomHandler define o contrato para os manipuladores que compõem a cadeia de responsabilidade. Contém métodos para validar o cupom (validarCupom) e configurar o próximo manipulador na cadeia (setProximo).
* ValidarExistencia, ValidarData, ValidarTipoProduto, AplicarDesconto (Classes Concretas):
  * Cada uma dessas classes implementa a interface CupomHandler, representando um manipulador específico na cadeia.
  * Atributos específicos, como nome, dataAtual, cuponsExistentes e valorCompra, são utilizados para armazenar informações relevantes para a lógica de validação ou aplicação de desconto.
* Client (Cliente): A classe Client interage com o manipulador inicial da cadeia, enviando comandos para validar o cupom. Esta classe representa o ponto de entrada para a aplicação do padrão.
* Relacionamentos:
  * O relacionamento entre Client e CupomHandler indica a interação entre o cliente e o manipulador inicial da cadeia.
  * Os relacionamentos CupomHandler e ValidarExistencia, CupomHandler e ValidarData, CupomHandler e ValidarTipoProduto, CupomHandler e AplicarDesconto representam a relação de implementação, indicando que cada uma dessas classes concretas implementa a interface CupomHandler.
* Funcionamento: A cadeia de responsabilidade é estabelecida pela interconexão dos manipuladores, onde cada manipulador decide se deve processar a solicitação (validar o cupom ou aplicar desconto) ou passá-la adiante para o próximo manipulador na cadeia. Essa abordagem permite uma aplicação flexível de cupons, onde diferentes tipos de validações e descontos podem ser aplicados de maneira dinâmica e independente.

O diagrama de classes proporciona uma visão clara da estrutura do padrão Chain of Responsibility implementado, oferecendo uma solução para a aplicação de cupons no contexto do sistema de compras da plataforma.

## Código
```BaseDeDadosCupons.java
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
```
```Carrinho.java
class Carrinho {
    private double valor;

    public Carrinho(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
```
```Cupom.java
import java.time.LocalDate;

public class Cupom {
    private String codigo;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private String tipoProduto;
    private int porcentagemDesconto;

    public Cupom() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public int getPorcentagemDesconto() {
        return porcentagemDesconto;
    }

    public void setPorcentagemDesconto(int porcentagemDesconto) {
        this.porcentagemDesconto = porcentagemDesconto;
    }
}
```
```CupomHandler.java
public interface CupomHandler {
    public void validarCupom(Cupom cupomBaseDeDados, Cupom cupomUsuario);
    public void setProximo(CupomHandler cupomHandler);
}
```
```ValidarExistencia.java
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
```
```ValidarData.java
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
```
```ValidarTipoProduto.java
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
```
```AplicarDesconto.java
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
```



## Referências Bibliográficas
1 - https://refactoring.guru/pt-br/design-patterns/chain-of-responsibility  
2 - GAMMA, E. et al. Design Patterns. [s.l.] Pearson Education, 1994.
https://diogomoreira.gitbook.io/padroes-de-projeto/padroes-gof-comportamentais/padrao-chain-of-responsibility

## Histórico de Versões
| Versão   | Descrição  | Responsável | Revisor    | Data      |
|----------|------------|-------------|------------|-----------|
| 1.0      | Criação da estrutura da página   | [Débora Moreira](https://github.com/deboracaires) e [Maciel Júnior](https://github.com/macieljuniormax) |    | 29/11/2023|
| 1.1      | UML e código implementados   | [Débora Moreira](https://github.com/deboracaires) e [Maciel Júnior](https://github.com/macieljuniormax) |    | 29/11/2023|
