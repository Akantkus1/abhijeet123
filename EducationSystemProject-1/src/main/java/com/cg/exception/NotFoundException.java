package com.cg.exception;

public class NotFoundException extends Exception {

	
	private static final long serialVersionUID = 1L;

	public transient String message;

	public NotFoundException(final String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "NotFoundException [message=" + message + "]";
	}
     
	
	
}
