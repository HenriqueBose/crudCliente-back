package com.example.crudclienteback.controller;


import com.example.crudclienteback.model.Usuario;
import com.example.crudclienteback.repository.UsuarioRepository;
import com.example.crudclienteback.service.UsuarioService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Slf4j
@RestController
@RequestMapping("/api/clientes")
@CrossOrigin("*")  // até encontrar um dominio fixo para a aplicação
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @RequestMapping(value = "/salvar", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> salvarUsuario(@RequestBody Usuario usuario){
        log.info("Salvando usuario");
        Long id = usuarioService.salvar(usuario);
        Map<String, Object> map = new HashMap<>();
        map.put("msg", id);
        return new ResponseEntity<>(map, HttpStatus.OK);
    }

    @RequestMapping(value = "/editar", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> editarUsuario(@RequestBody Usuario usuario){
        log.info("Editanto usuario: " + usuario.getId());
        String res = usuarioService.editar(usuario);
        Map<String, Object> map = new HashMap<>();
        map.put("msg", res);
        return new ResponseEntity<>(map, HttpStatus.OK);
    }

    @RequestMapping(value = "/find-all", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Usuario> findAll(){
       return usuarioRepository.findAll();
    }

    @RequestMapping(value = "/deletar/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable Long id){
        usuarioRepository.deleteById(id);
    }

}
