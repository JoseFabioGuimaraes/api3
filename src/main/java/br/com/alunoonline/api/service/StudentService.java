package br.com.alunoonline.api.service;

import br.com.alunoonline.api.model.Student;
import br.com.alunoonline.api.repository.StudentRepository;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentRepository repository;
    public Student create(Student student){
        return repository.save(student);
    }

    public List<Student> findAll(){
       return repository.findAll();
    }

    public Optional<Student> findById(Long id){
        return repository.findById(id);
    }
    public void delete(Long id){
        repository.deleteById(id);
    }

}
