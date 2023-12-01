# Diagrama de Comunicação

## Introdução
Segundo Martin Fowler[¹](#ancora1), o diagrama de comunicação é uma representação gráfica que destaca as conexões de dados entre os diversos participantes em uma interação, permitindo o posicionamento livre desses participantes e a representação das conexões entre eles. Esse tipo de diagrama também registra o comportamento de um cenário específico, enfatizando a sequência estrutural das mensagens[²](#ancora2). Embora seja semelhante ao [Diagrama de Sequência](Modelagem/DiagramaSequencia), ambos demonstram a colaboração dinâmica entre os objetos; a principal diferença é que o Diagrama de Comunicação concede maior ênfase ao contexto do sistema [⁴](#ancora4).
[](#versão-1---cadastro)
## Participantes
Na Tabela 1 a seguir, pode-se rastrear a participação de cada integrante num determinado fluxo que compõe os diagramas.

<div style="margin-left: auto;
            margin-right: auto;
            width: 60%">
<font size="3"><p style="text-align: center"><b>Tabela 1</b> - Participantes</p></font>

| Participantes   | Fluxos  |
|-----------------|:------------:|
| [Arthur de Melo](https://github.com/arthurmlv), [Debora Caires](https://github.com/deboracaires) ,  [Geovanna Maciel](https://github.com/manuziny) e [Sidney Fernando](https://github.com/nando3d3) | Busca e Compra |
| [Arthur de Melo](https://github.com/arthurmlv), [Debora Caires](https://github.com/deboracaires),  [Geovanna Maciel](https://github.com/manuziny) e [Sidney Fernando](https://github.com/nando3d3) | Cadastro/Login |

<font size="3"><p style="text-align: center">Fonte: Autores</p></font>
</div>

## Metodologia
Para a execução do diagrama, os participantes estudaram individualmente o material disponibilizado no Aprender 3 e nas bibliografias que estão citadas ao fim do documento. Feito o estudo, todos se reuniram em uma reunião no Discord no dia 29/09/2023 e teve uma duração de duas horas. 

No desenvolvimento do diagrama, cada participante desempenhou um papel fundamental ao contribuir com suas ideias e opiniões em relação ao diagrama de comunicação. O desenvolvimento no Lucidchart ajudou a manter o trabalho dinâmico, pois a colaboração foi ativa e diversificada de todos os membros da equipe, o que enriqueceu significativamente o processo de criação do diagrama. 

Os integrantes com mais experiência em diagramação foram essenciais para o trabalho, pois ajudou a "destravar" os participantes que estavam com dúvidas em relação às notações e aos fluxos.

## Artefato
O artefato desenvolvido tem como principal propósito esclarecer o funcionamento do sistema do site da Magazine Luiza em duas interações cruciais: a primeira relacionada ao processo de cadastro na plataforma e a segunda relacionada à busca e compra de produtos. Este diagrama de comunicação foi meticulosamente elaborado para proporcionar uma visão transparente das mensagens e do fluxo de informações entre os diversos elementos do sistema.

Para facilitar a compreensão do sistema, dividimos o diagrama em duas interações distintas, cada uma delas representando uma etapa importante do processo de compra:

1. __Interação de Cadastro na Plataforma__: Iniciamos com a interação de cadastro, onde o usuário cria uma conta na plataforma da Magazine Luiza. Este processo envolve a coleta de informações do usuário e os passos necessários para se registrar na plataforma.

2. __Interação de Busca e Compra de Produtos__: A segunda interação concentra-se no processo de busca e seleção de produtos. Detalhamos como o usuário navega pelo catálogo de produtos, pesquisa itens desejados e os adiciona ao carrinho de compras. Posteriormente, exploramos o processo de compra em si. Isso engloba a adição de produtos à sacola de compras, o processo de pagamento, a confirmação do pedido e a opção de escolha de entrega.

É importante destacar que nossa escolha deliberada foi se concentrar nas interações de cadastro, busca e compra, sem incluir outros fluxos que possam ser necessários para alcançar essas etapas. O objetivo é proporcionar uma compreensão detalhada e aprofundada dessas interações específicas, com o intuito de aprimorar ainda mais a experiência do usuário e otimizar o desempenho do sistema da Magazine Luiza nessas áreas-chave.

## Diagrama Produzido

### Versão 1 - Cadastro
No contexto do fluxo de cadastro do Comprador, que é o usuário principal do sistema conforme ilustrado na Figura 1, notamos que o diagrama acabou por se mostrar relativamente simples e conciso. Durante o processo de concepção, não surguram sugestões adicionais para expandir ou enriquecer o diagrama por meio da inclusão de mais elementos ou componentes. Mas essa simplicidade não necessariamente implica uma insuficiência na representação do processo, mas sim uma precisão na exposição das etapas envolvidas no cadastro do Comprador.

<center>

Figura 1 - Diagrama de Cadasro

<div style="margin-left: auto;
            margin-right: auto;
            width: 80%">
<img src="assets/comunicacao-cadastro.png" alt="Diagrama de Comunicacao" width="1000"/>

</div>

<font>Fonte: Autores, 2023</font>

</center>

### Versão 1 - Busca e Compra
A elaboração do diagrama que representa o fluxo de compra e busca também se manteve simples, levantando algumas incertezas em relação ao seu nível de detalhamento, questionando se este se mostrava suficiente e abrangente ou se permanecia superficial, incapaz de capturar plenamente o processo completo de compra e busca. Após análises e discussões conduzidas em reuniões dedicadas a este propósito, a Figura 2 foi o resultado final da diagramação desse fluxo, com as considerações e aprimoramentos resultantes das discussões em equipe.

<center>

Figura 2 - Diagrama de Busca e Compra

<div style="margin-left: auto;
            margin-right: auto;
            width: 80%">
<img src="assets/comunicacao-compra.png" alt="Diagrama de Comunicacao" width="1000"/>

</div>

<font>Fonte: Autores, 2023</font>

</center>

## Conclusões
O diagrama de comunicação foi feito para salientar os vínculos existentes entre os fluxos, envolvendo os léxicos [usuário](Base/lexicos.md#l05-usuário), [cadastrar](Base/lexicos.md#l01-cadastrar), [comprar](Base/lexicos.md#l02-comprar), [cadastrado](Base/lexicos.md#l03-cadastrado), [pedido confirmado](Base/lexicos.md#l07-pedido-confirmado), [produto](Base/lexicos.md#l08-produto), [visualizar](Base/lexicos.md#l09-visualizar) e [buscar](Base/lexicos.md#l10-buscar), além de ser bom para explorar alternativas. Mesmo com suas semelhanças com o [Diagrama de Sequência](Modelagem/DiagramaSequencia), o diagrama de comunicação foi feito para ser um complementar ao projeto.

Em suma, a escolha do diagrama de comunicação como ferramenta de representação para esses fluxos é uma abordagem estratégica que contribui para a precisão, eficiência, melhoria contínua e alinhamento em projetos que envolvem processos complexos de interação.

## Referências Bibliográficas
> <a id="ancora1"></a> 1. FOWLER, Martin. UML essencial. Grupo A, 2011. E-book. ISBN 9788560031382. Disponível em: https://integrada.minhabiblioteca.com.br/#/books/9788560031382/. Acesso em: 30 Sep 2023.

> <a id="ancora2"></a> 2. BARCELAR, Ricardo. Módulo 3 - Modelagem de Sistemas Orientada a Objetos Com UML. Disponível na plataforma Aprender 3. Acesso em: 30 Sep 2023.

> <a id="ancora3"></a> 3. SERRANO, Milene. Arquitetura e Desenho de Software AULA - MODELAGEM UML DINÂMICA. Disponível na plataforma Aprender 3. Acesso em: 30 Sep 2023.

> <a id="ancora4"></a> 4. "UML Linguagem de Modelagem Unificada". Disponível na plataforma Aprender 3. Acesso em: 30 Sep 2023.

## Histórico de Versões

| Versão | Descrição                                    | Autor(es)                                        | Revisor(es)                                      | Data       |
| ------ | ---------- | -------------------------------------------- | ------------------------------------------------ | ------------------------------------------------ |
| `1.0`  | Adição da versão inicial do diagrama, introdução e referências.         | [Geovanna Maciel](https://github.com/manuziny) | [Arthur de Melo](https://github.com/arthurmlv) |  29/09/2023 |
| `1.1`  | Adição da metodologia         | [Geovanna Maciel](https://github.com/manuziny) | [Debora Caires](https://github.com/deboracaires) |  07/10/2023 |
| `1.2`  |  Adição do tópico artefato        | [Debora Caires](https://github.com/deboracaires) | [Geovanna Maciel](https://github.com/manuziny) | 08/10/2023 |
| `1.3`  |  Adição da conclusão      | [Geovanna Maciel](https://github.com/manuziny) |  [Arthur de Melo](https://github.com/arthurmlv) | 08/10/2023 |
| `1.3.1`   |  Correção links                                                                       | [Douglas Alves](https://github.com/dougAlvs) |  | 08/10/2023 |