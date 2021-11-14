package com.anushka.sportyshoes_ecommerce.exceptions;

public class UserAlreadyExistsException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	String message;
	UserAlreadyExistsException(String message){
		super(message);
	}
	

}
