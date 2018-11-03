package br.gov.sp.fatec.orienteme.controller;

import br.gov.sp.fatec.orienteme.model.User;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping(value = "/usuarios")
public class UserController {

    /*@ApiOperation(value = "Cria usuario", response = User.class)
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Usuario criado com sucesso!") })
    @RequestMapping(value = "/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Void> cadastrarEncaminhamento(User user, UriComponentsBuilder ucBuilder) {

        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/usuarios/{id}").buildAndExpand(user.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }*/

    @ApiOperation(value = "Busca um usuario a partir do id", response = User.class)
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Busca com sucesso!") })
    @RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Void> cadastrarEncaminhamento(@PathVariable Long id, UriComponentsBuilder ucBuilder) {

        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

}
