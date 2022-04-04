package com.cg.exception;

public class InvalidTrainerException extends Exception {
	
	
	private static final long serialVersionUID = 1L;
	
	public transient String message;

	public InvalidTrainerException(final String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "TrainerException [message=" + message + "]";
	}
	
	

}
