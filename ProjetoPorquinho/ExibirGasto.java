import java.util.ArrayList;

public class ExibirGasto {
    public static void exibirGasto(ArrayList<String> descricoes, ArrayList<Double> valores) {

        for (int i = 0; i < descricoes.size(); i++) {
            System.out.println((i + 1) + "- DESCRIÇÃO: " + descricoes.get(i));
            System.out.printf("VALOR: R$%.2f%n", valores.get(i));
            System.out.println("---------------------------");
            System.out.println();
        }
    }
}
