# Diagrama de Atividades

## Introdução

O Diagrama de Atividades é um diagrama dinâmico, o qual configura uma visão comportamental de um fluxo de controle ou de objeto. Contudo, nesse tipo de diagrama, o foco é sequencial e condicional dentro do fluxo (UML DIAGRAMS, 2023). Apesar de constituir um papel semelhante ao de um fluxograma, tal suporta a representação de comportamentos paralelos (FOWLER, 2014).

## Participantes

Na Tabela 1 a seguir, pode-se rastrear a participação de cada integrante na elaboração dos diagramas.

<div style="margin-left: auto;
            margin-right: auto;
            width: 60%">
<font size="3"><p style="text-align: center"><b>Tabela 1</b> - Participantes</p></font>

| Participantes   | Etapas  |
|-----------------|:------------:|
| [Arthur de Melo](https://github.com/arthurmlv), [Geovanna Maciel](https://github.com/manuziny), [Maciel Júnior](https://github.com/macieljuniormax) e [Sidney Fernando](https://github.com/nando3d3) | Diagrama de Atividades Versão 1 |

<font size="3"><p style="text-align: center">Fonte: Autores</p></font>
</div>

## Metodologia

Antes de realizar a reunião em grupo para a confecção do diagrama, cada integrante realizou um estudo individual. Após isso, fez-se uma reunião que durou cerca de 4 horas e que foi realizada na plataforma Discord no dia 29/09/2023, a qual teve início às 17 horas. Durante essa reunião, cada integrante ofereceu uma visão da atividade a ser detalhada no diagrama e tal foi modelado de acordo com a ordem e a forma de realização de tais atividades no site da Magazine Luiza.

A perspectiva condicional do diagrama foi feita com base nas decisões e nas intercalações. As decisões são compostas por apenas um fluxo de entrada e vários de saída, já as intercalações apresentam vários fluxos de entrada e um de saída (FOWLER, 2014). 

## Diagramas produzidos

A Figura 1 representa a primeira versão do diagrama de atividades de cadastro e de acesso. Já a Figura 2 retrata o diagrama de atividades da ação de compra.

### Versão 1

Na Figura 1, para cadastrar o comprador, compreende-se que o [usuário](Base/lexicos.md#l05-usuário) se torna [cadastrado](Base/lexicos.md#l03-cadastrado) após um processo de validação do e-mail e de seus dados. Ao confirmar o e-mail, o usuário pode simplesmente finalizar a tarefa ou acessar sua conta. O processo de acessar a conta se trata de preencher e-mail, preencher senha e verificar os dados de autenticação. Caso os dados estejam corretos, o [usuário](Base/lexicos.md#l05-usuário) pode prosseguir para outra atividade ou realizar uma [compra](Base/lexicos.md#l02-comprar).

<center>

Figura 1 - Diagrama de Atividades: Cadastro e Acesso

<img src="assets/diagramaAtividade1.png" alt="Diagrama de Atividades 1" width="1000"/>

<font>Fonte: Autores, 2023</font>

</center>

A realização de uma [compra](Base/lexicos.md#l02-comprar) envolve, inicialmente, duas formas de encontrar um [produto](Base/lexicos.md#l08-produto): por meio de uma [busca](Base/lexicos.md#l10-buscar) ou por meio de uma navegação no site. Uma [busca](Base/lexicos.md#l10-buscar) se trata da busca por um [produto](Base/lexicos.md#l08-produto) ou uma ideia de [produto](Base/lexicos.md#l08-produto), podendo achar tal ou não. Já a navegação é quando o [usuário](Base/lexicos.md#l05-usuário) não possui uma ideia específica do que procura. Portanto, ele [visualiza](Base/lexicos.md#l09-visualizar) diversos produtos até achar ou não um de seu interesse.

Após a [visualização](Base/lexicos.md#l09-visualizar) do [produto](Base/lexicos.md#l08-produto), ele pode adicionar à sacola ou procurar outros produtos e atualizar a sacola. Por fim, para realizar a compra, pode-se visualizar os itens da sacola e prosseguir com a [compra](Base/lexicos.md#l02-comprar). Após isso, a escolha de destino pode se utilizar de um [endereço salvo](Base/lexicos.md#l04-salvar-endereço), receber no endereço escolhido ou retirar na loja. Por fim, o método de pagamento é escolhido e, após realizar o pagamento, o pagamento é confirmado e o pedido é [confirmado](Base/lexicos.md#l07-pedido-confirmado).

<center>

Figura 2 - Diagrama de Atividades: Compra

<img src="assets/diagramaAtividade2.png" alt="Diagrama de Atividades 1" width="1000"/>

<font>Fonte: Autores, 2023</font>

</center>

### Versão 2

A versão 2 do Diagrama de Atividades de Cadastro e Acesso se justifica devido à necessidade de aprimorar a representação dos processos e torná-la mais precisa. Em sua primeira versão, algumas situações que não eram propriamente bifurcações foram reavaliadas e corretamente identificadas como decisões, proporcionando uma melhor compreensão do fluxo de atividades. Além disso, para enriquecer a representação, foram introduzidos objetos como Email e dados, que são elementos cruciais em muitos processos, tornando o diagrama mais completo e fiel à realidade das operações. Essas melhorias na segunda versão do Diagrama de Atividades contribuem para uma representação mais precisa e eficaz dos processos e suas interações. A explicação sobre seu funcionamento continua a mesma da versão 1.

<center>

Figura 3 - Diagrama de Atividades: Cadastro e Acesso versão 2

<img src="assets/diagramaAtividade1_v2.png" alt="Diagrama de Atividades 1" width="1000"/>

<font>Fonte: Autores, 2023</font>

</center>

## Conclusão

Produzidos esses diagramas, foi possível analisar a lógica do procedimento que envolvem os léxicos do [usuário](Base/lexicos.md#l05-usuário), [cadastrar](Base/lexicos.md#l01-cadastrar), [comprar](Base/lexicos.md#l02-comprar), [cadastrado](Base/lexicos.md#l03-cadastrado), [pedido confirmado](Base/lexicos.md#l07-pedido-confirmado), [produto](Base/lexicos.md#l08-produto), [visualizar](Base/lexicos.md#l09-visualizar) e [buscar](Base/lexicos.md#l10-buscar). Isso posto, infere-se que, após e durante a confecção do diagrama de atividades, pôde-se analisar apropriadamente as idiossincrasias das atividades e desenvolver novas visões acerca das atividades principais do projeto. Portanto, tal artefato complementa os léxicos de forma significativa.

## Referências Bibliográficas

> FOWLER, Martin. UML Essencial: um breve guia para linguagem padrão. Bookman editora, 2014.
> 
> UML DIAGRAMS. UML Activity Diagrams, 2023. Disponível em: <<https://www.uml-diagrams.org/activity-diagrams.html>>. Acesso em: 29/09/2023.
> 
> LARMAN, Craig. Utilizando UML e padrões. Bookman Editora, 2007.

## Histórico de Versões

| Versão   | Descrição  | Responsável | Revisor    | Data      |
|----------|------------|-------------|------------|-----------|
| `1.0`    | Criação dos Diagramas Versão 1 | [Arthur de Melo](https://github.com/arthurmlv), [Geovanna Maciel](https://github.com/manuziny), [Maciel Júnior](https://github.com/macieljuniormax) e [Sidney Fernando](https://github.com/nando3d3)  |  [Douglas Alves](https://github.com/dougalvs)  | 29/09/2023 |
| `1.1`    | Documentação Versão 1 | [Arthur de Melo](https://github.com/arthurmlv)  |  [Douglas Alves](https://github.com/dougalvs)  | 07/10/2023 |
| `1.2`    | Documentação Versão 1 Conclusão | [Arthur de Melo](https://github.com/arthurmlv)  |  [Douglas Alves](https://github.com/dougalvs)  | 08/10/2023 |
| `1.2.1`   | 08/10/2023 | Correção links                                                                       | [Douglas Alves](https://github.com/dougAlvs) |   |
| `1.3`   | 08/10/2023 | Versão 2 do artefato                                                            | [Sidney Fernando](https://github.com/nando3d3) |   |