package com.example.crudclienteback.repository;


import com.example.crudclienteback.model.Emails;
import com.example.crudclienteback.repository.custom.EmailRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmailRepository extends JpaRepository<Emails, Long>, EmailRepositoryCustom {

    List<Emails>findAllByIdCliente(Long idCliente);

}
