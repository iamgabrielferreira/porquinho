# 🐷 Oink oink!

Você chegou dentro da pasta onde o Porquinho realmente vive.

Aqui é onde a mágica (e os `try/catch`) acontece — se procura a história completa do projeto, o roadmap e os conceitos aprendidos, dá uma olhada no [README lá da raiz do repositório](../README.md).

Por aqui você vai encontrar:

### 🧱 Os dados (classes do Porquinho)

```
📄 Porquinho.java      -> guarda as listas de gastos e depósitos e calcula totais e saldo
📄 GastoPorquinho.java -> um gasto: descrição, valor, categoria e data (com validação nos setters)
📄 Deposito.java       -> um depósito: valor e data
📄 Categoria.java      -> enum com a lista fixa de categorias de gasto
```

### 🖥️ As telas

```
📄 Menu.java                -> o cérebro do sistema (menu principal)
📄 AlimentarPorquinho.java  -> onde você guarda dinheiro no porquinho
📄 CofreDeValores.java      -> lista os depósitos, com data, e o total guardado
📄 CadastroGastos.java      -> onde os gastos são cadastrados (com categoria)
📄 ListarGasto.java         -> onde todos os gastos são listados
📄 ExcluirGasto.java        -> onde exclui gastos
📄 ResumoFinanceiro.java    -> mostra guardado, gasto e saldo
```

### 🧰 Os ajudantes

```
📄 ExibirGasto.java          -> exibe a lista numerada de gastos
📄 LeituraDadosUsuario.java  -> leitura e validação do que o usuário digita
📄 FormatadorData.java       -> formata datas no padrão dd/MM/yyyy HH:mm
```

Sinta-se em casa, mas cuidado pra não deixar o porquinho no vermelho. 🐽
