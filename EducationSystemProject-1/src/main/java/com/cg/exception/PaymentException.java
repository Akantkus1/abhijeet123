package com.cg.exception;

public class PaymentException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public transient  String str;
	
	public PaymentException(final String str) {
		super();
		this.str = str;
	}
	@Override
	public String toString() {
		return "PaymentException [str=" + str + "]";
	}
	
}
