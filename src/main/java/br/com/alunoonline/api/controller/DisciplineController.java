package br.com.alunoonline.api.controller;

import br.com.alunoonline.api.model.Discipline;
import br.com.alunoonline.api.service.DisciplineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/discipline")
public class DisciplineController {

    @Autowired
    DisciplineService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Discipline> create(@RequestBody Discipline discipline){
        Discipline disciplineCreate = service.create(discipline);
        return ResponseEntity.status(201).body(disciplineCreate);
    }
    @GetMapping("/professor/{professorId}")
    @ResponseStatus(HttpStatus.OK)
    public List<Discipline> findByProfessorId(@PathVariable Long professorId){
        return service.findByProfessorId(professorId);
    }
}
