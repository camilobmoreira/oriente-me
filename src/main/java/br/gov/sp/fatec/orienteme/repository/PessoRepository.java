package br.gov.sp.fatec.orienteme.repository;

import br.gov.sp.fatec.orienteme.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.transaction.annotation.Transactional;

@NoRepositoryBean
@Transactional
public interface PessoRepository <T extends Pessoa> extends JpaRepository<T, Long> {

	@Query("select p from #{#entityName} as p where p.id = ?1")
	T findById(Long id);
}
