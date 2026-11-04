import java.util.ArrayList;

public class ListarGasto {
    public static void listarGasto(ArrayList<GastoPorquinho> gastos) {

        System.out.println("=== LISTAR GASTOS ===");
        System.out.println();

        if (gastos.isEmpty()) {
            System.out.println("Seu Porquinho não encontrou nenhum gasto cadastrado. \nParabéns! Seu dinheiro está sendo bem cuidado.");
            System.out.println();
            return;
        }

        ExibirGasto.exibirGasto(gastos);

    }
}