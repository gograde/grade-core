package org.grade.core.exception;

public class NotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = -7967417644558747777L;

	public NotFoundException() {
		super();
	}
	
	public NotFoundException(String msg, Object...params) {
		super(String.format(msg, params));
	}
	
	public NotFoundException(Throwable cause) {
		super(cause);
	}
	
	public NotFoundException(String msg, Throwable cause) {
		super(msg, cause);
	} 

}
