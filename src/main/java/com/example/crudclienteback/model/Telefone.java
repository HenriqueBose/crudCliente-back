package com.example.crudclienteback.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Entity
@Getter
@Setter
@SequenceGenerator(name = "telefone_id_seq", sequenceName = "telefone_id_seq", allocationSize = 1, initialValue = 1)
public class Telefone {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "telefone_id_seq")
    private Long id;

    @Column(name="numero", nullable = false)
    @NotBlank(message = "Campo telefone é obrigatório")
    private String numero;

    @Column(name="idCliente", nullable = false)
    private Long idCliente;



}
