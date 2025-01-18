# Biblioteca da Bru em Java

Este é um projeto em Java para gerenciar uma biblioteca simples. A aplicação permite o cadastro, atualização, exclusão e exibição de livros armazenados em um banco de dados MySQL.

## Funcionalidades

A aplicação permite as seguintes funcionalidades:

- **Adicionar um livro**: Você pode adicionar um novo livro, informando o título, autor, gênero e ano de publicação.
- **Listar livros**: Exibe a lista de todos os livros cadastrados.
- **Atualizar livro**: Permite alterar as informações de um livro existente.
- **Excluir livro**: Remove um livro da lista com base no ID fornecido.

## Tecnologias utilizadas

- **Java**: A linguagem de programação utilizada.
- **MySQL**: Banco de dados utilizado para armazenar os livros.
- **JDBC**: Para a conexão entre a aplicação Java e o banco de dados.

## Como rodar o projeto

### Pré-requisitos

Certifique-se de que você tem o seguinte instalado em sua máquina:

- [Java 8 ou superior](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html)
- [MySQL](https://www.mysql.com/)
- [IntelliJ IDEA](https://www.jetbrains.com/idea/) (ou qualquer outra IDE de sua preferência)

### Passos para rodar

1. **Configuração do banco de dados**:
   - Crie um banco de dados no MySQL chamado `biblioteca` (ou qualquer outro nome de sua preferência).
   - Execute o script SQL para criar a tabela de livros no banco de dados:

   ```sql
   CREATE TABLE livros (
     id INT NOT NULL AUTO_INCREMENT,
     titulo VARCHAR(100) NOT NULL,
     autor VARCHAR(100) NOT NULL,
     genero VARCHAR(50) NOT NULL,
     ano INT DEFAULT NULL,
     PRIMARY KEY (id)
   ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

## Configuração do projeto:

No arquivo Conexao.java, altere as configurações de conexão (usuário, senha, URL) conforme o seu ambiente de banco de dados.
Rodando a aplicação:
Abra o projeto na sua IDE (como o IntelliJ IDEA).
Execute a classe Menu.java para iniciar o menu interativo e interagir com a aplicação.

## Contribuições

Se você deseja contribuir com melhorias ou correções, fique à vontade para abrir uma issue ou submeter um pull request.
