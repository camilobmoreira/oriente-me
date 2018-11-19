package br.gov.sp.fatec.orienteme.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.gov.sp.fatec.orienteme.model.Aluno;

@Repository
public interface AlunoRepository extends PessoRepository {
	
	List<Aluno> findAll();
	
	Aluno findById(Long id);
	
	List<Aluno> findByName(String name);
	
	Optional<Aluno> findByRa(String ra);
	
	Optional<Aluno> findByEmail(String email);

	Boolean existsByRa(String ra);
	
	Boolean existsByEmail(String email);

	Aluno saveAndFlush(Aluno aluno);

}
