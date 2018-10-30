package br.gov.sp.fatec.orienteme.model;

import lombok.Data;

public @Data abstract class Pessoa {
    private Long id;
    private String name;
}
