# GOF - Factory Method

## Introdução
O Factory Method é um padrão criacional de projeto que fornece uma interface para criar objetos em uma superclasse, mas permite que as subclasses alterem o tipo de objetos que serão criados.

## Metodologia
A metodologia adotada compreende uma abordagem estruturada para a aplicação de padrões de design GoF na resolução de uma problemática específica do site Magazine Luiza. Inicialmente, realizei uma análise da problemática identificada, seguida pela escolha do padrão GoF mais adequado, optando pelo Factory Method para facilitar a criação dinâmica de objetos. Logo, é desenvolvido um diagrama de implementação representando as relações entre classes, seguido pela elaboração de um pseudocódigo que reflete a lógica da implementação. 
## Problemática e Solução

### Problemática  
O site inclui uma variedade de produtos eletrônicos, como smartphones, laptops e câmeras, cada um com características específicas.No entanto, cada categoria de eletrônicos pode ter diferentes atributos, métodos de exibição e promoções exclusivas.

### Solução
A aplicação do Factory Method resolve essa problemática. Cada categoria de produtos eletrônicos (como smartphones, laptops, câmeras) pode ter sua própria fábrica concreta que implementa o método create_product. Isso permite que cada fábrica crie instâncias específicas de produtos relacionados à sua categoria, encapsulando a lógica de criação.

## UML

<img src="/assets/FactoryMethod.png" alt="Factory Method" width="1400"/>


## Código

```
//Product

public class interface ElectronicProduct:


//ConcreteProducts

class Smartphone implements ElectronicProduct:

class Laptop implements ElectronicProduct:


//Creator

class ProductFactory:
    public void createProduct ();

//ConcreteCreators

class SmartphoneFactory extends ProductFactory:
    public String create_product(self):
        return Smartphone()

class LaptopFactory extends ProductFactory:
    public String create_product(self):
        return Laptop()

```
## Referências Bibliográficas

>https://refactoring.guru/pt-br/design-patterns/factory-method
## Histórico de Versões
| Versão   | Descrição  | Responsável | Revisor    | Data      |
|----------|------------|-------------|------------|-----------|
| 1.0      | Criação da estrutura da página   | [Hellen Fernanda](https://github.com/Hellen159)   |  [Sidney Fernando](https://github.com/nando3d3)  | 29/11/2023|