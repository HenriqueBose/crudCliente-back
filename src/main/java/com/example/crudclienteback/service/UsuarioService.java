package com.example.crudclienteback.service;

import com.example.crudclienteback.model.Telefone;
import com.example.crudclienteback.model.Usuario;
import com.example.crudclienteback.repository.UsuarioRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Slf4j
@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;



    public String editar(Usuario usuario){
        try{
            repository.saveAndFlush(usuario);
        }catch (RuntimeException e ) {
            throw new RuntimeException(" Ocorreu um erro ao tentar editar o usuario, erro: " + e);
        }
        return "Edição efetuada com sucesso!";
    }

    @Transactional
    public Long salvar(Usuario usuario){
        try{
            repository.save(usuario);
        }catch (RuntimeException e ) {
            log.info("Erro ao salvar o usuario");
            throw new RuntimeException("Ocorreu um erro ao tentar salvar o usuario, erro: " + e);
        }
        return usuario.getId();
    }

}
