import java.util.ArrayList;

public class ResumoFinanceiro {
    public static void resumoFinanceiro(ArrayList<GastoPorquinho> gastos, ArrayList<Double> valores) {

        System.out.println("=== CALCULAR TOTAL GASTO ===");
        System.out.println();

        if (gastos.isEmpty()) {
            System.out.println("Nenhum gasto cadastrado. \nParabéns! O Porquinho está feliz e seu dinheiro está seguro.");
            System.out.println();
            return;
        }

        double somaGastos = CalculadoraFinanceira.calculadoraFinanceira(gastos);
        double valorGuardado = CalculadoraFinanceira.calculadoraValores(valores);
        double sobraValor =  valorGuardado - somaGastos;

        if (sobraValor < 0) {

            System.out.println("ATENÇÃO! O seu Porquinho está no vermelho! \nO valor dos gastos ultrapassou o saldo disponível.");
            System.out.printf("É necessário repor R$%.2f para ficar em dia.%n", Math.abs(sobraValor));
            System.out.println();
        }

        System.out.printf("TOTAL GUARDADO: R$%.2f%n", valorGuardado);
        System.out.printf("GASTO TOTAL: R$%.2f%n", somaGastos);
        System.out.printf("VALOR RESTANTE: R$ %.2f%n", sobraValor);
        System.out.println();
    }
}