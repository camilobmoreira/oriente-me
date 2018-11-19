package br.gov.sp.fatec.orienteme.model;

import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "MSG_MENSAGEM")
public @Data class Mensagem {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="PRO_ID")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "MSG_DE", referencedColumnName = "PES_ID")
	private Pessoa de;

	@ManyToOne
	@JoinColumn(name = "MSG_PARA", referencedColumnName = "PES_ID")
	private Pessoa para;
}
