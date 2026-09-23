import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        ArrayList<String> descricoes = new ArrayList<>();
        ArrayList<Double> valores = new ArrayList<>();

        System.out.println("-- BEM-VINDO --");

        int opcao = 0;
        while (opcao != 3) {
            try {
                System.out.println("==== MENU PORQUINHO ====");
                System.out.println("1- Cadastrar Gasto");
                System.out.println("2- Listar Gastos");
                System.out.println("3- Sair do programa");
                System.out.print("Digite a opção de sua preferência: ");
                opcao = scanner.nextInt();
                System.out.println();

                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        CadastroGastos.cadastrar(descricoes, valores, scanner);
                        break;

                    case 2:
                        System.out.println("Opção em manutenção.");
                        break;

                    case 3:
                        System.out.println("Fechando o porquinho...");
                        break;

                    default:
                        System.out.println("Opção inválida/inexistente. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Digite apenas números inteiros no menu.");
                scanner.nextLine(); // LIMPEZA DO BUFFER
            }
        }
    }
}
