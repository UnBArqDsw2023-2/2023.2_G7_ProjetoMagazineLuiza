# GOF - Singleton

## Introdução

De maneira concisa, um padrão pode ser definido como "uma solução recorrente para um problema comum em um contexto específico" (SWEBOK, 2019). No universo da engenharia de software, os padrões desempenham um papel crucial na definição da arquitetura e do design dos sistemas. Nesse contexto, os estilos arquiteturais oferecem uma perspectiva abrangente sobre a organização do software. Esses estilos se dividem em três categorias distintas: criacionais, estruturais e comportamentais, cada uma abordando desafios específicos.

No âmbito dessas categorias, foi escolhido o padrão de projeto Singleton para gerenciar o acesso à conexão com o banco de dados no backend da aplicação (essa problemática será melhor discorrida no tópico [Problemática e Solução](/PadroesDeProjeto/adapter?id=problemática-e-solução)). Este padrão, inserido na categoria criacional, demonstra sua utilidade ao garantir que uma determinada classe tenha uma única instância ao mesmo tempo e também ao fornecer um acesso global para essa instância.

## Metodologia

A preparação para a produção do artefato teve início após a reunião documentada na [Ata 5](https://unbarqdsw2023-2.github.io/2023.2_G7_ProjetoMagazineLuiza/#/atas/ata5), na qual as duplas foram designadas, e discutiram-se os padrões mais viáveis para a implementação. O singleton foi escolhido pela relação que seria possível ser feita com a [reutilização de software com o banco de dados](/ArquiteturaReutilizacao/4.2.ReutilizacaoDeSoftware?id=banco-de-dados) e assim a elaboração dos dois artefatos foi feita de maneira muito próxima. O diagrama de classes foi elaborado no [Lucidchart](https://lucid.app/), utilizando o formato do template UML, e a implementação do código ocorreu no ambiente VScode, utilizando a linguagem Java.

## Problemática e Solução

### Problemática 

No contexto de uma aplicação de e-commerce como a Magalu, assim como é explicitado na [Visão de Dados](/ArquiteturaReutilizacao/DAS?id=visão-de-dados) do Documento de Arquitetura de Software, é muito importante a presença de uma camada de persistência de dados na forma de um banco de dados. Contudo, a conexão à esse banco deve ser gerenciada de forma cuidadosa e eficiente, de forma a se garantir a consistência dos dados armazenados e a performance do sistema. Sendo assim, a criação de múltiplas instâncias de conexão com o banco de dados pode levar a problemas como consumo excessivo de recursos, conflitos de dados e dificuldade em gerenciar essas conexões. Além disso, a falta de um controle centralizado sobre as conexões pode resultar em inconsistências nos dados.

### Solução 

A implementação do padrão de projeto Singleton garante que apenas uma instância da conexão com o banco de dados seja criada. Este padrão restringe a inicialização do objeto de conexão ao banco de dados a um único ponto, garantindo que todas as operações de banco de dados sejam realizadas através dessa única instância.

## UML

O diagrama de classes representado pela Figura 1 reflete a modelagem feita para a aplicação do padrão de projeto Singleton na conexão ao banco de dados da plataforma.

<center>

Figura 1 - Diagrama de Classes Singleton Versão 1

<img src="assets/DiagramaReutilizacao/diagramaClassesSingleton.png" alt="" width="1400"/>

<font>Fonte: [Douglas Alves](https://github.com/dougAlvs), 2023</font>

</center>

A seguir, uma explicação detalhada dos principais elementos do diagrama:
* DatabaseSingleton: essa classe tem seu construtor privado, assim só é possível instanciá-la pelo método estático getInstance(), que tem a lógica necessária para que não sejam criadas mais que uma instância, mesmo em ambientes multi-thread;
* PlataformStatistics: essa classe se conecta ao banco de dados usando a DatabaseSingleton e exibe algumas estatísticas da plataforma;
* ResultSetProcessor: interface utilizada pela PlataformStatistics para manipular os dados das queries SQL.

## Código

O código realiza a implementação da modelagem UML proposta, exercitando o padrão Singleton ao mesmo tempo que exercita a [reutilização de software com o banco de dados](/ArquiteturaReutilizacao/4.2.ReutilizacaoDeSoftware?id=banco-de-dados).


A Figura 2 ilustra a classe Main, ela instancia a  classe PlataformStatistics e exibe algumas estatísticas da plataforma.

<center>

Figura 2 - Classe Main

<img src="assets/DiagramaReutilizacao/main-singleton.png" alt="" width="1200"/>

<font>Fonte: [Douglas Alves](https://github.com/dougAlvs), 2023</font>

</center>


A Figura 3 ilustra a classe PlataformStatistics, ela se conecta ao banco de dados pelos método getInstance() e getConnection() da classe DatabaseSingleton. O método executeQuery implementa a interface ResultSetProcessor para executar uma query no banco e processar esses dados para exibição, com a implementação dessa parte de processamento sendo feita por cada método de estatísticas em específico. Pode-se observar nas linhas 34, 48 e 62 como as queries são executadas nas views assim como seriam em tabelas, dessa forma a criação das views evitar a repetição do código e aumenta sua legibilidade.

<center>

Figura 3 - Classe PlataformStatistics

<img src="assets/DiagramaReutilizacao/statistics-singleton.png" alt="" width="1200"/>

<font>Fonte: [Douglas Alves](https://github.com/dougAlvs), 2023</font>

</center>



Por fim, Na Figura 4 é possível ver a classe DatabaseSingleton, ela tem seu construtor privado, assim só é possível instanciá-la pelo método estático getInstance(), que tem a lógica necessária para que não sejam criadas mais que uma instância, mesmo em ambientes multi-thread. Ademais existe um método para retornar a conexão do  com o banco e para fechá-la.
<center>


Figura 4 - Classe DatabaseSingleton

<img src="assets/DiagramaReutilizacao/database-singleton.png" alt="" width="2400"/>

<font>Fonte: [Douglas Alves](https://github.com/dougAlvs), 2023</font>

</center>


## Como rodar o código?

Esse código de exemplo está localizado no repositório do projeto, especificamente no diretório [code/padroes/singleton](https://github.com/UnBArqDsw2023-2/2023.2_G7_ProjetoMagazineLuiza/tree/main/code/padroes/singleton), e foi estruturado com o [Maven](/ArquiteturaReutilizacao/4.2.ReutilizacaoDeSoftware.md?id=reutilização-externa). 

Primeiramente, para executá-lo é preciso ter o banco de dados do projeto rodando na sua máquina, o passo a passo de como fazer isso está no artefato de [reuso de software no banco de dados](/ArquiteturaReutilizacao/4.2.ReutilizacaoDeSoftware?id=uso-do-banco). Após ter a base de dados rodando na sua máquina, com todas as tabelas e views já populadas, basta ir no diretório do padrão de projeto e executar no terminal o comando <b>"mvn exec:java"</b>, com a saída do código sendo  mostrada na Figura 5.

<center>

Figura 5 - Saída do código de exemplo

<img src="assets/DiagramaReutilizacao/saida-singleton.png" alt="" width="1200"/>

<font>Fonte: [Douglas Alves](https://github.com/dougAlvs), 2023</font>

</center>

## Conclusões

Observou-se que a implementação do padrão de projeto Singleton resolve a problemática da conexão ao banco de dados ao garantir que apenas uma instância dessa conexão seja criada e restringindo a inicialização do objeto de conexão ao banco de dados a um único ponto. Isso não apenas economiza recursos, mas também facilita o gerenciamento da conexão, pois todas as solicitações passam por um único ponto de controle. Assim, o padrão ajuda a manter a consistência dos dados e a eficiência do sistema.

## Referências Bibliográficas

> Software Engineering Body of Knowledge (SWEBOK) | IEEE Computer Society» (em inglês). Consultado em 01 de dezembro de 2023.
> 
> **Singleton**. Refactoring Guru, 2023. Disponível em: <https://refactoring.guru/pt-br/design-patterns/singleton>. Acesso em: 28 de novembro de 2023.

## Histórico de Versões
| Versão   | Descrição  | Responsável | Revisor    | Data      |
|----------|------------|-------------|------------|-----------|
| 1.0      | Criação da estrutura da página   | [Douglas Alves](https://github.com/dougAlvs)   |  [Sidney Fernando](https://github.com/nando3d3)  | 28/11/2023|
| 1.1      | Adição da documentação  | [Douglas Alves](https://github.com/dougAlvs)   |  [Geovanna Maciel](https://github.com/manuziny)  | 01/12/2023|