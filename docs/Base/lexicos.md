## Introdução

O Léxico é uma notação que, por meio da descrição de termos, tem como objetivo descrever os símbolos de uma linguagem, ou seja, visam fornecer ideias iniciais de um conceito dentro de um projeto. No entanto, seu principal objetivo na Engenharia de Requisitos é o reconhecimento de palavras ou frases peculiares ao contexto social aplicado no estudo. Cada símbolo possui sua noção e seu impacto. Sendo a noção e o impacto dois conceitos que, na notação do Léxico Ampliado da Linguagem, se alteram de acordo com o tipo de símbolo.

## Metodologia

Para a confeccção dos léxicos, utilizamos a notação do Léxico Ampliado da Linguagem (LAL)<a id="anchor_1" href="#REF1">^1^</a>, com os conceitos explicitados na Tabela 1, já o template utilizado está presente na Tabela 2: 
<figure markdown>
<font size="3"><p style="text-align: center"><b>Tabela 1</b> - Léxicos do tipo LAL</p></font>

| Tipo do símbolo | Noção | Impacto |
|-----------------|-------|-------|
| Sujeito | Quem é o sujeito | Quais ações executa |
| Verbo | Quem realiza, quando acontece e quais os procedimentos envolvidos | Quais os reflexos das ações no ambiente e quais são os novos estados decorrentes |
| Objeto | Definir o objeto e identificar outros objetos com os quais se relaciona | Ações que podem ser aplicadas ao objeto  |
| Estado | O que indica e ações que levaram a esse estado | Identificar outros estados que podem ocorrer a partir do estado descrito  |

<font size="3"><p style="text-align: center">Fonte: LEITE<a id="anchor_1" href="#REF1">^1^</a>.</p></font>

</figure>


<figure markdown>
<font size="3"><p style="text-align: center"><b>Tabela 2</b> - Template Léxicos</p></font>

| ID | Descrição |
|-----------------|-------|
| Classificação | Estado/Objeto/Verbo |
| Noção | Símbolo |
| Impacto | Descrição de ações e de seus efeitos | 
| Dicionário | Sinônimos |

<font size="3"><p style="text-align: center">Fonte: [Arthur de Melo](https://github.com/arthurmlv) e [Sidney Fernando](https://github.com/nando3d3).</p></font>
</figure>

## Léxicos

### <a id="L01" href="#anchor_L01" style="color:black;"> L01: Cadastrar</a>

O primeiro Léxico, presente na Tabela 3, representa a função de cadastro do usuário.

<figure markdown>
<font size="3"><p style="text-align: center"><b>Tabela 3</b> - Léxico 01: Cadastrar (L01)</p></font>

| L01 | Descrição |
|-----------------|-------|
| Classificação | Verbo |
| Noção |  O <a id="anchor_L05" href="#L05">usuário</a> pode se cadastrar. <br> O cadastro ocorre quando <a id="anchor_L05" href="#L05">usuário</a> for realizar sua primeira <a id="anchor_L02" href="#L02">compra</a> no site. <br> Exige um e-mail, senha, tipo de conta, CPF, nome completo, data de nascimento e CEP. <br> O <a id="anchor_L05" href="#L05">usuário</a> precisa ler e aceitar a política de privacidade. |
| Impacto | O <a id="anchor_L05" href="#L05">usuário</a> confirma seu cadastro via e-mail. <br> O <a id="anchor_L05" href="#L05">usuário</a> recebe o estado de <a id="anchor_L03" href="#L03">cadastrado</a>. <br> A <a id="anchor_L02" href="#L02">compra</a> de um produto pode ser realizada pelo <a id="anchor_L05" href="#L05">usuário</a>. |
| Dicionário | Registrar, inscrever ou fichar. |

<font size="3"><p style="text-align: center">Fonte: [Arthur de Melo](https://github.com/arthurmlv) e [Sidney Fernando](https://github.com/nando3d3).</p></font>
</figure>

### <a id="L02" href="#anchor_L02" style="color:black;"> L02: Comprar</a>

O segundo Léxico, presente na Tabela 4, detalha a ação de comprar.

<figure markdown>
<font size="3"><p style="text-align: center"><b>Tabela 4</b> - Léxico 02: Comprar (L02)</p></font>

| L02 | Descrição |
|-----------------|-------|
| Classificação | Verbo |
| Noção | O <a id="anchor_L05" href="#L05">usuário</a> <a id="anchor_L03" href="#L03">cadastrado</a> pode comprar um produto. <br> O <a id="anchor_L05" href="#L05">usuário</a> realiza a compra. <br> A compra é feita após a adição de produto(s) na sacola. <br> O <a id="anchor_L01" href="#L01">cadastro</a> é necessário para realizar a compra. <br> Durante o processo, escolhe-se o endereço de entrega. <br> A <a id="anchor_L07" href="#L07">confirmação do pedido</a> ocorre após a escolha do método de pagamento. |
| Impacto | Para finalizar a compra, o pagamento precisa ser feito. <br> Um e-mail com os detalhes da compra é enviado ao <a id="anchor_L05" href="#L05">comprador</a>. <br> O <a id="anchor_L05" href="#L05">comprador</a> recebe atualizações do estado do seu pedido. |
| Dicionário | Adquirir ou realizar pedido. |

<font size="3"><p style="text-align: center">Fonte: [Arthur de Melo](https://github.com/arthurmlv) e [Sidney Fernando](https://github.com/nando3d3).</p></font>
</figure>

### <a id="L03" href="#anchor_L03" style="color:black;"> L03: Cadastrado</a>

O terceiro Léxico, presente na Tabela 5, detalha o estado de um usuário cadastrado.

<figure markdown>
<font size="3"><p style="text-align: center"><b>Tabela 5</b> - Léxico 03: Cadastrado (L03)</p></font>


| L03 | Descrição |
|-----------------|-------|
| Classificação | Estado |
| Noção | O referido <a id="anchor_L05" href="#L05">usuário</a> possui uma conta no site após <a id="anchor_L01" href="#L01">cadastrar</a>.  |
| Impacto | Nesse estado, pode-se <a id="anchor_L04" href="#L04">salvar endereços</a>, <a id="anchor_L02" href="#L02">realizar pedidos</a> e <a id="anchor_L06" href="#L06">acompanhar pedidos</a>. | 
| Dicionário | Registrado ou inscrito. |

<font size="3"><p style="text-align: center">Fonte: [Arthur de Melo](https://github.com/arthurmlv) e [Sidney Fernando](https://github.com/nando3d3).</p></font>
</figure>

### <a id="L04" href="#anchor_L04" style="color:black;"> L04: Salvar endereço</a>

O quarto Léxico, presente na Tabela 6, se refere ao registro de endereços em uma conta.

<figure markdown>
<font size="3"><p style="text-align: center"><b>Tabela 6</b> - Léxico 04: Salvar endereço (L04)</p></font>


| L04 | Descrição |
|-----------------|-------|
| Classificação | Verbo |
| Noção | O <a id="anchor_L05" href="#L05">usuário</a> <a id="anchor_L03" href="#L03">cadastrado</a> pode salvar endereços. <br> Acontece ao acessar a aba de endereços de entrega ou ao realizar a <a id="anchor_L02" href="#L02">compra de um produto</a>.  |
| Impacto | O endereço salvo pode ser utilizado como destino para o pedido. | 
| Dicionário | Registrar ou cadastrar endereço. |

<font size="3"><p style="text-align: center">Fonte: [Arthur de Melo](https://github.com/arthurmlv) e [Sidney Fernando](https://github.com/nando3d3).</p></font>
</figure>

### <a id="L05" href="#anchor_L05" style="color:black;"> L05: Usuário</a>

O quinto Léxico, presente na Tabela 7, 

<figure markdown>
<font size="3"><p style="text-align: center"><b>Tabela 6</b> - Léxico 05: Usuário (L05)</p></font>

| L05 | Descrição |
|-----------------|-------|
| Classificação | Sujeito |
| Noção | Um comprador ou um cliente que se interessou por algum produto. |
| Impacto | Pode <a id="anchor_L02" href="#L02">realizar pedidos</a>. <br> Pode <a id="anchor_L04" href="#L04">salvar endereços</a>. <br> Pode se <a id="anchor_L01" href="#L01">cadastrar</a>. <br> Pode <a id="anchor_L06" href="#L06">acompanhar pedidos</a>.  | 
| Dicionário | Cliente, comprador ou consumidor. |

<font size="3"><p style="text-align: center">Fonte: [Arthur de Melo](https://github.com/arthurmlv) e [Sidney Fernando](https://github.com/nando3d3).</p></font>
</figure>

### <a id="L06" href="#anchor_L06" style="color:black;"> L06: Acompanhar pedido</a>

O sexto Léxico, presente na Tabela 8,

<figure markdown>
<font size="3"><p style="text-align: center"><b>Tabela 6</b> - Léxico 06: Acompanhar pedido (L06)</p></font>

| L06 | Descrição |
|-----------------|-------|
| Classificação | Verbo |
| Noção | O <a id="anchor_L05" href="#L05">usuário</a> que confirmou um pedido pode acompanhar seu estado. <br> O pedido pode ser acompanhado desde que esteja <a id="anchor_L07" href="#L07">confirmado</a>. <br> O pedido é confirmado após a seleção do método de pagamento durante a <a id="anchor_L02" href="#L02">compra</a>. |
| Impacto | Informa o <a id="anchor_L05" href="#L05">usuário</a> sobre o estado de seu pedido. <br> Apresenta o código de rastreamento e a localização da encomenda ao <a id="anchor_L05" href="#L05">usuário</a>. <br> Informa os dados da compra ao <a id="anchor_L05" href="#L05">usuário</a>, como o método de pagamento, o preço, o produto e o número do pedido. | 
| Dicionário | Detalhar pedido. |

<font size="3"><p style="text-align: center">Fonte: [Arthur de Melo](https://github.com/arthurmlv) e [Sidney Fernando](https://github.com/nando3d3).</p></font>
</figure>

### <a id="L07" href="#anchor_L07" style="color:black;"> L07: Pedido confirmado</a>

O sétimo Léxico, presente na Tabela 9, detalha o estado de pedido confirmado.

<figure markdown>
<font size="3"><p style="text-align: center"><b>Tabela 6</b> - Léxico 07: Pedido confirmado (L07)</p></font>

| L07 | Descrição |
|-----------------|-------|
| Classificação | Estado |
| Noção | Significa que o <a id="anchor_L05" href="#L05">usuário</a> confirmou o método de pagamento durante a <a id="anchor_L02" href="#L02">compra</a>. <br>  |
| Impacto | O pedido pode ser cancelado ou entregue. <br> O <a id="anchor_L05" href="#L05">usuário</a> pode <a id="anchor_L06" href="#L06">acompanhar o pedido</a>, bem como cancelá-lo. <br> Caso o pedido chegue ao destino, ele será marcado como entregue.  | 
| Dicionário | Pedido realizado. |

<font size="3"><p style="text-align: center">Fonte: [Arthur de Melo](https://github.com/arthurmlv) e [Sidney Fernando](https://github.com/nando3d3).</p></font>
</figure>

## Referências Bibliográficas

> <a id="REF1" href="#anchor_1">1.</a> LEITE, Julio Cesar. Léxico Ampliado da Linguagem, 2012. Disponível em: <<https://www-di.inf.puc-rio.br/~julio/lal.pdf>>. Acesso em: 10/09/2023.

## Histórico de Versões

| Versão | Data       | Descrição                                    | Autor(es)                                        | Revisor(es)                                      |
| ------ | ---------- | -------------------------------------------- | ------------------------------------------------ | ------------------------------------------------ |
| `1.0`  | 10/09/2023 | Criação dos léxicos.                           | [Arthur de Melo](https://github.com/arthurmlv) e [Sidney Fernando](https://github.com/nando3d3) | [Douglas Alves](https://github.com/dougalvs) |
