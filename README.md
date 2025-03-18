# DSCommerce 🛒  

## Sistema de E-commerce Backend  

O **DSCommerce** é um projeto de backend desenvolvido para um sistema de e-commerce, criado durante o curso **Spring Boot Professional** da DevSuperior. O sistema oferece funcionalidades essenciais para gerenciamento de produtos, usuários, pedidos e autenticação, seguindo boas práticas de desenvolvimento e utilizando tecnologias modernas.  

---

## 🚀 Funcionalidades  

### 🔹 Gerenciamento de produtos  
- Cadastro, atualização, exclusão e listagem de produtos.  
- Catálogo com pesquisa dinâmica e paginação.  

### 🔹 Gerenciamento de usuários  
- Cadastro e autenticação de usuários.  
- Controle de acesso baseado em perfis (**ADMIN**, **CLIENT**).  

### 🔹 Carrinho de compras  
- Adição, remoção, atualização e listagem de itens no carrinho.  

### 🔹 Processamento de pedidos  
- Criação de pedidos com status (**WAITING_PAYMENT, PAID, SHIPPED, DELIVERED, CANCELED**).  
- Histórico de pedidos por usuário.  

### 🔹 Autenticação e autorização  
- Segurança implementada com **Spring Security**.  
- Endpoints protegidos por **roles (ADMIN, CLIENT)**.  

---

## 🛠️ Tecnologias e Ferramentas  

- **Linguagem:** Java 17  
- **Framework:** Spring Boot  
- **Persistência de dados:**  
  - Spring Data JPA  
  - PostgreSQL (produção)  
  - H2 (testes)  
- **Segurança:** Spring Security (autenticação e autorização)  
- **Gerenciamento de dependências:** Maven  
- **Versionamento:** Git  

## 🔗 Endpoints da API

### 🔑 Autenticação  
- **`POST /auth/login`** → Realiza login e retorna o token de autenticação.  

### 📂 Categorias  
- **`GET /categories`** → Lista todas as categorias.  

### 📜 Pedidos  
- **`GET /order/{id}`** → Busca um pedido por ID.  
- **`POST /order`** → Cria um novo pedido.  

### 🛍️ Produtos  
- **`GET /products/{id}`** → Busca um produto por ID.  
- **`DELETE /products/{id}`** → Remove um produto por ID (**requer perfil ADMIN**).  
- **`GET /products`** → Lista todos os produtos.  
- **`POST /products`** → Cria um novo produto (**requer perfil ADMIN**).  
- **`PUT /products/{id}`** → Atualiza um produto existente (**requer perfil ADMIN**).  

### 👤 Usuário  
- **`POST /user/logged`** → Retorna os detalhes do usuário autenticado.  


## 📂 Estrutura do Projeto  
![modelo conceitual](https://github.com/user-attachments/assets/640643dc-6453-40a2-9d89-6afcb57e28a3)


