package br.com.alunoonline.api.repository;

import br.com.alunoonline.api.model.Discipline;
import br.com.alunoonline.api.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}
