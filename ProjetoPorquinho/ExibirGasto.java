import java.util.ArrayList;

public class ExibirGasto {
    public static void exibirGasto(ArrayList<GastoPorquinho> gastos) {

        int numero = 1;

        for (GastoPorquinho gasto : gastos) {
            System.out.println(numero + "- DESCRIÇÃO: " + gasto.getDescricao());
            System.out.printf("VALOR: R$%.2f%n", gasto.getValor());
            System.out.println("---------------------------");
            System.out.println();

            numero++;
        }
    }
}

// Antes: duas listas (descricoes e valores) ligadas pelo índice.
// Agora: uma lista de GastoPorquinho; cada objeto já tem descrição e valor.
// "gastos" é a lista (o pote); "gasto" é o item da vez a cada volta do for each.
// Lê-se: "para cada GastoPorquinho em gastos, faça...". Os dados saem pelos getters.
// O for each não tem índice, por isso o contador "numero" para numerar de 1 em diante.
