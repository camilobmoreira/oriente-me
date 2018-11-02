package br.gov.sp.fatec.orienteme.model;


import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;

public @Data class User {
	
	@NotBlank
	private String email;
	
	@NotBlank
	private String senha;
}
