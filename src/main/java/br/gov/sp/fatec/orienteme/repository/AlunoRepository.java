package br.gov.sp.fatec.orienteme.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.gov.sp.fatec.orienteme.model.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
	
	List<Aluno> findAll();
	
	List<Aluno> findByName(String name);
	
	Optional<Aluno> findByRa(String ra);
	
	Optional<Aluno> findByEmail(String email);

	List<Aluno> findByIdIn(List<Long> userIds);
	
	Boolean existsByRa(String ra);
	
	Boolean existsByEmail(String email);

}
