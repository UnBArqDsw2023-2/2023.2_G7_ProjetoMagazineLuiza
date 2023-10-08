# Diagrama de Componentes

## Introdução

A diferença entre componentes e classes apresenta uma linha tênue e é alvo de discussões na UML, visto que ambos os conceitos podem ser usados para modelar as mesmas coisas. De acordo com Rumbaugh, a diferença entre as duas, além de vaga, é mais uma questão de intenção do que de semântica estrita (LARMAN, 2007). Pode-se dizer que um componente representa um módulo do sistema que encapsula seu conteúdo e que, caso necessário, pode ser substítuido facilmente por outro componente equivalente, além de ter seu comportamento definido por interfaces fornecidas e requeridas. Sendo assim, o diagrama de componentes busca modelar o sistema com uma visão ainda mais modular e independente do que os diagramas de [classes]() e de [pacotes]().

## Participantes

Na Tabela 1 a seguir, pode-se rastrear a participação de cada integrante na elaboração dos diagramas.

<div style="margin-left: auto;
            margin-right: auto;
            width: 60%">
<font size="3"><p style="text-align: center"><b>Tabela 1</b> - Participantes</p></font>

| Participantes   | Etapas  |
|-----------------|:------------:|
|[Debora Caires](https://github.com/deboracaires), [Douglas Alves](https://github.com/dougAlvs), [Laura Pinos](https://github.com/laurapinos) e [Maciel Júnior](https://github.com/macieljuniormax) | Diagrama de Componentes versão 1 |

<font size="3"><p style="text-align: center">Fonte: Autores</p></font>
</div>

## Metodologia
Para a produção deste artefato, foi adotada uma abordagem de aprendizado inicial, dedicando tempo para estudar de forma individual os materiais disponibilizados no Aprender 3 da disciplina, bem como consultando as valiosas [Referências Bibliográficas](#referências-bibliográficas) apresentadas no final deste documento. Esse processo de estudo individual permitiu que cada membro da equipe obtivesse uma compreensão sólida dos conceitos e informações relevantes para o projeto.

Posteriormente, foi agendada uma reunião de trabalho no dia 30 de setembro de 2023, realizada de forma remota pelo Discord. Essa reunião se revelou uma etapa crítica no processo, uma vez que proporcionou um espaço para discussão, colaboração e integração das ideias de todos os participantes. Durante essa reunião de aproximadamente três horas, foram debatidos pontos-chave, dúvidas e estratégias para a criação do artefato. Nessa reunião, a plataforma Lucidchart desempenhou um papel fundamental. Essa ferramenta foi utilizada para desenvolver a primeira versão do artefato, permitindo a criação de diagramas de comunicação de forma colaborativa e eficaz. É relevante destacar que a participação de todos os envolvidos foi ativa e desempenhou um papel crucial no entendimento e no desenvolvimento do artefato. Cada membro trouxe perspectivas únicas e conhecimento específico que enriqueceram o trabalho em equipe.

## Artefato
O artefato desenvolvido neste documento foi criado com o objetivo principal de fornecer uma representação visual clara e concisa da estrutura do sistema relacionado ao processo de compra de produtos. O diagrama de componentes destaca os principais componentes envolvidos nesse processo, suas interfaces fornecidas e requeridas, bem como as relações e dependências entre eles.

O principal objetivo deste artefato é facilitar o entendimento da arquitetura do sistema na parte de compra de produtos, destacando os elementos-chave que desempenham um papel crucial nesse processo. Isso inclui componentes relacionados à busca de produtos, gerenciamento de sacola de compras, processamento de pagamento, confirmação de pedido e outros componentes relevantes.

## Diagramas produzidos

### Versão 1
Nesta primeira versão, o processo foi simplificado e dividido em apenas três subsistemas: Usuário, Plataforma e Banco de Dados. Essa abordagem inicial foi escolhida para facilitar o entendimento e a construção do artefato, especialmente considerando o primeiro contato da equipe com essa representação.
<center>

Figura 1 - Diagrama de Componentes Inicial

<img src="assets/diagrama-componentes/diagrama-componentes1.png" alt="Diagrama de Pacotes" width="1400"/>

<font>Fonte: Autores, 2023</font>

</center>



## Referências Bibliográficas

> FOWLER, Martin. UML Essencial: um breve guia para linguagem padrão. Bookman editora, 2014.
> 
> UML DIAGRAMS. UML Component Diagrams, 2023. Disponível em: <<https://www.uml-diagrams.org/component-diagrams.html>>. Acesso em:  30/09/2023.
> 
> LARMAN, Craig. Utilizando UML e padrões. Bookman Editora, 2007.

## Histórico de Versões
| Versão   | Descrição  | Responsável | Revisor    | Data      |
|----------|------------|-------------|------------|-----------|
| 1.0      | Criação da página e adição da introdução   | [Douglas Alves](https://github.com/dougAlvs)   | [Maciel Júnior](https://github.com/macieljuniormax)   | 30/09/2023|
| 1.1      | Adição da v1 do diagrama   | [Debora Caires](https://github.com/deboracaires), [Douglas Alves](https://github.com/dougAlvs), [Laura Pinos](https://github.com/laurapinos) e [Maciel Júnior](https://github.com/macieljuniormax)   | [Hellen Fernanda](https://github.com/Hellen159)  | 30/09/2023|
| 1.2      | Adição da metodologia da V1 e artefato   | [Debora Caires](https://github.com/deboracaires) e [Maciel Júnior](https://github.com/macieljuniormax)   |  [Douglas Alves](https://github.com/dougAlvs)  | 08/10/2023|