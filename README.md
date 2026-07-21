# 💼 Staff Core

Sistema de Gestão de Recursos Humanos (RH) desenvolvido com **Java + Spring Boot**, com o objetivo de centralizar e facilitar o gerenciamento de colaboradores, departamentos e processos internos de uma empresa.

---

## 📋 Sobre o Projeto

O **Staff Core** é uma aplicação de Recursos Humanos desenvolvida para auxiliar empresas na organização e administração de informações dos seus colaboradores.

O sistema permite o cadastro, consulta, atualização e remoção de registros, proporcionando uma gestão mais eficiente e segura dos dados.

Entre as funcionalidades estão o gerenciamento de funcionários, contratos, departamentos e demais informações essenciais para o setor de RH.

---

## 🎯 Objetivos

- Centralizar informações dos colaboradores;
- Facilitar o gerenciamento de dados pelo setor de RH;
- Automatizar processos administrativos;
- Garantir organização e segurança das informações;
- Disponibilizar uma API REST para integração com outras aplicações.

---

## 🚀 Tecnologias Utilizadas

| Tecnologia | Descrição |
|------------|-----------|
| ☕ Java | Linguagem de programação |
| 🌱 Spring Boot | Framework principal |
| 🗄️ Spring Data JPA | Persistência de dados |
| 🔥 Hibernate | ORM |
| 🐬 MySQL | Banco de dados |
| 🌐 Tomcat | Servidor de aplicação |
| 📦 Maven | Gerenciador de dependências |
| 🔧 Git | Controle de versão |
| 🐙 GitHub | Hospedagem do projeto |

---


## 🏛️ Arquitetura

O projeto segue o padrão de arquitetura em camadas:

```text
Controller
     ↓
Repository
     ↓
Banco de Dados (MySQL)
     ↓
   Model
```

---

# 📊 Banco de Dados

**db_staffcore**


Nosso banco de dados tem sido feito através do SGBD MySQL. 

A seguir temos a nossa tabela de colaboradores, com os tipos de dados utilizados e algumas validações:


---

## 📌 Tabela: tb_colaborador

| Atributo | Tipo | Descrição |
|----------|------|-----------|
| id | BIGINT | Identificador único do colaborador |
| matricula | VARCHAR(10) | Matrícula interna |
| nomeCompleto | VARCHAR(255) | Nome completo |
| dataNascimento | DATE | Data de nascimento |
| cpf | VARCHAR(11) | CPF do colaborador |
| email | VARCHAR(100) | Email corporativo ou pessoal |
| dataAdmissao | DATE | Data de contratação |
| dataDemissao | DATE | Data de desligamento (opcional) |
| tipoContrato | VARCHAR(25) | CLT, PJ, Estágio, Jovem Aprendiz, etc. |

---

## 📈 Diagrama Entidade-Relacionamento


![Tabela Colaborador](https://raw.githubusercontent.com/Projetos-Generation/Docs/main/tabelaColaborador.png)


---

## 📂 Estrutura do Projeto

```text
src
├── model
├── repository
├── controller
```

---

## ⚙️ Como executar o projeto

### Clone o repositório

```bash
git clone https://github.com/Projetos-Generation/StaffCore.git
```

### Entre na pasta

```bash
cd staff-core
```

### Configure o banco de dados

Crie um banco chamado:

```text
db_staffcore
```

Configure o arquivo:

```text
application.properties
```

Exemplo:

```properties
spring.datasource.url=jdbc:mysql://localhost:8080/colaborador
spring.datasource.username=root
spring.datasource.password=root1234

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## ▶️ Executando

Execute a classe principal do Spring Boot:

```text
StaffCoreApplication.java
```

Ou pelo Maven:

```bash
mvn spring-boot:run
```

---

## 📌 Funcionalidades

- Cadastro de colaboradores
- Consulta de colaboradores
- Atualização de dados
- Exclusão de colaboradores
- Gerenciamento de contratos
- Integração com banco de dados MySQL
- API REST

---

## 🛠️ Futuras Implementações

### 📅 Automação
- Aviso de vencimento de contratos
- Lembrete de férias
- Alertas de aniversários
- Renovação de documentos
- Aprovação de solicitações por fluxo



### 📱 Aplicativo para Colaboradores
- Solicitar férias
- Visualizar holerite
- Registrar ponto
- Atualizar dados cadastrais
- Acompanhar benefícios

- Integração com e-mail

---

## 👥 Equipe

O **Staff Core** foi desenvolvido pela equipe **OctaDev**, formada por estudantes do Bootcamp Java Full Stack da Generation Brasil, com foco na aplicação de boas práticas de desenvolvimento de software, metodologias ágeis e construção de APIs REST utilizando Java e Spring Boot.

### Desenvolvedores

- Felipe Oliveira Lopes 
- Gabriel José Alegre 
- Giovanna Karolline Menezes Ribeiro 
- Guilherme Oliveira 
- João Vitor Diniz Alves 
- Juliana Macedo 
- Maryane Praxedes Alves da Silva 
- Thiago José Nascimento Versiani

---

## 📄 Licença

Este projeto possui finalidade acadêmica e de aprendizado.

