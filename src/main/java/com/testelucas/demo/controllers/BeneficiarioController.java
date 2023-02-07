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

import com.testelucas.demo.entities.Beneficiario;
import com.testelucas.demo.repositories.BeneficiarioRepository;

@RestController
@RequestMapping(value = "/beneficiarios")
public class BeneficiarioController {

    @Autowired
    private BeneficiarioRepository repository;
    
    @GetMapping
    public List<Beneficiario> findAll(){
        List<Beneficiario> resultados = repository.findAll();
        return resultados;
    }

    @GetMapping(value ="/{id}")
    public Beneficiario findyById(@PathVariable Long id){
        Beneficiario resultado = repository.findById(id).get();
        return resultado;
    }

    @PostMapping
    public Beneficiario insert(@RequestBody Beneficiario beneficiario){
        Beneficiario resultado = repository.save(beneficiario);
        return resultado;
    }

    @PutMapping(value = "/{id}")
    public Beneficiario updateBeneficiario(@PathVariable Long id, @RequestBody Beneficiario beneficiario){
        Beneficiario resultado = repository.findById(id).get();
        resultado.setNome(beneficiario.getNome());
        resultado.setCpf(beneficiario.getCpf());
        resultado.setEmail(beneficiario.getEmail());
        resultado.setIdade(beneficiario.getIdade());
        resultado.setPlano(beneficiario.getPlano());

        Beneficiario updateBeneficiario = repository.save(resultado);

        return updateBeneficiario;
    }
}
