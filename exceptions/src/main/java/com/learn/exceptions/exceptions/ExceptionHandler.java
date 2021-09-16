package com.learn.exceptions.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandler {

	@org.springframework.web.bind.annotation.ExceptionHandler(MyCustomException.class)
	public ResponseEntity<ErrorMessage> getExceptionData(MyCustomException exception){
		ErrorMessage error=new ErrorMessage(404, exception.getMessage());
		return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
		
	}
}
