-- Os comandos a baixo sao para mostrar como inserir cidades associando com os estados por meio do ID

SELECT * FROM estados;

-- Dessa forma voce precisa procurar o id para passar no valor
INSERT INTO cidades (nome, area, estado_id)
VALUES ('Campinas', 795, 24);
--Mesma situação da de cima
INSERT INTO cidades (nome, area, estado_id)
VALUES ('Maceio', 300, 2);

-- Essa forma é mais robusta
-- Utiliza um select na tabela estados pegando o id onde(where) a sigla é igual a 'estado pertecente da cidade'

INSERT INTO cidades (nome, area, estado_id) 
VALUES ('Caruaru', 920.6, (SELECT id FROM estados WHERE sigla = 'PE'));

INSERT INTO cidades (nome, area, estado_id)
VALUES ('Juazeiro do Norte',248.2, (SELECT id FROM estados WHERE sigla = 'CE'));

SELECT * FROM cidades;