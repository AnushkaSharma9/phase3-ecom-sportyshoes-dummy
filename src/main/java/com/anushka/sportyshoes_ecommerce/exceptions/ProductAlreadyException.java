package com.anushka.sportyshoes_ecommerce.exceptions;

public class ProductAlreadyException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	String message;
	ProductAlreadyException(String message){
		super(message);
	}
	

}
