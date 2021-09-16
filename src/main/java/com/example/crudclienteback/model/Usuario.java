package com.example.crudclienteback.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@SequenceGenerator(name = "usuario_id_seq", sequenceName = "usuario_id_seq", allocationSize = 1, initialValue = 1)
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario_id_seq")
    private Long id;


    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name="cpf", nullable = false)
    private String cpf;

    @Column(name="cep", nullable = false)
    private int cep;

    @Column(name="logradouro", nullable = false)
    private String logradouro;

    @Column(name="bairro", nullable = false)
    private String bairro;

    @Column(name = "cidade", nullable = false)
    private String cidade;

    @Column(name = "uf", nullable = false)
    private String uf;

    @Column(name = "complemento")
    private String complemento;

}
