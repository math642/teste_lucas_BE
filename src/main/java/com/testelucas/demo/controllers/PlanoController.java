package com.testelucas.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testelucas.demo.entities.Plano;
import com.testelucas.demo.repositories.PlanoRepository;

@RestController
@RequestMapping(value = "/planos")
public class PlanoController {
    
    @Autowired
    private PlanoRepository repository;
    
    @GetMapping
    public List<Plano> findAll(){
        List<Plano> resultados = repository.findAll();
        return resultados;
    }

    @GetMapping(value ="/{id}")
    public Plano findyById(@PathVariable Long id){
        Plano resultado = repository.findById(id).get();
        return resultado;
    }

    @PostMapping
    public Plano insert(@RequestBody Plano plano){
        Plano resultado = repository.save(plano);
        return resultado;
    }

    @PutMapping(value = "/{id}")
    public Plano updatePlano(@PathVariable Long id, @RequestBody Plano plano){
        Plano resultado = repository.findById(id).get();
        resultado.setNome(plano.getNome());
        resultado.setValor(plano.getValor());

        Plano updatePlano = repository.save(resultado);

        return updatePlano;
    }
}
