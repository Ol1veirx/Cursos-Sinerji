SELECT 
    a.nome, c.nome 
FROM 
    cursos c, 
    alunos a 
INNER JOIN 
    matriculas m 
ON 
    a.id = m.curso_id;