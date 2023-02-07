package com.testelucas.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testelucas.demo.entities.Plano;

@Repository
public interface PlanoRepository extends JpaRepository<Plano, Long> {
    
}
