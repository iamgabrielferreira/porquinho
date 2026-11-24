public class CofreDeValores {
    public static void cofrinho(Porquinho porquinho) {

        int numero = 1;

        System.out.println("== COFRE DE VALORES ==");
        System.out.println("=== DEPOSITADOS ===");
        System.out.println();

        if (porquinho.getDepositos().isEmpty()) {
            System.out.println("Seu porquinho está vazio. \nDeposite valores para acessar seu Cofre de Valores.");
            System.out.println();
            return;
        }

        for (Deposito deposito : porquinho.getDepositos()) {
            System.out.printf("%d- R$%.2f | DATA: %s%n", numero, deposito.getValor(), FormatadorData.formatar(deposito.getData()));
            System.out.println();
            System.out.println("-----------------------------------------");
            System.out.println();

            numero++;
        }

        double cofreFechado = porquinho.getTotalGuardado();

        System.out.printf("TOTAL NO PORQUINHO: R$%.2f%n", cofreFechado);
        System.out.println();
    }
}

