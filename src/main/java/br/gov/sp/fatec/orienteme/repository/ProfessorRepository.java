package br.gov.sp.fatec.orienteme.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.orienteme.model.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
	
	List<Professor> findAll();
	
	List<Professor> findByName(String name);
	
	Optional<Professor> findByEmail(String email);
	
	Boolean existsByEmail(String email);
}

