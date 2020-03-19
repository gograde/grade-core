package org.grade.core.exception;

public class GeneralException extends RuntimeException {
	
	private static final long serialVersionUID = 858592880960252686L;

	public GeneralException() {
		super();
	}
	
	public GeneralException(String msg, Object...params) {
		super(String.format(msg, params));
	}
	
	public GeneralException(Throwable cause) {
		super(cause);
	}
	
	public GeneralException(String msg, Throwable cause) {
		super(msg, cause);
	} 

}
