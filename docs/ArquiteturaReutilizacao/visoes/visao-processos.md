Como um sistema de e-commerce, a Magazine Luiza opera com uma interligação de processos internos que formam um sistema dinâmico e complexo. Para oferecer uma compreensão detalhada desse funcionamento interno, utilizamos diagramas de atividades e sequência. Esses recursos visuais fornecem uma representação visual clara e abrangente dos fluxos de trabalho e funcionamento da plataforma, permitindo uma compreensão mais fácil e aprofundada de como os processos se conectam e interagem entre si.

### Metodologia

A visão de processos foi realizada pelos integrantes: [Arthur de Melo](https://github.com/arthurmlv) e [Matheus Henrique](https://github.com/mathonaut). Visto que ambos haviam participado da elaboração de pelo menos um dos dois diagramas envolvidos nessa visão, cada um optou por realizar as mudanças no artefato específico que possuíam maior afinidade e compreensão. Sendo assim, o integrante [Matheus Henrique](https://github.com/mathonaut) ficou responsável pelo detalhamento da visão de processo do diagrama de sequências e o integrante [Arthur de Melo](https://github.com/arthurmlv) ficou responsável pelo desenvolvimento referente ao diagrama de atividades. Além disso, ao longo do desenvolvimento da Visão de Processo, ambos os diagramas sofreram alterações e correções baseadas no feedback da professora e no maior entendimento que foi adquirido ao longo da matéria acerca dos aspectos relevantes em uma aplicação de tal natureza. Os diagramas foram corrigidos de forma assíncrona na ferramenta [Lucidchart](https://lucid.app/).

### Diagrama de Atividades

De acordo com Kruchten, a visão de processo deve contabilizar alguns requisitos não-funcionais, tais como desempenho e disponibilidade, a fim de analisar a simultaneidade e distribuição, a integridade do sistema, tolerância a falhas e também deve-se levar em conta as abstrações da visão lógica (Kruchten, 1995). Além disso, as correções realizadas e as outras versões, que foram necessárias para culminar na versão aqui exibida dos diagramas, estão presentes na [página de Modelagem do Diagrama de Atividades](Modelagem/DiagramaAtividades.md). Logo, essas alterações não serão comentadas neste artefato e a análise consistirá apenas das versões aqui disponibilizadas.

Sendo assim, deve-se ponderar que os diagramas considerados na visão lógica são: de [Comunicação](Modelagem/comunicacao.md), de [Classes](Modelagem/DiagramaClasses.md) e de [Pacotes](Modelagem/DiagramaPacotes.md). Na Figura 8, pode-se analisar que a abstração realizada no [Diagrama de Comunicação](Modelagem/comunicacao.md) pode ser traduzida e verificada pelo diagrama de atividades correspondente. Dado que cobre grande parte das possibilidades em relação à validação do e-mail — se foi criado ou não —, dos dados e 
a confirmação da conta. O que o diagrama de atividades complementa seriam as possibilidades após a realização da referida atividade, que seria fechar o site ou realizar login, o que pode culminar em uma ação compra ou outra atividade.

<center>

**Figura 8** - Diagrama de Atividades: Cadastro e Acesso versão 2.1

<img src="assets/diagramaAtividade1_v2_1.png" alt="Diagrama de Atividades 1.2" width="1000"/>

<font>Fonte: Elaborada por [Arthur de Melo](https://github.com/arthurmlv) e [Sidney Fernando](https://github.com/nando3d3), 2023</font>

</center>

Contudo, quanto ao diagrama de compra do artefato de [Comunicação](Modelagem/comunicacao.md), quando analisado por meio dos processos, as threads são omitidas, pois o diagrama foi construído como algo sequêncial e não leva em conta os processos que podem acontecer em paralelo. Embora haja maior noção destas no Diagrama de Atividades, dado que, por exemplo, ao passo que o usuário visualiza os itens — que também podem ser adicionados à sacola —, o sistema adapta as recomendações para aquele usuário. Ao mesmo tempo, os itens da sacola são atualizados e executa o cálculo do subtotal. Desta forma, deve-se considerar o [Diagrama de Pacotes](Modelagem/DiagramaPacotes.md?id=diagrama-definido), o qual apresenta essas relações na versão final da Model View Controller.

Por fim, outro artefato a ser considerado é a visão de [Caso de Uso](ArquiteturaReutilizacao/DAS?id=diagrama-de-caso-de-uso), o qual a auxilia na visualização do processo de pagamento na compra, no qual é verificada a disponibilidade dos pagamentos por meio do pix, do cartão de crédito, do boleto e outros métodos com o serviço de pagamento presente no [Diagrama de Caso de Uso](ArquiteturaReutilizacao/DAS?id=diagrama-de-caso-de-uso) e também no [Diagrama de Pacotes](Modelagem/DiagramaPacotes.md?id=diagrama-definido) — no pacote Controller —, o qual apresenta os pacotes de Verificação de Dados e de Controle de Pagamento. Após isso, o mesmo serviço valida as informações de pagamento enquanto o usuário as preenche e, ao confirmar o pagamento, emite a nota fiscal anexada ao e-mail de confirmação de pagamento. 

<center>

**Figura 9** - Diagrama de Atividades: Compra versão 2

<img src="assets/diagramaAtividade2_v2.png" alt="Diagrama de Atividades 2" width="1000"/>

<font>Fonte: Elaborada por [Arthur de Melo](https://github.com/arthurmlv), 2023</font>

</center>

### Diagrama de Sequência

Um diagrama de sequência é uma representação visual em UML (Unified Modeling Language) usada para mostrar como objetos interagem em um sistema ao longo do tempo, sendo considerado o tipo de diagrama de interação mais comum. Ele descreve as mensagens trocadas entre objetos, suas linhas de vida, e pode incluir fragmentos de interação para representar lógica condicional (FOWLER, 2003).<a id='anchor1'>[1](#ref1)</a>

No intuito de melhor apresentar as diferentes interações que ocorrem no sistema foram construídos três diagramas um de visão geral, um representando o processo de cadastro e um do processo de compra.

#### Diagrama de Sequência: Geral

Esse diagrama apresenta de maneira geral os componentes responsáveis pelas principais atividades oferecidas pelo sistema. Nele são apresentados os componentes de cadastro de usuários, visualização de produtos, compra e pagamento. Os componentes de cadastro e compra serão mais detalhados a seguir. A figura 10 apresenta o diagrama.

<center>

**Figura 10** - Diagrama de Sequência: Geral

<p align="center">
    <img src="assets/visoes/processos/geral-proc.png" alt="Diagrama de Sequencia Geral" width="1000"/></a></br>
</p>

Fonte: Elaborada por [Matheus Henrique](https://github.com/mathonaut), 2023.

</center>

#### Diagrama de Sequência: Cadastro

Nesse diagrama é apresentada uma visão mais abrangente das relações que ocorrem no sistema, principalmente entre o cliente, aplicação e os serviços externos a ela. É possível perceber que o sistema atua como um mediador do cliente com o serviço de autentificação externas à aplicação. Além disso, o banco de dados é apresentado como um elemento externo da aplicação dado a natureza deste componente, pois ele geralmente um serviços separado que atua somente quando aplicação realiza um solicitação ao mesmo. A figura 11 apresenta o diagrama.

<center>

**Figura 11** - Diagrama de Sequência: Cadastro

<p align="center">
    <img src="assets/visoes/processos/cadastro-proc.png" alt="Diagrama de Sequencia Cadastro" width="1000"/></a></br>
</p>

Fonte: Elaborada por [Douglas Alves](https://github.com/dougAlvs) e [Matheus Henrique](https://github.com/mathonaut), 2023.

</center>

#### Diagrama de Sequência: Compra

Esse diagrama apresenta a relação entre o usuário e os componentes do sistema que permite a realização dessa atividade.

Já construído com falhas em [entregas anteriores](Modelagem/DiagramaSequencia.md?id=diagrama-de-compra), ele foi refeito e ajustado para melhor demonstrar as relações entre os componentes, principalmente os apresentados no [diagrama de classes de compra](Modelagem/DiagramaClasses.md). Sendo uma versão que se aproxima do diagrama de sequência de interações, nele é possível visualizar a troca de mensagens entre as classes _Produto_, _ItemSacola_ e a _Sacola_, onde é possível observar o desacoplamento delas que permite um melhor controle. Vale ressaltar que a reconstrução foi novamente feita tendo os [léxico de compra](Base/lexicos.md#l02-comprar), [mapa mental](Base/MapaMental?id=visualização-no-miro) e o [rich picture](Base/RichPicture.md?id=rich-picture-definido) como guias para os passos que deveriam ser realizados para se completar a tarefa. A figura 12 apresenta o diagrama.

<center>

**Figura 12** - Diagrama de Sequência: Compra

<p align="center">
    <img src="assets/visoes/processos/compra-proc.png" alt="Diagrama de Sequencia Compra" width="1000"/></a></br>
</p>

_Fonte: Elaborada por [Matheus Henrique](https://github.com/mathonaut), 2023._

</center>

### Conclusão

Desse modo, constata-se que a visão de processos complementa de forma coerente os artefatos relacionados à visão lógica, e que tal concordância é também interligada com a visão de cenários que, no caso, se trata da análise do Diagrama de Caso de Uso. Contudo, deve-se salientar que os artefatos aqui citados não apresentam uma explicitação das ações que acontecem em paralelo, apenas indicam que essas ocorrem. Por fim, conclui-se que a visão de processos apresenta os aspectos relevantes a tal ótica levantados por Kruchten em seu modelo de visão 4+1, posto que desvencilha as threads e os requisitos não-funcionais relacionados quanto à simultaneidade — a qual ocorre em momentos necessários — e à distribuição, a qual é notada pela quantidade equilibrada de ações paralelas.