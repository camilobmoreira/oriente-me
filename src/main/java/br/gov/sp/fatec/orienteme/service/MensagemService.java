package br.gov.sp.fatec.orienteme.service;

import br.gov.sp.fatec.orienteme.model.Mensagem;
import br.gov.sp.fatec.orienteme.model.Pessoa;
import br.gov.sp.fatec.orienteme.repository.MensagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MensagemService {
	@Autowired
	private MensagemRepository mensagemRepository;

	public List<Mensagem> buscaMensagens(Long de, Long para) {
		return this.mensagemRepository.findByDeIdAndParaId(de, para);
	}
}
