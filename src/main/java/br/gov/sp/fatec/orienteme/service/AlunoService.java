package br.gov.sp.fatec.orienteme.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.orienteme.exception.ResourceNotFoundException;
import br.gov.sp.fatec.orienteme.model.Aluno;
import br.gov.sp.fatec.orienteme.repository.AlunoRepository;

@Service
public class AlunoService {

	@Autowired
	private AlunoRepository alunoRepository;

	public Aluno salvarAluno(Aluno aluno) {
		return this.alunoRepository.saveAndFlush(aluno);
	}

	public boolean emailExiste(String email) {
		return alunoRepository.existsByEmail(email);
	}

	public boolean raExiste(String ra) {
		return alunoRepository.existsByRa(ra);
	}

	public List<Aluno> todos(){
		return this.alunoRepository.findAll();
	}
	
	public List<Aluno> pesquisarAluno(String nome){
		return this.alunoRepository.findByName(nome);
	}

	public Aluno atualizarAluno(Aluno alunoReq) {
		 return this.alunoRepository.saveAndFlush(alunoReq);
	}
}
