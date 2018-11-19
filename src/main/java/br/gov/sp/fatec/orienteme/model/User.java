package br.gov.sp.fatec.orienteme.model;


import javax.persistence.*;

import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;
@Entity
@Table(name="USE_USER")
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
