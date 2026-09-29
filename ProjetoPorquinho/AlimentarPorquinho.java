import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AlimentarPorquinho {
    private static final String EMOJI_PORQUINHO = "\uD83D\uDC37";

    public static void alimentarPorquinho(ArrayList<Double> valoresAlimentados, Scanner scanner) {
        System.out.println("=== ALIMENTAR PORQUINHO ===");
        System.out.println();

        double valorAlimentado = 0;

        while (valorAlimentado <= 0) {
            try {
                System.out.print(EMOJI_PORQUINHO + " Hora de alimentar o Porquinho! Quanto você quer guardar? R$");
                valorAlimentado = scanner.nextDouble();
                System.out.println();

                if (valorAlimentado <= 0) {
                    System.out.println("O Porquinho está com fome! Coloque um valor maior que zero.");
                    System.out.println();
                }

            } catch (InputMismatchException e) {
                System.out.println("Ih! O Porquinho não come letras! Digite apenas números.");
                scanner.nextLine();
                System.out.println();
            }
        }

        valoresAlimentados.add(valorAlimentado);

        System.out.println("SEU PORQUINHO FOI ALIMENTADO!");
        System.out.printf("VALOR GUARDADO: R$%.2f%n", valorAlimentado);
        System.out.println();
    }
}
