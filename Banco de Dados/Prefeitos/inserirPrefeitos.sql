-- Comando para inserir os prefeitos

-- Inserindo prefeitos e associando com as cidades e também colocando valor null 
INSERT INTO prefeitos
    (nome, cidade_id)
VALUES
    ('Rodrigo Neves', 2),
    ('Raquel Lyra', 3),
    ('Zenaldo Coutinho', null);

-- Mostrando que é possivel ter mais de uma linha com o valor na coluna cidade_id = null
INSERT INTO prefeitos 
    (nome, cidade_id)
VALUES
    ('Rafael Greca', null);

-- Mostando que não é possivel inserir um prefeito com o mesmo valor na cidade_id, pois ja existe esse valor la e a coluna é UNIQUE;
INSERT INTO prefeitos
    (nome, cidade_id)
VALUES 
    ('Ronaldo Lopes', 3);


-- Eu tinha colocado a tabela not null, mas alterei para aceitar o campo nulo
ALTER TABLE prefeitos
ALTER COLUMN cidade_id
DROP NOT NULL;