package br.gov.sp.fatec.orienteme.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;

public @Data abstract class Pessoa {
	@NotBlank
    private String name;
	
	@NotBlank
	@Email
	private String email;
}
