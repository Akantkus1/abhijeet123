package com.cg.exception;

public class ListEmptyException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public transient String message;

	public ListEmptyException(final String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "ListEmptyException [message=" + message + "]";
	}
	

}
