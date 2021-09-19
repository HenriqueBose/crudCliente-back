package com.example.crudclienteback.controller;

import com.example.crudclienteback.model.Telefone;
import com.example.crudclienteback.model.Usuario;
import com.example.crudclienteback.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/login")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void salvar(@RequestBody Usuario usuario){
        repository.save(usuario);
    }


    @RequestMapping(value = "/find-role/{login}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> findByClienteId(@PathVariable String login){
        Usuario usuario = repository.findByLogin(login).orElseThrow(() -> new UsernameNotFoundException("Login não encontrado."));
        Map<String, Object> map = new HashMap<>();
        map.put("role", usuario.getRole());
        return new ResponseEntity<>(map, HttpStatus.OK);
    }

}
