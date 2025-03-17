package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.User;

public class ClientDTO {
    private long id;
    private String nome;

    public ClientDTO() {

    }
    public ClientDTO(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    public ClientDTO(User entity) {
        id = entity.getId();
        nome = entity.getName();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
