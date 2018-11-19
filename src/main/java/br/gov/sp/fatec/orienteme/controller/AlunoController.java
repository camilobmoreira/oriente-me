package br.gov.sp.fatec.orienteme.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatec.orienteme.model.Aluno;
import br.gov.sp.fatec.orienteme.service.AlunoService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(value = "/aluno")
public class AlunoController {
	
	@Autowired
	private AlunoService alunoService;
	
	@ApiOperation(value="Busca aluno pelo nome",response=Aluno.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Busca realizada com sucesso com sucesso!") })
	@RequestMapping(value = "/{nome}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<List<Aluno>> buscarAlunoNome(@PathVariable String nome){
		return ResponseEntity.ok(alunoService.pesquisarAluno(nome));
	}
	
	
	@PostMapping("/")
	public void salvarAluno(@Valid @RequestBody Aluno aluno) {
		alunoService.salvarAluno(aluno);
	}
	
	@PutMapping("/atualizar/{aluno}")
	public Aluno atualizarPerfilAluno(@Valid @RequestBody Aluno aluno) {
		return alunoService.atualizarAluno(aluno);
	}

}
