import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        ArrayList<String> descricoes = new ArrayList<>();
        ArrayList<Double> valores = new ArrayList<>();
        ArrayList<Double> valorReceita = new ArrayList<>();


        System.out.println("================================");
        System.out.println(" BEM-VINDO AO PORQUINHO");
        System.out.println("================================");
        System.out.println();

        int opcao = 0;
        while (opcao != 6) {
            try {
                System.out.println("==== MENU PORQUINHO ====");
                System.out.println("1- Alimentar o Porquinho");
                System.out.println("2- Cadastrar Gasto");
                System.out.println("3- Listar Gastos");
                System.out.println("4- Consultar Resumo Financeiro");
                System.out.println("5- Excluir Gasto");
                System.out.println("6- Sair do programa");
                System.out.print("Digite a opção de sua preferência: ");
                opcao = scanner.nextInt();
                System.out.println();

                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        CadastrarReceita.cadastrarReceita(valorReceita, scanner);
                        break;

                    case 2:
                        CadastroGastos.cadastrar(descricoes, valores, scanner);
                        break;

                    case 3:
                        ListarGasto.listarGasto(descricoes, valores);
                        break;

                    case 4:
                        TotalGasto.totalGasto(valores, valorReceita);
                        break;

                    case 5:
                        ExcluirGasto.excluirGasto(descricoes, valores, scanner);
                        break;

                    case 6:
                        System.out.println("Fechando o Porquinho...");
                        System.out.println("Até a próxima!");
                        break;

                    default:
                        System.out.println("Opção inválida/inexistente. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Digite apenas números inteiros no menu.");
                scanner.nextLine(); // LIMPEZA DO BUFFER
            }
        }
        scanner.close();
    }
}

