package br.com.alunoonline.api.repository;

import br.com.alunoonline.api.model.Discipline;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DisciplineRepository extends JpaRepository<Discipline, Long> {
    List<Discipline> findByProfessorId(Long professorId);
}
