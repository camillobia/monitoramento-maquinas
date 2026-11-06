# Sistema de Monitoramento de Máquinas

Projeto desenvolvido para a Aula 11 de Desenvolvimento Backend do SENAI, simulando um sistema de monitoramento de máquinas industriais para a CloudTech Solutions.

## Tecnologias utilizadas

- Java
- Spring Boot
- Maven
- Git e GitHub
- Thunder Client

## Funcionalidades

- Cadastro de máquinas industriais.
- Listagem de máquinas cadastradas.
- Registro de dados de produção.
- Consulta de dados de produção.
- Verificação do status da aplicação.
- Consulta da versão do sistema.

## Endpoints

| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | / | Mensagem inicial |
| GET | /status | Status da aplicação |
| GET | /versao | Versão do sistema |
| POST | /maquinas/cadastro | Cadastrar máquina |
| GET | /maquinas | Listar máquinas |
| POST | /producao | Registrar produção |
| GET | /producao | Consultar produção |

## Como executar

1. Clone o repositório.
2. Entre na pasta do projeto.
3. Execute o comando:

No Windows:

```powershell
.\mvnw.cmd spring-boot:run