package com.daniel.challengforo.challengaluraforo.domain.usuario.validaciones.actualizar;

import com.daniel.challengforo.challengaluraforo.domain.usuario.ActualizarUsuarioDTO;
import com.daniel.challengforo.challengaluraforo.domain.usuario.UsuarioRepository;
import jakarta.validation.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidaActualizacionUsuario implements ValidarActualizarUsuario{

    @Autowired
    private UsuarioRepository repository;

    @Override
    public void validate(ActualizarUsuarioDTO data) {
        if(data.email() != null){
            var emailDuplicado = repository.findByEmail(data.email());
            if(emailDuplicado != null){
                throw new ValidationException("Este email ya esta en uso");
            }
        }
    }
}
