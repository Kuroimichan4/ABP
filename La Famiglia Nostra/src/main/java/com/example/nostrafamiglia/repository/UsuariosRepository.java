package com.example.nostrafamiglia.repository;

import com.example.nostrafamiglia.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuariosRepository extends JpaRepository <Usuario, Integer> {
    Optional<Usuario> findByCorreoAndPassword(String correo, String password);

}
