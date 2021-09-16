package com.example.crudclienteback.repository;


import com.example.crudclienteback.model.Usuario;
import com.example.crudclienteback.repository.custom.UsuarioRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>, UsuarioRepositoryCustom {



}
