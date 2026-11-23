public enum Categoria {
    MORADIA("Moradia"),
    ALIMENTACAO("Alimentação"),
    TRANSPORTE("Transporte"),
    SAUDE("Saúde"),
    LAZER_E_ESTILO_DE_VIDA("Lazer e Estilo de Vida"),
    EDUCACAO("Educação"),
    DIVIDAS("Dívidas"),
    INVESTIMENTO("Investimento");

    private final String nome;

    Categoria(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

/**
 * Categoria: lista fixa de categorias de gasto (enum).
 *
 * - Constantes em MAIÚSCULAS, sem acento nem espaço. Separadas por
 *   vírgula; a última termina com ponto e vírgula (;).
 * - O texto entre parênteses é o que o usuário vê. O Java chama o
 *   construtor sozinho, uma vez por constante, e ele guarda em nome.
 * - getNome(): devolve o texto da constante (MORADIA -> "Moradia").
 * - Categoria.values(): array com todas as constantes (já vem pronto).
 */