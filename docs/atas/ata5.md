# Ata da reunião 5

### 25/11 14:00 às 15:25

## Participantes presentes

- [x] [Arthur de Melo](https://github.com/arthurmlv)
- [ ] [Débora Caires](https://github.com/deboracaires)
- [x] [Douglas Alves](https://github.com/dougAlvs)
- [x] [Geovanna Maciel](https://github.com/manuziny)
- [ ] [Hellen Fernanda](https://github.com/Hellen159)
- [ ] [Laura Pinos](https://github.com/laurapinos)
- [x] [Maciel Júnior](https://github.com/macieljuniormax)
- [x] [Matheus Henrique](https://github.com/mathonaut)
- [x] [Sidney Fernando](https://github.com/nando3d3)

## Objetivo

Discutir acerca da escolha definitiva de um padrão arquitetural e das suas respectivas visões. Também, no que se diz respeito à reutilização de software, escolher uma linguagem e frameworks ou bibliotecas interessantes. Por fim escolher padrões de projeto que se apliquem no escopo do projeto. Em suma, responder as seguintes questões:

* **Foco 1: Arquitetura de Software**
  * Qual será o modelo de visão/visões de arquiteturas escolhidas?
  * Qual será o padrão/estilo de arquitetura escolhido?
* **Foco 2: Reutilização de Software**
  * Qual será a linguagem no qual o código será escrito?
  * Quais frameworks serão utilizados?
  * Quais bibliotecas serão utilizadas?
  * O reuso de software será demonstrado por meio de banco de dados?
  * Quais padrões de projeto se aplicam no escopo do projeto para serem implementados?

## Discussões e decisões

Abaixo está as respostas das perguntas de acordo com as discussões acontecidas na reunião.

* **Foco 1: Arquitetura de Software**
  * Qual será o modelo de visão/visões de arquiteturas escolhidas?
    * Optou-se por uma adaptação do modelo 4 + 1, com as seguintes visões: lógica, processos, implementação , caso de uso e dados. Isso pois esse modelo apresenta visões que conseguem representaR a arquitetura de um sistema por diferentes perspectivas, satisfazendo as necessidades de vários stakeholders de um projeto (KRUTCHEN, 1995);
  * Qual será o padrão/estilo de arquitetura escolhido?
    * Visto que na entrega de modelagem o grupo optou pelo padrão MVC no [diagrama de pacotes](../Modelagem/DiagramaPacotes.md), optou-se por manter esse mesmo padrão arquitetural. Isso pois ele permite que os dados sejam alterados de forma independente de sua representação, e vice-versa, sendo muito utilizado em sistemas web (SOMMERVILLE, 2011);
* **Foco 2: Reutilização de Software**
  * Qual será a linguagem no qual o código será escrito? 
    * Por uma questão de afinidade e presença de diversas funcionalidades orientadas a objetos, o grupo optou por usar a linguagem Java;
  * Quais frameworks/bibliotecas serão utilizados?
    * Em relação à frameworks/bibliotecas, ficou decidido que todos do grupo estariam designados para pesquisar as principais ferramentas da linguagem aplicáveis ao escopo do projeto, e assim contribuir para esse tópico;
  * O reuso de software será demonstrado por meio de banco de dados?
    * Como optou-se por usar a visão de dados da arquitetura, o grupo achou válido representar também o reúso de software por essa ótica, além do fato que padrões de projeto podem ser aplicados nesse mesmo contexto;
  * Quais padrões de projeto se aplicam no escopo do projeto para serem implementados?
    * Foi decidido que seriam abordados um total de 5 padrões de projeto, no mínimo, sendo separadas duplas para cada um deles. Cada padrão deve apresentar uma problemática, a sua solução para ela, a modelagem e código de exemplo. A escolha de um padrão de projeto que se encaixe nessa especificação e no escopo do projeto fica livre para cada dupla (a divisão dessas está no cronograma).



## Definição das Tarefas

A tabela 1 mostra a divisão planejada das tarefas definidas, assim como seu período de desenvolvimento e revisão.

<center>
<font size="3"><p style="text-align: center"><b>Tabela 1</b> - Cronograma Planejado Entrega 4</p></font>

<iframe style="height: 545px; width: 1030px;" src="https://docs.google.com/spreadsheets/d/e/2PACX-1vRw2u-lLpth997XS3LDg9u4PyLIFELeHZtu6ayavYH8aDXA1Cx2zRxGyiu0i9kSTBHJhobp4PK0Ppxq/pubhtml?gid=987985918&amp;single=true&amp;widget=false&amp;headers=false&amp;chrome=false"></iframe>

<font size="3"><p style="text-align: center">Fonte: [Douglas Alves](https://github.com/dougAlvs), 2023</p></font>

</center>

## Próxima Reunião

A priori, essa é a última reunião de planejamento do projeto. Contudo, os integrantes estão livres para se reunirem para a elaboração dos artefatos definidos para a entrega, na medida do necessário.

## Bibliografia

> Bourque, P., Fairley, R. E. Guide to the Software Engineering Body of Knowledge, Version 3.0. SWEBOK. IEEE Computer Society, 2014. Disponível em: http://www.computer.org/web/swebok/v3.

## Referências Bibliográficas

> <p id="ancora1"> 1. SOMMERVILLE, Ian. Engenharia de Software. 9a. edição. Pearson, 2011.</p>
>
> <a id="ancora2"></a> 2. KRUCHTEN, Philippe B. The 4+1 view model of architecture. IEEE software, v. 12, n. 6, p. 42-50, 1995.

## Histórico de Versões

| Versão | Data       | Descrição                                    | Autor(es)                                        | Revisor(es)                                      |
| ------ | ---------- | -------------------------------------------- | ------------------------------------------------ | ------------------------------------------------ |
| `1.0`  | 25/11/2023 | Criação da Ata         | [Douglas Alves](https://github.com/dougAlvs) |  | 
