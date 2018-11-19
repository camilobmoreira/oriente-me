package br.gov.sp.fatec.orienteme.model;

import javax.persistence.MappedSuperclass;

import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;

import javax.persistence.*;

@Inheritance
public @Data abstract class Pessoa {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="PES_ID")
	private Long id;

	@NotBlank
    private String name;

	@NotBlank
	private String email;
}
