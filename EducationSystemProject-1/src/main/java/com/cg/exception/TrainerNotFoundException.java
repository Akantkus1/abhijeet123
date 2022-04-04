package com.cg.exception;

public class TrainerNotFoundException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public transient String message;

	public TrainerNotFoundException(final String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "TrainerNotFoundException [message=" + message + "]";
	}
	

}
