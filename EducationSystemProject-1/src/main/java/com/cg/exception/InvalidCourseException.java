package com.cg.exception;

public class InvalidCourseException extends Exception{

	
	private static final long serialVersionUID = 1L;
	
	public transient String str;
	
	public InvalidCourseException(final String message)
	{
		super();
		this.str=message;
	}
	@Override
	public String toString() {
		return "InvalidCourseException [" + str + "]";
	}
	
}
