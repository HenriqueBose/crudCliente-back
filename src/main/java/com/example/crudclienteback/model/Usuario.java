package com.example.crudclienteback.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Usuario {

    @Id
    private Integer id;

    @Column(name = "login", unique = true)
    private String login;

    @Column(name="senha", nullable = false)
    private String senha;

    @Column(name="role", nullable = false)
    private String role;
}
