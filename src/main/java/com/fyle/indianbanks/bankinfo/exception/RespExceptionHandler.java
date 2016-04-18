package com.fyle.indianbanks.bankinfo.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.fyle.indianbanks.bankinfo.ErrorResource;

@ControllerAdvice
public class RespExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler({ BranchNotFoundException.class,
			BankNotFoundException.class })
	protected ResponseEntity<Object> handleNotFound(RuntimeException e,
			WebRequest request) {
		RuntimeException ex;
		if (e instanceof BranchNotFoundException) {
			ex = (BranchNotFoundException) e;
		} else {
			ex = (BankNotFoundException) e;
		}
		ErrorResource error = new ErrorResource("NotFoundException",
				ex.getMessage());

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		return handleExceptionInternal(e, error, headers, HttpStatus.NOT_FOUND,
				request);
	}
}
