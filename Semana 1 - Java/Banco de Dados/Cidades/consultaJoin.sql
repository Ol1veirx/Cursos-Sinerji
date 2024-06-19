-- Os comandos a baixo serve para fazer consulta unido as duas tabelas e existem duas formas

-- Nessa forma utiliza-se o ALIAS(apelido para cada tabela), seleciona as colunas que deseja de cada tabela e passa uma condição que nesse caso e pega somente onde o id do estado seja igual ao estado_id na cidade
SELECT 
    e.nome, 
    c.nome, 
    e.regiao 
FROM estados e, cidades c
WHERE e.id = c.estado_id;

-- Aqui já é utilizado o JOIN onde tambem se faz a utilização do ALIAS porem sem a presença do WHERE. Nesse caso voce seleciona a tabela estados unida a tabela cidades onde o id do estados é igual ao estado_id da cidade
SELECT 
    c.nome, 
    e.nome, 
    regiao 
FROM estados e 
INNER JOIN cidades c 
    ON e.id = c.estado_id;