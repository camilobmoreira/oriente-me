package br.gov.sp.fatec.orienteme.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.orienteme.exception.BadRequestException;
import br.gov.sp.fatec.orienteme.model.Professor;
import br.gov.sp.fatec.orienteme.repository.ProfessorRepository;

@Service
public class ProfessorService {
	
	@Autowired
	private ProfessorRepository professorRepository;
	
	public void salvarProfessor(Professor professor) {
		if (professorRepository.existsByEmail(professor.getEmail())) {
			professorRepository.save(professor);
		}else {
			new BadRequestException("Professor ja existe!");
		}
	}
}
