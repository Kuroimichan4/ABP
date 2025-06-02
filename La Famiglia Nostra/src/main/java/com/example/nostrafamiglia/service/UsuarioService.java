package com.example.nostrafamiglia.service;


import com.example.nostrafamiglia.model.Usuario;
import com.example.nostrafamiglia.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuariosRepository usuariosRepository;

    //Get all
    public List<Usuario> getAllUsuarios() {return usuariosRepository.findAll();}

    // por Id
    public Optional<Usuario> getUsuarioById(Integer id) {return usuariosRepository.findById(id);}

    //Save
    public Usuario saveUsuario(Usuario usuario) {
        usuario.setFirstName(capitalize(usuario.getFirstName()));
        usuario.setLastName(capitalize(usuario.getLastName()));
        return usuariosRepository.save(usuario);
    }

    //Boprrar
    public void deleteUsuario(Integer id) {usuariosRepository.deleteById(id);}

    // Ver si existe
    public boolean existsById(Integer id) {return usuariosRepository.existsById(id);}

    // Login
    public Optional<Usuario> login(String correo, String password) {
        return usuariosRepository.findByCorreoAndPassword(correo, password);
    }

    // metodo para el formato de la primera letra en mayuys
    private String capitalize(String texto) {
        if (texto == null || texto.isBlank()) return texto; // si no hay texto que formatear no hace nada para evitar que genere errores
        return texto.substring(0, 1).toUpperCase() + texto.substring(1).toLowerCase(); //la primera en mayus y las siguiente en minus
    }

    //posible implementación de encriptación de las contras




}
