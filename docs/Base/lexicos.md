## Introdução

O Léxico é uma notação que, por meio da descrição de termos, tem como objetivo descrever os símbolos de uma linguagem, ou seja, visam fornecer ideias iniciais de um conceito dentro de um projeto. No entanto, seu principal objetivo na Engenharia de Requisitos é o reconhecimento de palavras ou frases peculiares ao contexto social aplicado no estudo. Cada símbolo possui sua noção e seu impacto. Sendo a noção e o impacto dois conceitos que, na notação do Léxico Ampliado da Linguagem, se alteram de acordo com o tipo de símbolo.

## Metodologia

Para a confeccção dos léxicos, utilizamos a notação do Léxico Ampliado da Linguagem (LAL) [1](#Referências-Bibliográficas), com os conceitos explicitados na Tabela 1, já o template utilizado está presente na Tabela 2:

<div style="margin-left: auto;
            margin-right: auto;
            width: 30%">
<font size="3"><p style="text-align: center"><b>Tabela 1</b> - Léxicos do tipo LAL</p></font>

| Tipo do símbolo | Noção | Impacto |
|-----------------|-------|-------|
| Sujeito | Quem é o sujeito | Quais ações executa |
| Verbo | Quem realiza, quando acontece e quais os procedimentos envolvidos | Quais os reflexos das ações no ambiente e quais são os novos estados decorrentes |
| Objeto | Definir o objeto e identificar outros objetos com os quais se relaciona | Ações que podem ser aplicadas ao objeto  |
| Estado | O que indica e ações que levaram a esse estado | Identificar outros estados que podem ocorrer a partir do estado descrito  |

<!-- <font size="3"><p style="text-align: center">Fonte: LEITE<a id="anchor_1" href="#REF1"><sup>1</a>.</p></font> -->
<font size="3"><p style="text-align: center">Fonte: LEITE[<sup>1](#referências-bibliográficas)</p></font>
</div>



<div style="margin-left: auto;
            margin-right: auto;
            width: 20%">
<font size="3"><p style="text-align: center"><b>Tabela 2</b> - Template Léxicos</p></font>

| ID | Descrição |
|-----------------|-------|
| Classificação | Estado/Objeto/Verbo/Sujeito |
| Noção | Símbolo |
| Impacto | Descrição de ações e de seus efeitos | 
| Dicionário | Sinônimos |

<font size="3"><p style="text-align: center">Fonte: [Arthur de Melo](https://github.com/arthurmlv) e [Sidney Fernando](https://github.com/nando3d3).</p></font>
</div>

## Léxicos

### L01: Cadastrar

O primeiro Léxico, presente na Tabela 3, representa a função de cadastro do usuário.

<div style="margin-left: auto;
            margin-right: auto;
            width: 30%">
<font size="3"><p style="text-align: center"><b>Tabela 3</b> - Léxico 01: Cadastrar (L01)</p></font>

| L01 | Descrição |
|-----------------|-------|
| Classificação | Verbo |
| Noção |  O [usuário](#l05-usuário) pode se cadastrar. <br> O cadastro ocorre quando [usuário](#l05-usuário) for realizar sua primeira [compra](#l02-comprar) no site. <br> Exige um e-mail, senha, tipo de conta, CPF, nome completo, data de nascimento e CEP. <br> O [usuário](#l05-usuário) precisa ler e aceitar a política de privacidade. |usuário
| Impacto | O [usuário](#l05-usuário) confirma seu cadastro via e-mail. <br> O [usuário](#l05-usuário) recebe o estado de [cadastrado](#l03-cadastrado). <br> A [compra](#l02-comprar) de um [produto](#l08-produto) pode ser realizada pelo [usuário](#l05-usuário). |
| Dicionário | Registrar, inscrever ou fichar. |

<font size="3"><p style="text-align: center">Fonte: [Arthur de Melo](https://github.com/arthurmlv) e [Sidney Fernando](https://github.com/nando3d3).</p></font>
</div>

### L02: Comprar

O segundo Léxico, presente na Tabela 4, detalha a ação de comprar.

<div style="margin-left: auto;
            margin-right: auto;
            width: 30%">
<font size="3"><p style="text-align: center"><b>Tabela 4</b> - Léxico 02: Comprar (L02)</p></font>

| L02 | Descrição |
|-----------------|-------|
| Classificação | Verbo |
| Noção | O [usuário](#l05-usuário) [cadastrado](#l01-cadastrar) pode comprar um [produto](#l08-produto). <br> O [usuário](#l05-usuário) realiza a compra. <br> A compra é feita após a adição de [produto(s)](#l08-produto) na sacola. <br> [cadastro](#l01-cadastrar) é necessário para realizar a compra. <br> Durante o processo, escolhe-se o endereço de entrega. <br> A [confirmação do pedido](#l07-pedido-confirmado) ocorre após a escolha do método de pagamento. |
| Impacto | Para finalizar a compra, o pagamento precisa ser feito. <br> Um e-mail com os detalhes da compra é enviado ao [usuário](#l05-usuário). <br> O [usuário](#l05-usuário) recebe atualizações do estado do seu pedido. |
| Dicionário | Adquirir ou realizar pedido. |

<font size="3"><p style="text-align: center">Fonte: [Arthur de Melo](https://github.com/arthurmlv) e [Sidney Fernando](https://github.com/nando3d3).</p></font>
</div>

### L03: Cadastrado

O terceiro Léxico, presente na Tabela 5, detalha o estado de um usuário cadastrado.

<div style="margin-left: auto;
            margin-right: auto;
            width: 30%">
<font size="3"><p style="text-align: center"><b>Tabela 5</b> - Léxico 03: Cadastrado (L03)</p></font>


| L03 | Descrição |
|-----------------|-------|
| Classificação | Estado |
| Noção | O referido [usuário](#l05-usuário) possui uma conta no site após [cadastrar](#l01-cadastrar).  |
| Impacto | Nesse estado, pode-se [salvar endereços](#l04-salvar-endereço), [realizar pedidos](#l02-comprar) e [acompanhar pedidos](#l06-acompanhar-pedido). | 
| Dicionário | Registrado ou inscrito. |

<font size="3"><p style="text-align: center">Fonte: [Arthur de Melo](https://github.com/arthurmlv) e [Sidney Fernando](https://github.com/nando3d3).</p></font>
</div>

### L04: Salvar endereço

O quarto Léxico, presente na Tabela 6, se refere ao registro de endereços em uma conta.

<div style="margin-left: auto;
            margin-right: auto;
            width: 30%">
<font size="3"><p style="text-align: center"><b>Tabela 6</b> - Léxico 04: Salvar endereço (L04)</p></font>


| L04 | Descrição |
|-----------------|-------|
| Classificação | Verbo |
| Noção | O [usuário](#l05-usuário) [cadastrado](#l01-cadastrar) pode salvar endereços. <br> Acontece ao acessar a aba de endereços de entrega ou ao realizar a [compra](#l02-comprar) de um [produto](#l08-produto).  |
| Impacto | O endereço salvo pode ser utilizado como destino para o pedido. | 
| Dicionário | Registrar ou cadastrar endereço. |

<font size="3"><p style="text-align: center">Fonte: [Arthur de Melo](https://github.com/arthurmlv) e [Sidney Fernando](https://github.com/nando3d3).</p></font>
</div>

### L05: Usuário

O quinto Léxico, presente na Tabela 7, representa o usuário.

<div style="margin-left: auto;
            margin-right: auto;
            width: 30%">
<font size="3"><p style="text-align: center"><b>Tabela 7</b> - Léxico 05: Usuário (L05)</p></font>

| L05 | Descrição |
|-----------------|-------|
| Classificação | Sujeito |
| Noção | Um comprador ou um cliente que se interessou por algum [produto](#l08-produto). |
| Impacto | Pode [realizar pedidos](#l02-comprar). <br> Pode [salvar endereços](#l04-salvar-endereço). <br> Pode se [cadastrar](#l01-cadastrar). <br> [Pode acompanhar pedidos](#l06-acompanhar-pedido).  | 
| Dicionário | Cliente, comprador ou consumidor. |

<font size="3"><p style="text-align: center">Fonte: [Arthur de Melo](https://github.com/arthurmlv) e [Sidney Fernando](https://github.com/nando3d3).</p></font>
</div>

### L06: Acompanhar pedido

O sexto Léxico, presente na Tabela 8, descreve a ação de acompanhar pedido.

<div style="margin-left: auto;
            margin-right: auto;
            width: 30%">
<font size="3"><p style="text-align: center"><b>Tabela 8</b> - Léxico 06: Acompanhar pedido (L06)</p></font>

| L06 | Descrição |
|-----------------|-------|
| Classificação | Verbo |
| Noção | O [usuário](#l05-usuário) que confirmou um pedido pode acompanhar seu estado. <br> O pedido pode ser acompanhado desde que esteja [confirmado](#l07-pedido-confirmado). <br> O pedido é confirmado após a seleção do método de pagamento durante a [compra](#l02-comprar). |
| Impacto | Informa o [usuário](#l05-usuário) sobre o estado de seu pedido. <br> Apresenta o código de rastreamento e a localização da encomenda ao [usuário](#l05-usuário). <br> Informa os dados da compra ao [usuário](#l05-usuário), como o método de pagamento, o preço, o [produto](#l08-produto) e o número do pedido. | 
| Dicionário | Detalhar pedido. |

<font size="3"><p style="text-align: center">Fonte: [Arthur de Melo](https://github.com/arthurmlv) e [Sidney Fernando](https://github.com/nando3d3).</p></font>
</div>

### L07: Pedido confirmado

O sétimo Léxico, presente na Tabela 9, detalha o estado de pedido confirmado.

<div style="margin-left: auto;
            margin-right: auto;
            width: 30%">
<font size="3"><p style="text-align: center"><b>Tabela 9</b> - Léxico 07: Pedido confirmado (L07)</p></font>

| L07 | Descrição |
|-----------------|-------|
| Classificação | Estado |
| Noção | Significa que o [usuário](#L05-Usuário) confirmou o método de pagamento durante a [compra](#L02-comprar)  |
| Impacto | O pedido pode ser cancelado ou entregue. <br> O [usuário](#L05-Usuário) pode [acompanhar o pedido](#l06-acompanhar-pedido), bem como cancelá-lo. <br> Caso o pedido chegue ao destino, ele será marcado como entregue.  | 
| Dicionário | Pedido realizado. |

<font size="3"><p style="text-align: center">Fonte: [Arthur de Melo](https://github.com/arthurmlv) e [Sidney Fernando](https://github.com/nando3d3).</p></font>
</div>

### L08: Produto

O oitavo Léxico, presente na Tabela 10, detalha o objeto Produto.

<div style="margin-left: auto;
            margin-right: auto;
            width: 30%">
<font size="3"><p style="text-align: center"><b>Tabela 10</b> - Léxico 08: Produto (L08)</p></font>

| L08 | Descrição |
|-----------------|-------|
| Classificação | Objeto |
| Noção | Qualquer objeto cadastrado para venda na loja. <br> Um produto possui informações básicas necessárias, como: preço, disponibilidade, fornecedor e nome. <br> Um [usuário](#l05-usuário) [cadastrado](#l03-cadastrado) [compra](#l02-comprar) uma geladeira. <br> Um [usuário](#l05-usuário) qualquer [visualiza](#l09-visualizar) uma geladeira. |
| Impacto | Um produto pode ser [visualizado](#l09-visualizar). <br> Um produto pode ser [comprado](#L02-comprar). | 
| Dicionário | Mercadoria ou item. |

<font size="3"><p style="text-align: center">Fonte: [Arthur de Melo](https://github.com/arthurmlv) e [Sidney Fernando](https://github.com/nando3d3).</p></font>
</div>

### L09: Visualizar

O nono Léxico, presente na Tabela 11, detalha a ação de visualizar um [produto](#l08-produto).

<div style="margin-left: auto;
            margin-right: auto;
            width: 30%">
<font size="3"><p style="text-align: center"><b>Tabela 11</b> - Léxico 09: Visualizar (L09)</p></font>

| L09 | Descrição |
|-----------------|-------|
| Classificação | Verbo |
| Noção | Um [usuário](#l05-usuário) qualquer visualiza produtos. <br> A visualização ocorre após o [usuário](#l05-usuário) realizar uma [busca](#l10-buscar). <br> Um [produto](#l08-produto) é visualizado para ser [comprado](#l02-comprar). |
| Impacto | Ao visualizar, o [produto](#l08-produto) pode ser adicionado à sacola. | 
| Dicionário | Observar ou ver. |

<font size="3"><p style="text-align: center">Fonte: [Arthur de Melo](https://github.com/arthurmlv) e [Sidney Fernando](https://github.com/nando3d3).</p></font>
</div>

### L10: Buscar

O décimo Léxico, presente na tabela 12, detalha a busca.

<div style="margin-left: auto;
            margin-right: auto;
            width: 30%">
<font size="3"><p style="text-align: center"><b>Tabela 12</b> - Léxico 10: Visualizar (L10)</p></font>

| L10 | Descrição |
|-----------------|-------|
| Classificação | Verbo |
| Noção | Um [usuário](#l05-usuário) qualquer busca um determinado [produto](#l08-produto). <br> A busca ocorre a partir do interesse de um [usuário](#l05-usuário) em [visualizar](#l09-visualizar) um [produto](#l08-produto). |
| Impacto | Aparece as informações do [produto](#l08-produto). | 
| Dicionário | Pesquisar ou procurar. |

<font size="3"><p style="text-align: center">Fonte: [Arthur de Melo](https://github.com/arthurmlv) e [Sidney Fernando](https://github.com/nando3d3).</p></font>
</div>

## Referências Bibliográficas

> 1. LEITE, Julio Cesar. Léxico Ampliado da Linguagem, 2012. Disponível em: <<https://www-di.inf.puc-rio.br/~julio/lal.pdf>>. Acesso em: 10/09/2023.

## Histórico de Versões

| Versão | Data       | Descrição                                    | Autor(es)                                        | Revisor(es)                                      |
| ------ | ---------- | -------------------------------------------- | ------------------------------------------------ | ------------------------------------------------ |
| `1.0`  | 10/09/2023 | Criação dos léxicos.                           | [Arthur de Melo](https://github.com/arthurmlv) e [Sidney Fernando](https://github.com/nando3d3) | [Douglas Alves](https://github.com/dougalvs) |
| `1.1`  | 12/09/2023 | Add léxicos 8, 9 e 10.                           | [Arthur de Melo](https://github.com/arthurmlv) | [Douglas Alves](https://github.com/dougalvs) |
