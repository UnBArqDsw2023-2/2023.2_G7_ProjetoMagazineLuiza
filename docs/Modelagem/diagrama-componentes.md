# Diagrama de Componentes

## Introdução

A diferença entre componentes e classes apresenta uma linha tênue e é alvo de discussões na UML, visto que ambos os conceitos podem ser usados para modelar as mesmas coisas. De acordo com Rumbaugh, a diferença entre as duas, além de vaga, é mais uma questão de intenção do que de semântica estrita (LARMAN, 2007). Pode-se dizer que um componente representa um módulo do sistema que encapsula seu conteúdo e que, caso necessário, pode ser substítuido facilmente por outro componente equivalente, além de ter seu comportamento definido por interfaces fornecidas e requeridas. Sendo assim, o diagrama de componentes busca modelar o sistema com uma visão ainda mais modular e independente do que os diagramas de [classes](Modelagem/DiagramaClasses) e de [pacotes](Modelagem/DiagramaPacotes).

## Participantes

Na Tabela 1 a seguir, pode-se rastrear a participação de cada integrante na elaboração dos diagramas.

<div style="margin-left: auto;
            margin-right: auto;
            width: 60%">
<font size="3"><p style="text-align: center"><b>Tabela 1</b> - Participantes</p></font>

| Participantes   | Etapas  |
|-----------------|:------------:|
|[Débora Caires](https://github.com/deboracaires), [Douglas Alves](https://github.com/dougAlvs), [Laura Pinos](https://github.com/laurapinos) e [Maciel Júnior](https://github.com/macieljuniormax) | Diagrama de Componentes versão 1 |
|[Douglas Alves](https://github.com/dougAlvs)| Diagrama de Componentes versão 2 |
|[Douglas Alves](https://github.com/dougAlvs)| Diagrama de Componentes versão 3 |
|[Débora Caires](https://github.com/deboracaires), [Douglas Alves](https://github.com/dougAlvs), e [Maciel Júnior](https://github.com/macieljuniormax)| Diagrama de Componentes versão 4 |

<font size="3"><p style="text-align: center">Fonte: Autores</p></font>
</div>

## Metodologia
Para a produção deste artefato, foi adotada uma abordagem de aprendizado inicial, dedicando tempo para estudar de forma individual os materiais disponibilizados no Aprender 3 da disciplina, bem como consultando as valiosas [Referências Bibliográficas](#referências-bibliográficas) apresentadas no final deste documento. Esse processo de estudo individual permitiu que cada membro da equipe obtivesse uma compreensão sólida dos conceitos e informações relevantes para o projeto.

Posteriormente, foi agendada uma reunião de trabalho no dia 30 de setembro de 2023, realizada de forma remota pelo Discord. Essa reunião se revelou uma etapa crítica no processo, uma vez que proporcionou um espaço para discussão, colaboração e integração das ideias de todos os participantes. Durante essa reunião de aproximadamente três horas, foram debatidos pontos-chave, dúvidas e estratégias para a criação do artefato. Nessa reunião, a plataforma Lucidchart desempenhou um papel fundamental. Essa ferramenta foi utilizada para desenvolver a primeira versão do artefato, permitindo a criação de diagramas de comunicação de forma colaborativa e eficaz. É relevante destacar que a participação de todos os envolvidos foi ativa e desempenhou um papel crucial no entendimento e no desenvolvimento do artefato. Cada membro trouxe perspectivas únicas e conhecimento específico que enriqueceram o trabalho em equipe. Por fim, após um feedback dado pela professora em sala, o diagrama foi reformulado para abranger melhor o escopo da aplicação e melhor representá-la.

Após a entrega deste artefato, foi realizada uma reestruturação do diagrama com base nos novos feedbacks recebidos. Os participantes se reuniram e discutiram a elaboração desta nova versão durante uma reunião via Discord no dia 30/11/2023, com duração de duas horas.

## Artefato
O artefato desenvolvido neste documento foi criado com o objetivo principal de fornecer uma representação visual clara e concisa da estrutura do sistema relacionado ao processo de compra de produtos. O diagrama de componentes destaca os principais componentes envolvidos nesse processo, suas interfaces fornecidas e requeridas, bem como as relações e dependências entre eles.

O principal objetivo deste artefato é facilitar o entendimento da arquitetura do sistema na parte de compra de produtos, destacando os elementos-chave que desempenham um papel crucial nesse processo. Isso inclui componentes relacionados à busca de produtos, gerenciamento de sacola de compras, processamento de pagamento, confirmação de pedido e outros componentes relevantes.

## Diagramas produzidos

### Versão 1

Nesta primeira versão, apresentada na figura 1, o processo foi simplificado e dividido em apenas três subsistemas: Usuário, Plataforma e Banco de Dados. Essa abordagem inicial foi escolhida para facilitar o entendimento e a construção do artefato, especialmente considerando o primeiro contato da equipe com essa representação.
<center>

Figura 1 - Diagrama de Componentes Inicial

<img src="assets/diagrama-componentes/diagrama-componentes1.png" alt="Diagrama de Pacotes" width="1400"/>

<font>Fonte: Autores, 2023</font>

</center>

### Versão 2

Na segunda versão apresentada na figura 2, foram adicionados alguns componentes a mais no subsistema da plataforma, de forma a abrangir mais do escopo da aplicação, além de ter sido adicionado um novo subsistema de pagamento e a adição dos usuários na camada de persistência.

<center>

Figura 2 - Diagrama de Componentes Versão 2

<img src="assets/diagrama-componentes/diagrama-componentes2.png" alt="Diagrama de Pacotes Versão 2" width="1400"/>

<font>Fonte: [Douglas Alves](https://github.com/dougAlvs), 2023</font>

</center>

### Versão 3

Na terceira versão apresentada na figura 3, foi estabelecida uma nova relação entre o componente de autenticação do usuário e o componente de compra da plataforma. Visto que foi observado que o papel de ator do usuário estava muito diluído pela grande concentração das tarefas dentro dos componentes da plataforma, dessa forma a relação do usuário com o sistema acaba acontecendo de maneira mais direta e natural.

<center>

Figura 3 - Diagrama de Componentes Versão 3

<img src="assets/diagrama-componentes/diagrama-componentes3.png" alt="Diagrama de Pacotes Versão 3" width="1400"/>

<font>Fonte: [Douglas Alves](https://github.com/dougAlvs), 2023</font>

</center>

### Versão 4

Na quarta versão apresentada na Figura 4, foram considerados os feedbacks da entrega 2. Estabeleceram-se novas relações, envolvendo catálogo, pedidos e segurança. Observou-se que o papel da Plataforma ainda abrangia muitas tarefas, então ele foi distribuído entre essas novas relações. Também foi levada em consideração a questão da segurança, que anteriormente estava contida apenas no processo de pagamento; nessa versão, ela foi separada e passou a englobar todas as tarefas que requerem o tratamento de dados confidenciais.
<center>

Figura 4 - Diagrama de Componentes Versão 4

<img src="assets/diagrama-componentes/diagrama-componentes4.png" alt="Diagrama de Pacotes Versão 3" width="1400"/>

<font>Fonte: [Débora Caires](https://github.com/deboracaires), [Douglas Alves](https://github.com/dougAlvs) e [Maciel Júnior](https://github.com/macieljuniormax), 2023</font>

</center>

## Conclusão

O diagrama de componentes apresentado forneceu um grande desafio à equipe devido a sua complexidade, porém oferece uma visão abrangente e estruturada dos elementos essenciais que compõem nosso sistema. Ele serviu como uma ferramenta valiosa para descrever a arquitetura e a organização interna da aplicação de maneira modular e de alto nível de abstração, destacando as interações e dependências entre cada componente.

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
| 1.1      | Adição da v1 do diagrama   | [Débora Caires](https://github.com/deboracaires), [Douglas Alves](https://github.com/dougAlvs), [Laura Pinos](https://github.com/laurapinos) e [Maciel Júnior](https://github.com/macieljuniormax)   | [Hellen Fernanda](https://github.com/Hellen159)  | 30/09/2023|
| 1.2      | Adição da metodologia da V1 e artefato   | [Débora Caires](https://github.com/deboracaires) e [Maciel Júnior](https://github.com/macieljuniormax)   |  [Douglas Alves](https://github.com/dougAlvs)  | 08/10/2023|
| 1.3      | Adição da segunda versão do diagrama e da conclusão  | [Douglas Alves](https://github.com/dougAlvs) | [Arthur de Melo](https://github.com/arthurmlv)  | 08/10/2023|   |  
| 1.4      | Adição da terceira versão do diagrama e atualização da conclusão  | [Douglas Alves](https://github.com/dougAlvs) | [Arthur de Melo](https://github.com/arthurmlv)  | 09/10/2023|
| 2.0      | Adição da quarta versão do diagrama  | [Débora Caires](https://github.com/deboracaires), [Douglas Alves](https://github.com/dougAlvs) e [Maciel Júnior](https://github.com/macieljuniormax) | [Arthur de Melo](https://github.com/arthurmlv)  | 01/12/2023|
