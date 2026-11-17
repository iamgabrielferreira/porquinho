public class CalculadoraFinanceira {
    public static double calculadoraFinanceira(Porquinho porquinho) {

        double soma = 0;
        for (GastoPorquinho gasto : porquinho.getGastos()) {
            soma += gasto.getValor();
        }
        return soma;
    }

    public static double calculadoraValores(Porquinho porquinho) {

        double soma = 0;
        for (double valor : porquinho.getValoresAlimentados()) {
            soma += valor;
        }
        return soma;
    }
}

/**
 * CalculadoraFinanceira
 *
 * Responsável pelos cálculos dos totais financeiros do Porquinho.
 *
 * Recebe o objeto Porquinho como parâmetro para acessar as listas
 * por meio dos métodos getters.
 *
 * Possui dois métodos, pois as listas armazenam tipos diferentes de dados:
 * uma contém objetos GastoPorquinho e a outra contém valores Double.
 *
 * calculadoraFinanceira(Porquinho porquinho)
 *   - Percorre a cópia da lista de gastos retornada por getGastos().
 *   - A cada iteração, acessa o valor do gasto por meio de getValor().
 *   - Soma todos os gastos e retorna o total gasto.
 *
 * calculadoraValores(Porquinho porquinho)
 *   - Percorre a cópia da lista de valores retornada por getValoresAlimentados().
 *   - Soma cada valor armazenado no Porquinho.
 *   - Retorna o total de valores alimentados.
 */