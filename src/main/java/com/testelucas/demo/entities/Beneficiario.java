package com.testelucas.demo.entities;

public class Beneficiario {

    private Long id;
    private String nome;
    private int cpg;
    private String email;
    private int idade;
    private Plano plano;

    public Beneficiario(){
        
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCpg() {
        return cpg;
    }
    public void setCpg(int cpg) {
        this.cpg = cpg;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public Plano getPlano() {
        return plano;
    }
    public void setPlano(Plano plano) {
        this.plano = plano;
    }


}
