-- Inserindo as empresas e fazendo o relacionamento

-- Antes de inserir as empresas é preciso fazer um mudança do tipo do campo cnpj que era INT na criação de passou a ser VARCHAR depois do seguinte comando a baixo
ALTER TABLE empresas
ALTER COLUMN cnpj 
SET DATA TYPE VARCHAR(255);


-- Inserindo as empresas na tabela
INSERT INTO empresas 
    (nome, cnpj)
VALUES
    ('Bradesco', 737465623634),
    ('Vale', 27887982130089234),
    ('Cielo', 012312398383284234);

SELECT * FROM empresas;
SELECT * FROM cidades;


-- Fazendo a relação entre empresas e cidades e dizendo se a sede é em tal cidade ou não
INSERT INTO empresas_unidades 
    (empresa_id, cidade_id, sede)
VALUES
    (1, 1, TRUE),
    (1, 2, FALSE),
    (2, 1, FALSE),
    (2, 2, TRUE)

SELECT * FROM empresas_unidades;
