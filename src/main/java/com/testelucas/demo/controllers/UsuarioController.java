package com.testelucas.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testelucas.demo.entities.Usuario;
import com.testelucas.demo.repositories.UsuarioRepository;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @GetMapping
    public List<Usuario> findAll() {
        List<Usuario> resultados = repository.findAll();
        return resultados;
    }

    @GetMapping(value = "/{id}")
    public Usuario findById(@PathVariable Long id ) {
        Usuario resultado = repository.findById(id).get();
        return resultado;
    }

    @PostMapping
    public Usuario insert(@RequestBody Usuario usuario) {
        Usuario resultado = repository.save(usuario);
        return resultado;
    }
    
    @PutMapping(value = "/{id}")
    public Usuario updateUsuario(@PathVariable Long id, @Validated @RequestBody Usuario usuario){
        Usuario resultado = repository.findById(id).get();
        resultado.setLogin(usuario.getNome());
        resultado.setNome(usuario.getNome());
        resultado.setSenha(usuario.getSenha());

        Usuario updateUsuario = repository.save(resultado);
        
        return updateUsuario;
    }
    
    
}
