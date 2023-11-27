package br.com.alunoonline.api.service;

import br.com.alunoonline.api.model.Professor;
import br.com.alunoonline.api.model.ResgistrationStudent;
import br.com.alunoonline.api.repository.ResgistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResgistrationService {

    @Autowired
    ResgistrationRepository repository;

    public void create(ResgistrationStudent resgistrationStudent){
        repository.save(resgistrationStudent);
    }
}
