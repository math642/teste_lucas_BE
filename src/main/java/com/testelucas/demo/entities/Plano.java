package com.testelucas.demo.entities;

import com.fasterxml.jackson.databind.annotation.JsonAppend.Prop;

public class Plano {
    
    private Long id;
    private String name;
    private Boolean valor;
    
    public Plano(){

    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Boolean getValor() {
        return valor;
    }
    public void setValor(Boolean valor) {
        this.valor = valor;
    }
    
}
