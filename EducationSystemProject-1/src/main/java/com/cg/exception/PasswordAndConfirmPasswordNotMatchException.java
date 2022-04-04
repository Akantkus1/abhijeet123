package com.cg.exception;

public class PasswordAndConfirmPasswordNotMatchException extends Exception {

	
	private static final long serialVersionUID = 1L;

	public PasswordAndConfirmPasswordNotMatchException(final String message) {
		super(message);
	}

}
