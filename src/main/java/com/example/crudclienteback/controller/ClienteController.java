package com.example.crudclienteback.controller;


import com.example.crudclienteback.model.Cliente;
import com.example.crudclienteback.repository.ClienteRepository;
import com.example.crudclienteback.service.ClienteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Slf4j
@RestController
@Validated
@RequestMapping("/api/clientes")
@CrossOrigin("*")  // até encontrar um dominio fixo para a aplicação
public class ClienteController {

    @Autowired
    private ClienteService ClienteService;

    @Autowired
    private ClienteRepository ClienteRepository;

    @RequestMapping(value = "/salvar", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> salvarCliente(@RequestBody @Valid Cliente Cliente){
        log.info("Salvando Cliente");
        Long id = ClienteService.salvar(Cliente);
        Map<String, Object> map = new HashMap<>();
        map.put("msg", id);
        return new ResponseEntity<>(map, HttpStatus.OK);
    }

    @RequestMapping(value = "/editar", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> editarCliente(@RequestBody @Valid Cliente Cliente){
        log.info("Editanto Cliente: " + Cliente.getId());
        String res = ClienteService.editar(Cliente);
        Map<String, Object> map = new HashMap<>();
        map.put("msg", res);
        return new ResponseEntity<>(map, HttpStatus.OK);
    }

    @RequestMapping(value = "/find-all", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Cliente> findAll(){
       return ClienteRepository.findAll();
    }

    @RequestMapping(value = "/deletar/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable Long id){
        ClienteRepository.deleteById(id);
    }

}
