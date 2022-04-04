package com.cg.exception;

public class InvalidPaymentException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public transient String str;
	
	public InvalidPaymentException(final String str) {
		super();
		this.str = str;
	}
	@Override
	public String toString() {
		return "InvalidPaymentException [str=" + str + "]";
	}
	

}
