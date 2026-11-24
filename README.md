# 🐷 Porquinho de Economia

Projeto de estudo em Java, criado logo após concluir o curso de Java para iniciantes do **Gustavo Guanabara** (Curso em Vídeo).

A ideia é simples: um sistema de controle financeiro via terminal que **cresce junto com meu aprendizado**. Cada nova versão introduz um conceito novo de Java — do básico até Spring Boot e API REST.

> Este repositório também serve como diário técnico da minha evolução como desenvolvedor. Cada commit representa um passo aprendido na prática.

---

## 🚀 Status atual: v0.3 — Programação Orientada a Objetos (em andamento)

| Funcionalidade | Status |
|---|---|
| Menu principal | ✅ |
| Alimentar Porquinho (depósitos com data e hora) | ✅ |
| Cofre de Valores (lista de depósitos e total guardado) | ✅ |
| Cadastro de Gastos (com categoria) | ✅ |
| Listar Gastos | ✅ |
| Excluir Gasto | ✅ |
| Resumo Financeiro (guardado, gasto e saldo) | ✅ |
| Leitura e validação de dados do usuário | ✅ |
| Classe `Usuario` | 🔄 |

---

## 🗺️ Roadmap de evolução

```
v0.1  Java básico + Collections  → menu, cadastro/listagem de gastos ✅
v0.2  Melhor organização         → métodos, validações, refino de Collections ✅
v0.3  POO                        → transformar o projeto em classes e objetos 🔄
v0.4  Exceptions + regras        → tratamento de erros e regras de negócio robustas
v0.5  Banco de dados             → MySQL/PostgreSQL (schema do PostgreSQL já versionado)
v0.6  JDBC                       → Connection, PreparedStatement, ResultSet
v0.7  DAO                        → separação de responsabilidades
v0.8  JUnit                      → testes automatizados
v1.0  Spring Boot + API REST     → projeto vira um backend completo
```

### Progresso da v0.3 (POO)

- [x] Classe `GastoPorquinho` com encapsulamento e validação nos setters
- [x] Classe `Porquinho` guardando as listas e calculando os totais (`getTotalGasto`, `getTotalGuardado`, `getSaldo`)
- [x] `enum Categoria` no lugar do array de textos
- [x] Classe `Deposito` (valor + data) no lugar de `Double` solto
- [x] `FormatadorData` para formatar datas em um só lugar
- [ ] Classe `Usuario` (um usuário tem um Porquinho)

---

## 🧠 Conceitos já aplicados

- `Scanner` (instância única compartilhada entre métodos)
- Estruturas de repetição (`while`, `do-while`, `for`)
- `switch` para controle de menu
- Tratamento de exceções (`try/catch`, `InputMismatchException`)
- `ArrayList` e generics (`ArrayList<GastoPorquinho>`, `ArrayList<Deposito>`)
- Percorrer listas com `for each` e por índice
- Passagem de parâmetros e coleções por referência entre métodos
- Validação de entrada do usuário
- **Classes e objetos**, construtores e `this`
- **Encapsulamento**: atributos `private`, getters e setters que validam antes de atribuir
- `IllegalArgumentException` lançada pelos setters
- Cópia imutável de lista com `List.copyOf` nos getters
- **`enum`** com atributo e construtor (`Categoria`) e uso do `values()`
- `LocalDateTime` e `DateTimeFormatter`
- Refatoração: cálculos movidos da classe de apoio para dentro do `Porquinho`
- Constantes (`static final`) no menu

---

## 🛠️ Como rodar

```bash
cd ProjetoPorquinho
javac *.java
java Menu
```

---

## 📁 Estrutura do projeto

```
PorquinhoFinanceiro/
├── ProjetoPorquinho/
│   ├── Menu.java
│   ├── AlimentarPorquinho.java
│   ├── CofreDeValores.java
│   ├── CadastroGastos.java
│   ├── ListarGasto.java
│   ├── ExibirGasto.java
│   ├── ExcluirGasto.java
│   ├── ResumoFinanceiro.java
│   ├── LeituraDadosUsuario.java
│   ├── FormatadorData.java
│   ├── Categoria.java
│   ├── GastoPorquinho.java
│   ├── Deposito.java
│   └── Porquinho.java
└── database/
    ├── README.md
    └── PostgreSQL/
        ├── schema/
        │   ├── 01_usuarios.sql
        │   ├── 02_depositos.sql
        │   └── 03_gasto.sql
        └── seeds/
            └── dados_ficticios.sql
```

---

## 💡 Sobre o projeto

Esse projeto **não busca ser perfeito ou "enterprise"** — ele reflete exatamente o nível de conhecimento que eu tenho em cada etapa. A cada nova fase, o código é revisado e evoluído com um propósito: aprender por necessidade, não por modismo.

Feedbacks e sugestões são sempre bem-vindos!

---

## ⚙️ Ferramentas

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Git](https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white)

---

## 📬 Contato

Acompanhe a evolução também no [LinkedIn](COLOQUE_AQUI_O_LINK_DO_SEU_LINKEDIN) — vou postar as atualizações conforme o projeto avançar.
