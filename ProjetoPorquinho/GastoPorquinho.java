public class GastoPorquinho {
    private String descricao;
    private double valor;
    private Categoria categoria;

    public GastoPorquinho(String descricao, double valor, Categoria categoria) {
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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria cat) {
        if (cat == null) {
            throw new IllegalArgumentException(
                    "O Porquinho aceita apenas gastos que possuem categoria."
            );
        }
        else {
            categoria = cat;
        }
    }
}


