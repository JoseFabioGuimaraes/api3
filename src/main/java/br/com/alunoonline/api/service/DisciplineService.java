package br.com.alunoonline.api.service;

import br.com.alunoonline.api.model.Discipline;
import br.com.alunoonline.api.repository.DisciplineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisciplineService {

    @Autowired
    DisciplineRepository repository;

    public Discipline create(Discipline discipline){
        return  repository.save(discipline);
    }

    public List<Discipline> findByProfessorId(Long professorId){
        return repository.findByProfessorId(professorId);
    }

}
