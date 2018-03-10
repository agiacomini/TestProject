package com.giacomini.andrea.ExceptionWNM;

public class WnmRuntimeException extends Exception {
	
	private String errorCode = ErrorCodes.TECH_ERROR;
	
	private Object args[];
	
	public Object[] getArgs() {
		return args;
	}

	public void setArgs(Object[] args) {
		this.args = args;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public WnmRuntimeException() {
		super();
 	}

	public WnmRuntimeException(String message, Throwable cause) {
		super(message, cause);
 	}

	public WnmRuntimeException(String message) {
		super(message);
 	}

	public WnmRuntimeException(Throwable cause) {
		super(cause);
 	}
	
	 

	public WnmRuntimeException(String message, Throwable cause, String errorCode) {
		super(message, cause);
		this.errorCode=errorCode;
	}

	public WnmRuntimeException(String message,String errorCode) {
		super(message);
		this.errorCode=errorCode;
	}

	public WnmRuntimeException(Throwable cause, String errorCode) {
		super(cause);
		this.errorCode=errorCode;
 	}

}
