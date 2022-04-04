package com.cg.exception;

public class StudyMaterialException extends Exception{
	private static final long serialVersionUID = 1L;
		public transient String str;
	
	public StudyMaterialException(final String str) {
		super();
		this.str = str;
	}
	@Override
	public String toString() {
		return "StudyMaterialException [str=" + str + "]";
	}

}
