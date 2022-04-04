package com.cg.exception;

public class InvalidStudyMaterialException extends Exception{
	private static final long serialVersionUID = 1L;
	
	public transient String str;
	
	public InvalidStudyMaterialException(final String str) {
		super();
		this.str = str;
	}
	@Override
	public String toString() {
		return "InvalidStudyMaterialException [str=" + str + "]";
	}

}
