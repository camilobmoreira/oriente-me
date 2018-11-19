package br.gov.sp.fatec.orienteme.exception;

import org.omg.CORBA.TRANSACTION_UNAVAILABLE;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BadRequestException extends RuntimeException {
	
	public BadRequestException(String mensagem) {
		super(mensagem);
	}
	
	public BadRequestException(String mensagem, Throwable causa ) {
		super(mensagem,causa);
	}

}
