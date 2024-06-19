
-- Seleciona a regiao e a populacao de cada uma somando o total de acordo com  regiao
SELECT regiao AS Região, SUM(populacao) AS Total
FROM estados GROUP BY regiao
ORDER BY Total desc;

-- Soma todos os valores da coluna populacao e trouxe a população total
SELECT SUM(populacao) AS Total
FROM estados;