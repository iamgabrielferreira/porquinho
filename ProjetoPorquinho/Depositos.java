import java.time.LocalDateTime;

public class Depositos {
    private double valor;
    private LocalDateTime data;

    public Depositos(double valor) {
        setValor(valor);
        this.data = LocalDateTime.now();
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double v) {
        if (v <= 0) {
            throw new IllegalArgumentException(
                    "O Porquinho não registra depositos de R$ 0,00 ou valores negativos."
            );
        }
        else {
            valor = v;
        }
    }

    public LocalDateTime getData() {
        return data;
    }
}
