CREATE TABLE respuestas (
    id BIGSERIAL PRIMARY KEY,
    cuerpo VARCHAR(5000) NOT NULL,
    fecha_creacion TIMESTAMPTZ NOT NULL,
    ultima_actualizacion TIMESTAMPTZ,
    solucion BOOLEAN NOT NULL,
    borrar BOOLEAN NOT NULL,
    usuario_id BIGINT NOT NULL,
    topico_id BIGINT NOT NULL,
    FOREIGN KEY (usuario_id) REFERENCES usuarios(id),
    FOREIGN KEY (topico_id) REFERENCES topicos(id)
);
