package br.gov.sp.fatec.orienteme.repository;

import br.gov.sp.fatec.orienteme.model.Mensagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MensagemRepository extends JpaRepository<Mensagem, Long> {
	List<Mensagem> findByDeIdAndParaId(Long de, Long para);
}
