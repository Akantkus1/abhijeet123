package com.cg.exception;

import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement(name = "error")

public class ErrorResponse {
	
	
    private String message; 
 
    
    private String status;  

    
	public ErrorResponse(final String message, final String status) {  
		super();
		this.message = message;
		this.status = status;
	}
	
	
	public String getMessage() {
		return message;
	}

	public void setMessage(final String message) {
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(final String status) {
		this.status = status;
	}

    
    
}
