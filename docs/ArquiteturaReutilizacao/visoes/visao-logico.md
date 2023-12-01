
A Visão Lógica de um sistema, como explicado em (KRUCHTEN, 1995, p. 43), concentra-se nos requisitos funcionais e na estrutura interna do sistema. Utilizando notações visuais como diagramas de classes, diagrama de componentes e diagrama de pacotes, essa visão busca criar um modelo coerente, aplicando princípios de orientação a objetos, destacando interações, hierarquias e serviçoes compartilhados entre as classes. 

### Metodologia
A visão lógica foi realizada pelos integrantes associados à atividade que foram: [Geovanna Maciel](https://github.com/manuziny), [Laura Pinos](https://github.com/laurapinos) e [Sidney Fernando](https://github.com/nando3d3). A seleção dos integrantes foi feita considerando a participação posterior de cada um nos diagramas de [Classe](https://unbarqdsw2023-2.github.io/2023.2_G7_ProjetoMagazineLuiza/#/Modelagem/DiagramaClasses), [Pacotes](https://unbarqdsw2023-2.github.io/2023.2_G7_ProjetoMagazineLuiza/#/Modelagem/DiagramaPacotes) e [Comunicação](https://unbarqdsw2023-2.github.io/2023.2_G7_ProjetoMagazineLuiza/#/Modelagem/comunicacao). Esses diagramas passaram por mudanças com base no feedback fornecido na entrega anterior sobre a [Modelagem](https://unbarqdsw2023-2.github.io/2023.2_G7_ProjetoMagazineLuiza/#/Modelagem/2.Modelagem) da Magazine Luiza baseado em seus fluxos de Cadastro/Login, Visualização, Busca e Compra de produtos. A divisão para a discussão detalhada sobre s visão lógica de cada artefato foi pensada focando na afinidade de cada integrante com seu respectivo diagrama, desta forma o [Sidney Fernando](https://github.com/nando3d3) ficou responsável pelo [Diagrama de Classes](https://unbarqdsw2023-2.github.io/2023.2_G7_ProjetoMagazineLuiza/#/Modelagem/DiagramaClasses), a  [Geovanna Maciel](https://github.com/manuziny) com o [Diagrama de Pacotes](https://unbarqdsw2023-2.github.io/2023.2_G7_ProjetoMagazineLuiza/#/Modelagem/DiagramaPacotes) e a [Laura Pinos](https://github.com/laurapinos) com o [Comunicação](https://unbarqdsw2023-2.github.io/2023.2_G7_ProjetoMagazineLuiza/#/Modelagem/comunicacao), esta não atuou no diagrama de comunicação mas atuou no de sequência que é um diagrama dinâmico, portanto se dá a afinidade.

O estudo individual sobre as Visões DAS foi conduzido antes da reunião, que ocorreu em 30 de novembro de 2023 no ambiente do Discord, às 14h30. Essa reunião teve como objetivo alinhar as atividades, elucidando as mudanças feitas nos diagramas e garantindo que nenhum deles ficasse desconexo em termos de informações. Importante mencionar que os diagramas foram corrigidos separadamente usando as ferramentas [Lucidchart](https://lucid.app/) e [Drawio](https://drawio-app.com). O alinhamento foi essencial para que os integrantes pudessem compreender a situação de cada diagrama e realizar mudanças, caso necessário.

#### Diagrama de Classes
O diagrama de classe é uma ferramenta comumente usada para modelar a estrutura de um sistema orientado a objetos e podem ser aplicados em diferentes visões arquiteturais, incluindo a visão lógica/arquitetural de um projeto. Este diagrama fornece uma representação visual das classes no sistema, suas relações, atributos e métodos, o que pode ajudar a compreender a estrutura interna do sistema.


O diagrama de classes abaixo é mais detalhado em sua respectiva página [Diagrama de Classes](https://unbarqdsw2023-2.github.io/2023.2_G7_ProjetoMagazineLuiza/#/Modelagem/DiagramaClasses).

<center>
Figura 3 - Diagrama de Classes Versão
<p align="center">
    <img src="assets/diagrama-de-classes3.png" alt="Diagrama de Classes" width="1000"/></a></br>
</p>
<font>Fonte: Autores, 2023</font>
</center>

O Diagrama de Classes, integrado à Visão Lógica no contexto do projeto da Magazine Luiza, é um elemento essencial para compreender o perfil do comprador e os fluxos operacionais desde o cadastro na plataforma até a visualização, seleção, compra e pagamento de produtos. Ao representar entidades como Cliente, Pedido, Sacola, ItemSacola, Produto e Pagamento, juntamente com suas relações e interações, o diagrama reflete a estrutura e as dinâmicas presentes no sistema de e-commerce da Magazine Luiza. Por exemplo, ele evidencia a associação entre Cliente e Pedido, ilustrando a possibilidade de um cliente realizar múltiplos pedidos. Além disso, esse modelo ressalta as dependências e hierarquias entre as classes, como a interdependência entre Pedido e Cliente, sendo fundamental para o entendimento do fluxo de informações durante o processo de compra. A representação visual oferecida pelo Diagrama de Classes é crucial para o desenvolvimento de um sistema coeso e eficaz, alinhado às necessidades da plataforma de e-commerce da Magazine Luiza.

#### Diagrama de Pacotes
De acordo com Sommerville a visão lógica mostra as abstrações fundamentais do sistema como objetos ou classes de objetos. Nessa visão, deve ser possível relacionar os requisitos de sistema com as entidades, essas que lidam e são fundamentais pra modelar a lógica de negócios no contexto da Magazine Luiza. Vale ressaltar que as correções feitas nos diagramas, mencionadas na metodologia, não serão abordadas aqui. Elas foram detalhadamente discutidas em sua respectiva página. 

Considerando o ponto de vista do sistema em questão, os artefatos [Rich Picture](https://unbarqdsw2023-2.github.io/2023.2_G7_ProjetoMagazineLuiza/#/Base/RichPicture), [Storyboard](https://unbarqdsw2023-2.github.io/2023.2_G7_ProjetoMagazineLuiza/#/Base/storyboard?id=introdução) e o [Protótipo](https://unbarqdsw2023-2.github.io/2023.2_G7_ProjetoMagazineLuiza/#/Base/Prototipos?id=introdução) foram empregados para contemplar as futuras responsabilidades dos pacotes, incluindo suas interfaces, dependências e relações com outros pacotes. Esses artefatos possibilitam a captura de maneira abstrata e ilustrativa da visão geral de um sistema e/ou seus processos, abrangendo também a experiência do usuário em diferentes fluxos do sistema. O Protótipo, especialmente, foi utilizado com o intuito de criar uma experiência próxima à final para os usuários. Apesar do nível de abstração elevado desses artefatos, eles constituem uma base sólida para a inclusão dos fluxos de cadastro/login, busca, visualização e compra no diagrama de pacotes. 

Agora, ao observar o Diagrama de Classes, é possível compreender a estrutura interna de cada pacote em relação às classes e seus respectivos relacionamentos. Essa relação fica evidente quando examinamos o pacote Model e suas relações internas de classes. 

Para concluir, o artefato de visão de [Caso de Uso](https://github.com/UnBArqDsw2023-2/2023.2_G7_ProjetoMagazineLuiza/blob/visao-processo/docs/ArquiteturaReutilizacao/visoes/ArquiteturaReutilizacao/DAS?id=diagrama-de-caso-de-uso) pode auxiliar na compreensão de como os pacotes se relacionam com a organização lógica do sistema. Os casos de uso "Visualizar Produto" e "Buscar Produto" impactam na estrutura lógica do sistema, pois o pacote View contém módulos que tratam dessas funcionalidades. No pacote "Model", encontramos representações para os casos de uso "Realizar Cadastro/Login", "Realizar Pagamento", "Adicionar à Sacola", "Selecionar Método de Pagamento" e "Escolher Local de Entrega", os quais são refletidos tanto no diagrama de pacotes quanto no diagrama de classes. Resumindo, 

Desta forma, olhando para o digrama de pacotes na figura 4 percebe-se que ao integrar as diversas perspectivas oferecidas pelos artefatos, desde a visão lógica preconizada por Sommerville até a materialização nos diagramas e protótipos, obtivemos uma compreensão profunda da estrutura e interações dentro do sistema da Magazine Luiza.

<center>
Figura 4 - Diagrama de Pacotes 
<p align="center">
    <img src="assets\diagramas\sequencia\diagrama-mvc-corrigido.drawio.png" alt="Diagrama de Pacotes com MVC" width="500"/></a></br>
</p>

<font>Fonte: Autores, 2023</font>

</center>

#### Diagrama de Comunicação
Conforme explicado por Martin Fowler, o diagrama de comunicação é uma representação visual que destaca as relações de dados entre diferentes participantes em uma interação. Ele permite a disposição livre desses participantes e a visualização das conexões entre eles. Esse tipo de diagrama também documenta o comportamento de um cenário específico, enfocando a sequência estrutural das mensagens. Embora compartilhe semelhanças com o Diagrama de Sequência, ambos evidenciam a colaboração dinâmica entre objetos; a distinção principal reside no fato de que o Diagrama de Comunicação concede maior ênfase ao contexto do sistema


### Conclusão
