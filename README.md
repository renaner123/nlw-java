# API de Gerenciamento de Eventos

Este projeto consiste em uma API RESTful desenvolvida em Java 17 com Spring Boot, focada no gerenciamento de eventos e inscrições. A API permite a criação, listagem e gerenciamento de eventos, além de um sistema de indicações e ranking de usuários.

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3**
- **Maven**
- **Banco de Dados MySQL**
- **Docker**
- **Swagger para documentação da API**

## Funcionalidades

### Gerenciamento de Eventos
- Criar novos eventos
- Listar todos os eventos
- Buscar evento por identificador

### Inscrições
- Criar inscrição para um evento
- Criar inscrição associada a um usuário

### Indicações e Ranking
- Permitir que um usuário indique outro
- Gerar ranking de usuários que mais realizaram indicações

## Endpoints

```
POST /events
```
Cria um novo evento.

```
GET /events
```
Retorna todos os eventos cadastrados.

```
GET /events/{prettyName}
```
Busca um evento pelo identificador amigável.

```
POST /subscription/{prettyName}
```
Cria uma inscrição para um evento.

```
POST /subscription/{prettyName}/{userId}
```
Cria uma inscrição associada a um usuário específico.

```
GET /subscription/{prettyName}/ranking
```
Gera o ranking de usuários que mais indicaram pessoas para o evento.

```
GET /subscription/{prettyName}/ranking/{userId}
```
Retorna a posição de um usuário no ranking de indicações.

## Documentação da API

A documentação da API foi gerada utilizando Swagger e pode ser acessada localmente após a execução do projeto:

[http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## Como Executar

1. Clone o repositório e acesse a pasta do projeto
2. Execute o comando `mvn clean install` para baixar as dependências e gerar o arquivo JAR
3. Execute o comando `docker-compose -d up` para subir o banco de dados MySQL
4. Execute o comando `java -jar target/events-0.0.1-SNAPSHOT.jar` para iniciar a aplicação
5. Acesse a documentação no Swagger para testar os endpoints
---

