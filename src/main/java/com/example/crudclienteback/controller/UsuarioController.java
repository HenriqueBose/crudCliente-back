package com.example.crudclienteback.controller;


import com.example.crudclienteback.model.Usuario;
import com.example.crudclienteback.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @RequestMapping(value = "/salvar", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public String salvarUsuario(@RequestBody Usuario usuario){

        usuarioRepository.save(usuario);
        return "Aplicação funcionando, usuario salvo com sucesso.";
    }

    @RequestMapping(value = "/editar", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public String editarUsuario(@RequestBody Usuario usuario){
        usuarioRepository.saveAndFlush(usuario);
        return "Usuario " + usuario.getId() + "editado com sucesso!";
    }

    @RequestMapping(value = "/find-all", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Usuario> findAll(){
       return usuarioRepository.findAll();
    }


}
