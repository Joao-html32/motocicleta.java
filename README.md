# 🏍️ Sistema de Gerenciamento de Motos - Estudo de POO

Este é um projeto desenvolvido em **Java** com o objetivo de consolidar meus conhecimentos em **Programação Orientada a Objetos (POO)** e **Encapsulamento**. No ecossistema Java, entender como isolar regras de negócio e proteger o estado dos objetos é fundamental, e este repositório reflete a aplicação prática desses conceitos.

## 🚀 O que o projeto faz?
O sistema simula o gerenciamento de dados e operações financeiras básicas de uma motocicleta dentro de um modelo de negócio (como uma concessionária ou oficina):
* **Criação Dinâmica de Objetos:** Utiliza construtores personalizados para instanciar motos com atributos únicos (Marca, Cilindradas, Modelo e Preço), eliminando o uso de dados fixos ("hardcoded") dentro da classe molde.
* **Regra de Negócio Controlada:** Implementa um método dinâmico para aplicação de descontos, onde o preço final é recalculado com segurança.
* **Exibição de Status:** Apresenta de forma organizada no terminal todas as especificações e o estado atualizado do objeto.

## 🧠 Conceitos de POO Aplicados
* **Classes e Objetos:** Separação estrita de responsabilidades entre a classe executável principal (`sla`) e a classe de domínio/molde (`moto`).
* **Encapsulamento:** Todos os atributos da moto foram definidos como `private`, impedindo alterações diretas e maliciosas por fora da classe. O acesso e a modificação dos estados ocorrem estritamente por meio de portas seguras (métodos públicos de ação).
* **Passagem de Parâmetros e Construtores:** Uso da palavra-chave `this` para mapear corretamente o fluxo de dados do momento da inicialização do objeto até a persistência em memória.

## 🛠️ Tecnologias Utilizadas
* **Linguagem:** Java
* **Ambiente de Desenvolvimento:** Visual Studio Code (VS Code)

---
*Desenvolvido por João Vitor durante meus estudos de fundamentos da programação e engenharia de software backend.*
