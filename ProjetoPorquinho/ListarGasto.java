import java.util.ArrayList;

public class ListarGasto {
    public static void listarGasto(ArrayList<String> descricoes, ArrayList<Double> valores) {

        System.out.println("=== LISTAR GASTOS ===");
        System.out.println();

        if (descricoes.isEmpty()) {
            System.out.println("Não há gastos cadastrados. \nParabéns!");
            System.out.println();
        }

        for (int l = 0; l <  descricoes.size(); l++) {
            System.out.println("DESCRIÇÕES: " + descricoes.get(l));
            System.out.printf("VALORES: R$%.2f%n", valores.get(l));
            System.out.println("---------------------------");
            System.out.println();
        }
    }
}