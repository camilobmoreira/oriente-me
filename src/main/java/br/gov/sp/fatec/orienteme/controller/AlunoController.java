package br.gov.sp.fatec.orienteme.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatec.orienteme.model.Aluno;
import br.gov.sp.fatec.orienteme.service.AlunoService;

@RestController
@RequestMapping(value = "/aluno")
public class AlunoController {
	
	@Autowired
	private AlunoService alunoService;
	
	@RequestMapping(value = "/{nome}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<List<Aluno>> buscarAluno(@PathVariable String nome){
		return ResponseEntity.ok(alunoService.pesquisarAluno(nome));
	}

}
