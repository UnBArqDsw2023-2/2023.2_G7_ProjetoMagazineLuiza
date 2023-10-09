# Diagrama de Sequência

## Introdução

Um diagrama de sequência é uma representação visual em UML (Unified Modeling Language) usada para mostrar como objetos interagem em um sistema ao longo do tempo, sendo considerado o tipo de diagrama de interação mais comum. Ele descreve as mensagens trocadas entre objetos, suas linhas de vida, e pode incluir fragmentos de interação para representar lógica condicional (FOWLER, 2003).<a id='anchor1'>[1](#ref1)</a> Usando um diagrama de sequência, você pode descrever quais interações serão acionadas quando um caso de uso específico for executado e em que ordem essas interações ocorrerão (HAMILTON & MILES, 2006).<a id='anchor2'>[2](#ref2)</a> Além disso, por serem interativos fornecem muitas outras informações sobre como um sistema/ processo vai realizar seu trabalho.

## Participantes

Os participantes responsáveis por elaborar esse artefato foram os integrantes do grupo [Douglas Alves](https://github.com/dougAlvs), [Hellen Fernanda](https://github.com/Hellen159), [Laura](https://github.com/laurapinos) e [Matheus Henrique](https://github.com/mathonaut). A revisão desse artefato ficou a cargo dos integrantes do mesmo grupo [Douglas Alves](https://github.com/dougAlvs) e [Arthur de Melo](https://github.com/arthurmlv).

A tabela 1 a seguir apresenta a relação de cada participante com os artefatos produzidos por eles.

<center>

**Tabela 1** - Relação Participantes-Artefatos .

| Artefato                    | Participante                                                                                       |
| --------------------------- | -------------------------------------------------------------------------------------------------- |
| [Introdução](#introdução)   | [Hellen Fernanda](https://github.com/Hellen159) e [Matheus Henrique](https://github.com/mathonaut) |
| [Metodologia](#metodologia) | [Hellen Fernanda](https://github.com/Hellen159) e [Matheus Henrique](https://github.com/mathonaut) |
| [Diagramas](#diagramas)     | [Douglas Alves](https://github.com/dougAlvs) e [Matheus Henrique](https://github.com/mathonaut)    |
| [Conclusão](#conclusão)     | [Matheus Henrique](https://github.com/mathonaut)                                                   |

_Fonte: Elaborada por [Matheus Henrique](https://github.com/mathonaut), 2023._

</center>

## Metodologia

Em um diagrama de sequência, objetos são retratados como retângulos verticais, e suas interações são ilustradas através de setas que indicam o fluxo de mensagens. Essas mensagens podem ser classificadas como síncronas, quando o objeto remetente aguarda uma resposta do objeto destinatário, ou assíncronas, quando o objeto remetente não espera uma resposta imediata.

Foi utilizada a aplicação [Lucidchart](https://www.lucidchart.com/pages/pt) para a elaboração dos diagramas e a linguagem UML na versão 2.0.

### Reuniões de Desenvolvimento

O grupo se reuniu via Discord para realizar uma sessão de estudo e planejamento, onde cada membro discutiu e definiu suas respectivas tarefas. Durante a reunião, ficou acordado que seriam criadas várias versões do diagrama, com iterações e revisões contínuas, visando alcançar uma versão final refinada e precisa do diagrama. Essa abordagem iterativa permitirá que o grupo refine e melhore progressivamente o diagrama à medida que avançam no artefato. Além disso, o feedback dado pela professora em sala foi levado em conta para o desenvolvimento do diagrama.

## Diagramas

Os diagramas foram construídos ao longo de um intervalo de uma semana (02/08 até 08/08) e sofreram alterações sucessivas que modificaram suas características e demonstraram a evolução na compreensão de como a aplicação funciona.

### Diagrama Geral

O primeiro diagrama elaborado foi o geral que representa em alto nível a relação entre o usuário e o sistema de e-commerce. A figura 1 apresenta esse diagrama.

<center>

**Figura 1** - Diagrama de Sequência: Geral

![Figura do diagrama de sequência geral](../../assets/diagramas/sequencia/geral.png)

_Fonte: Elaborada por [Matheus Henrique](https://github.com/mathonaut), 2023._

</center>

### Diagrama de Cadastro

O segundo elaborado foi o de cadastro de usuário na aplicação. Esse cenário também foi modelado através do [Diagrama de Atividades: Cadastro e Acesso](linkar com o artefato de atividade). Uma versão inicial foi construída através de uma rascunho em papel e pode ser visualizada na figura 2.

<center>

**Figura 2** - Diagrama de Sequência: Cadastro 1.0

![Figura do rascunho do diagrama de sequência cadastro 1.0](../../assets/diagramas/sequencia/cadastro-rascunho.png)

_Fonte: Elaborada por [Matheus Henrique](https://github.com/mathonaut), 2023._

</center>

Nota-se que essa primeira versão apresenta vários erros tanto conceituais e de padrão notação, o que dificulta para o leitor entender exatamente os participantes e as ações que estão ocorrendo. Portanto, uma segunda versão foi produzida e foi digitalizada podendo ser observada na figura 3.

<center>

**Figura 3** - Diagrama de Sequência: Cadastro 2.0

![Figura do diagrama de sequência cadastro 2.0](../../assets/diagramas/sequencia/cadastro.png)

_Fonte: Elaborada por [Douglas Alves](https://github.com/dougAlvs) e [Matheus Henrique](https://github.com/mathonaut), 2023._

</center>

### Diagrama de Compra

O diagrama de compra foi construído de maneira um pouco diferente, nele algumas atividades foram omitidas (de visualização de produto e pagamento) para serem tratadas em diagramas separados. Além disso, objetos representando elementos de baixo nível como banco de dados e da própria aplicação foram retirados no intuito de simplificar a visualização. A figura 4 apresenta o diagrama.

<center>

**Figura 4** - Diagrama de Sequência: Compra

![Figura do diagrama de sequência compra](../../assets/diagramas/sequencia/compra.png)

_Fonte: Elaborada por [Douglas Alves](https://github.com/dougAlvs) e [Matheus Henrique](https://github.com/mathonaut), 2023._

</center>

## Conclusão

Nesse artefato foi explorado o uso de diagramas de sequência para modelar o que o sistema de e-commerce da Magazine Luiza é capaz de fazer. Esses diagramas demonstraram ser uma ferramenta valiosa para modelar o fluxo de interações entre objetos no sistema, permitindo-nos compreender e comunicar de maneira eficaz como os diversos componentes se relacionam durante a execução de cenários específicos.

Além disso, clareza e precisão na elaboração desses diagramas garantem que eles sejam uma ferramenta eficaz para a compreensão do sistema e de consulta futura. Também é importante destacar a atualização da documentação, que ocorreu de forma contínua garantindo que ela seja vista como uma fonte confiável de informações para a equipe.

Desse modo, os diagramas de sequência UML desempenham um papel fundamental na modelagem e na documentação do sistema da Magazine Luiza, ajudando-nos a visualizar e analisar o fluxo de interações entre os objetos do sistema.

## Referências Bibliográficas

> <a id='ref1'>[1.](#anchor1)</a> FOWLER, Martin. **UML Distilled : A Brief Guide to the Standard Object Modeling Language.** 3rd ed. Boston: Pearson Education, 2003.

> <a id='ref2'>[2.](#anchor2)</a> HAMILTON, Kim; MILES, RUSS. **Learning UML 2.0.** California: O’Reilly Media, 2006.

## Bibliografia

> RODRIGUES, João; VITOR, Paulo. **Diagrama de Sequencia.** Repositório A Monitoria no GitHub, 2019. Disponível em: <https://2019-2-arquitetura-desenho.github.io/wiki/dinamica_seminario_III/diagrama_seq/>. Acesso em: 06 de outubro de 2023.

> **UML Sequence Diagrams**. UML DIAGRAMS, 2023. Disponível em: <https://www.uml-diagrams.org/sequence-diagrams.html>. Acesso em: 04 de outubro de 2023.

## Histórico de Versões

| Versão  | Data       | Descrição                                                                                | Autor(es)                                        | Revisor(es)                                      |
| ------- | ---------- | ---------------------------------------------------------------------------------------- | ------------------------------------------------ | ------------------------------------------------ |
| `1.0`   | 14/09/2023 | Criação da página, introdução e metodologia                                              | [Hellen Fernanda](https://github.com/Hellen159)  | [Arthur de Melo](https://github.com/arthurmlv)   |
| `1.1`   | 07/10/2023 | Ajuste no texto de introdução, organização das seções e adição da seção de participantes | [Matheus Henrique](https://github.com/mathonaut) | [Douglas Alves](https://github.com/dougAlvs)     |
| `1.2`   | 07/10/2023 | Adiciona diagramas geral e de cadastro                                                   | [Matheus Henrique](https://github.com/mathonaut) | [Douglas Alves](https://github.com/dougAlvs)     |
| `1.3`   | 08/10/2023 | Adiciona diagrama de compra e texto de conclusão                                         | [Matheus Henrique](https://github.com/mathonaut) | [Douglas Alves](https://github.com/dougAlvs)     |
| `1.3.1` | 08/10/2023 | Corrige erros do texto e incrementa metodologias e introdução                            | [Douglas Alves](https://github.com/dougAlvs)     | [Matheus Henrique](https://github.com/mathonaut) |
| `1.3.2` | 08/10/2023 | Adiciona referência e revisores                                                          | [Matheus Henrique](https://github.com/mathonaut) | [Douglas Alves](https://github.com/dougAlvs)     |
