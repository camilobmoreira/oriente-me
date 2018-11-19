package br.gov.sp.fatec.orienteme.controller;

import br.gov.sp.fatec.orienteme.model.Mensagem;
import br.gov.sp.fatec.orienteme.service.MensagemService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "mensagens")
public class MensagemController {

	@Autowired
	private MensagemService mensagemService;

	@ApiOperation(value="Busca todas as mensagens dado remetente id e destinatário id", response= Mensagem.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Busca realizada com sucesso com sucesso!") })
	@RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<List<Mensagem>> buscarAlunoNome(@RequestBody Mensagem mensagem){
		return ResponseEntity.ok(this.mensagemService.buscaMensagens(mensagem.getDe().getId(), mensagem.getPara().getId()));
	}
}
