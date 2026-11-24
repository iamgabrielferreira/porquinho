import java.util.ArrayList;
import java.util.List;

public class Porquinho {
    private ArrayList<GastoPorquinho> gastos = new ArrayList<>();
    private ArrayList<Deposito> depositos = new ArrayList<>();

    public Porquinho () {
    }

    public double getTotalGasto() {
        double soma = 0;
        for (GastoPorquinho gasto : gastos) {
            soma += gasto.getValor();
        }
        return soma;
    }

    public double getTotalGuardado() {
        double soma = 0;
        for (Deposito deposito : depositos) {
            soma += deposito.getValor();
        }
        return soma;
    }

    public double getSaldo() {
        return getTotalGuardado() - getTotalGasto();
    }

    public void alimentarPorquinho(Deposito deposito) {
        if (deposito == null) {
            throw new IllegalArgumentException(
                    "O Porquinho precisa de um depósito válido."
            );

        } else {
            this.depositos.add(deposito);
        }
    }

    public void cadastrarGasto(String desc, double valor, Categoria cat) {
        GastoPorquinho gasto = new GastoPorquinho(desc, valor, cat);
        gastos.add(gasto);
    }

    public GastoPorquinho excluirGasto(int indice) {

        if (indice < 0 || indice >= gastos.size()) {
            throw new IllegalArgumentException(
                    "Posição inválida. Digite a posição do gasto que deseja excluir."
            );
        }
        else {
            return gastos.remove(indice);
        }
    }

    public List<GastoPorquinho> getGastos() {
        return List.copyOf(gastos);
        // Retorna uma cópia imutável da lista, impedindo alterações diretas na coleção original. Seria uma cópia da lista original.
    }

    public List<Deposito> getDepositos() {
        return List.copyOf(depositos);
    }
}

