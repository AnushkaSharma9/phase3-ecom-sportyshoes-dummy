package com.anushka.sportyshoes_ecommerce.exceptions;

public class UserNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	String message;
	public UserNotFoundException(String message){
		super(message);
	}
	

}
