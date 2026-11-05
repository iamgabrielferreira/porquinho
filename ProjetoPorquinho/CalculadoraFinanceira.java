import java.util.ArrayList;

public class CalculadoraFinanceira {
    public static double calculadoraFinanceira(ArrayList<GastoPorquinho> gastos) {

        double soma = 0;
        for (GastoPorquinho gasto : gastos) {
            soma += gasto.getValor();
        }
        return soma;
    }

    public static double calculadoraValores(ArrayList<Double> valores) {

        double soma = 0;
        for (double valor : valores) {
            soma += valor;
        }
        return soma;
    }
}

/**
 * CalculadoraFinanceira
 *
 * Responsável pelos cálculos de totais do Porquinho.
 * Possui dois métodos, porque as duas listas guardam tipos diferentes de dado:
 * uma de GastoPorquinho (gastos) e outra de números (valores guardados).
 *
 * calculadoraFinanceira(ArrayList<GastoPorquinho> gastos)
 *   - Soma o valor de cada gasto da lista, lendo cada um com getValor().
 *   - Retorna o total gasto.
 *
 * calculadoraValores(ArrayList<Double> valores)
 *   - Soma os números da lista de valores colocados no Porquinho.
 *   - Retorna o total guardado.
 */
