package br.gov.sp.fatec.orienteme.service;

import br.gov.sp.fatec.orienteme.model.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class UserServiceTest {

    @Autowired
    UserService userService;
    User user;

    @Before
    public void createUser() {
        this.user = this.userService.createUser("admin@teste.com", "senha");
    }

    @Test
    public void loginTest() {
        Assert.assertEquals(this.userService.login("admin@teste.com", "senha"), this.user);
    }

    @Test
    public void loginWithInvalidCredentialsShouldFail() {
        Assert.assertNull(this.userService.login(null, "senha"));
        Assert.assertNull(this.userService.login(null, null));
        Assert.assertNull(this.userService.login("admin@teste.com", null));
        Assert.assertNull(this.userService.login("", ""));
    }
}
