package com.cg.exception;

public class TestNotFoundException extends Exception{
     
	private static final long serialVersionUID = 1L;
	
	public transient String message;

	public TestNotFoundException(final String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "TestNotFoundException [message=" + message + "]";
	}
     
     
}
