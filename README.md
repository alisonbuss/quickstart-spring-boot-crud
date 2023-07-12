
#### Translation for: **[English](https://github.com/alisonbuss/quickstart-spring-boot-crud/blob/master/README_LANG_EN.md)**.

#### Status do Projeto: *(Desenvolvimento)*.

<h3 align="center">
  <a href="https://start.spring.io/">Gerado no Spring Initializr</a><br/>
  <img src="https://raw.githubusercontent.com/alisonbuss/quickstart-spring-boot-crud/main/SpringInitializr.png" alt="SpringInitializr"/> 
</h3>

### Documentação de Referência:
Para referência adicional, considere as seguintes seções::

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.1.1/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.1.1/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#web)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#data.sql.jpa-and-spring-data)
* [Validation](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#io.validation)
* [Spring Data Redis (Access+Driver)](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#data.nosql.redis)
* [Spring for RabbitMQ](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#messaging.amqp)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#using.devtools)

### Projeto foi Inspirado:

...

### Objetivo:

Criar uma API para gestão de produtos, com os seguintes recursos:

- Recuperar um registro por código; ***(NÃO IMPLEMENTADO)***
- Listar registros, filtrando a partir de parâmetros e paginando a resposta; ***(NÃO IMPLEMENTADO)***
- Inserir e criar validação para o campo data de fabricação que não poderá ser maior ou igual a data de validade; ***(NÃO IMPLEMENTADO)***
- Editar e criar validação para o campo data de fabricação que não poderá ser maior ou igual a data de validade; ***(NÃO IMPLEMENTADO)***
- Exclusão deverá ser lógica, atualizando o campo situação com o valor Inativo; ***(NÃO IMPLEMENTADO)***

Campos do escopo do produto: ***(NÃO IMPLEMENTADO)***

- Código do produto (sequencial e não nulo);
- Descrição do produto (não nulo);
- Situação do produto (Ativo ou Inativo);
- Data de fabricação;
- Data de validade;
- Código do fornecedor;
- Descrição do fornecedor;
- CNPJ do fornecedor;

Criterio de aceite:

- Construir a Web-api em Spring Boot 3; ***(PARCIALMENTE IMPLEMENTADO)***

Diferenciais:

- Construir aplicação no padrão Stateless, sem estado. ***(IMPLEMENTADO)***
- Aplicar padrões de Logger, para observabilidade. ***(IMPLEMENTADO)***
- Containerizar serviços [Redis, RabbitMQ, PostgreSQL e pgAdmin]. ***(IMPLEMENTADO)***
- Containerizar aplicação em um Minimal JRE (Java 17). ***(IMPLEMENTADO)***
- Utilizar ORM(JPA); ***(NÃO IMPLEMENTADO)***
- Implementar mapeamento de DTOs; ***(NÃO IMPLEMENTADO)***
- Implementar testes unitários; ***(IMPLEMENTADO)***

### Dependências do Ambiente:

Todo o projeto foi criado e desenvolvido em uma máquina Linux, com as seguintes dependências:

- **[[VS Code](https://code.visualstudio.com/download)]** 1.74.0 ou superior...
- **[[Maven](https://maven.apache.org/download.cgi)]** 3.8.5 ou superior...
- **[[JDK 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)]** 17...
- **[[Docker](https://docs.docker.com/engine/docker-overview/)]** 20.10.9 ou superior...
- **[[Docker Compose](https://docs.docker.com/compose/)]** 2.7.0 ou superior...

> **Nota:**
>
> - _É necessário ter instalado as dependências citadas a cima, para que o projeto funcione._
> - _O desenvolvimento desse projeto foi feita através de um **Desktop Ubuntu 22.04.1 LTS (Jammy Jellyfish)**._


### Command-lines:

Documentação de apoio:

- **[Maven Command-line](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html)**

### Estrutura do projeto:

Descrição dos arquivos e diretórios do projeto:

```text
.
├── .vscode.........................Arquivos de configuração do VS Code
│   ├── extensions.json
│   ├── settings.json
│   └── launch.json
├── files
│   |── docs
│   |   └── ...
│   └── services....................Arquivos de suporte e configuração dos serviços Docker
│       ├── mssql
│       │   ├── postgresql-custom.conf
│       │   ├── postgresql-default-13.3.conf
│       │   └── sql-scripts
│       │       ├── 01-base.sql
│       │       ├── 02-tables.sql
│       │       ├── 03-procedures.sql
│       │       ├── 04-views.sql
│       │       └── 05-inserts.sql
│       ├── pgadmin4
│       │   └── servers.json
│       ├── rabbitmq
│       │   └── rabbitmq-3.11.conf
│       └── redis
│           ├── redis-custom.conf
│           └── redis-default-6.0.conf
├── src............................................Pasta dos códigos fontes do projeto
│   ├── ...
├── .dockerignore...................Arquivo para excluir arquivos ou diretórios desnecessários do seu contexto de build
├── .env............................Arquivo de variáveis de ambiente
├── .gitignore......................Arquivo que diz ao Git quais arquivos ou pastas ele deve ignorar em um projeto
├── docker-compose.services.yml.....Docker Compose dos serviços externos
├── docker-compose.webapi.yml.......Docker Compose da aplicação do projeto
├── Dockerfile-17...................Dockerfile da aplicação do projeto
├── LICENSE.........................Licença (MIT)
├── Makefile........................Arquivo principal de start do projeto "$ make help".
├── README_LANG_EN.md...............Arquivo de tradução do README.md.
└── README.md.......................Documentação Geral do Projeto.
```

### Serviços externos do projeto:

O projeto contém 5 serviços encapsulados em um Docker Compose, os serviços são eles:

- **[Redis](https://hub.docker.com/_/redis)**
    - Serviço: redis_server
    - Imagem: redis:6.0.5
    - Porta: 6379
    - Rede: localhost ou redis_server
    - Pass: P@ssw0rd!

- **[Redis Commander](https://hub.docker.com/r/rediscommander/redis-commander)**
    - Serviço: redis_webapp
    - Imagem: rediscommander/redis-commander:latest
    - Porta: 8081
    - Rede: localhost
    - UI Web: http://localhost:8081
        - User: admin
        - Pass: P@ssw0rd!

- **[RabbitMQ](https://hub.docker.com/_/rabbitmq)**
    - Serviço: rabbitmq_server
    - Imagem: rabbitmq:3.11-management
    - Porta: 8082 e 15672
    - Rede: localhost ou rabbitmq_server
    - UI Web: http://localhost:15672
        - User: admin
        - Pass: P@ssw0rd!

- **[PostgreSQL](https://hub.docker.com/_/postgres)**
    - Serviço: postgres_server
    - Imagem: postgres:13.3
    - Porta: 5432
    - Rede: localhost ou postgres_server
    - User: admin
    - Pass: P@ssw0rd!

- **[pgAdmin](https://hub.docker.com/r/dpage/pgadmin4)**
    - Serviço: pgadmin_server
    - Imagem: dpage/pgadmin4:7.4
    - Porta: 8083
    - Rede: localhost
    - UI Web: http://localhost:8083
        - User: admin@email.com
        - Pass: P@ssw0rd!

#### Executando o Serviços via Docker Compose:

Para rodar os serviços no Docker Compose, siga com os comandos abaixo:

```bash
# Exibir informações gerais do ambiente Docker.
$ docker image ls && docker network ls && docker volume ls && docker container ls;

# Valide e visualize o arquivo de composição.
$ docker-compose --file ./docker-compose.services.yml config;

# Criar ou reconstruir serviços e construa imagens em paralelo.
$ docker-compose --file ./docker-compose.services.yml build --parallel;

# Criar ou reconstruir serviços no modo desanexado.
$ docker-compose --file ./docker-compose.services.yml up --detach;

# Lista todos os containers do Compose.
$ docker-compose --file ./docker-compose.services.yml ps;
```

Para destruir todos os serviços, network, volumes e imagens:

```bash
# Parar e remover contêineres, redes, imagens e volumes.
$ docker-compose --file ./docker-compose.services.yml down;
$ docker-compose --file ./docker-compose.services.yml rm -f;

# DANDO UMA LIMPADA NO AMBIENTE:
# Esse comando remove todos os contêineres parados, redes não utilizadas, imagens pendentes e caches de compilação...
# É o satanais!!!
$ docker system prune -a;

## OU...
$ docker stop $(docker ps -a -q) && docker rm $(docker ps -a -q) && docker rmi $(docker images -q);
```

### Executando o projeto:

#### Executando via Maven Command-line:

Para executar o projeto, siga com os comandos abaixo:

Documentação de apoio:

- **[Maven Command-line](https://www.digitalocean.com/community/tutorials/maven-commands-options-cheat-sheet)**

```bash
# Restaura as dependências e as ferramentas de um projeto.
$ mvn dependency:treen;

# Compila um projeto e todas as suas dependências.
$ mvn compiler:compile;

# Publica o aplicativo e suas dependências em uma pasta para implantação.
$ mvn package;

# Executa aplicação.
$ mvn package && java -jar target/quickstart-spring-boot-crud-0.0.1-SNAPSHOT.jar;

# OU:

$ ./mvnw spring-boot:run
```

Aplicando o Migrations, siga com os comandos abaixo:

Documentação de apoio:

- **[Migrations Overview](https://...)**

```bash
# Aplica as atualizações o banco de dados para a última migração ou para uma migração especificada.
$ ...
```

#### Executando via Docker Compose:

Para rodar a aplicação no Docker Compose, siga com os comandos abaixo:

```bash
# Exibir informações gerais do ambiente Docker.
$ docker image ls && docker network ls && docker volume ls && docker container ls;

# Valide e visualize o arquivo de composição.
$ docker-compose --file ./docker-compose.app.yml config;

# Criar ou reconstruir serviços e construa imagens em paralelo.
$ docker-compose --file ./docker-compose.app.yml build --parallel;

# Criar ou reconstruir serviços no modo desanexado.
$ docker-compose --file ./docker-compose.app.yml up --detach;

# Lista todos os containers do Compose.
$ docker-compose --file ./docker-compose.app.yml ps;
```

Para destruir toda a aplicação, network, volumes e imagens:

```bash
# Parar e remover contêineres, redes, imagens e volumes.
$ docker-compose --file ./docker-compose.app.yml down;
$ docker-compose --file ./docker-compose.app.yml rm -f;

# DANDO UMA LIMPADA NO AMBIENTE:
# Esse comando remove todos os contêineres parados, redes não utilizadas, imagens pendentes e caches de compilação...
# É o satanais!!!
$ docker system prune -a;

## OU...
$ docker stop $(docker ps -a -q) && docker rm $(docker ps -a -q) && docker rmi $(docker images -q);
```

### Referências:

- Documentação oficial. **...** <br/>
  Disponível: _[https://...](https://...)_


## Licença:

[<img width="190" src="https://raw.githubusercontent.com/alisonbuss/my-files/master/files/images/logo-open-source-550x200px.png">](https://opensource.org/licenses)
[<img width="166" src="https://raw.githubusercontent.com/alisonbuss/my-files/master/files/images/icon-license-mit-500px.png">](https://github.com/alisonbuss/DesafioAutoglass/blob/master/LICENSE)







<!-- 




https://www.digitalocean.com/community/tutorials/maven-commands-options-cheat-sheet

https://jenkov.com/tutorials/maven/maven-commands.html

The following command takes your compiled code and packages it into a distributable format, like a JAR:

./mvnw package

./mvnw package && java -jar target/gs-spring-boot-docker-0.1.0.jar

./mvnw spring-boot:run


https://www.zup.com.br/blog/java-17

Java 17 - Sealed Class - Novidades - Programação Iniciante
https://www.youtube.com/watch?v=5dvPweJ7xAg

Java 17 - A nova versão LTS
https://www.youtube.com/watch?v=2jEm41nGvuk

COMO INSTALAR JAVA JDK 17 E SETAR AS VARIÁVEIS DE AMBIENTE AUTOMATICAMENTE
https://www.youtube.com/watch?v=WwTWc_cM94Y

Spring Logging no Microservice de Email
https://www.youtube.com/watch?v=tCErZHxaTxg

https://sdkman.io/
https://dev.to/fialhorenato/how-to-create-slim-docker-java-images-using-a-minimal-jre-3a20
https://www.renatofialho.com/blog/creating-slim-spring-boot-images
https://hub.docker.com/r/bitnami/minideb
https://www.pgadmin.org/docs/pgadmin4/latest/config_py.html#config-py

https://springdoc.org/#Introduction
https://www.appsdeveloperblog.com/document-spring-rest-api-with-openapi-3swagger/
 -->
