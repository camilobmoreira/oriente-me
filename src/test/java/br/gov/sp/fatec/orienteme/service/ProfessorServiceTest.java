package br.gov.sp.fatec.orienteme.service;


import br.gov.sp.fatec.orienteme.model.Professor;
import br.gov.sp.fatec.orienteme.repository.ProfessorRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class ProfessorServiceTest {

    @Autowired
    ProfessorService professorService;
    @Autowired
    ProfessorRepository professorRepository;

    Professor professor;

    /*@Before
    public void preparaCenario() {
        this.professor = this.professorService.createProfessor(String name, String email);
    }*/

    @Test
    public void buscaProfessorExistente() {
        Assert.assertEquals(this.professorRepository.findByEmail("professor@email.com"), this.professor);
    }

    @Test
    public void buscaProfessorInexistente() {
        Assert.assertNull(this.professorRepository.findByEmail("asd@email.com"));
        Assert.assertNull(this.professorRepository.findByEmail("adfr@345.com"));
        Assert.assertNull(this.professorRepository.findByEmail("professor"));
    }
}
