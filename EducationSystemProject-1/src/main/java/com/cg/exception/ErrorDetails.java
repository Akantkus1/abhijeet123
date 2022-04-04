package com.cg.exception;

public class ErrorDetails {
	
	private String message;
	
	private String details;
	
	public ErrorDetails(final String message, final String details) {
		
		super();
		this.message = message;
		this.details = details;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(final String message) {
		this.message = message;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(final String details) {
		this.details = details;
	}
	
}
