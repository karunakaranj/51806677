package com.hcl.mortagage.exception;

public class ApplicationException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1691742324787003683L;

	public ApplicationException() {

	}

	public ApplicationException(String errorMessage) {
		super(errorMessage);
	}

//	
}
