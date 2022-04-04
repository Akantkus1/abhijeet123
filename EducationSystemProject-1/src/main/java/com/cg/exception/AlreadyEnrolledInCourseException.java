package com.cg.exception;


public class AlreadyEnrolledInCourseException extends Exception {

	
	private static final long serialVersionUID = 1L;
	

	public AlreadyEnrolledInCourseException(final String message) {
		super(message);
	}

}
