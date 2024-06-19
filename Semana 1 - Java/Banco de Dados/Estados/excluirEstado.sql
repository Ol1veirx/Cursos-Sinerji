-- As formas mais seguras de fazer uma deleção de algo na tabela
-- Utilizar sempre uma condição unica para não exluir dados uteis

DELETE FROM estados
WHERE sigla = 'MN';

DELETE FROM estados
WHERE id = 1000;

SELECT * FROM estados;