package br.com.alunoonline.api.controller;

import br.com.alunoonline.api.model.Professor;
import br.com.alunoonline.api.model.Student;
import br.com.alunoonline.api.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/professor")
public class ProfessorController {

    @Autowired
    ProfessorService service;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Professor> create(@RequestBody Professor professor){
           Professor professorCreated = service.create(professor);
            return ResponseEntity.status(201).body(professorCreated);
    }

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<Professor> findAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Professor> findById(@PathVariable Long id){
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        service.delete(id);
    }

}
