import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CadastrarReceita {
    public static void cadastrarReceita(ArrayList<Double> valorReceita, Scanner scanner)  {

        System.out.println("=== CADASTRAR RECEITA ===");
        System.out.println();

        double valor = 0;

        while (valor <= 0) {
            try {
                System.out.print("\uD83D\uDC37 Hora de alimentar o Porquinho! Quanto você quer guardar? R$");
                valor = scanner.nextDouble();
                System.out.println();

                if (valor <= 0) {
                    System.out.println("O Porquinho está com fome! Coloque um valor maior que zero.");
                    System.out.println();
                }

            } catch (InputMismatchException e) {
                System.out.println("Ih! O Porquinho não come letras! Digite apenas números.");
                scanner.nextLine();
                System.out.println();
            }
        }

        valorReceita.add(valor);

        System.out.println("SEU PORQUINHO FOI ALIMENTADO!");
        System.out.printf("VALOR GUARDADO: R$%.2f%n", valor);
        System.out.println();
    }
}
