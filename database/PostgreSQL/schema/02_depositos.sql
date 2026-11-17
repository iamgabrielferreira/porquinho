CREATE TABLE deposito (
id SERIAL PRIMARY KEY,
fk_usuario INT NOT NULL,
valor DECIMAL (10,2) NOT NULL CHECK (valor > 0),
dt_deposito TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,

CONSTRAINT fk_deposito_usuario
/* regra imposta pelo banco de dados para impedir operações que violem a integridade dos dados.*/

FOREIGN KEY (fk_usuario) REFERENCES usuarios (id)
	ON DELETE CASCADE
);
