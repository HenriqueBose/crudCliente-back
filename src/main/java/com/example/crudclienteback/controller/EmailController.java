package com.example.crudclienteback.controller;


import com.example.crudclienteback.model.Emails;
import com.example.crudclienteback.repository.EmailRepository;
import com.example.crudclienteback.service.EmailService;
import com.example.crudclienteback.service.TelefoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@Validated
@RequestMapping("/api/email")
@CrossOrigin("*")  // até encontrar um dominio fixo para a aplicação
public class EmailController {


    @Autowired
    private EmailService emailService;


    @RequestMapping(value = "/salvar", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public Emails salvarEmail(@RequestBody @Valid Emails email){
        return emailService.save(email);

    }
    @RequestMapping(value = "/find-all/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Emails> findByClienteId(@PathVariable Long id){

        return emailService.findAllByContaId(id);
    }
}
