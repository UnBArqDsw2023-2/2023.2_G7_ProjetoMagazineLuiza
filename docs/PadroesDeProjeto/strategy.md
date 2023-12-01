# GOF - Strategy

## Introdução

É um padrão de projeto que tem a intenção de definir uma família de algoritmos, encapsular cada um deles e fazê-los intercambiáveis. O strategy permite que o algoritmo varie independentemente dos clientes que o utilizam, isto é, ele permite separar uma regra de negócio dos seus algoritmos. No caso, o strategy é utilizado para implementar uma função de cálculo de desconto de acordo com o Subtotal e a regra do cupom de desconto. Por fim, calcula-se o valor do subtotal subtraído o desconto.

## Metodologia

Foi realizada uma reunião via Discord com quatro integrantes (duas duplas), nessa, as duas duplas realizaram a parte de implementação dos GOF's. A reunião teve início às 19 horas e durou aproximadamente 4 horas. O motivo da realização em conjunto com outra se deu para parear e estruturar de maneira similar os documentos referentes à entrega de reutilização, além de evitar sobreposição de resoluções de vicissitudes e de padrões de projeto.

## Problemática e Solução

Foi analisado no artefato de [Visão de Caso de Uso](ArquiteturaReutilizacao/DAS.md?id=visão-de-casos-de-uso) que o site da Magazine Luiza, diferente de outros sites de mesma natureza, como a Kabum, não possui a opção de calcular o valor da compra desejada com algum cupom de desconto na página da sacola, somente após o usuário prosseguir para a compra. A solução foi realizada por meio do Strategy, no qual foi criada uma interface Strategy para calcular o desconto, na qual havia o método abstrato a ser reescrito. Além disso, uma classe com método sobrescrito para calcular o desconto com de valor fixo, da mesma forma, outras duas para calcular o desconto em porcentagem e outro para caso de não haver desconto.

## UML

No diagrama de classes, a classe Sacola apresenta métodos nos quais a implementação aqui feita omitiu, dado que seria apenas uma lista. Portanto, na implementação da referida classe, esses métodos permaneceram comentados sem corpo e apenas utilizou-se de um valor fixo para testar o cálculo do desconto. A estrutura básica do Strategy está de acordo com o Refactoring Guru. Entretanto, na implementação realizada, a Sacola seria a Context, a qual possui uma relação de agregação com a Desconto Strategy. Já a generalização ocorre da interface com as demais outras classes concretas, onde o método apresentado na interface apresenta o polimorfismo.

<center>

Figura 1 - Diagrama de Classes

<img src="assets/strategy/strategy-uml.png" alt="Classes" width="1400"/>

<font>Fonte: [Arthur de Melo](https://github.com/arthurmlv) e [Sidney Fernando](https://github.com/nando3d3), 2023</font>

</center>

## Código

O código da Figura 2 é o Strategy do desconto, o qual define o método abstrato a ser sobrescrito. Vale ressaltar que algumas idiossincrasias referentes às restrições dos referidos cupons, como casos de cupons específicos para alguns tipos de produtos.

<center>

Figura 2 - Código Desconto Strategy

<img src="assets/strategy/strategy1.png" alt="Desconto Strategy" width="850"/>

<font>Fonte: [Arthur de Melo](https://github.com/arthurmlv) e [Sidney Fernando](https://github.com/nando3d3), 2023</font>

</center>

Já o código da Figura 3 apresenta o método sobrescrito para cálculo do desconto com base na porcentagem.

<center>

Figura 3 - Código Desconto Porcentagem

<img src="assets/strategy/strategy2.png" alt="Desconto Porcentagem" width="850"/>

<font>Fonte: [Arthur de Melo](https://github.com/arthurmlv) e [Sidney Fernando](https://github.com/nando3d3), 2023</font>

</center>

Da mesma forma código da Figura 4 apresenta o método sobrescrito para cálculo do desconto com valor fixo. Contudo, não se leva em consideração o valor mínimo para utilização do cupom de desconto.

<center>

Figura 4 - Código Desconto Valor Fixo

<img src="assets/strategy/strategy4.png" alt="Desconto Valor Fixo" width="850"/>

<font>Fonte: [Arthur de Melo](https://github.com/arthurmlv) e [Sidney Fernando](https://github.com/nando3d3), 2023</font>

</center>

Por fim, o método sem desconto, que seria utilizado para compras realizadas sem cupom. Além disso, pode-se utilizar tal para calcular casos onde o cupom é inválido.

<center>

Figura 5 - Código Sem Desconto

<img src="assets/strategy/strategy3.png" alt="Sem Desconto" width="850"/>

<font>Fonte: [Arthur de Melo](https://github.com/arthurmlv) e [Sidney Fernando](https://github.com/nando3d3), 2023</font>

</center>

## Referências Bibliográficas

> IEEE. SWEBOK-Guide to the Software Engineering Body of Knowledge, 2004.
> 
> Refactoring Guru. Padrões Comportamentais: Strategy. Refactoring.Guru, 2023. Disponível em: <https://refactoring.guru/pt-br/design-patterns/strategy>.

## Histórico de Versões
| Versão   | Descrição  | Responsável | Revisor    | Data      |
|----------|------------|-------------|------------|-----------|
| 1.0      | Documentação da implementação do Strategy.   | [Arthur de Melo](https://github.com/arthurmlv) e [Sidney Fernando](https://github.com/nando3d3)  |  [Douglas Alves](https://github.com/dougalvs)  | 30/11/2023 |
| 1.0      | Documentação da implementação do Strategy.   | [Arthur de Melo](https://github.com/arthurmlv)   |  [Douglas Alves](https://github.com/dougalvs)  | 30/11/2023 |