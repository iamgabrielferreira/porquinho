import java.time.format.DateTimeFormatter;

public class ExibirGasto {
    public static void exibirGasto(Porquinho porquinho) {

        int numero = 1;

        DateTimeFormatter formato =
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        for (GastoPorquinho gasto : porquinho.getGastos()) {
            System.out.println(numero + "- DESCRIÇÃO: " + gasto.getDescricao());
            System.out.printf("VALOR: R$%.2f%n", gasto.getValor());
            System.out.println("CATEGORIA: " + gasto.getCategoria().getNome());
            System.out.println("DATA: " + gasto.getData().format(formato));
            System.out.println("---------------------------");
            System.out.println();

            numero++;
        }
    }
}

//porquinho.getGastos() retorna uma cópia imutável da lista de gastos.
//O for each percorre essa lista, elemento por elemento.
//A variável gasto recebe a referência ao objeto atual em cada iteração.
//Com gasto.getDescricao() e gasto.getValor(), você acessa os atributos daquele objeto.

