package br.gov.sp.fatec.orienteme.model;

import javax.persistence.MappedSuperclass;

import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;

@MappedSuperclass
public @Data abstract class Pessoa {
	@NotBlank
    private String name;
	
	@NotBlank
	private String email;
}
