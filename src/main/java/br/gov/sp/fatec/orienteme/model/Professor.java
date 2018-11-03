package br.gov.sp.fatec.orienteme.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@Entity
@Table(name="PRO_PROFESSOR")
@ApiModel(value="Professor",description="Modelo professor | Id & Alunos")
public @Data class Professor extends Pessoa {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PRO_ID")
    private Long id;
	
	@OneToMany(
			mappedBy = "orientador",
			targetEntity = Aluno.class,
			fetch = FetchType.LAZY,
			cascade = CascadeType.ALL)
	private Set<Aluno> alunos = new HashSet<>();
	
}
