package com.anushka.sportyshoes_ecommerce.exceptions;

public class ProductNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	String message;
	public ProductNotFoundException(String message){
		super(message);
	}
	

}
