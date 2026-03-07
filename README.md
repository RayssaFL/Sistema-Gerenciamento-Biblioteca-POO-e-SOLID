# 📚 Sistema de Gerenciamento de Biblioteca

<div align="center">

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![OOP](https://img.shields.io/badge/POO-Orientado%20a%20Objetos-007396?style=for-the-badge)
![UML](https://img.shields.io/badge/UML-Diagrama%20de%20Classes-02569B?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Em%20Desenvolvimento-yellow?style=for-the-badge)
![SOLID](https://img.shields.io/badge/SOLID-Princ%C3%ADpios-6DB33F?style=for-the-badge)

**Um sistema orientado a objetos para gerenciar empréstimos, devoluções e acervo de uma biblioteca.**

</div>

---

## 📋 Sobre o Projeto

Este diagrama de classes representa a estrutura de um sistema de gerenciamento de biblioteca, desenvolvido com base nos princípios da **Programação Orientada a Objetos** e nas boas práticas do **SOLID**. A modelagem apresenta uma separação clara de responsabilidades entre as classes, promovendo **baixo acoplamento**, **alta coesão** e **facilidade de manutenção**.

O sistema permite controlar o empréstimo e devolução de itens do acervo (livros e periódicos) por diferentes tipos de usuários (alunos e professores), com o suporte de funcionários.

---

## 🗂️ Diagrama de Classes

<p align="center">
  <img src="docs/Diagrama_Sist_Ger_Biblioteca.png" width="600">
</p>

## 💡 Conceitos de POO Aplicados

- **Herança** — `Livro` e `Periodico` estendem `Item`; `Aluno` e `Professor` estendem `Usuario`
- **Polimorfismo** — `exibirDetalhes()` é sobrescrito em cada subclasse de `Item`
- **Encapsulamento** — Atributos privados com acesso via getters/setters
- **Abstração** — `Item` e `Usuario` funcionam como classes base abstratas
- **Associação / Composição** — Relacionamentos entre `ServicoEmprestimo`, `Emprestimo`, `Item` e `Usuario`

---

## 🧱 Princípios SOLID Aplicados

| Princípio | Como se aplica no sistema |
|---|---|
| **S** — *Single Responsibility* | Cada classe tem uma única responsabilidade: `ServicoEmprestimo` gerencia empréstimos, `Emprestimo` representa o contrato, `Funcionario` registra operações |
| **O** — *Open/Closed* | `Item` e `Usuario` são abertos para extensão (`Livro`, `Periodico`, `Aluno`, `Professor`) sem necessidade de alterar a classe base |
| **L** — *Liskov Substitution* | Subclasses como `Livro` e `Aluno` podem substituir suas classes pai (`Item`, `Usuario`) sem quebrar o comportamento esperado |
| **I** — *Interface Segregation* | As responsabilidades são separadas em classes coesas, evitando que uma classe seja forçada a implementar comportamentos que não lhe pertencem |
| **D** — *Dependency Inversion* | `ServicoEmprestimo` depende das abstrações `Usuario` e `Item`, e não das implementações concretas (`Aluno`, `Professor`, `Livro`, `Periodico`) |

---

<div align="center">

Feito com ☕ e muito Java

</div>

