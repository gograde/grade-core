package org.grade.core.exception;

public class BadRequestException extends RuntimeException {
	
	private static final long serialVersionUID = -1052292100419154756L;

	public BadRequestException() {
		super();
	}
	
	public BadRequestException(String msg, Object...params) {
		super(String.format(msg, params));
	}
	
	public BadRequestException(Throwable cause) {
		super(cause);
	}
	
	public BadRequestException(String msg, Throwable cause) {
		super(msg, cause);
	} 

}
