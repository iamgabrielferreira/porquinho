/*= seeds.sql/ semente =*/

INSERT INTO usuarios (nome, cod_pais, telefone, email, senha_hash) VALUES
('Ana Souza',   '+55', '11999990001', 'ana@exemplo.com',   'hash_ficticio_001'),
('Bruno Lima',  '+55', '11999990002', 'bruno@exemplo.com', 'hash_ficticio_002'),
('Carla Dias',  '+55', '11999990003', 'carla@exemplo.com', 'hash_ficticio_003');

/*Subconsulta*/
INSERT INTO deposito (fk_usuario, valor)
VALUES
	((SELECT id FROM usuarios WHERE email = 'ana@exemplo.com'), 500.00),
	((SELECT id FROM usuarios WHERE email = 'ana@exemplo.com'), 300.00),
	((SELECT id FROM usuarios WHERE email = 'ana@exemplo.com'), 200.00),
	((SELECT id FROM usuarios WHERE email = 'bruno@exemplo.com'), 200.00),
	((SELECT id FROM usuarios WHERE email = 'bruno@exemplo.com'), 100.00),
	((SELECT id FROM usuarios WHERE email = 'carla@exemplo.com'), 150.00);

INSERT INTO gasto (fk_usuario, descricao, valor) 
VALUES
	((SELECT id FROM usuarios WHERE email = 'ana@exemplo.com'), 'Mercado', 250.00),
	((SELECT id FROM usuarios WHERE email = 'ana@exemplo.com'), 'Transporte', 120.00),
	((SELECT id FROM usuarios WHERE email = 'ana@exemplo.com'), 'Cinema', 80.00),
	((SELECT id FROM usuarios WHERE email = 'bruno@exemplo.com'), 'Aluguel', 350.00),
	((SELECT id FROM usuarios WHERE email = 'bruno@exemplo.com'), 'Lanche', 90.00);