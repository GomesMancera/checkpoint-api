# 📌 Checkpoint 1 – Desenvolvimento de API REST com Spring Boot e Persistência

Projeto desenvolvido como parte do curso de Tecnologia em Desenvolvimento de Sistemas – 2º Ano. O objetivo é consolidar conhecimentos de construção de APIs RESTful com persistência de dados utilizando **Spring Boot**, **JPA**, **H2**, e boas práticas de desenvolvimento.

---

## 🧩 Tecnologias Utilizadas

- Java 17
- Spring Boot 3.4.5
- Spring Data JPA
- Spring Web
- H2 Database
- SpringDoc OpenAPI (Swagger)
- Jakarta Bean Validation

---

## 📁 Estrutura do Projeto

```
src/
├── controller/
│   ├── ClienteController.java
│   └── ProdutoController.java
├── model/
│   ├── Cliente.java
│   └── Produto.java
├── repository/
│   ├── ClienteRepository.java
│   └── ProdutoRepository.java
├── service/
│   ├── ClienteService.java
│   └── ProdutoService.java
└── application.properties
```

---

## 🔧 Endpoints Disponíveis

### 🧍 Cliente
- `GET /clientes` → Listar todos
- `GET /clientes/{id}` → Buscar por ID
- `POST /clientes` → Cadastrar novo
- `PUT /clientes/{id}` → Atualizar existente
- `DELETE /clientes/{id}` → Deletar por ID

### 📦 Produto
- `GET /produtos` → Listar todos
- `GET /produtos/{id}` → Buscar por ID
- `POST /produtos` → Cadastrar novo
- `PUT /produtos/{id}` → Atualizar existente
- `DELETE /produtos/{id}` → Deletar por ID

---

## 🗃️ Configurações do Banco

- Banco: H2 (em memória)
- Console: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
- JDBC URL: `jdbc:h2:mem:checkpointdb`
- Usuário: `sa`
- Senha: *(em branco)*

---

## 📘 Swagger

A documentação da API está disponível em:

🔗 [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

---

## ✅ Validações

As entidades utilizam validações com `@NotBlank`, `@Email`, `@Min`, `@NotNull`, etc., para garantir integridade dos dados recebidos via API.

---

## 📦 Como rodar

1. Clonar o repositório
2. Executar o projeto no IntelliJ ou via terminal com:
```bash
./mvnw spring-boot:run
```
3. Acessar o Swagger ou o H2 Console para testes

