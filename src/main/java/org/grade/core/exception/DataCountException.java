package org.grade.core.exception;

public class DataCountException extends RuntimeException {

	private static final long serialVersionUID = -7592080415952255786L;
	
	public DataCountException() {
		super();
	}
	
	public DataCountException(String msg, Object...params) {
		super(String.format(msg, params));
	}
	
	public DataCountException(Throwable cause) {
		super(cause);
	}
	
	public DataCountException(String msg, Throwable cause) {
		super(msg, cause);
	} 

}
