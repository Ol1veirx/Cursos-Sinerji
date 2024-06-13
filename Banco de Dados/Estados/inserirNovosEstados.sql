-- Nesse arquivo é mostrado que pode inserir um ID de forma manual

INSERT INTO estados(id, nome, sigla, regiao, populacao)
VALUES(1000, 'Novo', 'NV', 'Sul', 2.54);

INSERT INTO estados (nome, sigla, regiao, populacao)
VALUES('Mais novo', 'MN', 'Nordeste', 2.51);

SELECT * FROM estados
ORDER BY id;