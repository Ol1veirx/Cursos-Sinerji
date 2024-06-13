-- Criando a tabela estado

-- O seguinte comando serve para criar um tipo de forma mais específica
CREATE TYPE regiao_tipo AS ENUM ('Norte', 'Nordeste', 'Centro-Oeste', 'Sudeste', 'Sul');

-- Comando responsavel por criar a tabela, colunas e suas caracteristicas
CREATE TABLE estados (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(45) NOT NULL UNIQUE,
    sigla VARCHAR(2) NOT NULL UNIQUE,
    regiao regiao_tipo NOT NULL,
    populacao BIGINT NOT NULL
);