import java.util.Scanner;

public class AlimentarPorquinho {
    private static final String EMOJI_PORQUINHO = "\uD83D\uDC37";

    public static void alimentarPorquinho(Porquinho porquinho, Scanner scanner) {
        System.out.println("=== ALIMENTAR PORQUINHO ===");
        System.out.println();

        double valorAlimentado = LeituraDadosUsuario.lerValorPositivo(scanner,
                EMOJI_PORQUINHO + " Hora de alimentar o Porquinho! Quanto você quer guardar? R$",
                "O Porquinho está com fome! Coloque um valor maior que zero.",
                "Ih! O Porquinho não come letras! Digite apenas números.");

        porquinho.alimentarPorquinho(valorAlimentado);
        // Solicita ao objeto Porquinho que armazene o valor alimentado em sua lista interna.


        System.out.println("SEU PORQUINHO FOI ALIMENTADO!");
        System.out.printf("VALOR GUARDADO: R$%.2f%n", valorAlimentado);
        System.out.println();
    }
}