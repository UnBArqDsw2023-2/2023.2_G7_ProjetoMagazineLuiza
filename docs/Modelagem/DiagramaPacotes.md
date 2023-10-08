# Diagrama de Pacotes

## Introdução

Enquanto classes representam a forma básica de estruturação de um sistema orientado a objetos, os pacotes podem estruturar sistemas grandes, representando o agrupamento de quaisquer construções UML (com os mais comuns sendo classes ou sub-pacotes) (FOWLER, 2014). Dito isso, o diagrama de pacotes é um diagrama estrutural e estático que permite organizar o sistema com uma visão mais modular e de alto nível do que o [diagrama de classes](), representando uma estrutura hierárquica do sistema.

## Participantes

Na Tabela 1 a seguir, pode-se rastrear a participação de cada integrante num determinado fluxo que compõe os diagramas.

<div style="margin-left: auto;
            margin-right: auto;
            width: 60%">
<font size="3"><p style="text-align: center"><b>Tabela 1</b> - Participantes</p></font>

| Participantes                                                                                                                                 |         Etapas          |
| --------------------------------------------------------------------------------------------------------------------------------------------- | :---------------------: |
| [Geovanna Maciel](https://github.com/manuziny)                                                                                                | Busca e Compra com MVC  |
| [Arthur de Melo](https://github.com/arthurmlv), [Douglas Alves](https://github.com/dougAlvs) e [Geovanna Maciel](https://github.com/manuziny) |     Compra versão 1     |
| [Arthur de Melo](https://github.com/arthurmlv), [Douglas Alves](https://github.com/dougAlvs) e [Geovanna Maciel](https://github.com/manuziny) | Busca e Compra versão 2 |
| [Arthur de Melo](https://github.com/arthurmlv), [Douglas Alves](https://github.com/dougAlvs), [Geovanna Maciel](https://github.com/manuziny) e [Matheus Henrique](https://github.com/mathonaut) | Modelo definitivo com Cadastro, Busca e Compra com MVC |

<font size="3"><p style="text-align: center">Fonte: Autores</p></font>

</div>

## Metodologia

Os diagramas foram construídos através da ferramenta Lucidchart e por meio de reuniões realizadas na plataforma Discord (nas datas de 27/09 e 07/10). A linguagem utilizada na confecção foi a UML.

Em relação ao diagrama em si, eles são representados por pacotes e suas relações. Um pacote pode ser definido como um _namespace_ usado para agrupar elementos semanticamente relacionados e que podem mudar juntos (UML Diagrams).

## Diagramas produzidos

### Versão 1 com MVC

Para a produção do diagrama na Figura 1, inicialmente consideramos a adoção do padrão arquitetural Modelo-Visão-Controladora (MVC) como uma abordagem para melhor visualização e organização do sistema. Porém surgiram muitas dúvidas se estava realmente aplicável ou coerente com o que seria desenvolvido posteriormente na disciplina. Assim, decidimos explorar alternativas que não dependessem do modelo MVC, buscando assegurar que nosso diagrama refletisse de maneira precisa e apropriada os requisitos e a natureza do projeto.

<center>

Figura 1 - Diagrama de Busca e Compra com MVC

<div style="margin-left: auto;
            margin-right: auto;
            width: 80%">
<img src="assets/diagramapacotesmvc.png" alt="Diagrama de Pacotes com MVC" width="1000"/>

</div>

<font>Fonte: Autores, 2023</font>

</center>

### Versão 1

Paralelamente ao diagrama que utilizava o MVC, foi elaborado outro, mostrado na Figura 2, mas que não utilizava diretamente os conceitos de model, view e controller. Este diagrama representa alguns pacotes básicos e suas dependências. Porém por ser simplesmente um rascunho inicial, apresenta tudo isso de forma bem simples.

<center>

Figura 2 - Diagrama de Compra

<div style="margin-left: auto;
            margin-right: auto;
            width: 80%">
<img src="assets/pacotes-compra1.png" alt="Diagrama de Pacotes" width="1000"/>

</div>

<font>Fonte: Autores, 2023</font>

</center>

### Versão 2

Nessa segunda versão do diagrama, mostrada na Figura 3, algumas semânticas da notação foram melhor aproveitadas, passamos a utilizar os elementos <\<merge>>, <\<use>>, <\<acess>> e <\<import>>. Assim, houve um maior detalhamento de alguns pacotes (por exemplo o "interface com o usuário") com a especificação das relações entre eles.

<center>
Figura 3 - Diagrama de Busca e Compra  de produtos 
<p align="center">
    <img src="assets/DiagramaPacotes/Diagrama1.png" alt="Diagrama de Pacotes" width="1000"/></a></br>
</p>

<font>Fonte: Autores, 2023</font>

</center>

## Diagrama Definido
Após discussões entre o grupo e com o feedback a professora, optamos por voltar ao padrão arquitetural Modelo-Visão-Controladora (MVC) presente na Figura 4. Com a finalidade de aumentar a granularidade, optou-se por adicionar as classes e suas relações dentro do pacote "model", atualização da "controller" com pacotes mais específicos das requisições do usuário na "view".

<center>
Figura 4 - Diagrama de Busca e Compra  de produtos 
<p align="center">
    <img src="assets/diagrama-pacotes-mvc2.png" alt="Diagrama de Pacotes com MVC" width="1000"/></a></br>
</p>

<font>Fonte: Autores, 2023</font>

</center>

## Conclusão

## Referências Bibliográficas

> FOWLER, Martin. UML Essencial: um breve guia para linguagem padrão. Bookman editora, 2014.
>
> UML DIAGRAMS. UML Package Diagrams Overview, 2023. Disponível em: <<https://www.uml-diagrams.org/package-diagrams-overview.html>>. Acesso em: 27/09/2023.
>
> LARMAN, Craig. Utilizando UML e padrões. Bookman Editora, 2007.

## Histórico de Versões

| Versão | Descrição                                         | Responsável                                                                                                                                   | Revisor                                          | Data       |
| ------ | ------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------ | ---------- |
| `1.0`  | Criação da página                                 | [Geovanna Maciel](https://github.com/manuziny)                                                                                                | [Arthur de Melo](https://github.com/arthurmlv)   | 27/09/2023 |
| `1.1`  | Adição da introdução e referencias bibliograficas | [Douglas Alves](https://github.com/dougAlvs)                                                                                                  | [Geovanna Maciel](https://github.com/manuziny)   | 27/09/2023 |
| `1.2`  | Adição do diagrama inicial de compra              | [Arthur de Melo](https://github.com/arthurmlv)                                                                                                | [Douglas Alves](https://github.com/manuziny)     | 27/09/2023 |
| `1.3`  | Adição das versões do diagrama                    | [Arthur de Melo](https://github.com/arthurmlv), [Douglas Alves](https://github.com/dougAlvs) e [Geovanna Maciel](https://github.com/manuziny) | [Matheus Henrique](https://github.com/mathonaut) | 27/09/2023 |
| `1.4`  | Adição do diagrama com MVC                        | [Geovanna Maciel](https://github.com/manuziny)                                                                                                | [Arthur de Melo](https://github.com/arthurmlv)   | 07/10/2023 |
| `1.5`  | Adição do rascunho da metodologia                 | [Matheus Henrique](https://github.com/mathonaut)                                                                                              | [Geovanna Maciel](https://github.com/manuziny)   | 08/10/2023 |
| `1.6`  | Adição da motivação de elaboração dos diagramas versão 1 e 2   |  [Douglas Alves](https://github.com/dougAlvs)                                                                                              | [Sidney Fernando](https://github.com/nando3d3)   | 08/10/2023 |
| `1.7`  | Adição do diagrama definito e sua motivação  | [Arthur de Melo](https://github.com/arthurmlv), [Douglas Alves](https://github.com/dougAlvs), [Geovanna Maciel](https://github.com/manuziny) e [Matheus Henrique](https://github.com/mathonaut)                                                                                       |  [Sidney Fernando](https://github.com/nando3d3)  | 08/10/2023 |
