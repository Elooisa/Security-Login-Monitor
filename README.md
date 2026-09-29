# Security Login Monitor

Projeto desenvolvido em Java durante meus estudos de programação e Cybersecurity.

## Objetivo

Criar um sistema simples de login para praticar conceitos de Java e começar a trabalhar com o registro de eventos de acesso.

## O que o projeto faz

* Verifica usuário e senha
* Permite até 3 tentativas de login
* Bloqueia o acesso após as tentativas serem esgotadas
* Informa quando o login foi permitido ou negado
* Registra os eventos de login

## Tecnologias

* Java
* Git
* GitHub

## Conceitos que estou praticando

* Variáveis
* String
* Scanner
* if/else
* while
* for
* ArrayList
* Contadores
* Comparação de Strings
* break

## Relação com Cybersecurity

A ideia do projeto é simular uma parte simples de um sistema de autenticação.

Além de verificar o login, estou começando a registrar as tentativas de acesso. Esse registro pode ser usado posteriormente para analisar comportamentos e identificar tentativas suspeitas.

## Próximos passos

* Registrar o usuário em cada evento
* Adicionar data e hora aos eventos
* Melhorar a forma como os eventos são armazenados
* Organizar melhor o código
* Continuar evoluindo o projeto para um monitor de eventos de segurança

## Como executar

Clone o repositório:

```bash
git clone https://github.com/Elooisa/Security-Login-Monitor.git
```

Entre na pasta do projeto:

```bash
cd Security-Login-Monitor
```

Compile o programa:

```bash
javac SecurityLoginMonitor.java
```

Execute:

```bash
java SecurityLoginMonitor
```
