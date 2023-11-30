Em um sistema de e-commerce como o da Magalu, a camada de persistência de dados é importantíssima, visto que são armazenados dados dos diferentes usuários, produtos, departamentos, pedidos, pagamentos, entre outros. Dito isso, a visão de dados da arquitetura permite uma descrição mais clara e concisa de quais são os dados do sistema, sua estruturação e como eles são persistidos.

### Metodologia

O banco de dados da aplicação foi modelado como um banco de dados relacional. Sendo assim, foram elaborados um total de três artefatos, sendo eles: o [Modelo Entidade-Relacionamento (MER)](#modelo-entidade-relacionamento) e o [Diagrama Entidade-Relacionamento (DER)](#diagrama-entidade-relacionamento), ambos no nível conceitual, e o [Diagrama Lógico de Dados (DLD)](#diagrama-lógico-de-dados) no nível lógico. 

O esqueleto inicial do MER foi elaborado no dia 23/11/2023 com base no que já tinha sido modelado no [diagrama de classes](../../Modelagem/DiagramaClasses.md), sendo posteriormente refinado com base em discussões realizadas em uma reunião de brainstorming entre os membros do grupo. Após isso, o DER foi feito com base no que havia no MER e, diminuindo-se o nível de abstração, adentrou-se no nível lógico com o DLD.

### Modelo Entidade Relacionamento

Nesse primeiro artefato, observa-se o nível conceitual do banco, nele as entidades são representadas por substantivos no singular com letras maiúsculas, já seus atributos são apresentados entre parênteses, com as chaves primárias estando sublinhadas. Os relacionamentos, por sua vez, possuem um nome, as entidades relacionadas, além de uma descrição textual e sua cardinalidade.

**Entidades:**

* COMPRADOR (<u>cpf</u>, nome, email, telefone)
* PEDIDO (<u>idPedido</u>, status, totalPedido, dataPedido, cpfComprador, idEnderecoEntrega)
* PAGAMENTO (<u>idPagamento</u>, métodoPagamento, valorPagamento, dataPagamento, cpfComprador, idPedido)
* SACOLA (cpfComprador, totalSacola)
* ENDERECO (<u>idEndereco</u>, nomeEndereco, cep, numero, bairro, estado, complemento, referencia, cidade)
* ITEM (<u>idItem</u>, quantidade, idPedido, idProduto)
* PRODUTO (<u>idProduto</u>, nomeProduto, descricao, valorProduto, idDepartamento)
* DEPARTAMENTO (<u>idDepartamento</u>, nomeDepartamento)

**Relacionamentos:**

* COMPRADOR - tem - SACOLA
 
Um COMPRADOR pode ter nenhuma ou uma SACOLA, enquanto uma SACOLA é de um único COMPRADOR.
Cardinalidade (1:1)

* COMPRADOR - possui - ENDERECO
 
Um COMPRADOR possui um ou vários ENDERECO, enquanto um ENDERECO é de nenhum ou vários COMPRADOR.
Cardinalidade (n:m)

* COMPRADOR - realiza - PAGAMENTO
 
Um COMPRADOR realiza nenhum ou vários PAGAMENTO, enquanto um PAGAMENTO é realizado por um único COMPRADOR.<br>
Cardinalidade (1:n)

* COMPRADOR - faz - PEDIDO
 
Um COMPRADOR faz nenhum ou vários PEDIDO, enquanto um PEDIDO é realizado por um único COMPRADOR.
Cardinalidade (1:n)

* PEDIDO - entregue - ENDERECO
 
Um PEDIDO é entregue em um único ENDERECO, enquanto um ENDERECO pode ter a entrega de nenhum ou vários PEDIDO.<br>
Cardinalidade (n:1)

* PEDIDO - liberado - PAGAMENTO
 
Um PEDIDO pode ser liberado por nenhum ou um PAGAMENTO, enquanto um PAGAMENTO libera um único PEDIDO.
Cardinalidade (1:1)

* PEDIDO - contem - ITEM
 
Um PEDIDO contem um ou vários ITEM, enquanto um ITEM faz parte de um único PEDIDO.<br>
Cardinalidade (1:n)

* SACOLA - contem - ITEM
 
Uma SACOLA contem nenhum ou vários ITEM, enquanto um ITEM faz parte de nenhuma ou uma única SACOLA.
Cardinalidade (1:n)

* ITEM - associado - PRODUTO
 
Um ITEM é associado a um único PRODUTO, enquanto um PRODUTO pode ser associado a nenhum ou vários ITEM.
Cardinalidade (n:1)

* PRODUTO - incluido - DEPARTAMENTO
 
Um PRODUTO é incluido em um único DEPARTAMENTO, enquanto um DEPARTAMENTO pode  incluir nenhum ou vários PRODUTO.<br>
Cardinalidade (n:1)

### Diagrama Entidade Relacionamento

Ainda no nível conceitual, o DER fornece uma representação visual das entidades, atributos e relacionamentos do MER. Nele, as entidades são representadas por retângulos, os atributos por elipses e os relacionamentos por losangos. O diagrama da Figura 1 foi feito utilizando a ferramenta brModelo.

<center>

Figura 1 - Diagrama Entidade Relacionamento

<img src="assets/visoes/der.png" alt="Diagrama Entidade Relacionamento" width="1400"/>

<font>Fonte: [Douglas Alves](https://github.com/dougAlvs), 2023</font>

</center>

### Diagrama Lógico de Dados

O DLD, por sua vez, representa o nível lógico do banco de dados, ou seja, o grau de abstração já é menor e há uma maior proximidade com a implementação. Nele não existem mais entidades ou relacionamentos, apenas tabelas. Além disso, com sua análise é possível obter informações preciosas como: tipos de dados dos atributos e presença de chaves primárias, estrangeiras e candidatas.

<center>

Figura 2 - Diagrama Lógico de Dados

<img src="assets/visoes/dld.png" alt="Diagrama Lógico de Dados" width="1400"/>

<font>Fonte: [Douglas Alves](https://github.com/dougAlvs), 2023</font>

</center>


### Conclusão

A representação dos dados por meio do Modelo Entidade-Relacionamento (MER), do Diagrama Entidade-Relacionamento (DER) e do Diagrama Lógico de Dados (DLD) proporcionou uma visão abrangente e detalhada das estruturas de persistência de dados do sistema. 

Por um lado, com o MER e o DER, a visão de dados se aproxima de uma perspectiva mais conceitual e de nível de abstração semelhante à [visão lógica](#Visão-Lógica), já por outro, com a presença do DLD, apresenta uma visão mais física e próxima da implementação do código do banco de dados em si, com o próximo nível sendo justamente a implementação que pode ser observada no tópico de [Reutilização de Software]().
