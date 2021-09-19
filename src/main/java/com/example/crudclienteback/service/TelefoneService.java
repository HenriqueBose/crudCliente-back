package com.example.crudclienteback.service;

import com.example.crudclienteback.model.Telefone;
import com.example.crudclienteback.repository.EmailRepository;
import com.example.crudclienteback.repository.TelefoneRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class TelefoneService {

    @Autowired
    private TelefoneRepository repository;


    public Telefone save(Telefone telefone){
        try{
            return repository.save(telefone);
        }catch (RuntimeException e ) {
            log.info("Erro ao salvar o telefone");
            throw new RuntimeException("Erro ao tentar inserir a entidade no banco, erro: " + e);
        }
    }

    public List<Telefone> findAllByContaId(Long id) {
        try {
            return repository.findAllByIdCliente(id);
        } catch (RuntimeException e) {
            log.info("Ocorreu um erro ao buscar lista de emails.");
            throw new RuntimeException("Erro ao buscar lista de email., erro: " + e);
        }
    }
}
