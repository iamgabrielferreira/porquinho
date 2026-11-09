import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcluirGasto {
    public static void excluirGasto(Porquinho porquinho, Scanner scanner) {

        System.out.println("=== EXCLUIR GASTOS ===");
        System.out.println();

        if (porquinho.getGastos().isEmpty()) {
            System.out.println("Não há gastos cadastrados para excluir. \nSeu Porquinho não encontrou nada para remover.");
            System.out.println();
            return;

        }

        ExibirGasto.exibirGasto(porquinho);

        int numero = 0;

        while (numero <= 0 || numero > porquinho.getGastos().size()) {
            try {
                System.out.print("Qual gasto o Porquinho deve remover? Digite o número: ");
                numero = scanner.nextInt();
                scanner.nextLine();
                System.out.println();

                if (numero <= 0 || numero > porquinho.getGastos().size()) { // Feedback para o user
                    System.out.println("Número inválido. Escolha um gasto seguindo a tabela disponível.");
                    System.out.println();
                }

            } catch (InputMismatchException e) {
                System.out.println("O Porquinho precisa de um número para encontrar o gasto.");
                System.out.println();
                scanner.nextLine();
            }
        }

            numero -= 1;

            GastoPorquinho gastoExcluido = porquinho.excluirGasto(numero);

            System.out.println("GASTO EXCLUÍDO COM SUCESSO!");
            System.out.println("DESCRIÇÃO: " + gastoExcluido.getDescricao());
            System.out.printf("VALOR: R$%.2f%n", gastoExcluido.getValor());
            System.out.println("Esse gasto não faz mais parte do seu Porquinho.");
            System.out.println();
        }
    }
