package com.example.crudclienteback.model;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Entity
@Getter
@Setter
@SequenceGenerator(name = "cliente_id_seq", sequenceName = "cliente_id_seq", allocationSize = 1, initialValue = 1)
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente_id_seq")
    private Long id;


    @Column(name = "nome", nullable = false)
    @NotBlank(message = "Campo nome é obrigatório")
    private String nome;


    @Column(name="cpf", nullable = false)
    @NotBlank(message = "Campo cpf é obrigatório")
    private String cpf;

    @Column(name="cep", nullable = false)
    @NotNull
    private int cep;

    @Column(name="logradouro", nullable = false)
    @NotNull
    @NotBlank(message = "Campo logradouro é obrigatório")
    private String logradouro;

    @Column(name="bairro", nullable = false)
    @NotNull
    @NotBlank(message = "Campo bairro é obrigatório")
    private String bairro;


    @Column(name = "cidade", nullable = false)
    @NotNull
    @NotBlank(message = "Campo cidade é obrigatório")
    private String cidade;

    @Column(name = "uf", nullable = false)
    @NotNull
    @NotBlank(message = "Campo uf é obrigatório")
    private String uf;

    @Column(name = "complemento")
    private String complemento;

}
