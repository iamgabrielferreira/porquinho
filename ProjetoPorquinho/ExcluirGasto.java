import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcluirGasto {
    public static void excluirGasto(ArrayList<String> descricoes, ArrayList<Double> valores, Scanner scanner) {

        System.out.println("== EXCLUIR GASTOS ==");
        System.out.println();

        if (descricoes.isEmpty()) {
            System.out.println("Não há gastos cadastrados para excluir.");
            System.out.println();
            return;

        }

        for (int i = 0; i < descricoes.size(); i++) {
            System.out.println((i + 1) + " - " + descricoes.get(i) + " R$" + valores.get(i));
        }

        int numero = 0;

        while (numero <= 0 || numero > descricoes.size()) {
            try {
                System.out.print("Digite o número do gasto que deseja excluir: ");
                numero = scanner.nextInt();
                scanner.nextLine();
                System.out.println();

                if (numero <= 0 || numero > descricoes.size()) { // Feedback para o user
                    System.out.println("Número inválido. Informe um número maior que 0, seguindo a tabela de gastos disponível.");
                    System.out.println();
                }

            } catch (InputMismatchException e) {
                System.out.println("Digite apenas números. Não é aceito letras.");
                System.out.println();
                scanner.nextLine();
            }
        }

        numero -= 1;

        String descricaoExcluida = descricoes.get(numero);
        double valoresExcluido = valores.get(numero);

        descricoes.remove(numero);
        valores.remove(numero);

        System.out.println("GASTO EXCLUÍDO COM SUCESSO!");
        System.out.println("DESCRIÇÕES: " + descricaoExcluida);
        System.out.printf("VALOR: R$%.2f%n", valoresExcluido);
        System.out.println();
    }
}
