package br.gov.sp.fatec.orienteme.service;

import br.gov.sp.fatec.orienteme.model.User;
import br.gov.sp.fatec.orienteme.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User login(String email, String senha) {
        return null;
    }

    public User createUser(String email, String senha) {
        return null;
    }
}
