package com.example.crudclienteback.repository;


import com.example.crudclienteback.model.Telefone;
import com.example.crudclienteback.repository.custom.TelefoneRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TelefoneRepository extends JpaRepository<Telefone, Long>, TelefoneRepositoryCustom {

    List<Telefone> findAllByIdCliente(Long idCliente);
}
