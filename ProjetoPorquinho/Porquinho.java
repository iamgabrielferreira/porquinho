import java.util.ArrayList;
import java.util.List;

public class Porquinho {
    private ArrayList<GastoPorquinho> gastos = new ArrayList<>();
    private ArrayList<Double> valoresAlimentados = new ArrayList<>();

    public Porquinho () {
    }

    public void alimentarPorquinho(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException(
                    "O Porquinho não registra valores de R$ 0,00 ou valores negativos."
            );

        } else {
            this.valoresAlimentados.add(valor);
        }
    }

    public void cadastrarGasto(String desc, double valor) {
        GastoPorquinho gasto = new GastoPorquinho(desc, valor);
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

    public List<Double> getValoresAlimentados() {
        return List.copyOf(valoresAlimentados);
    }
}
