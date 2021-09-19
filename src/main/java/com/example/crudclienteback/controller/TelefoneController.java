package com.example.crudclienteback.controller;


import com.example.crudclienteback.model.Email;
import com.example.crudclienteback.model.Telefone;
import com.example.crudclienteback.repository.TelefoneRepository;
import com.example.crudclienteback.service.TelefoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/telefone")
@CrossOrigin("*")  // até encontrar um dominio fixo para a aplicação
public class TelefoneController {

    @Autowired
    private TelefoneService telefoneService;

    @RequestMapping(value = "/salvar", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public Telefone salvarTelefone(@RequestBody Telefone telefone){
       return telefoneService.save(telefone);

    }

    @RequestMapping(value = "/find-all/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Telefone> findByClienteId(@PathVariable Long id){
        return telefoneService.findAllByContaId(id);
    }
}
