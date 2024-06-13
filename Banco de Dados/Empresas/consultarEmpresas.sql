-- Consulta sem o INNER JOIN

-- A seguinte consulta ira trazer o nome da cidade e da empresa que estao relacionadas na tabela empresas_unidades onde somente o campo sede = true
SELECT e.nome AS Empresa, c.nome AS Cidade 
FROM empresas e, empresas_unidades eu, cidades c
WHERE e.id = eu.empresa_id
AND c.id = eu.cidade_id
AND sede = TRUE;