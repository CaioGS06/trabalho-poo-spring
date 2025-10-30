# Trabalho de Programação Orientada a Objetos (POO) com Spring Boot

Este é um projeto acadêmico desenvolvido para a disciplina de Programação Orientada a Objetos. O objetivo principal é demonstrar a aplicação prática dos pilares e conceitos da POO em uma aplicação web moderna, utilizando Java, Spring Boot e Thymeleaf.

A aplicação foi publicada na plataforma Render e pode ser acessada através do link abaixo:

**[https://trabalho-poo-spring.onrender.com/](https://trabalho-poo-spring.onrender.com/)**

[![Site](https://img.shields.io/badge/Site-Live-brightgreen.svg)](https://trabalho-poo-spring.onrender.com/)

## 📖 Tema do Projeto

O tema escolhido para a demonstração dos conceitos foi um "Mini Zoológico". A estrutura de classes inclui uma classe `Animal` abstrata, classes filhas como `Cachorro` e `Gato`, e uma classe `Habitat` que demonstra o relacionamento entre objetos.

## 🎯 Conceitos de POO Aplicados

Este projeto foi estruturado para aplicar diretamente os seguintes conceitos de POO:

* **Abstração:**
    * A classe `Animal` é `abstract`, definindo um contrato (atributos e métodos) que toda classe filha deve seguir.
    * O método `fazerBarulho()` é `abstract`, forçando as classes concretas a implementá-lo.

* **Herança:**
    * As classes `Cachorro` e `Gato` `extendem` (herdam) da classe `Animal`, reutilizando seus atributos (`nome`, `idade`) e construtor (`super()`).

* **Polimorfismo:**
    * **De Subtipo (Sobrescrita):** O método `fazerBarulho()` é sobrescrito (`@Override`) em `Cachorro` ("Au au!") e `Gato` ("Miau!"). No controller, uma `List<Animal>` armazena ambos os tipos, e a chamada `animal.fazerBarulho()` executa a implementação correta em tempo de execução.
    * **Paramétrico (Generics):** A utilização de `List<Animal>` e `ArrayList<Animal>` demonstra o polimorfismo paramétrico.

* **Encapsulamento (Modificadores de Acesso):**
    * Os atributos da classe `Animal` (como `nome` e `idade`) são definidos como `private`, e o acesso a eles é controlado através de métodos públicos (`getters` e `setters`).

* **Sobrecarga (Overloading):**
    * A classe `Animal` possui dois métodos com o mesmo nome, `comer()`, mas com assinaturas diferentes:
        1.  `public String comer()`
        2.  `public String comer(String comida)`
    * O Thymeleaf demonstra essa capacidade chamando uma ou outra versão dependendo do tipo do animal.

* **Relacionamento entre Classes (HAS-A / HAS-MANY):**
    * A classe `Habitat` possui um atributo `private List<Animal> animais`. Isso demonstra um relacionamento de composição/agregação "TEM-MUITOS" (HAS-MANY), onde um `Habitat` é composto por vários `Animais`.

## 🛠️ Tecnologias Utilizadas

* **Back-End:** Java 21 e Spring Boot
* **Front-End:** Thymeleaf (Motor de Templates)
* **Gerenciador de Dependências:** Maven
* **Containerização:** Docker
* **Plataforma de Deploy (PaaS):** Render

## 🚀 Como Executar Localmente

Existem duas formas de executar o projeto:

### 1. Via IDE (VS Code / IntelliJ)

1.  **Pré-requisitos:** Ter o **JDK 21** instalado.
2.  Clone este repositório:
    ```bash
    git clone [https://github.com/CaioGS06/trabalho-poo-spring.git](https://github.com/CaioGS06/trabalho-poo-spring.git)
    ```
3.  Abra o projeto na sua IDE.
4.  Aguarde o Maven baixar todas as dependências (definidas no `pom.xml`).
5.  Encontre e execute o método `main` na classe `AvaliacaoFinalPooApplication.java`.
6.  Acesse **[http://localhost:8080](http://localhost:8080)** no seu navegador.

### 2. Via Docker (Forma Recomendada)

Esta forma é mais simples pois já inclui o Java e todas as dependências, graças ao `Dockerfile` presente no projeto.

1.  **Pré-requisitos:** Ter o **Docker Desktop** instalado e em execução.
2.  Clone o repositório.
3.  Abra um terminal na pasta raiz do projeto.
4.  Construa a imagem Docker:
    ```bash
    docker build -t trabalho-poo .
    ```
5.  Execute o container a partir da imagem:
    ```bash
    docker run -p 8080:8080 trabalho-poo
    ```
6.  Acesse **[http://localhost:8080](http://localhost:8080)** no seu navegador.

---
Desenvolvido por: [CaioGS06](https://github.com/CaioGS06)