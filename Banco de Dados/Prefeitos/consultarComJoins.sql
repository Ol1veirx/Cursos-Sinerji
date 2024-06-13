-- Explorando os diferentes tipos de JOINS

-- Vai trazer todas as cidades associadas a um prefeito
SELECT * FROM cidades c INNER JOIN prefeitos p ON c.id = p.cidade_id;


-- Vai trazer todas as cidades, com e sem prefeito associado
SELECT * FROM cidades c LEFT JOIN prefeitos p ON c.id = p.cidade_id;


-- Vai trazer somente as cidades com prefeitos relacionado, porem vai trazer os outros prefeitos que nao tem cidade associado com os campos null do lado da cidade
SELECT * FROM cidades c RIGHT JOIN prefeitos p ON c.id = p.cidade_id;

-- Vai trazer tudo, associados ou não
SELECT * FROM cidades c FULL JOIN prefeitos p ON c.id = p.cidade_id;