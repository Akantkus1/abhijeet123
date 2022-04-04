package com.cg.exception;

public class DateException extends Exception{
	private static final long serialVersionUID = 1L;
	
	public transient String str;
	
	public DateException(final String str) {
		super();
		this.str = str;
	}
	@Override
	public String toString() {
		return "DateException [str=" + str + "]";
	}
	


}
