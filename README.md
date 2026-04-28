# Café Expresso

Sistema de autoatendimento para cafeteria, desenvolvido em Java, com foco na gestão de pedidos, cálculo automático de valores e controle do fluxo de atendimento.

# Sobre o Projeto

O Café Expresso simula um ambiente de pedidos em uma cafeteria, onde clientes podem selecionar produtos, definir quantidades e acompanhar o processamento do pedido até sua finalização.

A aplicação foi projetada com base em boas práticas de desenvolvimento, incluindo organização em camadas, uso de orientação a objetos e validação de regras de negócio.

# Funcionalidades

* Cadastro e gerenciamento de produtos
* Criação e manipulação de pedidos
* Adição de múltiplos itens com diferentes quantidades
* Cálculo automático do valor total
* Controle de status do pedido (pendente, pago, em preparo e finalizado)

# Arquitetura

O sistema é estruturado a partir de três entidades principais:

* Produto: representa os itens disponíveis
* ItemPedido: relaciona produto e quantidade
* Pedido: centraliza a lógica de negócio e controle do pedido

Essa separação garante maior coesão, organização e facilidade de manutenção.

# Qualidade de Código

O projeto segue práticas voltadas à qualidade de software:

* Implementação incremental baseada em commits frequentes
* Testes unitários para validação das funcionalidades
* Separação clara de responsabilidades entre as classes

# Tecnologias

* Java
* JUnit
* Git & GitHub
