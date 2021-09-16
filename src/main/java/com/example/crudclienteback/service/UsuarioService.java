package com.example.crudclienteback.service;

import com.example.crudclienteback.model.Usuario;
import com.example.crudclienteback.repository.UsuarioRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


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

}
