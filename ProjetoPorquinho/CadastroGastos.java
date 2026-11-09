import java.util.Scanner;

public class CadastroGastos {

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

        porquinho.cadastrarGasto(desc, valor);

        System.out.println("GASTO CADASTRADO COM SUCESSO!");
        System.out.println("DESCRIÇÃO: " + desc);
        System.out.printf("VALOR GASTO: R$%.2f%n", valor);
        System.out.println("Seu Porquinho já está de olho nesse gasto!");
        System.out.println();
    }
}
