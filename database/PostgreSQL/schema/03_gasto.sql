-- criar o tipo ENUM
CREATE TYPE categorias AS ENUM (
	 'Moradia', 'Alimentação', 'Transporte', 'Saúde',
    'Lazer e Estilo de Vida', 'Educação', 'Dívidas', 'Investimento'
);

CREATE TABLE gasto (
id SERIAL PRIMARY KEY,
fk_usuario INT NOT NULL,
descricao VARCHAR (100) NOT NULL,
valor DECIMAL (10,2) NOT NULL CHECK (valor > 0),
categoria categorias NOT NULL,
dt_gasto TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,

CONSTRAINT fk_gasto_usuario
FOREIGN KEY (fk_usuario) REFERENCES usuarios (id)
	ON DELETE CASCADE
);