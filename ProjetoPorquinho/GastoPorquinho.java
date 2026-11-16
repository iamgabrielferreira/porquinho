public class GastoPorquinho {
    private String descricao;
    private double valor;
    private String categoria;

    public GastoPorquinho(String descricao, double valor, String categoria) {
        setDescricao(descricao);
        setValor(valor);
        setCategoria(categoria);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String d) {
        if (d != null) {
            d = d.strip();
        }

        if (d == null || d.isEmpty()) {
            throw new IllegalArgumentException(
                "Seu Porquinho precisa saber onde o dinheiro foi gasto."
                 // IllegalArgumentException: exceção do Java lançada quando um metodo ou construtor recebe um argumento inválido
            );
        }
        else {
            descricao = d;
        }
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double v) {
        if (v <= 0) {
            throw new IllegalArgumentException(
                    "O Porquinho não registra gastos de R$ 0,00 ou valores negativos."
            );
        }
        else {
                valor = v;
        }
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String cat) {
        if (cat == null || cat.strip().isEmpty()) {
            throw new IllegalArgumentException(
                    "O Porquinho aceita apenas gastos que possuem categoria."
            );
        }
        else {
            categoria = cat.strip();
        }
    }
}
