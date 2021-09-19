package com.example.crudclienteback.repository;


import com.example.crudclienteback.model.Cliente;
import com.example.crudclienteback.repository.custom.ClienteRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>, ClienteRepositoryCustom {



}
