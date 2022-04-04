package com.cg.exception;

public class ErrorMessage {
	
	private Integer errorCode;
	
	private String message;
	
	public ErrorMessage() {
		super();
	}

	public ErrorMessage(final Integer errorCode, final String message) {
		super();
		this.errorCode = errorCode;
		this.message = message;
	}

	public Integer getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(final Integer errorCode) {
		this.errorCode = errorCode;
	}

	public String getMessage() {
		return message;
	}
	

	public void setMessage(final String message) {
		this.message = message;
	}

}
