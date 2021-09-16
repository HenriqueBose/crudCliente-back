package com.example.crudclienteback.service;


import com.example.crudclienteback.model.Email;
import com.example.crudclienteback.repository.EmailRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class EmailService {

    @Autowired
    private EmailRepository repository;


    public Email save(Email email){
        try{
            return repository.save(email);
        }catch (RuntimeException e ) {
            log.info("Erro ao salvar o email");
            throw new RuntimeException("Erro ao tentar inserir a entidade no banco, erro: " + e);
        }
    }

    public List<Email> findAllByContaId(Long id) {
        try {
            return repository.findAllByIdCliente(id);
        } catch (RuntimeException e) {
            log.info("Ocorreu um erro ao buscar lista de emails.");
            throw new RuntimeException("Erro ao buscar lista de email., erro: " + e);
        }
    }
}
