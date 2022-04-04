package com.cg.exception;

public class CourseNotFoundException extends Exception {

	
	private static final long serialVersionUID = 1L;
	

	public CourseNotFoundException(final String message) {
		super(message);
	}

}
