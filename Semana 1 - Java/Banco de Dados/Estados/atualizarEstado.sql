-- Comandos para atualizar uma linha de uma determinada colunas

--OBS: Fazer atualizacao ou delecao sem o WHERE é algo muito arriscado e não recomendavel

UPDATE estados 
SET nome = 'Maranhão'
WHERE sigla = 'MA';

SELECT nome FROM estados
WHERE sigla = 'MA';

UPDATE estados
SET nome = 'Paraná', populacao = 11.32
WHERE sigla = 'PR';

SELECT nome, sigla, populacao FROM estados
WHERE sigla = 'PR';


--Eu fiz esse comando para alterar o tipo da coluna de BIGINT para DECIMAL, pois quando criei coloquei BIGINT
ALTER TABLE estados
ALTER COLUMN populacao 
SET DATA TYPE DECIMAL(10, 2);