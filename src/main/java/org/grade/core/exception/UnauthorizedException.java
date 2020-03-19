package org.grade.core.exception;

public class UnauthorizedException extends RuntimeException {
	
	private static final long serialVersionUID = -4686405476829066242L;

	public UnauthorizedException() {
		super();
	}
	
	public UnauthorizedException(String msg, Object...params) {
		super(String.format(msg, params));
	}
	
	public UnauthorizedException(Throwable cause) {
		super(cause);
	}
	
	public UnauthorizedException(String msg, Throwable cause) {
		super(msg, cause);
	} 

}
