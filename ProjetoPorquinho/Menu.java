import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private static final int ALIMENTAR_PORQUINHO = 1;
    private static final int CADASTRAR_GASTO = 2;
    private static final int LISTAR_GASTOS = 3;
    private static final int RESUMO_FINANCEIRO = 4;
    private static final int EXCLUIR_GASTO = 5;
    private static final int SAIR = 6;
    private static final int ERRO_LEITURA = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> descricoes = new ArrayList<>();
        ArrayList<Double> valores = new ArrayList<>();
        ArrayList<Double> valoresAlimentados = new ArrayList<>();

        exibirBoasVindas();

        int opcao = 0;
        while (opcao != SAIR) {
            exibirMenu();

            opcao = lerOpcao(scanner);

            executarOpcao(opcao, valoresAlimentados, descricoes, valores, scanner);
        }

        scanner.close();
    }

    private static void exibirBoasVindas() {
        System.out.println("================================");
        System.out.println(" BEM-VINDO AO PORQUINHO");
        System.out.println("================================");
        System.out.println();
    }

    private static void exibirMenu() {
        System.out.println("=== MENU PORQUINHO ===");
        System.out.println("1- Alimentar o Porquinho");
        System.out.println("2- Cadastrar Gasto");
        System.out.println("3- Listar Gastos");
        System.out.println("4- Consultar Resumo Financeiro");
        System.out.println("5- Excluir Gasto");
        System.out.println("6- Sair do programa");
    }

    private static int lerOpcao(Scanner scanner) {
        try {
            System.out.print("Digite a opção de sua preferência: ");
            int opcao = scanner.nextInt();
            System.out.println();

            scanner.nextLine();

            return opcao;

        } catch (InputMismatchException e) {
            System.out.println("ATENÇÃO: O porquinho aceita apenas números.");
            System.out.println("Digite apenas números inteiros no menu.");
            scanner.nextLine();
            System.out.println();
        }

        return ERRO_LEITURA;
    }

    private static void executarOpcao(
            int opcao,
            ArrayList<Double> valoresAlimentados,
            ArrayList<String> descricoes,
            ArrayList<Double> valores,
            Scanner scanner) {

        switch (opcao) {
            case ALIMENTAR_PORQUINHO ->
                    AlimentarPorquinho.alimentarPorquinho(valoresAlimentados, scanner);

            case CADASTRAR_GASTO ->
                    CadastroGastos.cadastrar(descricoes, valores, scanner);

            case LISTAR_GASTOS ->
                    ListarGasto.listarGasto(descricoes, valores);

            case RESUMO_FINANCEIRO ->
                    ResumoFinanceiro.resumoFinanceiro(valores, valoresAlimentados);

            case EXCLUIR_GASTO ->
                    ExcluirGasto.excluirGasto(descricoes, valores, scanner);

            case SAIR -> {
                System.out.println("Fechando o Porquinho...");
                System.out.println("Até a próxima!");
            }

            case ERRO_LEITURA -> {
            }

            default ->
                    System.out.println("Opção inválida/inexistente. Tente novamente.");
        }
    }
}
