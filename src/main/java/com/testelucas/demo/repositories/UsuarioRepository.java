package com.testelucas.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testelucas.demo.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {
    
}
