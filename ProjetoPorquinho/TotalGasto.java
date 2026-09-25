import java.util.ArrayList;

public class TotalGasto {
    public static void totalGasto(ArrayList<Double> valores, ArrayList<Double> valorReceita) {

        System.out.println("== CALCULAR TOTAL GASTO ==");
        System.out.println();

        double somaGastos = 0;
        double valorGuardado = 0;

        if (valores.isEmpty()) {
            System.out.println("Nenhum gasto cadastrado. \nParabéns! O Porquinho está feliz e seu dinheiro está seguro.");
            System.out.println();
            return;
        }
        else {
            for (int t = 0; t < valores.size(); t++) {
                somaGastos += valores.get(t);

            }

            for (int r = 0; r < valorReceita.size(); r++) {
                valorGuardado += valorReceita.get(r);
            }
        }

        double sobraValor = valorGuardado - somaGastos;
        if (sobraValor < 0) {
            System.out.println("ATENÇÃO! O seu Porquinho está no vermelho! \nO valor dos gastos ultrapassou o saldo disponível.");
            System.out.printf("É necessário repor R$%.2f para ficar em dia.%n", Math.abs(sobraValor));
            System.out.println();
        }

        System.out.printf("GASTO TOTAL: R$%.2f%n", somaGastos);
        System.out.printf("SALDO NO PORQUINHO: R$%.2f%n", valorGuardado);
        System.out.printf("VALOR RESTANTE: R$ %.2f%n", sobraValor);
        System.out.println();
    }
}
