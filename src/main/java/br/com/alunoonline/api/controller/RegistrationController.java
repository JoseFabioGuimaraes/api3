package br.com.alunoonline.api.controller;

import br.com.alunoonline.api.model.ResgistrationStudent;
import br.com.alunoonline.api.service.ResgistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/registration-student")
public class RegistrationController {

    @Autowired
    ResgistrationService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody ResgistrationStudent resgistrationStudent){
        service.create(resgistrationStudent);

    }
}
