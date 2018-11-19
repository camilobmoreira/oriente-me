package br.gov.sp.fatec.orienteme.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatec.orienteme.model.Professor;
import br.gov.sp.fatec.orienteme.service.ProfessorService;

@RestController
@RequestMapping(value = "/professor")
public class ProfessorController {
	
	@Autowired
	private ProfessorService professorService;
	
	@PostMapping("/")
	public void salvarProfessor(@Valid @RequestBody Professor professor) {
		professorService.salvarProfessor(professor);
		
	}

}
