# GOF - Observer

## Introdução

O Observer é um padrão de projeto comportamental que permite definir um mecanismo para reagir às alterações realizadas em determinados objetos sobre eventos que aconteçam com o objeto que eles estão observando.<a id='anchor1'>[1](#ref1)</a>

## Metodologia

A construção do ocorreu de maneira incremental entre os dias 26/11 até 29/11 sendo realizada a entrega no dia 30/11. No primeiro dia (26) foi realizado um estudo sobre o padrão e escolhido uma problemática que ele poderia resolver. Entre os dias 27 a 28, foi realizada a escrita dos textos de introdução, problemática e de solução, além da construção do diagrama UML (Unified Modeling Language).<a id='anchor2'>[2](#ref2)</a> O dia 29 foi dedicado para a implementação do UML em código Java.

Foi utilizado o padrão UML 2.0 e a aplicação LucidChart para a construção dos diagramas.

## Problemática e Solução

### Problemática

O consumidor demonstra interesse por vários produtos e com a proximidade de um período promocional, deseja monitorar suas variações de preço até atingirem um valor desejado. Como resultado, ele visita diariamente as páginas dos produtos para essa verificação, ocasionando um desperdício de recursos para a aplicação, que precisa processar essas solicitações redundantes, e demandando um tempo significativo do cliente para essa tarefa.

### Solução

Utilizando o padrão Observer, uma classe **ServicoNotificacao** como um _observer/subscribe_ notificará os clientes sempre que o preço de um objeto desejado da classe **Produto** como um _subject/publisher_ alterasse seu valor. Isso evitaria o desperdício de recursos da aplicação ao processar solicitações desnecessárias já que somente realizaria uma notificação quando os preços fossem alterados e pouparia o tempo do cliente, que não precisaria mais realizar verificações frequentes.

## UML

O diagrama foi construído de maneira semelhante a estrutura proposta pelo site [Refactoring Guru](https://refactoring.guru/pt-br/design-patterns/observer).

Nele, a classe _Produto_ funciona como publisher notificando as classes ouvintes quando o seu valor muda. A lista de assinantes/ouvintes é mantida separadamente em um objeto chamado eventos que é uma classe do tipo _ServicoNotificacao_. Esse objeto é responsável também por realizar a notificação de mudança de preço para todos os ouvintes através de uma interface de notificação chamada _Ouvintes_.

A interface _Ouvintes_ possui apenas um método chamado _atualizar_ que possui como parâmetro algum identificador que varia. Além disso, existem duas classes ouvintes concretas, _OuvintesEmail_ e _OuvintesMobile_, que são responsáveis por realizar a atualização dos valores dos produtos desejados de acordo com a plataforma que usuário/cliente escolheu.

A figura 1 apresenta o UML proposto para a solução.

<center>

Figura 1 - Diagrama UML da solução.

<img src="assets/padroes/observer/observer-uml.png" alt="Classes" width="1400"/>

<font>Fonte: [Matheus Henrique](https://github.com/mathonaut), 2023</font>

</center>

## Código

O código segue a estrutura proposta pelo Refactoring Guru, passando por algumas modificações para se adequar ao diagrama UML criado. Os trechos subsequentes são concebidos para ilustrar a forma como a implementação poderia ser executada, o que resulta na omissão de certas estruturas presentes no [diagrama de classes](/Modelagem/DiagramaClasses).

### Classe Produto

Essa classe é uma versão alterada e simplificada daquela representada no diagrama de classes. É importante observar que esta classe contém um objeto do tipo _ServicoNotificacao_ chamado eventos. Nesse exemplo o notificador, possui apenas dois tipo de notificação que são as de mudança de preço por e-mail e app.

```
package Produto;

public class Produto {

    // Declara atributos.
    private int produtoID;
    private String nome;
    private String descricao;
    private float valor;
    private int qtdEStoque;

    public ServicoNotificacao eventos; // Guarda o notificador.

    // Construtor para o notificador com o tipo de evento para a mudança de preço.
    public Produto() {
        this.eventos = new ServicoNotificacao("mudancaPrecoEmail", "mudancaPrecoApp");
    }

    // Função que lançaria uma notificação de mudança de preço por email.
    public void alteraPrecoEmail(float valorNovo, String email) {
        this.valor = valorNovo;
        eventos.notifica("mudancaPrecoEmail", email);
    }

    // Função que lançaria uma notificação de mudança de preço por aplicativo.
    public void alteraPrecoApp(float valorNovo, String idUsuario) {
        this.valor = valorNovo;
        eventos.notifica("mudancaPrecoApp", idUsuario);
    }
}
```

### Classe ServicoNotificacao

A classe guarda os ouvintes em uma hash e os métodos de apoio para a sua tarefa (inscrição e desinscrição). O uso da hash se justifica para aumentar a performance na manipulação da lista de ouvintes.

```
package publisher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServicoNotificacao {
    Map<String, List<OuvintesEvento>> ouvintes = new HashMap<>();

    public ServicoNotificacao(String... operacoes) {
        for (String operacao : operacos) {
            this.ouvintes.put(operacao, new ArrayList<>());
        }
    }

    public void inscrever(String tipoEvento, OuvintesEvento ouvinte) {
        List<OuvintesEvento> usuarios = ouvintes.get(tipoEvento);
        usuarios.add(ouvinte);
    }

    public void desinscrever(String tipoEvento, OuvintesEvento ouvinte) {
        List<OuvintesEvento> usuarios = ouvintes.get(tipoEvento);
        usuarios.remove(ouvinte);
    }

    public void notifica(String tipoEvento, String indentificador) {
        List<OuvintesEvento> usuarios = ouvintes.get(tipoEvento);
        for (OuvintesEvento ouvinte : usuarios) {
            ouvinte.atualizar(tipoEvento, indentificador);
        }
    }
}
```

### Interface OuvintesEvento

Ela funciona como uma interface comum para os ouvintes, possui o método _'atualizar'_ para tratar as alterações necessárias causadas pela notificação.

```
package listeners;

public interface OuvintesEvento {
    void atualizar(String identificador);
}
```

### Classe OuvintesEmail

Essa classe notifica o cliente pelo e-mail.

```
package listeners;

public class OuvintesEmail implements OuvintesEvento {

    private String email;

    public OuvintesEmail(String emailCliente) {
        this.email = emailCliente;
    }

    @Override
    public void atualizar(String email) {
        System.out.println("Um e-mail foi enviado para: " + email + "\n Ocorreu uma alteração no preço do produto que você deseja."
    }
}
```

### Classe OuvintesMobile

Possui a mesma estrutura da OuvintesMobile, porém a notificação ocorre no aplicativo.

```
package listeners;

public class OuvintesMobile implements OuvintesEvento {

    private String id;

    public OuvintesMobile(String idCliente) {
        this.id = idCliente;
    }

    @Override
    public void atualizar(String id) {
        System.out.println("Uma notificação no aplicativo foi realizada para o cliente com id: " + id + ".\n"
    }
}
```

### Teste

Para testar a implementação apresentada anteriormente use o codigo a seguir na main.

```
package test;

import produto.Produto;
import listeners.OuvintesEmail;
import listeners.OuvintesMobile;

public class Test {
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.eventos.inscrever("alteraPrecoEmail", new OuvintesEmail("test@test.com"));
        produto.eventos.inscrever("alteraPrecoApp", new OuvintesMobile("01"));

        try {
            produto.alteraPrecoEmail(10.0, "test@test.com");
            produto.alteraPrecoApp(10.0, "01");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

Os códigos da implementação podem ser encontrados neste [link](https://github.com/UnBArqDsw2023-2/2023.2_G7_ProjetoMagazineLuiza/tree/main/code/padroes/observer/).

## Referências Bibliográficas

> <a id='ref1'>[1.](#anchor1)</a> GAMMA, Eric, et al. **Design Patterns: Elements of Reusable Object-Oriented Software.** 1rd ed. Indianapolis: Pearson Education, 1994.
>
> <a id='ref2'>[2.](#anchor2)</a> HAMILTON, Kim; MILES, RUSS. **Learning UML 2.0.** California: O’Reilly Media, 2006.

## Bibliografia

> **Observer**. Refactoring Guru, 2023. Disponível em: <https://refactoring.guru/pt-br/design-patterns/observer>. Acesso em: 26 de novembro de 2023.
>
> **Observer Design Pattern**. Source Making, 2023. Disponível em: <https://sourcemaking.com/design_patterns/observer>. Acesso em: 27 de novembro de 2023.
>
> **Observer em Java**. Refactoring Guru, 2023. Disponível em: <https://refactoring.guru/pt-br/design-patterns/observer/java/example>. Acesso em: 29 de novembro de 2023.

## Histórico de Versões

| Versão | Descrição                                        | Responsável                                      | Revisor                                                                                       | Data       |
| ------ | ------------------------------------------------ | ------------------------------------------------ | --------------------------------------------------------------------------------------------- | ---------- |
| `1.0`  | Criação da página com introdução e problemática. | [Matheus Henrique](https://github.com/mathonaut) | [Douglas Alves](https://github.com/dougAlvs)                                                  | 29/11/2023 |
| `1.1`  | Atualiza textos, adiciona uml e código.          | [Matheus Henrique](https://github.com/mathonaut) | [Arthur de Melo](https://github.com/arthurmlv) e [Douglas Alves](https://github.com/dougAlvs) | 30/11/2023 |
| `2.0`  | Atualiza solução e uml.                          | [Matheus Henrique](https://github.com/mathonaut) | [Arthur de Melo](https://github.com/arthurmlv)                                                | 01/12/2023 |
| `2.1`  | Adiciona implementação e código da nova solução. | [Matheus Henrique](https://github.com/mathonaut) | [Arthur de Melo](https://github.com/arthurmlv)                                                | 01/12/2023 |
