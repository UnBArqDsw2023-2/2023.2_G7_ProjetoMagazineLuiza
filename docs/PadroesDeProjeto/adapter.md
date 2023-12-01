# GOF - Adapter

## Introdução

De maneira concisa, um padrão pode ser definido como "uma solução recorrente para um problema comum em um contexto específico" (SWEBOK, 2019). No universo da engenharia de software, os padrões desempenham um papel crucial na definição da arquitetura e do design dos sistemas. Nesse contexto, os estilos arquiteturais oferecem uma perspectiva abrangente sobre a organização do software. Esses estilos se dividem em três categorias distintas: criacionais, estruturais e comportamentais, cada uma abordando desafios específicos.

No âmbito dessas categorias, foi escolhido o padrão de projeto Adapter para resolver um desafio específico no site da Magazine Luiza. Este padrão, inserido na categoria estrutural, demonstra sua utilidade ao harmonizar interfaces inicialmente incompatíveis, facilitando a integração entre componentes heterogêneos. Desta forma, foi explorado como a implementação do padrão Adapter se revelou útil para aprimorar a funcionalidade de pagamento, a problemática será melhor discorrida no tópico **Problemática e Solução**.

## Metodologia

A preparação para a produção do artefato teve início após a reunião documentada na [Ata 5](https://unbarqdsw2023-2.github.io/2023.2_G7_ProjetoMagazineLuiza/#/atas/ata5), na qual as duplas foram designadas, e discutiram-se os padrões mais viáveis para a realização. O estudo individual foi conduzido antes da reunião agendada para o dia 29 de novembro de 2023, às 19h00, por meio do Discord. Durante a mesma, realizou-se uma análise dos padrões de projeto para identificar aquele que melhor se adequaria à problemática apresentada em "Problemática e Solução". O diagrama de classes foi elaborado no [Lucidchart](https://lucid.app/), utilizando o formato do template UML, e a implementação do código ocorreu no ambiente VScode, utilizando a linguagem Java.

## Problemática e Solução

### Problemática 

No contexto do sistema de pagamento da plataforma, uma avaliação do artefato [mapa mental](/Base/MapaMental.md?id=visualização-no-miro) revelou que os diferentes métodos de pagamento poderiam representar várias interfaces distintas para o seu processamento. Portanto, o sistema precisaria de uma maneira uniforme de lidar com todas essas interfaces distintas. Este desafio se torna ainda mais complexo quando consideramos as alterações no código que seriam necessárias para a inclusão de novos métodos de pagamento ou caso alguma dessas interfaces já existentes fosse alterada.

### Solução 

A solução escolhida foi, usando o padrão adaptador, estabelecer uma interface de pagamento padrão para o sistema e, para cada método de pagamento diferente, criar uma classe adaptadora que converta as chamadas para a interface desse sistema de pagamento específico. Assim, quando um cliente faz um pedido, a interface de pagamento padrão é utilizada, com o adaptador apropriado sendo escolhido com base no método de pagamento selecionado.

## UML

O diagrama de classes representado pela Figura 1 reflete a modelagem feita para a aplicação do padrão de projeto Adapter no sistema de pagamento da plataforma.

<center>

Figura 1 - Diagrama de Classes Adapter Versão 1

<img src="assets/DiagramaReutilizacao/diagramaClassesAdapter.png" alt="" width="1400"/>

<font>Fonte: [Douglas Alves](https://github.com/dougAlvs) e [Geovanna Maciel](https://github.com/manuziny), 2023</font>

</center>

A seguir, uma explicação detalhada dos principais elementos do diagrama:
* CheckoutService: o serviço de checkout se comunica com cada meio de pagamento pela interface PaymentGateway;
* PaymentGateway: representa a interface de pagamento padrão do sistema, deve ser implementada pelas classes adaptadores de todos os métodos de pagamento;
* MercadoPagoAdapter e PaypalAdapter: cada uma representa a classe adaptadora de um sistema de pagamento distinto, elas devem ser capaz de trabalhar tanto com o código cliente quanto com o serviço específico que adaptam, ou seja, elas recebem as chamadas do cliente e passam para a API de pagamento processar;
* MercadoPagoAPI e PaypalAPI: representam os sistemas de pagamento que são adaptados ao sistema.

## Código

O código realiza a implementação da modelagem UML proposta, entretanto, algumas funcionalidades que seriam mais complexas em um contexto real, como as solicitações às APIs de pagamento, verificação de credenciais, transações de débito e crédito, entre outras, foram "mockadas" para demonstrar a operação do padrão de projeto.


A Figura 2 ilustra a classe Main, ela recebe do usuário a escolha do método de pagamento e chama o CheckoutService passando essa escolha como parâmetro.

<center>

Figura 2 - Classe Main

<img src="assets/DiagramaReutilizacao/main-adapter.png" alt="" width="1200"/>

<font>Fonte: [Douglas Alves](https://github.com/dougAlvs) e [Geovanna Maciel](https://github.com/manuziny), 2023</font>

</center>


A Figura 3 ilustra a classe CheckoutService, ele se comunica com cada meio de pagamento pela interface PaymentGateway e dependendo da escolha do usuário chama o adapter correspondente para realizar o checkout do pagamento.

<center>

Figura 3 - Classe CheckoutService

<img src="assets/DiagramaReutilizacao/checkout-adapter.png" alt="" width="2400"/>

<font>Fonte: [Douglas Alves](https://github.com/dougAlvs) e [Geovanna Maciel](https://github.com/manuziny), 2023</font>

</center>


Na Figura 4 é possível ver a interface padrão de pagamento além das adapters de cada meio de pagamento específico, cada uma delas delegando o trabalho para a API correspondente.

<center>

Figura 4 - Classes Adaptadoras

<img src="assets/DiagramaReutilizacao/adapters.png" alt="" width="1200"/>

<font>Fonte: [Douglas Alves](https://github.com/dougAlvs) e [Geovanna Maciel](https://github.com/manuziny), 2023</font>

</center>

Por fim, a Figura 5 traz exemplos de cada API de pagamento.

<center>

Figura 5 - Exemplos de APIs

<img src="assets/DiagramaReutilizacao/api-adapter.png" alt="" width="1200"/>

<font>Fonte: [Douglas Alves](https://github.com/dougAlvs) e [Geovanna Maciel](https://github.com/manuziny), 2023</font>

</center>

## Como rodar o código?

Esse código de exemplo está localizado no repositório do projeto, especificamente no diretório [code/padroes/adapter](https://github.com/UnBArqDsw2023-2/2023.2_G7_ProjetoMagazineLuiza/tree/main/code/padroes/adapter), e foi estruturado com o [Maven](/ArquiteturaReutilizacao/4.2.ReutilizacaoDeSoftware.md?id=reutilização-externa). Dito isso, para executá-lo basta estar no diretório em questão e executar no terminal o comando <b>"mvn exec:java"</b>, com a saída do código sendo a seguinte:

<center>

Figura 6 - Saída do código de exemplo

<img src="assets/DiagramaReutilizacao/saida-adapter.png" alt="" width="1200"/>

<font>Fonte: [Douglas Alves](https://github.com/dougAlvs) e [Geovanna Maciel](https://github.com/manuziny), 2023</font>

</center>

## Conclusões

Observou-se que a aplicação do padrão adapter trouxe diversas vantagens para o código da aplicação. Caso novas formas de pagamento forem adicionadas, seria apenas necessário criar novas classes adaptadoras. E se, por acaso, algum sistema de pagamento tivesse alterações em seu código, apenas a respectiva classe adaptadora no sistema precisaria ser alterada, sem a necessidade de alterar o código cliente. Portanto, o código estaria em conformidade com o princípio Aberto/Fechado da programação orientada a objetos, ou seja, seria possível ampliar a funcionalidade de uma classe sem modificá-la.

## Referências Bibliográficas
> Software Engineering Body of Knowledge (SWEBOK) | IEEE Computer Society» (em inglês). Consultado em 25 de junho de 2019.
> 
> **Adapter**. Refactoring Guru, 2023. Disponível em: <https://refactoring.guru/pt-br/design-patterns/adapter>. Acesso em: 30 de novembro de 2023.

## Histórico de Versões
| Versão   | Descrição  | Responsável | Revisor    | Data      |
|----------|------------|-------------|------------|-----------|
| 1.0      | Criação da estrutura da página   | [Douglas Alves](https://github.com/dougAlvs) e [Geovanna Maciel](https://github.com/manuziny)  |  [Sidney Fernando](https://github.com/nando3d3)  | 28/11/2023|
| 1.1      | Adição da introdução, metodologia e UML | [Geovanna Maciel](https://github.com/manuziny)  | [Douglas Alves](https://github.com/dougAlvs)  | 29/11/2023|
| 1.2      | Adição dos prints do código, além de problemática, solução e  conclusão|  [Douglas Alves](https://github.com/dougAlvs)  | [Arthur de Melo](https://github.com/arthurmlv) | 01/12/2023|