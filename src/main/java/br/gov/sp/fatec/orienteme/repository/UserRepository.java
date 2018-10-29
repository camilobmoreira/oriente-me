package br.gov.sp.fatec.orienteme.repository;

import br.gov.sp.fatec.orienteme.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
