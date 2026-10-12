import java.util.ArrayList;

public class CalculadoraFinanceira {
    public static double calculadoraFinanceira(ArrayList<Double> valores) {

        double soma = 0;
        for (double valor : valores) {
            soma += valor;
        }
        return soma;
    }
}
