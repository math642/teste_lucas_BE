package com.testelucas.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testelucas.demo.entities.Beneficiario;

public interface BeneficiarioRepository extends JpaRepository<Beneficiario, Long> {
    
}
