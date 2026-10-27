# Character Record System

Projeto colaborativo de estudo em Java, inspirado no universo de *Demon Slayer*, desenvolvido para praticar conceitos de Programação Orientada a Objetos (POO).

A proposta é modelar diferentes categorias de personagens, suas características e habilidades por meio de uma estrutura de classes organizada e extensível.

## Estado atual

**Em desenvolvimento.**

A versão atual contém a estrutura inicial de classes e seus relacionamentos. A aplicação principal ainda não possui funcionalidades interativas de cadastro, consulta ou gerenciamento de personagens.

## Modelagem

A estrutura utiliza herança para representar diferentes categorias de personagens:

```text
Personagem
├── Humano
│   └── CacadorDeOnis
│       └── Hashira
│
└── Oni
    └── DozeKizuki
        └── LuaSuperior
```

Também existem classes para representar habilidades:

- `Respiracao`: nome e origem de uma técnica de respiração.
- `Kekkijutsu`: identificação de uma técnica demoníaca.

As classes `CacadorDeOnis` e `Oni` possuem referências às respectivas habilidades.

## Conceitos trabalhados

- Classes e objetos;
- Herança;
- Encapsulamento;
- Construtores;
- Métodos e atributos;
- Getters e setters;
- Associação entre objetos;
- Organização de código em pacotes.

## Tecnologias

- Java 26
- Maven
- Programação Orientada a Objetos

## Como executar

**Requisitos:** JDK 26 e Maven.

Clone o repositório:

```bash
git clone https://github.com/kdduuu/character-record-system.git
cd character-record-system
```

Compile o projeto:

```bash
mvn compile
```

Execute a classe principal:

```bash
java -cp target/classes br.com.demonslayer.Main
```

Na versão atual, a execução apresenta a mensagem `DEMON SLAYER RECORD SYSTEM` no terminal.

## Objetivo

Utilizar um universo fictício como referência para estudar modelagem de classes, hierarquias de herança e organização de responsabilidades em Java.

O repositório registra a evolução de um projeto de aprendizado colaborativo.

---

*Projeto educacional, não oficial e sem vínculo com os criadores ou detentores dos direitos de Demon Slayer.*
