import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CadastroGastos {

    public static void cadastrar(ArrayList<String> descricoes, ArrayList<Double> valores, Scanner scanner) { // Array vindo do menu.

        System.out.println("== CADASTRO DE GASTOS ==");

        System.out.print("O que fez seu Porquinho gastar hoje? (Ex: Mercado, Roupas): ");
        String desc = scanner.nextLine();
        while (desc.isEmpty()) {
            System.out.println("Seu Porquinho precisa saber onde o dinheiro foi gasto.");
            System.out.print("Informe novamente a descrição do gasto: ");
            desc = scanner.nextLine();
        }

        descricoes.add(desc);

        double valor = 0;

        while (valor <= 0) {
            try {
                System.out.print("Quanto o Porquinho desembolsou? R$");
                valor = scanner.nextDouble();
                System.out.println();

                if (valor <= 0) { // Feedback para o user.
                    System.out.println("O Porquinho não registra gastos de R$ 0,00 ou valores negativos.");
                }

            } catch (InputMismatchException e) {
                System.out.println("O Porquinho só entende números. Digite um valor válido.");
                scanner.nextLine();
            }
        }

        valores.add(valor);

        System.out.println("=== GASTO CADASTRADO COM SUCESSO! ===");
        System.out.println("DESCRIÇÃO: " + desc);
        System.out.printf("VALOR GASTO: R$%.2f%n", valor);
        System.out.println("Seu Porquinho já está de olho nesse gasto!");
        System.out.println();
    }
}
