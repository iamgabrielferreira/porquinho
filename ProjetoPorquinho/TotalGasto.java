import java.util.ArrayList;

public class TotalGasto {
    public static void totalGasto(ArrayList<Double> valores) {

        System.out.println("== CALCULAR TOTAL GASTO ==");
        System.out.println();

        double soma = 0;

        if (valores.isEmpty()) {
            System.out.println("Nenhum gasto cadastrado. \nParabéns! Tudo em dia.");
            System.out.println();
            return;
        }
        else {
            for (int t = 0; t < valores.size(); t++) {
                soma += valores.get(t);

            }
        }
        System.out.printf("GASTO TOTAL: R$%.2f%n", soma);
        System.out.println();
    }
}
