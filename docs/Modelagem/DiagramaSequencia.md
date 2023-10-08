# Diagrama de Sequência

## Introdução

Um diagrama de sequência é uma representação visual em UML (Unified Modeling Language) usada para mostrar como objetos interagem em um sistema ao longo do tempo. Ele descreve as mensagens trocadas entre objetos, suas linhas de vida, e pode incluir fragmentos de interação para representar lógica condicional (FOWLER, 2003).<a id='anchor1'>[1](#ref1)</a> Usando um diagrama de sequência, você pode descrever quais interações serão acionadas quando um caso de uso específico for executado e em que ordem essas interações ocorrerão (HAMILTON & MILES, 2006).<a id='anchor2'>[2](#ref2)</a> Além disso, por serem interativos fornecem muitas outras informações sobre como um sistema/ processo vai realizar seu trabalho.

## Participantes

Os participantes responsáveis por elaborar esse artefato foram os integrantes do grupo [Douglas Alves](https://github.com/dougAlvs), [Hellen Fernanda](https://github.com/Hellen159), [Laura](https://github.com/laurapinos) e [Matheus Henrique](https://github.com/mathonaut). A revisão desse artefato ficou a cargo dos integrantes do mesmo grupo [Fulano]().

A tabela 1 a seguir apresenta a relação de cada participante com os artefatos produzidos por eles.

<center>

**Tabela 1** - Relação Participantes-Artefatos .

| Artefato                    | Participante                                                                                       |
| --------------------------- | -------------------------------------------------------------------------------------------------- |
| [Introdução](#introdução)   | [Hellen Fernanda](https://github.com/Hellen159) e [Matheus Henrique](https://github.com/mathonaut) |
| [Metodologia](#metodologia) | [Hellen Fernanda](https://github.com/Hellen159) e [Matheus Henrique](https://github.com/mathonaut) |
| [Diagramas](#diagramas)     | [Douglas Alves](https://github.com/dougAlvs) e [Matheus Henrique](https://github.com/mathonaut)    |
| [Conclusão](#conclusão)     |                                                                                                    |

_Fonte: Elaborada por [Matheus Henrique](https://github.com/mathonaut), 2023._

</center>

## Metodologia

Em um diagrama de sequência, objetos são retratados como retângulos verticais, e suas interações são ilustradas através de setas que indicam o fluxo de mensagens. Essas mensagens podem ser classificadas como síncronas, quando o objeto remetente aguarda uma resposta do objeto destinatário, ou assíncronas, quando o objeto remetente não espera uma resposta imediata.

Foram utilizado a aplicação [Lucidchart](https://www.lucidchart.com/pages/pt) para a elaboração dos diagramas e a linguagem UML na versão 2.0.

### Reuniões de Desenvolvimento

O grupo se reuniu via Discord para realizar uma sessão de estudo e planejamento, onde cada membro discutiu e definiu suas respectivas tarefas. Durante a reunião, ficou acordado que seriam criadas várias versões do diagrama, com iterações e revisões contínuas, visando alcançar uma versão final refinada e precisa do diagrama. Essa abordagem iterativa permitirá que o grupo refine e melhore progressivamente o diagrama à medida que avançam no artefato.

## Diagramas

Os diagramas foram construídos ao longo de um intervalo de uma semana (02/08 até 08/08) e sofreram alterações sucessivas que modificaram suas características e demonstraram a evolução na compreensão de como a aplicação funciona.

O primeiro diagrama elaborado foi o geral que representa em alto nível a relação entre o usuário e o sistema de e-commerce. A figura 1 apresenta esse diagrama.

<center>

**Figura 1** - Diagrama de Sequência: Geral

![Figura do diagrama de sequência geral](../../assets/diagramas/sequencia/geral.png)

_Fonte: Elaborada por [Matheus Henrique](https://github.com/mathonaut), 2023._

</center>

O segundo elaborado foi o de cadastro de usuário na aplicação. Esse cenário também foi modelado através do [Diagrama de Atividades: Cadastro e Acesso](linkar com o artefato de atividade). Uma versão inicial foi construída através de uma rascunho em papel e pode ser visualizada na figura 2.

<center>

**Figura 2** - Diagrama de Sequência: Cadastro 1.0

![Figura do rascunho do diagrama de sequência cadastro 1.0](../../assets/diagramas/sequencia/cadastro-rascunho.png)

_Fonte: Elaborada por [Matheus Henrique](https://github.com/mathonaut), 2023._

</center>

Nota-se que essa primeira versão apresenta vários erros tanto conceituais e de padrão notação, o que dificulta para o leitor entender exatamente os participantes e as ações que estão ocorrendo. Portanto, uma segunda versão foi produzida e foi digitalizada podendo ser observada na figura 3.

<center>

**Figura 2** - Diagrama de Sequência: Cadastro 2.0

![Figura do rascunho do diagrama de sequência cadastro 2.0](../../assets/diagramas/sequencia/cadastro.png)

_Fonte: Elaborada por [Douglas Alves](https://github.com/dougAlvs) e [Matheus Henrique](https://github.com/mathonaut), 2023._

</center>

## Conclusão

## Referências Bibliográficas

> <a id='ref1'>[1.](#anchor1)</a> FOWLER, Martin. **UML Distilled : A Brief Guide to the Standard Object Modeling Language.** 3rd ed. Boston: Pearson Education, 2003.

> <a id='ref2'>[2.](#anchor2)</a> HAMILTON, Kim; MILES, RUSS. **Learning UML 2.0.** California: O’Reilly Media, 2006.

## Bibliografia

> RODRIGUES, João; VITOR, Paulo. **Diagrama de Sequencia.** Repositório A Monitoria no GitHub, 2019. Disponível em: <https://2019-2-arquitetura-desenho.github.io/wiki/dinamica_seminario_III/diagrama_seq/>. Acesso em: 06 de outubro de 2023.

## Histórico de Versões

| Versão | Data       | Descrição                                                                                | Autor(es)                                        | Revisor(es)                                    |
| ------ | ---------- | ---------------------------------------------------------------------------------------- | ------------------------------------------------ | ---------------------------------------------- |
| `1.0`  | 14/09/2023 | Criação da página, introdução e metodologia                                              | [Hellen Fernanda](https://github.com/Hellen159)  | [Arthur de Melo](https://github.com/arthurmlv) |
| `1.1`  | 07/10/2023 | Ajuste no texto de introdução, organização das seções e adição da seção de participantes | [Matheus Henrique](https://github.com/mathonaut) | [Douglas Alves](https://github.com/dougAlvs)   |
