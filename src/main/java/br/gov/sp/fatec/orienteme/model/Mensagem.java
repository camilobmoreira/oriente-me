package br.gov.sp.fatec.orienteme.model;

import lombok.Data;

import javax.persistence.*;


public @Data class Mensagem {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="PRO_ID")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "PES_ID")
	private Pessoa de;

	@ManyToOne
	@JoinColumn(name = "PES_ID")
	private Pessoa para;
}
