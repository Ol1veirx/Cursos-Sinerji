-- O exemplo a baixo mostra como funciona o relacionamento muitos para muitos (n para n)

-- cria a tabela empresas normalmente
CREATE TABLE IF NOT EXISTS empresas (
    id SERIAL NOT NULL PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    cnpj INT,
    UNIQUE (cnpj)
);


-- Cria uma tabela especial para associar cidades com empresas onde a chave primaria dela é uma composiçaõ entre empresa_id e cidade_id
CREATE TABLE IF NOT EXISTS empresas_unidades (
    empresa_id SERIAL NOT NULL,
    cidade_id SERIAL NOT NULL,
    sede BOOLEAN NOT NULL,
    PRIMARY KEY (empresa_id, cidade_id)
);