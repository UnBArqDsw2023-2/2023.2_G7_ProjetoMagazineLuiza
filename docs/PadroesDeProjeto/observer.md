# GOF - Observer

## Introdução

O Observer é um padrão de projeto comportamental que permite definir um mecanismo para reagir às alterações realizadas em determinados objetos sobre eventos que aconteçam com o objeto que eles estão observando.

## Metodologia

## Problemática e Solução

### Problemática

O consumidor demonstra interesse por vários produtos e com a proximidade de um período promocional, deseja monitorar suas variações de preço até atingirem um valor desejado. Como resultado, ele visita diariamente as páginas dos produtos para essa verificação, ocasionando um desperdício de recursos para a aplicação, que precisa processar essas solicitações redundantes, e demandando um tempo significativo do cliente para essa tarefa.

### Solução

Utilizando o padrão Observer, uma classe **Cliente** como um _observer/subscribe_ poderia se inscrever para receber notificações automáticas sempre que o preço da classe **Produto** como um _subject/publisher_ alterasse o valor para o de interesse. Isso evitaria o desperdício de recursos da aplicação ao processar solicitações desnecessárias já que somente realizaria uma notificação quando os preços fossem alterados e pouparia o tempo do cliente, que não precisaria mais realizar verificações frequentes.

## UML

## Código

## Referências Bibliográficas

**!! Consertar !!**

> <a id='ref1'>[1.](#anchor1)</a> GAMMA, Eric et all. **Design Patterns: Elements of Reusable Object-Oriented Software.** 1rd ed. Indianapolis: Pearson Education, 1994.

## Histórico de Versões

| Versão | Descrição                                        | Responsável                                      | Revisor                                      | Data       |
| ------ | ------------------------------------------------ | ------------------------------------------------ | -------------------------------------------- | ---------- |
| `1.0`  | Criação da página com introdução e problemática. | [Matheus Henrique](https://github.com/mathonaut) | [Douglas Alves](https://github.com/dougAlvs) | 29/11/2023 |
