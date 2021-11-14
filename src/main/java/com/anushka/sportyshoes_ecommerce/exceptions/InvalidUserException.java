package com.anushka.sportyshoes_ecommerce.exceptions;

public class InvalidUserException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	String message;
	public InvalidUserException(String message){
		super(message);
	}
	

}
