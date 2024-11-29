# SearchU

SearchU é uma aplicação web simples projetada para ajudar os usuários a pesquisar, navegar e interagir com diversos produtos. O projeto combina um frontend em React com um backend em Spring Boot, utilizando PostgreSQL como banco de dados.

---

## Tabela de Conteúdos
1. [Funcionalidades](#funcionalidades)
2. [Tecnologias Utilizadas](#tecnologias-utilizadas)
3. [Estrutura do Projeto](#estrutura-do-projeto)
4. [Instruções de Configuração](#instruções-de-configuração)
5. [Uso](#uso)
6. [Endpoints da API](#endpoints-da-api)
7. [Melhorias Futuras](#melhorias-futuras)

---

## Funcionalidades
- **Autenticação de Usuário**: Cadastro, login e gerenciamento de perfis de usuário.
- **Gestão de Produtos**: Adicionar, atualizar, excluir e buscar produtos.
- **Paginação**: Interface paginada para navegação de produtos.
- **Avaliações**: Usuários podem deixar avaliações e visualizar atividades recentes.

---

## Tecnologias Utilizadas
### Frontend
- React.js
- Axios
- React Router
- CSS (Estilos personalizados)

### Backend
- Spring Boot
- Spring Data JPA
- PostgreSQL
- REST API

---

## Estrutura do Projeto

### Backend
- **`src/main/java`**: Contém os arquivos Java para a lógica do backend.
    - `Config/`: Arquivos de configuração, incluindo CORS.
    - `Controller/`: Controladores para gerenciar requisições HTTP.
    - `Service/`: Lógica de negócios e métodos de serviço.
    - `Repository/`: Repositórios JPA para acesso ao banco de dados.
    - `Entity/`: Classes Java representando as tabelas do banco de dados.
    
### Frontend
- **`src/`**: Contém o código fonte da aplicação React.
    - `components/`: Componentes React para as páginas.
    - `styles/`: Arquivos CSS para estilização.
    - `assets/`: Imagens e outros recursos estáticos.

---

## Instruções de Configuração

### Pré-requisitos
- Java (JDK 17+)
- Node.js (v16+)
- PostgreSQL
- Maven (para as dependências do backend)

### Configuração do Backend
1. Clone o repositório:  
   ```bash
   git clone https://github.com/seuusuario/SearchU.git
