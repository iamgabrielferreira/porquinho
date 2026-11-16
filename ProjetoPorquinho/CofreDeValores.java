public class CofreDeValores {
    public static void cofrinho(Porquinho porquinho) {

        int numero = 1;

        System.out.println("== COFRE DE VALORES ==");
        System.out.println("=== DEPOSITADOS ===");
        System.out.println();

        if (porquinho.getValoresAlimentados().isEmpty()) {
            System.out.println("Seu porquinho está vazio. \nDeposite valores para acessar seu Cofre de Valores.");
            System.out.println();
            return;
        }

        for (Double cofre : porquinho.getValoresAlimentados()) {
            System.out.printf("%d- R$%.2f%n", numero, cofre);

            numero++;
        }

        double cofreFechado = CalculadoraFinanceira.calculadoraValores(porquinho);

        System.out.printf("TOTAL NO PORQUINHO: R$%.2f%n", cofreFechado);
    }
}
