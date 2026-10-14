# 🐷 Banco de dados do Porquinho

Aqui mora o banco onde o Porquinho guarda tudo: usuários, dinheiro guardado e gastos.

Para a história completa do projeto, o roadmap e os conceitos aprendidos, veja o [README da raiz](../README.md).

## Como criar o banco

1. Abra o MySQL Workbench conectado ao MariaDB/MySQL.
2. Abra o arquivo `schema.sql` desta pasta.
3. Execute o script inteiro. Ele cria o banco `porquinho` e as três tabelas.

> ⚠️ O script começa com `CREATE DATABASE porquinho;`, então dá erro se o banco já existir.

## Tabelas

| Tabela | O que guarda |
|---|---|
| `usuario` | Cadastro: nome, telefone, e-mail e hash da senha |
| `deposito` | Cada valor guardado no porquinho |
| `gasto` | Cada gasto cadastrado, com descrição e valor |

## Como elas se relacionam

```
usuario
└── deposito
└── gasto
````

Um usuário tem vários depósitos e vários gastos. Se o usuário for apagado, os depósitos e gastos dele também são (`ON DELETE CASCADE`).

## Resumo financeiro

O resumo não tem tabela própria: é calculado na hora.

restante = soma dos depósitos − soma dos gastos

## Tecnologias

- MariaDB 10.4 / MySQL
- Testado pelo MySQL Workbench
