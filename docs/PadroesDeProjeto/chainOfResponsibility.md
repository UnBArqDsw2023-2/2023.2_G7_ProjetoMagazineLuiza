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

## UML
```mermaid
graph TD;
    A-->B;
    A-->C;
    B-->D;
    C-->D;
```  

<div class="mermaid"> 
graph TD;
    A-->B;
    A-->C;
    B-->D;
    C-->D;
</div>

## Código

## Referências Bibliográficas
1 - https://refactoring.guru/pt-br/design-patterns/chain-of-responsibility
2 - GAMMA, E. et al. Design Patterns. [s.l.] Pearson Education, 1994.

## Histórico de Versões
| Versão   | Descrição  | Responsável | Revisor    | Data      |
|----------|------------|-------------|------------|-----------|
| 1.0      | Criação da estrutura da página   | [Débora Moreira](https://github.com/deboracaires) e [Maciel Júnior](https://github.com/macieljuniormax) |    | 29/11/2023|