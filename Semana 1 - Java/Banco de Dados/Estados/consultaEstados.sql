-- Seleciona toda a tabela e retorna ela
SELECT * FROM estados;

-- Seleciona somente as colunas nome e sigla e iltra pela regiao
SELECT 
    nome, 
    sigla 
FROM estados
where regiao = 'Sul';

-- Seleciona nome e regiao da tabela estados onde a população é maio ou igual a 10 odenado pela populacao em forma decrescente
SELECT 
    nome, 
    regiao, 
    populacao 
FROM estados
WHERE populacao >= 10
ORDER BY populacao desc;