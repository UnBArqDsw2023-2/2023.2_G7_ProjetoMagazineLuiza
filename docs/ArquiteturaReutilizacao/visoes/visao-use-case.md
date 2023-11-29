## Introdução

Dado que o sistema do Magazine Luiza se trata de uma loja virtual na qual diversos produtos podem ser comprados. Pressupõe-se que, assim como as lojas físicas desta natureza, haja um público-alvo abrangente. Portanto, emerge-se a necessidade de técnicas para descrever as interações entre o usuário e a aplicação. Sendo assim, o Diagrama de Casos de Uso serão confeccionados a fim de vislumbrar situações de uso do sistema (FOWLER, 2014).

## Metodologia

A execução deste artefato se deu, inicialmente, por meio de um estudo individual prévio dos integrantes. Após isso, no dia 28 de novembro de 2023, às 15:00, iniciou-se o processo de criação do diagrama e da documentação, em uma reunião via Discord. No decorrer da diagramação, foram realizadas consultas nos referênciais bibliográficos. Além disso, para a confecção dos casos de uso, simulou-se situações reais de uso por meio do método de inspeção na realização das ações de busca, visualização, compra e cadastro/login. O diagrama foi confecionado no [Lucidchart](https://lucid.app) e foram utilizados os formatos do template de Caso de Uso da ferramenta. Após a criação da primeira versão, realizou-se uma verificação em conjunto entre os dois participantes, a analisar cada caso de uso individualmente, o que culminou na versão 2.

## Diagrama de Caso de Uso

Conforme sugerido por Kruchten em seu Modelo de Visão 4+1: para melhor visualização das demais quatro visões, a descrição de cenários facilita o descobrimento de elementos arquiteturais durante o processo de desenho. Além de seu papel na validação e do caráter ilustrativo de tal após a finalização do design de arquitetura (KRUCHTEN, 1995). Entretanto, apesar da recomendação de Kruchten pelos cenários, o grupo optou por realizar uma adaptação do método ao fazer uso do Diagrama de Casos de Uso. Tal escolha se deu pela experiência prévia dos integrantes envolvidos neste artefato com tal ferramenta. A Figura 1 a seguir explicita a primeira versão do diagrama de casos de uso.

<center>

Figura 1 - Diagrama de Caso de Uso Versão 1

<img src="assets/visoes/use-case1.png" alt="" width="1400"/>

<font>Fonte: [Arthur de Melo](https://github.com/arthurmlv) e [Geovanna Maciel](https://github.com/manuziny), 2023</font>

</center>

A Figura 2 a seguir demonstra a segunda versão para o diagrama, feita após a verificação.

<center>

Figura 2 - Diagrama de Caso de Uso Versão 2

<img src="assets/visoes/use-case2.png" alt="" width="1400"/>

<font>Fonte: [Arthur de Melo](https://github.com/arthurmlv) e [Geovanna Maciel](https://github.com/manuziny), 2023</font>

</center>

### Buscar Produto

Para o fluxo de busca de produto, a inclusão se mostra necessária, dado que uma busca precisa estritamente exibir os resultados. Entretanto, não se aplica à opção de aplicar filtro, visto que a última é opcional. A busca pode ser utilizada para auxiliar na visualização do produto, dado que o usuário pode precisar buscar o produto desejado.

### Comprar Produto

Ao iniciar o fluxo de compra, a primeira ação ser tomada é de visualização do produto, a qual é obrigatória. Em seguida, o usuário pode optar por adicionar o item à sacola, o que pode exigir a seleção do tipo de produto e do tipo de garantia. A exigência citada anteriormente também pode ser requisitada ao realizar uma compra direta.

Ademais, para realizar a confirmação da compra é necessária a realização de cadastro e de login. Feito isso, exige-se a escolha do local de entrega e da realização do pagamento. Por fim, a última ação necessita da seleção do método de pagamento.

## Conclusão 

Isso posto, infere-se que algumas ações precisam ser realizadas no sistema sem ligação à uma conta, dado que essas independem da autenticação. Por exemplo, um usuário não cadastrado pode acessar itens e adicionar à sacola, logo o sistema precisa perdurar essa informação sem relacionar a sacola à conta, e esta relação pode ser relevante ao diagrama de dados, dado o escopo do projeto. Contudo, esse comportamento pode ser feito por meio de cache ou cookies. Por outra via, analisa-se que grande parte das interações são opcionais, ou seja, o site apresenta uma preocupação com a dinâmica das ações, oferecendo diferentes opções, principalmente durante a compra. No entanto, algumas dessas atividades são implementadas de forma insatisfatória. Tal como a busca só pode ser filtrada após a realização da primeira busca sem filtros. De maneira análoga, seria interessante a opção de cálculo de desconto e de preço total na Sacola, visto que a última só pode ser verificada na fase de pagamento.

## Referências Bibliográficas

> FOWLER, Martin. UML Essencial: um breve guia para linguagem padrão. Bookman editora, 2014.

> KRUCHTEN, Philippe. Architectural Blueprints — The “4+1” View Model of Software Architecture. IEEE Software 12 (6), pp. 42-50, 1995. Disponível em: <https://www.cs.ubc.ca/~gregor/teaching/papers/4+1view-architecture.pdf>. Acesso em: 28 de novembro de 2023 às 15:00.

> Lucidchart. Diagrama de Caso de Uso UML. Disponível em: <https://www.lucidchart.com/pages/pt/diagrama-de-caso-de-uso-uml>. Acesso em: 28 de novembro de 2023 às 16:08.

## Histórico de Versões

| Versão   | Descrição  | Responsável | Revisor    | Data      |
|----------|------------|-------------|------------|-----------|
| 1.0      | Criação da primeira versão e documentação.   | [Arthur de Melo](https://github.com/arthurmlv) e [Geovanna Maciel](https://github.com/manuziny)   |  [Douglas Alves](https://github.com/dougAlvs)  | 28/11/2023 |
| 1.1      | Desenvolvimento da segunda versão.   | [Arthur de Melo](https://github.com/arthurmlv) e [Geovanna Maciel](https://github.com/manuziny)   |  [Douglas Alves](https://github.com/dougAlvs)  | 28/11/2023 |
| 1.2      | Adição da conclusão.   | [Arthur de Melo](https://github.com/arthurmlv)  |  [Douglas Alves](https://github.com/dougAlvs)  | 28/11/2023 |