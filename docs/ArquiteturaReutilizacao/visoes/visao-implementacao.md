As decisões técnicas, escolhas de tecnologia e a especificação detalhada de cada componente, incluindo sua implementação física ou lógica, são todos elementos integrantes da visão de implementação, uma parte crucial da visão arquitetural.

No âmbito do desenvolvimento de software, essa perspectiva abrange elementos como o código-fonte, os executáveis e outros componentes essenciais para a criação dos produtos finais. Representada por pacotes, diagramas de componentes e descrições textuais, ela proporciona uma compreensão clara da implementação dos módulos e de suas interdependências. Esta abordagem abraça aspectos como a distribuição de tarefas, a reutilização de código e a organização dos artefatos, visando assegurar uma implementação eficaz e escalável. Assim, a visão de implementação serve como elo essencial, unindo os aspectos técnicos à materialização prática da visão arquitetural.

### Metodologia

A visão de implementação foi desenvolvida pelos participantes [Débora Caires](https://github.com/deboracaires), [Douglas Alves](https://github.com/dougAlvs), [Laura Pinos](https://github.com/laurapinos) e [Maciel Júnior](https://github.com/macieljuniormax). Como a maioria dos participantes já tinha contribuído para a elaboração do diagrama de implementação, a produção focou na incorporação dos feedbacks recebidos após a entrega do artefato. O Lucidchart foi utilizado para criar a nova versão, e reuniões virtuais foram realizadas para compartilhar ideias.

### Diagrama de Componentes

A distinção entre componentes e classes na UML é frequentemente alvo de debates, pois ambos os conceitos podem ser utilizados para modelar as mesmas entidades. Segundo Rumbaugh, a diferença entre eles, sendo mais uma questão de intenção do que de semântica estrita, é um tema nebuloso (LARMAN, 2007). Pode-se entender que um componente representa um módulo do sistema encapsulando seu conteúdo e, se necessário, sendo facilmente substituível por outro componente equivalente. Ele tem seu comportamento definido por interfaces fornecidas e requeridas. Nesse sentido, o diagrama de componentes busca modelar o sistema de forma mais modular e independente, o que é crucial para a visão de implementação.

O artefato desenvolvido neste documento tem como objetivo principal proporcionar uma representação visual clara e concisa da estrutura do sistema, concentrando-se no processo de compra de produtos. O diagrama de componentes destaca os principais elementos envolvidos nesse processo, suas interfaces fornecidas e requeridas, assim como as relações e dependências entre eles, elementos essenciais para a visão de implementação.

Ao focar na visão de implementação, o artefato visa facilitar a compreensão prática da arquitetura do sistema no contexto da compra de produtos, que é o foco deste trabalho. Destacam-se os componentes essenciais, desde a busca de produtos até o processamento do pagamento, proporcionando uma base sólida para a implementação eficaz e escalável do sistema. Um detalhamento melhor do diagrama pode ser encontrado na página dedicada a ele: [Diagrama de Componentes](Modelagem/diagrama-componentes.md).

<center>
Figura 10 - Diagrama de Componentes - Versão 4
<p align="center">
    <img src="assets/diagrama-componentes/diagrama-componentes4.png" alt="Diagrama de Componentes" width="1000"/></a></br>
</p>
<font>Fonte: Autores, 2023</font>
</center>

Na Figura 10 acima, é apresentada a versão final do diagrama de componentes. Podem ser observados componentes de usuário, pedidos, catálogo, plataforma, persistência, pagamento e segurança. Uma maior abstração foi aplicada na versão final, onde métodos em versões anteriores foram transformados em componentes, tornando o componente de plataforma menos complexo e mais abstrato, conforme sugerido pela professora em seu feedback.

### Conclusão

A visão de implementação é uma peça essencial no quebra-cabeça da arquitetura de software. Este documento e seu diagrama representam visualmente a estrutura do sistema de compras e seus componentes essenciais.

No contexto deste artefato está a compreensão de que a visão de implementação não é apenas um exercício técnico, mas sim uma ponte vital que conecta os aspectos teóricos da arquitetura de software à sua realização prática. O diagrama de componentes serve como um guia fundamental para a implementação bem-sucedida do sistema, destacando os componentes críticos que sustentarão sua funcionalidade e desempenho.

Além disso, a metodologia adotada, envolvendo a colaboração ativa dos participantes e a incorporação dos feedbacks recebidos, ressalta a importância da revisão contínua e da melhoria iterativa na construção de uma visão arquitetural.1
