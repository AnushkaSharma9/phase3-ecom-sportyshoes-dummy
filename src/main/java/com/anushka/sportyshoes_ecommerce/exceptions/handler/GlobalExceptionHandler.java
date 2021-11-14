package com.anushka.sportyshoes_ecommerce.exceptions.handler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.anushka.sportyshoes_ecommerce.exceptions.InvalidProductException;
import com.anushka.sportyshoes_ecommerce.exceptions.InvalidUserException;
import com.anushka.sportyshoes_ecommerce.exceptions.ProductAlreadyException;
import com.anushka.sportyshoes_ecommerce.exceptions.ProductNotFoundException;
import com.anushka.sportyshoes_ecommerce.exceptions.UserAlreadyExistsException;
import com.anushka.sportyshoes_ecommerce.exceptions.UserNotFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	ExceptionResponse response;
	
	@ExceptionHandler(value=ProductNotFoundException.class)
	public ResponseEntity<ExceptionResponse> notFoundException(ProductNotFoundException exception) {
		response = new ExceptionResponse(exception.getMessage(), new Date(), 
				HttpStatus.NOT_FOUND.name(), exception.getClass().getSimpleName());
		return new ResponseEntity<ExceptionResponse>(response,HttpStatus.NOT_FOUND);
	}

	
	@ExceptionHandler(value=InvalidProductException.class)
	public ResponseEntity<ExceptionResponse> invalidException(InvalidProductException exception) {
		response = new ExceptionResponse(exception.getMessage(), new Date(), 
				HttpStatus.BAD_REQUEST.name(), exception.getClass().getSimpleName());
		return new ResponseEntity<ExceptionResponse>(response,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(value=ProductAlreadyException.class)
	public ResponseEntity<ExceptionResponse> alreadyExistException(ProductAlreadyException exception) {
		response = new ExceptionResponse(exception.getMessage(), new Date(), 
				HttpStatus.BAD_REQUEST.name(), exception.getClass().getSimpleName());
		return new ResponseEntity<ExceptionResponse>(response,HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(value=UserNotFoundException.class)
	public ResponseEntity<ExceptionResponse> notFoundException(UserNotFoundException exception) {
		response = new ExceptionResponse(exception.getMessage(), new Date(), 
				HttpStatus.NOT_FOUND.name(), exception.getClass().getSimpleName());
		return new ResponseEntity<ExceptionResponse>(response,HttpStatus.NOT_FOUND);
	}

	
	@ExceptionHandler(value=InvalidUserException.class)
	public ResponseEntity<ExceptionResponse> invalidException(InvalidUserException exception) {
		response = new ExceptionResponse(exception.getMessage(), new Date(), 
				HttpStatus.BAD_REQUEST.name(), exception.getClass().getSimpleName());
		return new ResponseEntity<ExceptionResponse>(response,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(value=UserAlreadyExistsException.class)
	public ResponseEntity<ExceptionResponse> alreadyExistException(UserAlreadyExistsException exception) {
		response = new ExceptionResponse(exception.getMessage(), new Date(), 
				HttpStatus.BAD_REQUEST.name(), exception.getClass().getSimpleName());
		return new ResponseEntity<ExceptionResponse>(response,HttpStatus.BAD_REQUEST);
	}
}
