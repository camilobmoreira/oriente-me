package br.gov.sp.fatec.orienteme.model;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;

@Entity
@Table(name="PES_PESSOA")
@Inheritance(strategy = InheritanceType.JOINED)
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
