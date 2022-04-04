package com.cg.exception;

public class ErrorMessages {

   private String status;
   
	private String message;
	
	public ErrorMessages(final String status, final String message) {
		super();
		this.status = status;
		this.message = message;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(final String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(final String message) {
		this.message = message;
	}
	
	
}
