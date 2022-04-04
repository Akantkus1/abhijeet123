package com.cg.exception;

public class EmailAlreadyExistsException extends Exception{
	
	private static final long serialVersionUID = 1L;
	

	public EmailAlreadyExistsException() {
		super();
	}
	
	public EmailAlreadyExistsException(final String message) {
		super(message);
	}
}
