package com.daniel.challengforo.challengaluraforo.domain.respuesta.validaciones.actualizar;

import com.daniel.challengforo.challengaluraforo.domain.respuesta.ActualizarRespuestaDTO;

public interface ValidarRespuestaActualizada {

    public void validate(ActualizarRespuestaDTO data, Long respuestaId);

}