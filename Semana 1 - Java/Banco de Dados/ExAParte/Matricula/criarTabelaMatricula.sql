CREATE TABLE IF NOT EXISTS matriculas (
    curso_id SERIAL NOT NULL,
    aluno_id SERIAL NOT NULL,
    PRIMARY KEY (curso_id, aluno_id)
)