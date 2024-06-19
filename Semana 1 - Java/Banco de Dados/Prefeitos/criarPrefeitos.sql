-- Criando uma tabela com relacionamento 1 para 1 (1 prefeito pertence a uma cidade e vice-versa)
-- O que vai definir isso de forma correta é informar que na coluna da FK ela é unica (UNIQUE), não aceita repetição de valores

CREATE TABLE IF NOT EXISTS prefeitos (
    id SERIAL NOT NULL PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    cidade_id SERIAL NOT NULL,
    UNIQUE (cidade_id),
    FOREIGN KEY (cidade_id) REFERENCES cidades (id)
);

