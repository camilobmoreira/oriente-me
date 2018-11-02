package br.gov.sp.fatec.orienteme.model;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;

@Entity
@Table(name="ALU_ALUNO")
public @Data class Aluno extends Pessoa {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ALU_ID")
    private Long id;
	
	@Column(name="ALU_RA")
	private String ra;
	
	@NotBlank
	@Column(name="ALU_SENHA")
	private String senha;
	
	@Column(name="ALU_TITULO")
	private String tituloTg;
	
	@Column(name="ALU_MOTIVACAO")
	private String motivacao;
	
	@Column(name="ALU_CURSO")
	private String curso;
	
	@Column(name="ALU_DATASOLICITACAO")
	@Basic
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataSolicitacao;
	
	@ManyToOne
	@JoinColumn(name="PRO_ID")
	private Professor orientador;
	

}
