import java.util.InputMismatchException;
import java.util.Scanner;

public class CadastroGastos {

    private static final String[] CATEGORIAS = {
            "Moradia", "Alimentação", "Transporte", "Saúde",
            "Lazer e Estilo de Vida", "Educação", "Dívidas", "Investimento"
            };


    public static void cadastrarGasto(Porquinho porquinho, Scanner scanner) {

        System.out.println("=== CADASTRO DE GASTOS ===");

        System.out.print("O que fez seu Porquinho gastar hoje? (Ex: Mercado, Roupas): ");
        String desc = scanner.nextLine().strip();
        while (desc.isEmpty()) {
            System.out.println("Seu Porquinho precisa saber onde o dinheiro foi gasto.");
            System.out.print("Informe novamente a descrição do gasto: ");
            desc = scanner.nextLine().strip();
        }
        double valor = LeituraDadosUsuario.lerValorPositivo(scanner,
                "Quanto o Porquinho desembolsou? R$",
                "O Porquinho não registra gastos de R$ 0,00 ou valores negativos.",
                "O Porquinho só entende números. Digite um valor válido.");


        System.out.println("== CATEGORIAS DE GASTOS ==");
        for (int i = 0; i < CATEGORIAS.length; i++) {
            System.out.println((i + 1) + "- " + CATEGORIAS[i]);
        }

        int num = 0;
        while (num < 1 || num > CATEGORIAS.length) {
            try {
                System.out.print("Digite o número da categoria: ");
                num = scanner.nextInt();
                scanner.nextLine();
                System.out.println();

                if (num < 1 || num > CATEGORIAS.length) {
                    System.out.println("Número inválido. Escolha uma categoria da lista.");
                    System.out.println();
                }

            } catch (InputMismatchException e) {
                System.out.println("O Porquinho precisa de um número para escolher a categoria.");
                System.out.println();
                scanner.nextLine();
            }
        }

        String categoria = CATEGORIAS[num - 1];

        porquinho.cadastrarGasto(desc, valor, categoria);

        System.out.println("GASTO CADASTRADO COM SUCESSO!");
        System.out.println("DESCRIÇÃO: " + desc);
        System.out.printf("VALOR GASTO: R$%.2f%n", valor);
        System.out.println("CATEGORIA: " + categoria);
        System.out.println("Seu Porquinho já está de olho nesse gasto!");
        System.out.println();
    }
}