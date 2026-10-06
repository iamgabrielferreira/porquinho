import java.util.InputMismatchException;
import java.util.Scanner;

public class LeituraDadosUsuario {
    public static double lerValorPositivo(Scanner scanner,
                                          String textoPergunta,
                                          String avisoValorMenorOuIgualZero,
                                          String avisoEntradaInvalida) {

        double valor = 0;

        while (valor <= 0) {
            try {
                System.out.print(textoPergunta);
                valor = scanner.nextDouble();
                System.out.println();
                scanner.nextLine();

                if (valor <= 0) {
                    System.out.println(avisoValorMenorOuIgualZero);
                    System.out.println();
                }

            } catch (InputMismatchException e) {
                System.out.println(avisoEntradaInvalida);
                scanner.nextLine();
                System.out.println();
            }
        }
        return valor;
    }
}
