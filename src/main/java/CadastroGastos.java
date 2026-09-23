import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CadastroGastos {

    public static void cadastrar(ArrayList<String> descricoes, ArrayList<Double> valores, Scanner scanner) { // Array vindo do menu.

        System.out.println("== CADASTRO DE GASTOS ==");

        System.out.print("Informe a descrição do seu gasto (Ex: Mercado, Roupas): ");
        String desc = scanner.nextLine();
        while (desc.isEmpty()) {
            System.out.println("O campo de informar descrição não pode ser vázio.");
            System.out.print("Informe novamente a descrição do gasto: ");
            desc = scanner.nextLine();
        }

        descricoes.add(desc);

        double valor = 0;

        while (valor <= 0) {
            try {
                System.out.print("Informe o valor gasto: ");
                valor = scanner.nextDouble();
                System.out.println();

                if (valor <= 0) { // Feedback para o user.
                    System.out.println("O valor não pode ser negativo ou R$0,00.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Digite apenas números. Não é aceito letras.");
                scanner.nextLine();
            }
        }

        valores.add(valor);

        System.out.println("=== PRODUTO CADASTRADO COM SUCESSO! ===");
        System.out.println("DESCRIÇÃO: " + desc);
        System.out.printf("VALOR GASTO: R$%.2f%n", valor);
        System.out.println();
    }
}
