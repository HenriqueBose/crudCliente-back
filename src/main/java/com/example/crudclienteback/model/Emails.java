package com.example.crudclienteback.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Email;

@Entity
@Getter
@Setter
@SequenceGenerator(name = "email_id_seq", sequenceName = "email_id_seq", allocationSize = 1, initialValue = 1)
public class Emails {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "email_id_seq")
    private Long id;

    @Column(name="email", nullable = false)
    @NotNull
    @NotBlank(message = "Campo email é obrigatório")
    @Email(message = "Email deve ser válido")
    private String email;

    @Column(name="idCliente", nullable = false)
    @NotNull
    private Long idCliente;



}