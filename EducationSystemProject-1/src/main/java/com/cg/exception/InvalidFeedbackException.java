package com.cg.exception;

public class InvalidFeedbackException extends Exception {


	private static final long serialVersionUID=1L;
	
	public transient String message;
	
	public InvalidFeedbackException(final String message) {
		super();
		this.message=message;
}
	@Override
	public String toString() {
		return "InvalidFeedbackException [message=" + message + "]";
	}
	
}
