## Introdução

Como um sistema de e-commerce, a Magazine Luiza opera com uma interligação de processos internos que formam um sistema dinâmico e complexo. Para oferecer uma compreensão detalhada desse funcionamento interno, utilizamos diagramas de atividades e sequência. Esses recursos visuais fornecem uma representação visual clara e abrangente dos fluxos de trabalho e funcionamento da plataforma, permitindo uma compreensão mais fácil e aprofundada de como os processos se conectam e interagem entre si.

## Metodologia

## Diagrama de Atividades

## Diagrama de Sequência

**!! Linkar com os outros artefatos e elaborar mais sobre os processo envolvidos !!**

Um diagrama de sequência é uma representação visual em UML (Unified Modeling Language) usada para mostrar como objetos interagem em um sistema ao longo do tempo, sendo considerado o tipo de diagrama de interação mais comum. Ele descreve as mensagens trocadas entre objetos, suas linhas de vida, e pode incluir fragmentos de interação para representar lógica condicional (FOWLER, 2003).<a id='anchor1'>[1](#ref1)</a>

No intuito de melhor apresentar as diferentes interações que ocorrem no sistema foram construídos três diagramas um de visão geral, um representando o processo de cadastro e um do processo de compra.

### Diagrama de Sequência: Geral

Esse diagrama apresenta de maneira geral os componentes responsáveis pelas principais atividades oferecidas pelo sistema. Nele são apresentados os componentes de cadastro de usuários, visualização de produtos, compra e pagamento. Os componentes de cadastro e compra serão mais detalhados a seguir. A figura x apresenta o diagrama.

<center>

**Figura x** - Diagrama de Sequência: Geral

<p align="center">
    <img src="assets/visoes/processos/geral-proc.png" alt="Diagrama de Sequencia Geral" width="1000"/></a></br>
</p>

_Fonte: Elaborada por [Matheus Henrique](https://github.com/mathonaut), 2023._

</center>

### Diagrama de Sequência: Cadastro

Nesse diagrama é apresentada uma visão mais abrangente das relações que ocorrem no sistema, principalmente entre o cliente, aplicação e os serviços externos a ela. É possível perceber que o sistema atua como um mediador do cliente com o serviço de autentificação externas à aplicação. Além disso, o banco de dados é apresentado como um elemento externo da aplicação dado a natureza deste componente, pois ele geralmente um serviços separado que atua somente quando aplicação realiza um solicitação ao mesmo. A figura x apresenta o diagrama.

<center>

**Figura x** - Diagrama de Sequência: Cadastro

<p align="center">
    <img src="assets/visoes/processos/cadastro-proc.png" alt="Diagrama de Sequencia Cadastro" width="1000"/></a></br>
</p>

_Fonte: Elaborada por [Douglas Alves](https://github.com/dougAlvs) e [Matheus Henrique](https://github.com/mathonaut), 2023._

</center>

### Diagrama de Sequência: Compra

**!! Adicionar o link com o diagrama de classe atualizado. !!**

Esse diagrama apresenta a relação entre o usuário e os componentes do sistema que permite a realização dessa atividade.

Já construído com falhas em [entregas anteriores](/Modelagem/DiagramaSequencia?id=diagrama-de-compra), ele foi refeito e ajustado para melhor demonstrar as relações entre os componentes, principalmente os apresentados no [diagrama de classes de compra](). Sendo uma versão que se aproxima do diagrama de sequência de interações, nele é possível visualizar a troca de mensagens entre as classes _Produto_, _ItemSacola_ e a _Sacola_, onde é possível observar o desacoplamento delas que permite um melhor controle. Vale ressaltar que a reconstrução foi novamente feita tendo os [léxico de compra](/Base/lexicos?id=l02-comprar), [mapa mental](Base/MapaMental?id=visualização-no-miro) e o [rich picture](Base/RichPicture?id=rich-picture-definido) como guias para os passos que deveriam ser realizados para se completar a tarefa. A figura x apresenta o diagrama.

<center>

**Figura x** - Diagrama de Sequência: Compra

<p align="center">
    <img src="assets/visoes/processos/compra-proc.png" alt="Diagrama de Sequencia Compra" width="1000"/></a></br>
</p>

_Fonte: Elaborada por [Matheus Henrique](https://github.com/mathonaut), 2023._

</center>

## Conclusão

## Referências Bibliográficas

> <a id='ref1'>[1.](#anchor1)</a> FOWLER, Martin. **UML Distilled : A Brief Guide to the Standard Object Modeling Language.** 3rd ed. Boston: Pearson Education, 2003.

## Histórico de Versões

| Versão | Data       | Descrição                                      | Autor(es)                                        | Revisor(es)                                    |
| ------ | ---------- | ---------------------------------------------- | ------------------------------------------------ | ---------------------------------------------- |
| `1.0`  | 28/11/2023 | Criação da versão inicial do artefato.         | [Matheus Henrique](https://github.com/mathonaut) | [Arthur de Melo](https://github.com/arthurmlv) |
| `1.1`  | 29/11/2023 | Adição dos textos nos diagramas de sequências. | [Matheus Henrique](https://github.com/mathonaut) | [Arthur de Melo](https://github.com/arthurmlv) |
