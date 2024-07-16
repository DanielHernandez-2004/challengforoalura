CREATE TABLE topicos (
    id BIGSERIAL PRIMARY KEY,
    titulo VARCHAR(100) NOT NULL,
    cuerpo VARCHAR(5000) NOT NULL,
    fecha_creacion TIMESTAMPTZ NOT NULL,
    ultima_actualizacion TIMESTAMPTZ,
    estado VARCHAR(100) NOT NULL,
    usuario_id BIGINT NOT NULL,
    curso_id BIGINT NOT NULL,
    FOREIGN KEY (usuario_id) REFERENCES usuarios(id),
    FOREIGN KEY (curso_id) REFERENCES cursos(id)
);
