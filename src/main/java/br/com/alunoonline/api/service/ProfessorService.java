package br.com.alunoonline.api.service;

import br.com.alunoonline.api.model.Professor;
import br.com.alunoonline.api.model.Student;
import br.com.alunoonline.api.repository.ProfessorRepository;
import br.com.alunoonline.api.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfessorService {
    @Autowired
    ProfessorRepository repository;
    public Professor create(Professor professor){
        return repository.save(professor);
    }

    public List<Professor> findAll(){
        return repository.findAll();
    }

    public Optional<Professor> findById(Long id){
        return repository.findById(id);
    }
    public void delete(Long id){
        repository.deleteById(id);
    }

}