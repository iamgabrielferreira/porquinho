public class ListarGasto {
    public static void listarGasto(Porquinho porquinho) {

        System.out.println("=== LISTAR GASTOS ===");
        System.out.println();

        if (porquinho.getGastos().isEmpty()) {
            System.out.println("Seu Porquinho não encontrou nenhum gasto cadastrado. \nParabéns! Seu dinheiro está sendo bem cuidado.");
            System.out.println();
            return;
        }

        ExibirGasto.exibirGasto(porquinho);

    }
}