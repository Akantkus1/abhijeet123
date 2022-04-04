package com.cg.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(HttpStatus.NOT_FOUND)
public class InvalidMessageException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	
	public InvalidMessageException(final String message) {
		super(message);
	}
}