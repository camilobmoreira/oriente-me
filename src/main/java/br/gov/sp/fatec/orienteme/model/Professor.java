package br.gov.sp.fatec.orienteme.model;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="PRO_PROFESSOR")
@ApiModel(value="Professor",description="Modelo professor | Id & Alunos")
public @Data class Professor extends Pessoa {

	
	@OneToMany(
			mappedBy = "orientador",
			targetEntity = Aluno.class,
			fetch = FetchType.LAZY,
			cascade = CascadeType.ALL)
	private Set<Aluno> alunos = new HashSet<>();
	
}
