package com.example.crudclienteback.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@SequenceGenerator(name = "email_id_seq", sequenceName = "email_id_seq", allocationSize = 1, initialValue = 1)
public class Email {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "email_id_seq")
    private Long id;

    @Column(name="email", nullable = false)
    private String email;

    @Column(name="idCliente", nullable = false)
    private Long idCliente;



}