package br.gov.sp.fatec.orienteme.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;
@Entity
public @Data class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="USER_ID")
    private Long id;
	
	@NotBlank
	private String email;
	
	@NotBlank
	private String senha;
}
