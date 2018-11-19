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

	public void salvarAluno(Aluno aluno) {
		alunoRepository.save(aluno);
	}
	
	public boolean emailExiste(String email) {
		return alunoRepository.existsByEmail(email);
	}
	
	public boolean raExiste(String ra) {
		return alunoRepository.existsByRa(ra);
	}
	
	public List<Aluno> todos(){
		List<Aluno> listaAlunos = new ArrayList<Aluno>();
		return listaAlunos;
	}
	
	public List<Aluno> pesquisarAluno(String nome){
		List<Aluno> listaAlunos = new ArrayList<Aluno>();
		return listaAlunos;
	}
	
	public Aluno atualizarAluno(Aluno alunoReq) {
		 return alunoRepository.findById(alunoReq.getId())
				 .map(aluno ->{
					 aluno.setName(alunoReq.getName());
					 return alunoRepository.save(aluno);
					 
				 }).orElseThrow(() -> new ResourceNotFoundException("Aluno nao encontrado: " + alunoReq.getName()));
		
	}
}
