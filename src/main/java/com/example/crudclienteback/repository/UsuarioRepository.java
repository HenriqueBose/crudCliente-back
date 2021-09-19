package com.example.crudclienteback.repository;

import com.example.crudclienteback.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository  extends JpaRepository<Usuario, Integer> {

    Optional<Usuario>findByLogin(String login);




}
