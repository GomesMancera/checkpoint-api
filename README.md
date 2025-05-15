# 📌 Checkpoint 1 – Desenvolvimento de API REST com Spring Boot e Persistência

Projeto desenvolvido como parte do curso de **Tecnologia em Desenvolvimento de Sistemas – 2º Ano**.  
O objetivo é consolidar conhecimentos de construção de APIs RESTful com persistência de dados utilizando **Spring Boot**, **JPA**, **H2**, e boas práticas de desenvolvimento.

---

## 🧩 Tecnologias Utilizadas

- ✅ Java 17
- ✅ Spring Boot 3.4.5
- ✅ Spring Web
- ✅ Spring Data JPA
- ✅ H2 Database (memória)
- ✅ Jakarta Bean Validation
- ✅ SpringDoc OpenAPI (Swagger)

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

| Método | Endpoint              | Descrição               |
|--------|------------------------|--------------------------|
| GET    | `/clientes`            | Listar todos os clientes |
| GET    | `/clientes/{id}`       | Buscar cliente por ID    |
| POST   | `/clientes`            | Cadastrar novo cliente   |
| PUT    | `/clientes/{id}`       | Atualizar cliente        |
| DELETE | `/clientes/{id}`       | Remover cliente por ID   |

#### 📝 Exemplo de requisição `POST /clientes`
```json
{
  "nome": "João Silva",
  "email": "joao@email.com",
  "telefone": "11999999999"
}
```

---

### 📦 Produto

| Método | Endpoint              | Descrição               |
|--------|------------------------|--------------------------|
| GET    | `/produtos`            | Listar todos os produtos |
| GET    | `/produtos/{id}`       | Buscar produto por ID    |
| POST   | `/produtos`            | Cadastrar novo produto   |
| PUT    | `/produtos/{id}`       | Atualizar produto        |
| DELETE | `/produtos/{id}`       | Remover produto por ID   |

#### 📝 Exemplo de requisição `POST /produtos`
```json
{
  "nome": "Notebook Dell",
  "descricao": "Intel i7, 16GB RAM, SSD",
  "preco": 4599.90
}
```

> 💡 Ajuste os campos conforme definidos na sua classe `Produto`.

---

## 🗃️ Configurações do Banco de Dados

- **Banco:** H2 (memória)
- **Console H2:** [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
- **JDBC URL:** `jdbc:h2:mem:checkpointdb`
- **Usuário:** `sa`
- **Senha:** *(em branco)*

---

## 📘 Swagger – Documentação da API

Acesse a interface interativa para testar os endpoints:  
🔗 [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

---

## ✅ Validações

As entidades contam com validações para garantir integridade dos dados recebidos:

- `@NotBlank` → campos obrigatórios (ex: nome, email, telefone)
- `@Email` → valida formato de email
- `@Min`, `@NotNull` → usados conforme necessidade na entidade `Produto`

---

## ▶️ Como Executar

1. Clone este repositório
2. Execute o projeto via terminal ou IDE:

```bash
./mvnw spring-boot:run
```

3. Acesse:
    - Swagger UI: [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)
    - H2 Console: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)

---
