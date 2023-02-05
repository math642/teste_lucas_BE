package com.testelucas.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testelucas.demo.entities.Plano;

public interface PlanoRepository extends JpaRepository<Plano, Long> {
    
}
