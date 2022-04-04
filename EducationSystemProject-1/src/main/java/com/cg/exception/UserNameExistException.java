package com.cg.exception;

public class UserNameExistException extends Exception{

	
	private static final long serialVersionUID = 1L;

	public UserNameExistException() {
		super();
	}
	
	public UserNameExistException(final String message) {
		super(message);
	}
	
}
