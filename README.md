# Sistema de Gerenciamento de Criptomoedas

API REST para gerenciamento de ativos de criptomoedas, permitindo cadastro, consulta, atualização e remoção de dados.

Este projeto faz parte da avaliação final da matéria de Programação do curso Técnico em TI (2025).

## 📌 Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- Jakarta Validation
- Lombok
- PostgreSQL
- Maven

---

## 📂 Arquitetura

O projeto segue o padrão de arquitetura em camadas:

- Controller
- Service
- Repository
- Entity
- Exception Handler

---

## 📌 Funcionalidades

- Cadastrar criptomoeda
- Listar todas
- Buscar por ID
- Editar
- Excluir
- Converte
- Validações automáticas
- Tratamento global de erros

---

## ▶️ Como rodar
1. Clone o repositório
2. Configure o banco de dados
3. Execute a aplicação

---

## 🔗 Endpoints

* POST /api/criptomoedas
* GET /api/criptomoedas
* GET /api/criptomoedas/{id}
* PUT /api/criptomoedas/{id}
* DELETE /api/criptomoedas/{id}
* GET /api/criptomoedas/converte/{moeda}/{valor}

---

## 🧠 Conceitos Aplicados

Durante o desenvolvimento deste projeto foram aplicados os seguintes conceitos:

- Arquitetura em camadas (Controller, Service, Repository)
- Injeção de Dependência (Dependency Injection)
- API RESTful
- Validações com Jakarta Bean Validation
- Tratamento global de exceções com @ControllerAdvice
- Persistência de dados com Spring Data JPA
- Mapeamento objeto-relacional (ORM)
- Uso de anotações do JPA (@Entity, @Id, @GeneratedValue)
- Boas práticas de organização de código
- Separação de responsabilidades (SRP)
