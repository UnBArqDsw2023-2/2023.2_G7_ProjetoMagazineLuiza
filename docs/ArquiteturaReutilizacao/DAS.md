# Documento de Arquitetura de Software

## Introdução
A visão DAS 4+1, proposta por Krutchten, é um modelo arquitetural abrangente que visa proporcionar uma compreensão holística de sistemas complexos de software. No projeto foi utilizado uma adaptção desse modelo, utilizando as visões de Caso de Uso, Lógica, Implementação, Dados e de Processo. Essa abordagem rica visa atender às necessidades de diferentes stakeholders, desde desenvolvedores e arquitetos até gerentes de projeto e usuários finais. Neste documento, foi analisado como a integração dessas perspectivas podem aprimorar de forma significativa o processo de design e arquitetura de software.

## Objetivo
Esse artefato tem o objetivo de implementar, explorar e compreender a abordagem adaptada da Visão DAS 4+1 no contexto do projeto. Este estudo visa analisar cada uma das cinco visões - Casos de Uso, Lógica, Implementação, Processo e Dados - para fornecer uma compreensão abrangente e integrada do desenvolvimento de software. Ao final, o objetivo é aplicar os princípios e as práticas da Visão DAS 4 + 1 para otimizar a qualidade, a eficiência e a adaptabilidade dos sistemas.

## Metodologia
Para a execução do artefato, houve uma divisão dos grupos, cada um responsável por uma visão específica. A decisão sobre essa divisão está documentada na [Ata 5](https://unbarqdsw2023-2.github.io/2023.2_G7_ProjetoMagazineLuiza/#/atas/ata5). Nessa reunião, também foi acordado utilizar uma versão adaptada da visão DAS 4+1, que incluiu a visão de dados, enquanto a visão de cenários foi omitida. A escolha de não utilizar a visão de cenários foi motivada pela maior afinidade do grupo com a visão de Caso de Uso, além de ser uma sugestão do autor sobre a opção de usar cenários ou não. A tabela 1 representa a alocação das equipes para cada visão.

<div align="center">

Tabela 1 - Participantes do Artefato

| Visão | Integrantes |
| ---------| ---------|
| Visão de Caso de Uso   |  [Arthur de Melo](https://github.com/arthurmlv) e [Geovanna Maciel](https://github.com/manuziny)  |
| Visão Lógica   | [Geovanna Maciel](https://github.com/manuziny), [Laura Pinos](https://github.com/laurapinos) e [Sidney Fernando](https://github.com/nando3d3)   |
| Visão de Dados   | [Douglas Alves](https://github.com/dougAlvs)    |
| Visão de Processos   | [Arthur de Melo](https://github.com/arthurmlv) e [Matheus Henrique](https://github.com/mathonaut)  |
| Visão de Implementação | [Débora Caires](https://github.com/deboracaires), [Douglas Alves](https://github.com/dougAlvs) e  [Maciel Júnior](https://github.com/macieljuniormax)  |

Fonte: _[Geovanna Maciel](https://github.com/manuziny)_

</div>

A formação dos grupos ocorreu com base na afinidade de cada integrante com os artefatos relacionados a uma visão específica. Embora a entrega não incluísse a correção dos diagramas, essa tarefa foi realizada remotamente por cada equipe responsável pela visão designada. As ferramentas utilizadas para corrigir os diagramas foram [Lucidchart](https://lucid.app/) e o [Drawio](https://drawio-app.com), as correções feitas estão detalhadas na página de cada respectivo diagrama. A etapa de estudo individual foi realizada antes da execução do artefato. Cada grupo adotou a metodologia que melhor lhe convém, e essas escolhas estão detalhadas na seção metodológica de cada visão.

Embora cada visão possua uma página dedicada, neste documento elas estão consolidadas para proporcionar uma leitura mais fluida. Isso permite que o leitor identifique a integração do sistema em cada visão, demonstrando como essa abordagem pode otimizar a qualidade, a eficiência e a adaptabilidade dos sistemas.

## Visões

## Visão de Casos de Uso

[Visão de Casos de Uso](./visoes/visao-use-case.md ':include')

## Visão Lógica
[Visão Lógica](./visoes/visao-logico.md ':include')

## Visão de Dados

[Visão Dados](./visoes/visao-dados.md ':include') 

## Conclusão



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
> KRUCHTEN, Philippe B. The 4+1 view model of architecture. IEEE software, v. 12, n. 6, p. 42-50, 1995.

## Histórico de Versões
| Versão   | Descrição  | Responsável | Revisor    | Data      |
|----------|------------|-------------|------------|-----------|
| 1.0      | Criação da estrutura da página   | [Douglas Alves](https://github.com/dougAlvs)   |  [Sidney Fernando](https://github.com/nando3d3)  | 23/11/2023|
| 1.0.1      | Adição da versão inicial da visão de dados   | [Douglas Alves](https://github.com/dougAlvs)   |  [Sidney Fernando](https://github.com/nando3d3)  | 24/11/2023|
| 1.0.2      | Criação da primeira versão e documentação.   | [Arthur de Melo](https://github.com/arthurmlv) e [Geovanna Maciel](https://github.com/manuziny)   |  [Douglas Alves](https://github.com/dougAlvs)  | 28/11/2023 |
| 1.0.3      | Desenvolvimento da segunda versão.   | [Arthur de Melo](https://github.com/arthurmlv) e [Geovanna Maciel](https://github.com/manuziny)   |  [Douglas Alves](https://github.com/dougAlvs)  | 28/11/2023 |
| 1.0.4      | Adição da conclusão.   | [Arthur de Melo](https://github.com/arthurmlv)  |  [Douglas Alves](https://github.com/dougAlvs)  | 28/11/2023 |
| 1.0.5      | Mudança da estrutura da visão de caso de uso para adequar ao DAS.   | [Douglas Alves](https://github.com/dougAlvs)  |  [Arthur de Melo](https://github.com/arthurmlv)  | 29/11/2023 |
| 1.0.6 | Adição da versão inicial da visão lógica | [Geovanna Maciel](https://github.com/manuziny), [Laura Pinos](https://github.com/laurapinos) e [Sidney Fernando](https://github.com/nando3d3) | [Arthur de Melo](https://github.com/arthurmlv) | 30/11/2023 |
| 1.0.7 | Adição da introdução, metodologia e objetivo | [Geovanna Maciel](https://github.com/manuziny) | [Matheus Henrique](https://github.com/mathonaut) | 30/11/2023 |
