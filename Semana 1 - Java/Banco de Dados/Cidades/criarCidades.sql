-- O comando a baixo é a criaçao da tabela "cidades" utilizando foreign key

-- estado_id vai ser a coluna FK que usará como referencia a da tabela "estados" a coluna "id"

CREATE TABLE IF NOT EXISTS cidades (
    id SERIAL PRIMARY KEY NOT NULL,
    nome VARCHAR(255) NOT NULL,
    estado_id SERIAL NOT NULL,
    area DECIMAL(10, 2),
    FOREIGN KEY (estado_id) REFERENCES estados (id)
);

-- Tabela dropada
CREATE TABLE IF NOT EXISTS testes (
    id SERIAL PRIMARY KEY NOT NULL
);

-- Esse comando exclui uma tabela se ela existir de acordo com seu nome (testes)
DROP TABLE IF EXISTS testes;
DROP TABLE IF EXISTS employees;

