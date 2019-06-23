package com.hcl.mortagage.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.hcl.mortagage.dto.ErrorResponse;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<ErrorResponse> handleAllExceptions(ApplicationException exception) {
		ErrorResponse message = new ErrorResponse();
		message.setMessage(exception.getMessage());
		return new ResponseEntity<ErrorResponse>(message, HttpStatus.NOT_FOUND);
	}
	
	
	@ExceptionHandler(value = ApplicationException.class)
	public ResponseEntity<ErrorResponse> exception(ApplicationException exception) {
		ErrorResponse message = new ErrorResponse();
		message.setMessage(exception.getMessage());
		return new ResponseEntity<ErrorResponse>(message, HttpStatus.NOT_FOUND);
	}
}
