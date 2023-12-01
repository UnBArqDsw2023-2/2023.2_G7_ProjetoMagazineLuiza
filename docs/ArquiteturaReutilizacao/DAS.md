# Documento de Arquitetura de Software

## Introdução

A visão DAS 4+1, proposta por Kruchten, é um modelo arquitetural abrangente que visa proporcionar uma compreensão holística de sistemas complexos de software. No projeto foi utilizado uma adaptção desse modelo, utilizando as visões de Caso de Uso, Lógica, Implementação, Dados e de Processo. Essa abordagem rica visa atender às necessidades de diferentes stakeholders, desde desenvolvedores e arquitetos até gerentes de projeto e usuários finais. Neste documento, foi analisado como a integração dessas perspectivas podem aprimorar de forma significativa o processo de design e arquitetura de software.

## Objetivo

Esse artefato tem o objetivo de implementar, explorar e compreender a abordagem adaptada da Visão DAS 4+1 no contexto do projeto. Este estudo visa analisar cada uma das cinco visões - Casos de Uso, Lógica, Implementação, Processo e Dados - para fornecer uma compreensão abrangente e integrada do desenvolvimento de software. Ao final, o objetivo é aplicar os princípios e as práticas da Visão DAS 4 + 1 para otimizar a qualidade, a eficiência e a adaptabilidade dos sistemas.

## Metodologia

Para a execução do artefato, houve uma divisão dos grupos, cada um responsável por uma visão específica. A decisão sobre essa divisão está documentada na [Ata 5](https://unbarqdsw2023-2.github.io/2023.2_G7_ProjetoMagazineLuiza/#/atas/ata5). Nessa reunião, também foi acordado representar a arquitetura do sistema com uma versão adaptada da visão DAS 4+1, que incluiu a visão de dados, enquanto a visões de cenários e de implantação foram omitidas. A escolha de não utilizar a visão de cenários foi motivada pela maior afinidade do grupo com a visão de Caso de Uso, além de ser uma sugestão do autor sobre a opção de usar cenários ou não. A tabela 1 representa a alocação das equipes para elaboração de cada visão, assim como os insumos de cada uma delas.

<div align="center">

Tabela 1 - Visões de Arquitetura

| Visão | Integrantes | Insumos |
|---------| ---------|---------|
| [Visão de Caso de Uso](/ArquiteturaReutilizacao/DAS?id=visão-de-casos-de-uso)   |  [Arthur de Melo](https://github.com/arthurmlv) e [Geovanna Maciel](https://github.com/manuziny)  |   [Diagrama de Caso de Uso](/ArquiteturaReutilizacao/DAS?id=visão-de-casos-de-uso)        |
| [Visão Lógica](/ArquiteturaReutilizacao/DAS?id=visão-lógica)   | [Geovanna Maciel](https://github.com/manuziny), [Laura Pinos](https://github.com/laurapinos) e [Sidney Fernando](https://github.com/nando3d3)   |   [Diagrama de Classes](Modelagem/DiagramaClasses), [Diagrama de Pacotes](Modelagem/DiagramaPacotes) e [Diagrama de Comunicação](Modelagem/comunicacao)       |
| [Visão de Dados](/ArquiteturaReutilizacao/DAS?id=visão-de-dados)   | [Douglas Alves](https://github.com/dougAlvs)    | [Modelo Entidade Relacionamento](/ArquiteturaReutilizacao/DAS?id=visão-de-dados), [Diagrama Entidade Relacionamento](/ArquiteturaReutilizacao/DAS?id=visão-de-dados) e [Diagrama Lógico de Dados](/ArquiteturaReutilizacao/DAS?id=visão-de-dados)         |
| [Visão de Processo](/ArquiteturaReutilizacao/DAS?id=visão-de-processo)   | [Arthur de Melo](https://github.com/arthurmlv) e [Matheus Henrique](https://github.com/mathonaut)  |   [Diagrama de Sequência](Modelagem/DiagramaSequencia)   e [Diagrama de Comunicação](Modelagem/comunicacao)      |
| [Visão de Implementação](/ArquiteturaReutilizacao/DAS?id=visão-de-implementação) | [Débora Caires](https://github.com/deboracaires), [Douglas Alves](https://github.com/dougAlvs) e  [Maciel Júnior](https://github.com/macieljuniormax)  |    [Diagrama de Componentes](Modelagem/diagrama-componentes)       |

Fonte: _[Geovanna Maciel](https://github.com/manuziny)_

</div>

A formação dos grupos ocorreu com base na afinidade de cada integrante com os artefatos relacionados a uma visão específica. Embora a entrega não incluísse a correção dos diagramas, essa tarefa foi realizada remotamente por cada equipe responsável pela visão designada. As ferramentas utilizadas para corrigir os diagramas foram [Lucidchart](https://lucid.app/) e o [Drawio](https://drawio-app.com), as correções feitas estão detalhadas na página de cada respectivo diagrama. A etapa de estudo individual foi realizada antes da execução do artefato. Cada grupo adotou a metodologia que melhor lhe convém, e essas escolhas estão detalhadas na seção metodológica de cada visão.

Embora cada visão possua uma página dedicada, neste documento elas estão consolidadas para proporcionar uma leitura mais fluida. Isso permite que o leitor identifique a integração do sistema em cada visão, demonstrando como essa abordagem pode otimizar a qualidade, a eficiência e a adaptabilidade dos sistemas.

## Escopo

O presente Documento de Arquitetura de Software se aplica ao escopo do perfil comprador, com o fluxo compreendido do cadastro na plataforma até a visualização, compra e pagamento de produtos da plataforma de comércio eletrônico Magalu. Na etapa de [desenho de software base](Base/1.Base) do projeto, a equipe elaborou, por meio de uma sessão de brainstorming, um [mapa mental](/Base/MapaMental.md) para entender melhor o escopo do trabalho e quais os processos que seriam abordados em etapas posteriores, tudo isso sob a ótica de diferentes integrantes com perspectivas distintas. Na Figura X é possível visualizar esse mapa mental.


<center>

Figura X - Mapa mental do escopo do projeto

<iframe width="768" height="432" src="https://miro.com/app/live-embed/uXjVMlLkH4M=/?moveToViewport=-3357,-1315,1028,1032&embedId=34743970085" frameborder="0" scrolling="no" allow="fullscreen; clipboard-read; clipboard-write" allowfullscreen></iframe>

<font>Fonte: Autores, 2023 </font>

</center>

## Visão de Casos de Uso

<details>
<summary>Detalhes</summary>

[Visão de Casos de Uso](./visoes/visao-use-case.md ':include')

</details>

## Visão Lógica

<details>
<summary>Detalhes</summary>

[Visão Lógica](./visoes/visao-logico.md ':include')

</details>

## Visão de Processo

<details>
<summary>Detalhes</summary>

[Visão de Processo](./visoes/visao-processos.md ':include')

</details>

## Visão de Dados

<details>
<summary>Detalhes</summary>

[Visão Dados](./visoes/visao-dados.md ':include') 

</details>


## Referências Bibliográficas

> FOWLER, Martin. UML Essencial: um breve guia para linguagem padrão. Bookman editora, 2014.
>
> Lucidchart. Diagrama de Caso de Uso UML. Disponível em: <https://www.lucidchart.com/pages/pt/diagrama-de-caso-de-uso-uml>. Acesso em: 28 de novembro de 2023 às 16:08.
> 
> LARMAN, Craig. Utilizando UML e padrões. Bookman Editora, 2007.
>
> Bourque, P., Fairley, R. E. Guide to the Software Engineering Body of Knowledge, Version 3.0. SWEBOK. IEEE Computer Society, 2014. Disponível em: http://www.computer.org/web/swebok/v3.
>
> SOMMERVILLE, Ian. Engenharia de Software. 9a. edição. Pearson, 2011.</p>
>
> KRUCHTEN, Philippe. Architectural Blueprints — The “4+1” View Model of Software Architecture. IEEE Software 12 (6), pp. 42-50, 1995. Disponível em: <https://www.cs.ubc.ca/~gregor/teaching/papers/4+1view-architecture.pdf>. Acesso em: 28 de novembro de 2023 às 15:00.
>
> <a id='ref1'>[1.](#anchor1)</a> FOWLER, Martin. **UML Distilled : A Brief Guide to the Standard Object Modeling Language.** 3rd ed. Boston: Pearson Education, 2003.


## Histórico de Versões

| Versão   | Descrição  | Responsável | Revisor    | Data      |
|----------|------------|-------------|------------|-----------|
| 1.0      | Criação da estrutura da página   | [Douglas Alves](https://github.com/dougAlvs)   |  [Sidney Fernando](https://github.com/nando3d3)  | 23/11/2023|
| 1.0.1      | Adição da versão inicial da visão de dados   | [Douglas Alves](https://github.com/dougAlvs)   |  [Sidney Fernando](https://github.com/nando3d3)  | 24/11/2023|
| 1.0.2      | Refinamento dos diagramas e adição da conclusão | [Douglas Alves](https://github.com/dougAlvs)   |  [Arthur de Melo](https://github.com/arthurmlv)  | 30/11/2023|
| 1.0.2      | Criação da primeira versão e documentação.   | [Arthur de Melo](https://github.com/arthurmlv) e [Geovanna Maciel](https://github.com/manuziny)   |  [Douglas Alves](https://github.com/dougAlvs)  | 28/11/2023 |
| 1.0.3      | Desenvolvimento da segunda versão.   | [Arthur de Melo](https://github.com/arthurmlv) e [Geovanna Maciel](https://github.com/manuziny)   |  [Douglas Alves](https://github.com/dougAlvs)  | 28/11/2023 |
| 1.0.4      | Adição da conclusão.   | [Arthur de Melo](https://github.com/arthurmlv)  |  [Douglas Alves](https://github.com/dougAlvs)  | 28/11/2023 |
| 1.0.5      | Mudança da estrutura da visão de caso de uso para adequar ao DAS.   | [Douglas Alves](https://github.com/dougAlvs)  |  [Arthur de Melo](https://github.com/arthurmlv)  | 29/11/2023 |
| 1.0.6 | Adição da versão inicial da visão lógica | [Geovanna Maciel](https://github.com/manuziny), [Laura Pinos](https://github.com/laurapinos) e [Sidney Fernando](https://github.com/nando3d3) | [Arthur de Melo](https://github.com/arthurmlv) | 30/11/2023 |
| 1.0.7 | Adição da introdução, metodologia e objetivo | [Geovanna Maciel](https://github.com/manuziny) | [Matheus Henrique](https://github.com/mathonaut) | 30/11/2023 |
| 1.0.6      | Criação da versão inicial do artefato.   | [Matheus Henrique](https://github.com/mathonaut) | [Arthur de Melo](https://github.com/arthurmlv) | 28/11/2023 |
| 1.0.7      | Adição dos textos nos diagramas de sequências.   | [Matheus Henrique](https://github.com/mathonaut) | [Arthur de Melo](https://github.com/arthurmlv) | 29/11/2023 |
| 1.0.8      | Documentação da visão de processo do diagrama de atividades, adiciona metodologia e conclusão.   | [Arthur de Melo](https://github.com/arthurmlv) | [Geovanna Maciel](https://github.com/manuziny) | 29/11/2023 |
