package com.cg.exception;

public class AlreadyExistsException extends Exception {

	
	private static final long serialVersionUID = 1L;
	
	public transient String message;
	
	public AlreadyExistsException(final String message) {
		super();
		this.message = message;
	}
	@Override
	public String toString() {
		return "AlreadyExistsException [message=" + message + "]";
	}
	

}
