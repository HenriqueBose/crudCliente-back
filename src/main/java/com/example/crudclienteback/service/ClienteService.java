package com.example.crudclienteback.service;

import com.example.crudclienteback.model.Telefone;
import com.example.crudclienteback.model.Cliente;
import com.example.crudclienteback.repository.ClienteRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Slf4j
@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;



    public String editar(Cliente Cliente){
        try{
            repository.saveAndFlush(Cliente);
        }catch (RuntimeException e ) {
            throw new RuntimeException(" Ocorreu um erro ao tentar editar o Cliente, erro: " + e);
        }
        return "Edição efetuada com sucesso!";
    }

    @Transactional
    public Long salvar(Cliente Cliente){
        try{
            repository.save(Cliente);
        }catch (RuntimeException e ) {
            log.info("Erro ao salvar o Cliente");
            throw new RuntimeException("Ocorreu um erro ao tentar salvar o Cliente, erro: " + e);
        }
        return Cliente.getId();
    }

}
