# GOF - Observer

## Introdução

O Observer é um padrão de projeto comportamental que permite definir um mecanismo para reagir às alterações realizadas em determinados objetos sobre eventos que aconteçam com o objeto que eles estão observando.<a id='anchor1'>[1](#ref1)</a>

## Metodologia

A construção do ocorreu de maneira incremental entre os dias 26/11 até 29/11 sendo realizada a entrega no dia 30/11. No primeiro dia (26) foi realizado um estudo sobre o padrão e escolhido uma problemática que ele poderia resolver. Entre os dias 27 a 28, foi realizada a escrita dos textos de introdução, problemática e de solução, além da construção do diagrama UML (Unified Modeling Language). O dia 29 foi dedicado para a implementação do UML em código Java.

Foi utilizado o padrão UML 2.0 e a aplicação LucidChart para a construção dos diagramas.

## Problemática e Solução

### Problemática

O consumidor demonstra interesse por vários produtos e com a proximidade de um período promocional, deseja monitorar suas variações de preço até atingirem, com um desconto de seu pefil de cliente, um valor desejado. Como resultado, ele visita diariamente as páginas dos produtos para essa verificação, ocasionando um desperdício de recursos para a aplicação, que precisa processar essas solicitações redundantes, e demandando um tempo significativo do cliente para essa tarefa.

### Solução

Utilizando o padrão Observer, uma classe **Cliente** como um _observer/subscribe_ poderia guardar os seus produtos favoritos e se inscrever para receber notificações automáticas sempre que o preço da classe **Produto** como um _subject/publisher_ alterasse seu valor. Isso evitaria o desperdício de recursos da aplicação ao processar solicitações desnecessárias já que somente realizaria uma notificação quando os preços fossem alterados e pouparia o tempo do cliente, que não precisaria mais realizar verificações frequentes.

Nessa solução os diversos tipos de clientes recebem descontos diferentes de acordo com a sua classe. Esse valores poderiam ser modificados diretamente na classe.

## UML

O diagrama foi construído de maneira semelhante a estrutura proposta pelo site [Refactoring Guru](https://refactoring.guru/pt-br/design-patterns/observer).

Nele, a classe _Produto_ funciona como publisher notificando as classes ouvintes quando o seu valor muda. A lista de assinantes/ouvintes é mantida separadamente em um objeto chamado eventos que é uma classe do tipo _Notificador_. Esse objeto é responsável também por realizar a notificação de mudança de preço para todos os ouvintes através de uma interface de notificação chamada _OuvintesPreco_.

A interface _OuvintesPreco_ possui apenas um método chamado _atualizar_ que possui como parâmetro o id do produto e o novo valor. Além disso, existem duas classes ouvintes concretas, _OuvinteComum_ e _OuvinteCartaoLuiza_, que são responsáveis por realizar a atualização dos valores dos produtos favoritados de acordo com o tipo de usuário que o cliente é.

A figura 1 apresenta o UML proposto para a solução.

<center>

Figura 1 - Diagrama UML da solução.

<img src="assets/padroes/observer/observer-uml.png" alt="Classes" width="1400"/>

<font>Fonte: [Matheus Henrique](https://github.com/mathonaut), 2023</font>

</center>

## Código

O código segue a estrutura proposta pelo Refactoring Guru, passando por algumas modificações para se adequar ao diagrama UML criado. Os trechos subsequentes são concebidos para ilustrar a forma como a implementação poderia ser executada, o que resulta na omissão de certas estruturas que seriam necessárias para a sua funcionalidade real e completa.

### Classe Notificador

A classe guarda os ouvintes em uma hash e os métodos de apoio para a sua tarefa (inscrição e desinscrição). O uso da hash se justifica para aumentar a performance na manipulação da lista de ouvintes.

```
import banco_dados.models.Cliente;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Notificador {
    Map<String, List<Cliente>> ouvintes = new HashMap<>();

    public Notificador(String... operacoes) {
        for (String operacao : operacos) {
            this.ouvintes.put(operacao, new ArrayList<>());
        }
    }

    public bool inscrever(String tipoEvento, Cliente ouvinte) {
        List<Cliente> usuarios = ouvintes.get(tipoEvento);
        usuarios.add(ouvinte);
    }

    public bool desinscrever(String tipoEvento, Cliente ouvinte) {
        List<Cliente> usuarios = ouvintes.get(tipoEvento);
        usuarios.remove(ouvinte);
    }

    public bool notifica(String tipoEvento, float valor) {
        List<Cliente> usuarios = ouvintes.get(tipoEvento);
        for (Cliente ouvinte : usuarios) {
            ouvinte.atualizar(tipoEvento, valor);
        }
    }
}
```

### Classe Produto

Essa classe é uma versão alterada e simplificada daquela representada no diagrama de classes. É importante observar que esta classe contém um objeto do tipo _Notificador_ chamado eventos. Nesse exemplo o notificador, possui apenas um tipo de notificação que é a de mudança de preço (mudancaPreco).

```
public class Produto {

    # Declara atributos.
    private int produtoID;
    private String nome;
    private String descricao;
    private float valor;

    public Notificador eventos; # Guarda o notificador.

    # Construtor para o notificador com o tipo de evento para a mudança de preço.
    public Produto() {
        this.eventos = new Notificador("mudancaPreco");
    }

    # Função que lançaria uma notificação de mudança de preço.
    public void alteraPreco(float valor) {
        this.valor = valor;
        eventos.notifica("mudancaPreco", valor);
    }
}

```

### Interface Comum Cliente

Ela funciona como uma interface e é quase a mesma apresentada no diagrama de classe, porém possui o método _'atualizar'_ para tratar as alterações necessárias causadas pela notificação. Vale ressaltar que os outros atributos/métodos são omitidos para a simplificação do exemplo.

```
public interface Cliente {
    void atualizar(int produtoID, float valor);
}
```

### Classe ClienteComum

Essa classe atualiza o valor de um produto guardado nos favoritos pelo um novo valor com desconto.

```
import java.util.ArrayList;
import banco_dados.models.Produto

public class ClienteComum implements Cliente {

    private ArrayList<Produto> produtosFavoritos = new ArrayList<Produto>();
    private float desconto;

    ... # Outros métodos/atributos.

    public void mudaDesconto(float novoDesconto) {
        this.desconto = novoDesconto;
    }

    @Override
    public void atualizar(int produtoID, float valor) {
        produtosFavoritos.get(produtoID).valor = valor*this.desconto; # Atuliza o valor do produto com o desconto de 10%.
    }
}
```

### Classe ClienteCartaoLuiza

Possui a mesma estrutura do ClienteComum, porém possui um desconto diferente e cashback.

```
import java.util.ArrayList;
import banco_dados.models.Produto

public class ClienteCArtaoLuiza implements Cliente {

    private ArrayList<Produto> produtosFavoritos = new ArrayList<Produto>();
    private float descontoEspecial;
    private float cashback;

    ... # Outros métodos/atributos.

    public void mudaDesconto(float novoDesconto) {
        this.descontoEspecial = novoDesconto;
    }

    @Override
    public void atualizar(int produtoID, float valor) {
        produtosFavoritos.get(produtoID).valor = (valor*this.descontoEspecial)-(produtosFavoritos.get(produtoID).valor*this.cashback); # Atuliza o valor do produto com o desconto e cashback.
    }
}
```

## Referências Bibliográficas

> <a id='ref1'>[1.](#anchor1)</a> GAMMA, Eric, et al. **Design Patterns: Elements of Reusable Object-Oriented Software.** 1rd ed. Indianapolis: Pearson Education, 1994.

## Bibliografia

> **Observer**. Refactoring Guru, 2023. Disponível em: <https://refactoring.guru/pt-br/design-patterns/observer>. Acesso em: 26 de novembro de 2023.

> **Observer Design Pattern**. Source Making, 2023. Disponível em: <https://sourcemaking.com/design_patterns/observer>. Acesso em: 27 de novembro de 2023.

> **Observer em Java**. Refactoring Guru, 2023. Disponível em: <https://refactoring.guru/pt-br/design-patterns/observer/java/example>. Acesso em: 29 de novembro de 2023.

## Histórico de Versões

| Versão | Descrição                                        | Responsável                                      | Revisor                                                                                       | Data       |
| ------ | ------------------------------------------------ | ------------------------------------------------ | --------------------------------------------------------------------------------------------- | ---------- |
| `1.0`  | Criação da página com introdução e problemática. | [Matheus Henrique](https://github.com/mathonaut) | [Douglas Alves](https://github.com/dougAlvs)                                                  | 29/11/2023 |
| `1.1`  | Atualiza textos, adiciona uml e código.          | [Matheus Henrique](https://github.com/mathonaut) | [Arthur de Melo](https://github.com/arthurmlv) e [Douglas Alves](https://github.com/dougAlvs) | 30/11/2023 |
