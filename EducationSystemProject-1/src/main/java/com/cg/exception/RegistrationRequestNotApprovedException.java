package com.cg.exception;

public class RegistrationRequestNotApprovedException extends Exception {

	private static final long serialVersionUID = 1L;
	public RegistrationRequestNotApprovedException(final String message) {
		super(message);
	}

}
